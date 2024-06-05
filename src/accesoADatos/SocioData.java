/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesoADatos;

import entidades.Socio;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author Rebeca
 */
public class SocioData {
     private Connection con=null;
    
     public SocioData() {
        con = Conexion.getConexion();
    }
     public void agregarSocio(Socio socio){
         String sql = "INSERT INTO socio "
                + "(dni, nombre , apellido , edad , correo , telefono , estado ) "
                + "VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, socio.getDni());
            ps.setString(2, socio.getNombre());
            ps.setString(3, socio.getApellido());
            ps.setInt(4, socio.getEdad());
            ps.setString(5, socio.getCorreo());
            ps.setString(6, socio.getTelefono());
            ps.setBoolean(7, socio.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                socio.setIdSocio(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Socio guardado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla socio");
            System.out.println(ex.getMessage());
        }
     }
     public void modificarSocio(Socio socio) {
        String sql = "UPDATE socio SET dni = ?, nombre = ?, apellido = ?,  edad= ?, correo= ?, telefono= ? "
                + "WHERE idSocio = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, socio.getDni());
            ps.setString(2, socio.getNombre());
            ps.setString(3, socio.getApellido());
            ps.setInt(4,socio.getEdad());
            ps.setString(5,socio.getCorreo());
            ps.setString(6,socio.getTelefono());
            ps.setInt(7, socio.getIdSocio());
            int filas = ps.executeUpdate();
            if (filas == 1) {
                JOptionPane.showMessageDialog(null, "Se modificó el socio");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla socio");
            System.out.println(ex.getMessage());
        }
    }
        public void eliminarSocio(int idSocio) {
        String sql = "UPDATE socio SET estado = 0 WHERE idSocio = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idSocio);
            int filas = ps.executeUpdate();
            if (filas == 1) {
                JOptionPane.showMessageDialog(null, "Socio Eliminado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla socio");
            System.out.println(ex.getMessage());
        }
    }
        public Socio buscarSocioPorId(int idSocio) {
        Socio socio = null;
        String sql = "SELECT idSocio, dni, nombre, apellido, edad, correo, telefono FROM socio WHERE idSocio = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idSocio);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                socio = new Socio();
                socio.setIdSocio(rs.getInt("idSocio"));
                socio.setDni(rs.getString("dni"));
                socio.setNombre(rs.getString("nombre"));
                socio.setApellido(rs.getString("apellido"));
                socio.setEdad(rs.getInt("edad"));
                socio.setCorreo(rs.getString("correo"));
                socio.setTelefono(rs.getString("telefono"));
                socio.setEstado(true);
                System.out.println(socio.toString());
            } else {
                JOptionPane.showMessageDialog(null, "No existe el socio");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla socio " + ex.getMessage());
        }
        return socio;
    }
      public Socio buscarSocioPorNombre(String nombre) {
        Socio socio = null;
        String sql = "SELECT idSocio, dni, nombre, apellido, edad, correo, telefono FROM socio WHERE nombre = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                socio = new Socio();
                socio.setIdSocio(rs.getInt("idSocio"));
                socio.setDni(rs.getString("dni"));
                socio.setNombre(rs.getString("nombre"));
                socio.setApellido(rs.getString("apellido"));
                socio.setEdad(rs.getInt("edad"));
                socio.setCorreo(rs.getString("correo"));
                socio.setTelefono(rs.getString("telefono"));
                socio.setEstado(true);
                System.out.println(socio.toString());
            } else {
                JOptionPane.showMessageDialog(null, "No existe el socio");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla socio " + ex.getMessage());
        }
        return socio;
    }
         public List<Socio> listarSocios() {
        List<Socio> socios = new ArrayList<>();
        try {
            String sql = "SELECT * FROM socio WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Socio socio = new Socio();
                socio.setIdSocio(rs.getInt("idSocio"));
                socio.setDni(rs.getString("dni"));
                socio.setNombre(rs.getString("nombre"));
                socio.setApellido(rs.getString("apellido"));
                socio.setEdad(rs.getInt("edad"));
                socio.setCorreo(rs.getString("correo"));
                socio.setTelefono(rs.getString("telefono"));
                socio.setEstado(rs.getBoolean("estado"));
                socios.add(socio);
                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla socio " + ex.getMessage());
        }
        return socios;
    }
    }
     

