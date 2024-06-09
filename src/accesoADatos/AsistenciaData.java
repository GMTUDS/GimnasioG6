/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesoADatos;

import entidades.Asistencia;
import entidades.Clase;
import entidades.Socio;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author NandoJ
 */
public class AsistenciaData {

    private Connection conn = null;
    private SocioData soDa;
    private ClaseData claDa;
    private MembresiaData meDa;

    public AsistenciaData() {
        conn = Conexion.getConexion();
        soDa = new SocioData();
        claDa = new ClaseData();
        meDa = new MembresiaData();
    }

    public void agregarAsistencia(Asistencia asistencia) {
        if (meDa.buscarMembresiaActiva(asistencia.getSocio().getIdSocio()) == null) {
            JOptionPane.showMessageDialog(null, "El socio no tiene una membresia activa");
        } else {

            meDa.modificarPases(asistencia.getSocio().getIdSocio());
            String sql = "INSERT INTO asistencia (idSocio, idClase, fechaAsistencia) "
                    + "VALUES (?,?,?)";
            try {
                PreparedStatement ps = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, asistencia.getSocio().getIdSocio());
                ps.setInt(2, asistencia.getClase().getIdClase());
                ps.setDate(3, Date.valueOf(asistencia.getFechaAsistencia()));
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();
                while (rs.next()) {
                    asistencia.setIdAsistencia(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "Se agregó la asistencia");
                }
                ps.close();
            } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al"
//                    + "acceder a la tabla asistencia \n"+ex);
                System.out.println("Error al acceder a la tabla Asistencia \n" + ex);
            }
        }
    }

    public List<Asistencia> listarAsistenciasDelSocio(int idSocio) {
        ArrayList<Asistencia> listaAsistencias = new ArrayList<>();
        String sql = "SELECT asistencia.*, clase.nombre FROM asistencia JOIN clase "
                + "ON (asistencia.idClase = clase.idClase) WHERE idSocio = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idSocio);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Asistencia asistencia = new Asistencia();
                Socio socio = new Socio();
                Clase clase = new Clase();
                socio = soDa.buscarSocioPorId(rs.getInt("idSocio"));
                clase = claDa.buscarClasePorNombre(rs.getString("nombre"));
                asistencia.setClase(clase);
                asistencia.setIdAsistencia(rs.getInt("idAsistencia"));
                asistencia.setSocio(socio);
                asistencia.setFechaAsistencia(rs.getDate("fechaAsistencia").toLocalDate());
                listaAsistencias.add(asistencia);
            }
            ps.close();
        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al"
//                    + "acceder a la tabla asistencia \n"+ex);
            System.out.println("Error al acceder a la tabla Asistencia \n" + ex);
        }
        return listaAsistencias;
    }

    public void modificarAsistencia(Asistencia asistencia) {
        String sql = "UPDATE asistencia SET idSocio = ?, idClase = ?, fechaAsistencia = ? WHERE idAsistencia = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, asistencia.getSocio().getIdSocio());
            ps.setInt(2, asistencia.getClase().getIdClase());
            ps.setDate(3, Date.valueOf(asistencia.getFechaAsistencia()));
            ps.setInt(4, asistencia.getIdAsistencia());
            int filas = ps.executeUpdate();

            if (filas == 1) {
                JOptionPane.showMessageDialog(null, "Se modificó la asistencia");
            }
            ps.close();
        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al"
//                    + "acceder a la tabla asistencia \n"+ex);
            System.out.println("Error al acceder a la tabla Asistencia \n" + ex);
        }
    }

    public void eliminarAsistencia(int idAsistencia) {
        String sql = "DELETE FROM asistencia WHERE idAsistencia = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idAsistencia);
            int filas = ps.executeUpdate();
            if (filas == 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó la asistencia");
            }
            ps.close();
        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al"
//                    + "acceder a la tabla asistencia \n"+ex);
            System.out.println("Error al acceder a la tabla Asistencia \n" + ex);
        }
    }
}
