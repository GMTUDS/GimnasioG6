
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
    
     public List<Entrenador> listarEntrenadores() {
        List<Entrenador> entrenadores = new ArrayList<>();
        try {
            String sql = "SELECT * FROM entrenador WHERE estado=1";
            PreparedStatement ps = con.prepareStatement(sql);
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
        String sql = "SELECT * FROM entrenador WHERE apellido = ? AND estado = 1";
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
                entrenador.setEspecialidad(rs.getString("especialidad"));
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
         public List<String> listarEspecialidades(){
     ArrayList<String> especialidades = new ArrayList<>();
     String sql = "SELECT DISTINCT especialidad FROM entrenador WHERE estado = 1";
        try{
            
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            String especialidad = rs.getString("especialidad");
            especialidades.add(especialidad);
            
            }
            ps.close();
        
        }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "error al acceder a la tabla");
            System.out.println(ex.getMessage());
        }
        return especialidades;
     
     }
             public Entrenador buscarEntrenadorPorId(int idEntrenador) {
        Entrenador entrenador =null;
        try {
            String sql = "SELECT * FROM entrenador WHERE idEntrenador = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idEntrenador);
            ResultSet rs = ps.executeQuery();
           
            while (rs.next()) {
                entrenador=new Entrenador();
                entrenador.setIdEntrenador(rs.getInt("idEntrenador"));
                entrenador.setDni(rs.getString("dni"));
                entrenador.setNombre(rs.getString("nombre"));
                entrenador.setApellido(rs.getString("apellido"));
                entrenador.setEspecialidad(rs.getString("especialidad"));
                entrenador.setEstado(rs.getBoolean("estado"));
                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Entrenador " + ex.getMessage());
        }
        return entrenador;
    
    }
    
       public void modificarEntrenador(Entrenador entrenador) {
        String sql = "UPDATE entrenador SET dni = ?, nombre = ?, apellido = ?, especialidad = ? "
                + "WHERE idEntrenador = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, entrenador.getDni());
            ps.setString(2, entrenador.getNombre());
            ps.setString(3, entrenador.getApellido());
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
       
         public void eliminarEntrenador(int idEntrenador) {
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

