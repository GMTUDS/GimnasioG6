
package accesoADatos;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import entidades.Entrenador;
import java.util.ArrayList;
import java.util.List;

public class EntrenadorData {
      
    private Connection con = null;

    public EntrenadorData() {
        con = Conexion.getConexion();
    }
    

    public void guardarEntrenador(Entrenador entrenador) {
        String sql = "INSERT INTO entrenador "
                + "(dni, nombre, apellido, especialidad, estado) "
                + "VALUES(?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, entrenador.getDni());
            ps.setString(2, entrenador.getNombre());
            ps.setString(3, entrenador.getApellido());
            ps.setString(4, entrenador.getEspecialidad());
            ps.setBoolean(5, entrenador.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                entrenador.setIdEntrenador(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Entrenador guardado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Entrenador");
            System.out.println(ex.getMessage());
        }
    }
    
     public List<Entrenador> listarEntrenador(String especialidad) {
        List<Entrenador> entrenadores = new ArrayList<>();
        try {
            String sql = "SELECT * FROM entrenador WHERE especialidad = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, especialidad);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Entrenador entrenador = new Entrenador();
                entrenador.setIdEntrenador(rs.getInt("idEntrenador"));
                entrenador.setDni(rs.getString("dni"));
                entrenador.setNombre(rs.getString("nombre"));
                entrenador.setApellido(rs.getString("apellido"));
                entrenador.setEspecialidad(rs.getString("especialidad"));
                entrenador.setEstado(rs.getBoolean("estado"));
                entrenadores.add(entrenador);
                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Entrenador " + ex.getMessage());
        }
        return entrenadores;
    }
    public Entrenador buscarEntrenadorPorNombre(String nombre) {
        Entrenador entrenador = null;
        String sql = "SELECT * FROM entrenador WHERE nombre = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                entrenador = new Entrenador();
                entrenador.setIdEntrenador(rs.getInt("idEntrenador"));
                entrenador.setDni(rs.getString("dni"));
                entrenador.setNombre(rs.getString("nombre"));
                entrenador.setApellido(rs.getString("apellido"));
                entrenador.setEspecialidad(rs.getString("especialidad"));
                entrenador.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el entrenador");
            }
                ps.close();
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Entrenador "+ex.getMessage()); 
      }
            return entrenador;
        }
    
    public Entrenador buscarEntrenadorPorApellido(String apellido) {
        Entrenador entrenador = null;
        String sql = "SELECT dni, nombre, apellido, especialiad, estado FROM entrenador WHERE apellido = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, apellido);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                entrenador = new Entrenador();
                entrenador.setIdEntrenador(rs.getInt("idEntrenador"));
                entrenador.setDni(rs.getString("dni"));
                entrenador.setNombre(rs.getString("nombre"));
                entrenador.setApellido(rs.getString("apellido"));
                entrenador.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el entrenador");
            }
                ps.close();
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Entrenador "+ex.getMessage()); 
      }
            return entrenador;
        }
    
       public List<Entrenador> buscarEntrenadorPorEspecialidad(String especialidad) {
        List<Entrenador> entrenadores = new ArrayList<>();
        try {
            String sql = "SELECT * FROM entrenador WHERE especialidad = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, especialidad);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Entrenador entrenador = new Entrenador();
                entrenador.setIdEntrenador(rs.getInt("idEntrenador"));
                entrenador.setDni(rs.getString("dni"));
                entrenador.setNombre(rs.getString("nombre"));
                entrenador.setApellido(rs.getString("apellido"));
                entrenador.setEspecialidad(rs.getString("especialidad"));
                entrenador.setEstado(rs.getBoolean("estado"));
                entrenadores.add(entrenador);
                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Entrenador " + ex.getMessage());
        }
        return entrenadores;
    
    }
    
       public void modificarAlumno(Entrenador entrenador) {
        String sql = "UPDATE entrenador SET dni = ?, nombre = ?, apellido = ?, especialidad = ? "
                + "WHERE idEntrenador = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, entrenador.getDni());
            ps.setString(3, entrenador.getNombre());
            ps.setString(2, entrenador.getApellido());
            ps.setString(4, entrenador.getEspecialidad());
            ps.setInt(5, entrenador.getIdEntrenador());
            int filas = ps.executeUpdate();
            if (filas == 1) {
                JOptionPane.showMessageDialog(null, "Se modificó el entrenador");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla entrenador");
            System.out.println(ex.getMessage());
        }
    } 
       
         public void eliminarAlumno(int idEntrenador) {
        String sql = "UPDATE entrenador SET estado = 0 WHERE idEntrenador = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idEntrenador);
            int filas = ps.executeUpdate();
            if (filas == 1) {
                JOptionPane.showMessageDialog(null, "Entrenador Eliminado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla entrenador");
            System.out.println(ex.getMessage());
        }
    }
}

