package accesoADatos;

import entidades.Membresia;
import entidades.Socio;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author NandoJ
 */
public class MembresiaData {

    private Connection conn = null;
//     MembresiaData membresiaData;
    private SocioData socioData;
    private Socio socio;
    private Membresia membresia;

    public MembresiaData() {
        conn = Conexion.getConexion();
//       membresiaData=new MembresiaData();
        membresia = new Membresia();
        socio = new Socio();
        socioData = new SocioData();
    }

    public List<Membresia> historialDeMembresiasSocio(String dni) {
        String sql = "SELECT m.* FROM membresia m  JOIN socio s ON m.idSocio = s.idSocio WHERE s.dni = ?";
        List<Membresia> membresias = new ArrayList<>();
        socio = null;
        try {
            
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,dni);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                membresia = new Membresia();
                membresia.setIdMembresia(rs.getInt("idMembresia"));
                socio = new Socio();
                socio = socioData.buscarSocioPorId(rs.getInt("idSocio"));
                membresia.setSocio(socio);
                membresia.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                membresia.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                membresia.setEstado(rs.getBoolean("estado"));
                membresia.setCosto(rs.getDouble("costo"));
                membresia.setCantidadPases(rs.getInt("cantidadPases"));
                
                membresias.add(membresia);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla membresia: " + ex.getMessage());
        }

        return membresias;
    }

    public Membresia buscarMembresiaActiva(int idSocio) {
        String sql = "SELECT * FROM  membresia WHERE estado = 1 AND idSocio = ? ";
        SocioData socioData = new SocioData();
        socio = null;
        membresia = null;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idSocio);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                membresia = new Membresia();
                membresia.setIdMembresia(rs.getInt("idMembresia"));
                socio = new Socio();
                socio = socioData.buscarSocioPorId(rs.getInt("idSocio"));
                membresia.setSocio(socio);
//                System.out.println(socio);
                membresia.setCantidadPases(rs.getInt("cantidadPases"));
                membresia.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                membresia.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                membresia.setCosto(rs.getDouble("costo"));
                membresia.setEstado(rs.getBoolean("estado"));
//                System.out.println(membresia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla membresia");
        }
        return membresia;
    }

    public void renovarMembresia(Membresia membresia) {
        agregarMembresia(membresia);
    }

    public void modificarPases(int idSocio) {
//        Membresia mem = new Membresia();
//        
//        mem = buscarMembresiaActiva();
//        int cont = mem.getCantidadPases();
//        
//funcionando:
//        Membresia mem = buscarMembresiaActiva(idSocio);
//        System.out.println(mem);
//        int cont = mem.getCantidadPases();
//        System.out.println(cont);
      boolean bandera=ControlarPases(idSocio);
      if(bandera){
        String sql = "UPDATE membresia SET cantidadPases = cantidadPases-1 WHERE idSocio = ? AND estado = 1";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
//            cont -= 1;
//            ps.setInt(1, cont);
            ps.setInt(1, idSocio);
            int filas = ps.executeUpdate();
            if (filas == 1) {
                JOptionPane.showMessageDialog(null, "Se restó un pase");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla membresia \n " + ex);
        }
      }
    }

    public void cancelarMembresia(String dni) {
        String sql = "UPDATE membresia m JOIN socio s ON m.idSocio = s.idSocio SET m.estado = 0 WHERE s.dni = ? AND m.estado = 1";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, dni);
            int filas = ps.executeUpdate();
            if (filas == 1) {
                JOptionPane.showMessageDialog(null, "Se canceló la membresia");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla membresia \n " + ex);
        }
    }
    

    public void agregarMembresia(Membresia membre) {
        String sql = "INSERT INTO membresia "
                + "(idSocio, cantidadPases, fechaInicio, fechaFin, costo, estado) "
                + "VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, membre.getSocio().getIdSocio());
            ps.setInt(2, membre.getCantidadPases());
            ps.setDate(3, Date.valueOf(membre.getFechaInicio()));
            ps.setDate(4, Date.valueOf(membre.getFechaInicio().plusDays(30)));
            ps.setDouble(5, membre.getCosto());
            ps.setBoolean(6, membre.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                membre.setIdMembresia(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Membresia Guardada");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA MEMBRESIA");
            System.out.println(ex.getMessage());
        }
    }

    public boolean sonIgualesLasFechas(LocalDate tiempoFin) {
        boolean bandera = false;
        LocalDate hoy = LocalDate.now();
        if (hoy.isBefore(tiempoFin)) {
            bandera = false;
        } else if (hoy.isAfter(tiempoFin)) {
            bandera = true;
        } else {
            bandera = true;
        }

        return bandera;
    }

    public void modificarMembresiasVencidas() {
        List<Membresia> membresias = buscarMembresiasActivas();
        for (Membresia membresia1 : membresias) {
            boolean bandera = sonIgualesLasFechas(membresia1.getFechaFin());
            if (bandera) {
                String sql = "UPDATE membresia SET estado = 0 WHERE idMembresia = ?";
                try {
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ps.setInt(1, membresia1.getIdMembresia());
                    ResultSet rs = ps.executeQuery();
                    while (rs.next()) {
                        membresia1.setIdMembresia(rs.getInt("idMembresia"));
                        membresia1.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                        membresia1.setEstado(rs.getBoolean("estado"));
                    }
                    ps.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al acceder a la tabla membresia");
                }
            }
        }

    }

    public List<Membresia> buscarMembresiasActivas() {
        String sql = "SELECT idMembresia , fechaFin , estado FROM  membresia WHERE estado = ? ";
        List<Membresia> membresias = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setBoolean(1, true);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                membresia = new Membresia();
                membresia.setIdMembresia(rs.getInt("idMembresia"));
                membresia.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                membresia.setEstado(rs.getBoolean("estado"));
                membresias.add(membresia);

            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla membresia \n" + ex.getMessage());
        }
        return membresias;
    }

    public void modificarMembresia(Membresia membresia) {
        String sql = "UPDATE membresia SET idSocio = ?, cantidadPases = ?, fechaInicio = ?, fechaFin = ?,costo = ?, estado = ? WHERE idMembresia = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, membresia.getSocio().getIdSocio());
            ps.setInt(2, membresia.getCantidadPases());
            ps.setDate(3, Date.valueOf(membresia.getFechaInicio()));
            ps.setDate(4, Date.valueOf(membresia.getFechaFin()));
            ps.setDouble(5, membresia.getCosto());
            ps.setBoolean(6, membresia.isEstado());
            ps.setInt(7, membresia.getIdMembresia());
            int filas = ps.executeUpdate();
            if (filas == 1) {
                JOptionPane.showMessageDialog(null, "Se modificó la membresia");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla membresia \n" + ex.getMessage());
        }
    }
    public boolean ControlarPases(int idSocio) {
        boolean bandera=true;
        String sql = "UPDATE membresia SET estado = 0 WHERE idSocio = ? AND cantidadPases <= 0";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idSocio);
            int filas = ps.executeUpdate();
            if (filas == 1) {
                JOptionPane.showMessageDialog(null, "No tiene mas pases");
                bandera=false;
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla membresia " + ex);
        }
        return bandera;
    }
    
}
