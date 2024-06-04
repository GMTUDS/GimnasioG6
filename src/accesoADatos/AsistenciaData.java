/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesoADatos;

import entidades.Asistencia;
import java.sql.*;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author NandoJ
 */
public class AsistenciaData {
    private Connection conn = null;
    
    public AsistenciaData() {
        conn=Conexion.getConexion();
    }
    
    public void agregarAsistencia(int idSocio, int idClase, LocalDate fechaAsistencia){
        String sql = "INSERT INTO asistencia (idSocio, IdClase, fechaAsistencia) "
                + "VALUES (?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idSocio);
            ps.setInt(2, idClase);
            ps.setDate(3, Date.valueOf(fechaAsistencia));
            int filas = ps.executeUpdate();
            if (filas==1) {
                JOptionPane.showMessageDialog(null, "Se agregó la asistencia");
            }
        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al"
//                    + "acceder a la tabla asistencia \n"+ex);
            System.out.println("Error al acceder a la tabla Asistencia \n"+ex);
        }
    }
    
    public void modificarAsistencia(Asistencia asistencia){
        String sql = "UPDATE asistencia SET IdAsistencia = ?,idSocio = ?,IdClase = ?,fechaAsistencia = ? WHERE idAsistencia = ?";
        
    }
    
    
}
