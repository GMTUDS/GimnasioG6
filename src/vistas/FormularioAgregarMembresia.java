package vistas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author elise
 */
public class FormularioAgregarMembresia extends javax.swing.JInternalFrame {
   
    private Connection connection;
    /**
     * Creates new form FormularioAgregarMembresia
     */
    public FormularioAgregarMembresia() {
        this.connection = connection;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFDNISocio = new javax.swing.JTextField();
        jTFPases = new javax.swing.JTextField();
        jTFCostos = new javax.swing.JTextField();
        jLDNISocio = new javax.swing.JLabel();
        jLPases = new javax.swing.JLabel();
        jLFechaInicio = new javax.swing.JLabel();
        jLAgregarMembresia = new javax.swing.JLabel();
        jBAgregar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jLCostos = new javax.swing.JLabel();
        jDCFechaInicio = new com.toedter.calendar.JDateChooser();

        jLDNISocio.setText("DNI Socio");

        jLPases.setText("Pases");

        jLFechaInicio.setText("Fecha Inicio");

        jLAgregarMembresia.setText("Agregar Membresia");

        jBAgregar.setText("Agregar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jLCostos.setText("Costos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLAgregarMembresia))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLDNISocio)
                                    .addComponent(jLPases))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFPases)
                                    .addComponent(jTFDNISocio)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLCostos)
                                    .addComponent(jLFechaInicio))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jDCFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 109, Short.MAX_VALUE))
                                    .addComponent(jTFCostos)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBSalir)))))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLAgregarMembresia)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLDNISocio)
                    .addComponent(jTFDNISocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFPases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLPases))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCostos)
                    .addComponent(jTFCostos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLFechaInicio)
                    .addComponent(jDCFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAgregar)
                    .addComponent(jBSalir))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        agregarMembresia();
    }//GEN-LAST:event_jBAgregarActionPerformed

     private void agregarMembresia() {
        String dniSocio = jTFDNISocio.getText();
        String pases = jTFPases.getText();
        String costos = jTFCostos.getText();
        java.util.Date fechaInicio = jDCFechaInicio.getDate();
        
        if (dniSocio.isEmpty() || pases.isEmpty() || costos.isEmpty() || fechaInicio == null) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.");
            return;
        }

        String query = "INSERT INTO Membresía (ID_Socio, Tipo, Fecha_Inicio, Fecha_Fin) VALUES (?, ?, ?, ?)";
        
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, dniSocio);
            ps.setString(2, pases);
            ps.setDate(3, new java.sql.Date(fechaInicio.getTime()));
            ps.setString(4, costos);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Membresia agregada exitosamente.");
            limpiarCampos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al agregar membresia: " + ex.getMessage());
        }
    }
    
    private void limpiarCampos() {
        jTFDNISocio.setText("");
        jTFPases.setText("");
        jTFCostos.setText("");
        jDCFechaInicio.setDate(null);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBSalir;
    private com.toedter.calendar.JDateChooser jDCFechaInicio;
    private javax.swing.JLabel jLAgregarMembresia;
    private javax.swing.JLabel jLCostos;
    private javax.swing.JLabel jLDNISocio;
    private javax.swing.JLabel jLFechaInicio;
    private javax.swing.JLabel jLPases;
    private javax.swing.JTextField jTFCostos;
    private javax.swing.JTextField jTFDNISocio;
    private javax.swing.JTextField jTFPases;
    // End of variables declaration//GEN-END:variables
}
