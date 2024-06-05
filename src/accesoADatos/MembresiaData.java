/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesoADatos;

import entidades.Membresia;
import entidades.Socio;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author NandoJ
 */
public class MembresiaData {

    private Connection conn = null;

    public MembresiaData() {
        conn = Conexion.getConexion();
    }
   public Membresia buscarMembresiaActiva(int idSocio){
        String sql= "SELECT * FROM  membresia WHERE estado = 1 AND idSocio = ? ";
        SocioData socioData=new SocioData();
        Socio socio=new Socio();
          Membresia membresia = new Membresia();
         try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idSocio);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
              
                membresia.setIdMembresia(rs.getInt("idMembresia"));
                socio=socioData.buscarSocioPorId(rs.getInt("idSocio"));
                membresia.setSocio(socio);
                membresia.setCantidadPases(rs.getInt("cantidadPases"));
                membresia.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                membresia.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                membresia.setCosto(rs.getDouble("costo"));
                membresia.setEstado(rs.getBoolean("estado"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla membresia");
        }
        return membresia;
    }
    
    
    public void renovarMembresia(int idSocio, int pases, int fechaInicio) {
        agregarMembresia(int idSocio, int pases, int fechaInicio);
    }
    
    public void modificarPases(int idSocio) {
//        Membresia mem = new Membresia();
//        
//        mem = buscarMembresiaActiva();
//        int cont = mem.getCantidadPases();
//        
        int cont = buscarMembresiaActiva().getCantidadPases();
        String sql = "UPDATE membresia SET pases = ? WHERE idSocio = ?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            cont -= 1;
            ps.setInt(1, cont);
            ps.setInt(2, idSocio);
            int filas = ps.executeUpdate();
            if (filas == 1) {
                JOptionPane.showMessageDialog(null, "Se restó un pase");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla membresia \n " + ex);
        }
    }

    public void cancelarMembresia(int idSocio) {
        String sql = "UPDATE membresia SET estado = 0 WHERE idSocio = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idSocio);
            int filas = ps.executeUpdate();
            if (filas == 1) {
                JOptionPane.showMessageDialog(null, "Se canceló la membresia");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla membresia \n " + ex);
        }
    }

}
