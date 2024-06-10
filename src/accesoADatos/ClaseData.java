package accesoADatos;
/**
 *
 * @author elise
 */
import entidades.Asistencia;
import entidades.Clase;
import entidades.Entrenador;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class ClaseData {
    
    private Connection con = null;
    EntrenadorData entreData;
    public ClaseData(){
        entreData=new EntrenadorData();
        con = Conexion.getConexion();
    }
    
    public void agregarClase(Clase clase, Entrenador entrenador) {
        String sql = "INSERT INTO clase (nombre, horario, idEntrenador, capacidad, estado) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, clase.getNombre());
            ps.setTime(2, Time.valueOf(clase.getHorario()));
            ps.setInt(3, entrenador.getIdEntrenador());
            ps.setInt(4, clase.getCapacidad());
            ps.setBoolean(5, clase.isEstado());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                clase.setIdClase(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Clase Agregada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Clase");
            System.out.println(ex.getMessage());
        }
    }

    public List<Clase> listarClases() {
        List<Clase> clases = new ArrayList<>();
        String sql = "SELECT * FROM clase";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Clase clase = new Clase();
                clase.setIdClase(rs.getInt("idClase"));
                clase.setNombre(rs.getString("nombre"));
                clase.setHorario(rs.getTime("horario").toLocalTime());
//                clase.getEntrenador().setIdEntrenador(rs.getInt("idEntrenador"));
                Entrenador entrenador = new Entrenador();
                entrenador = entreData.buscarEntrenadorPorId(rs.getInt("idEntrenador"));
                clase.setEntrenador(entrenador);
                clase.setCapacidad(rs.getInt("capacidad"));
                clase.setEstado(rs.getBoolean("estado"));
                clases.add(clase);
           }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar las clases");
            System.out.println(ex.getMessage());
        }
        return clases;
    }

    public Clase buscarClasePorNombre(String nombre) {
        Clase clase = null;
        String sql = "SELECT * FROM clase WHERE nombre = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                clase = new Clase();
                clase.setIdClase(rs.getInt("idClase"));
                clase.setNombre(rs.getString("nombre"));
                clase.setHorario(rs.getTime("horario").toLocalTime());
                
                Entrenador entrenador = new Entrenador();
                entrenador = entreData.buscarEntrenadorPorId(rs.getInt("idEntrenador"));
//                clase.getEntrenador().setIdEntrenador(rs.getInt("idEntrenador"));
//                clase.setEntrenador(entrenador);
                clase.setEntrenador(entrenador);
                clase.setCapacidad(rs.getInt("capacidad"));
                clase.setEstado(rs.getBoolean("estado"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar la clase x nombre");
            System.out.println(ex.getMessage());
        }
        return clase;
    }

    public Clase buscarClasePorEntrenador(int idEntrenador) {
        Clase clase = null;
        String sql = "SELECT * FROM clase WHERE idEntrenador = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idEntrenador);
            ResultSet rs = ps.executeQuery();
             if (rs.next()) {
                clase = new Clase();
                clase.setIdClase(rs.getInt("idClase"));
                clase.setNombre(rs.getString("nombre"));
                clase.setHorario(rs.getTime("horario").toLocalTime());
//                clase.getEntrenador().setIdEntrenador(rs.getInt("idEntrenador"));
                Entrenador entrenador = new Entrenador();
                entrenador = entreData.buscarEntrenadorPorId(rs.getInt("idEntrenador"));
                clase.setEntrenador(entrenador);
                
                clase.setCapacidad(rs.getInt("capacidad"));
                clase.setEstado(rs.getBoolean("estado"));
                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar la clase por entrenador");
            System.out.println(ex.getMessage());
        }
        return clase;
    }

    public Clase buscarClasePorHorario(LocalTime horario) {
        Clase clase = null;
        String sql = "SELECT * FROM clase WHERE horario = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setTime(1, Time.valueOf(horario));
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                clase = new Clase();
                clase.setIdClase(rs.getInt("idClase"));
                clase.setNombre(rs.getString("nombre"));
                clase.setHorario(rs.getTime("horario").toLocalTime());
                
                Entrenador entrenador = new Entrenador();
                entrenador = entreData.buscarEntrenadorPorId(rs.getInt("idEntrenador"));
                clase.setEntrenador(entrenador);
//                clase.getEntrenador().setIdEntrenador(rs.getInt("idEntrenador"));
                
                clase.setCapacidad(rs.getInt("capacidad"));
                clase.setEstado(rs.getBoolean("estado"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar la clase por horario");
            System.out.println(ex.getMessage());
        }
        return clase;
    }

    public void inscribirSocio(int idSocio, String nombreClase) {
        String sql = "INSERT INTO asistencia (idSocio, idClase, fechaAsistencia) SELECT ?, idClase, CURDATE() FROM clase WHERE nombre = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idSocio);
            ps.setString(2, nombreClase);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al inscribir al socio");
            System.out.println(ex.getMessage());
        }
    }
    
    public void modificarClase(Clase clase) {
         String sql = "UPDATE clase SET nombre = ?, horario = ?, idEntrenador = ?, capacidad = ?, estado = ? WHERE idClase = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, clase.getNombre());
            ps.setTime(2, Time.valueOf(clase.getHorario()));
            ps.setInt(3, clase.getEntrenador().getIdEntrenador());
            ps.setInt(4, clase.getCapacidad());
            ps.setBoolean(5, clase.isEstado());
            ps.setInt(6, clase.getIdClase());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Clase modificada");
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar la clase");
            System.out.println(ex.getMessage());
        }
    }
    
    public void eliminarClase(int idClase) {
        String sql = "UPDATE clase SET estado=0 WHERE idClase = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idClase);
            int filas = ps.executeUpdate();
            if (filas==1) {
            JOptionPane.showMessageDialog(null, "Clase eliminada");
            }else{
            JOptionPane.showMessageDialog(null, "No se pudo eliminar");                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la clase");
            System.out.println(ex.getMessage());
        }
    }
    
    public Clase consultarCapacidadHoy(Asistencia asistencia){
        Clase clase = null;
        LocalDate hoy = LocalDate.now();
        String sql = "SELECT idClase, nombre, idEntrenador FROM clase WHERE horario=? "
                + "AND nombre LIKE ? AND capacidad > (SELECT COUNT(idSocio) "
                + "FROM asistencia WHERE idClase = ? AND fechaAsistencia=?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setTime(1, Time.valueOf(asistencia.getClase().getHorario()));
            ps.setString(2, asistencia.getClase().getNombre());
            ps.setInt(3, asistencia.getClase().getIdClase());
            ps.setDate(4, Date.valueOf(asistencia.getFechaAsistencia()));
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
              clase = new Clase();
              clase.setIdClase(rs.getInt("idClase"));
              clase.setNombre(rs.getString("nombre"));
              Entrenador entrenador = new Entrenador();
              entrenador = entreData.buscarEntrenadorPorId(rs.getInt("idEntrenador"));
              clase.setEntrenador(entrenador);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
            System.out.println(ex.getMessage());
        }
        return clase;
    }
}
