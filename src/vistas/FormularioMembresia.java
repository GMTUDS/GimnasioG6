/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import accesoADatos.MembresiaData;
import entidades.Membresia;
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author elise
 */
public class FormularioMembresia extends javax.swing.JInternalFrame {
       private DefaultTableModel modelo=new DefaultTableModel();
      private MembresiaData membresiaData;
       FondoPanel fondo = new FondoPanel();
    public FormularioMembresia() {
        this.setContentPane(fondo);
        membresiaData=new MembresiaData();
        initComponents();
          armarCabecera();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFDniSocio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTMembresia = new javax.swing.JTable();
        jBSalir = new javax.swing.JButton();
        jBDarDeBaja = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();

        jLabel1.setText("Membresia");

        jLabel2.setText("ID Socio");

        jTMembresia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Pases", "Fecha de Inicio", "Costo"
            }
        ));
        jTMembresia.setEnabled(false);
        jScrollPane1.setViewportView(jTMembresia);

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBDarDeBaja.setText("Dar de Baja");
        jBDarDeBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDarDeBajaActionPerformed(evt);
            }
        });

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBDarDeBaja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 541, Short.MAX_VALUE)
                        .addComponent(jBSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTFDniSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBBuscar))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFDniSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir)
                    .addComponent(jBDarDeBaja)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBDarDeBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDarDeBajaActionPerformed
       membresiaData.cancelarMembresia(jTFDniSocio.getText());
    }//GEN-LAST:event_jBDarDeBajaActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
       borrarFilas();
       List<Membresia> membresias= membresiaData.historialDeMembresiasSocio(jTFDniSocio.getText());
        for (Membresia membresia : membresias) {
            String activo;
            if(membresia.isEstado()){
                activo="Activa";
            }else{
                activo="Inactiva";
            }
            modelo.addRow(new Object []{membresia.getIdMembresia(),membresia.getCantidadPases(),membresia.getFechaInicio(),
            membresia.getFechaFin(),membresia.getCosto(),activo});
          
        }
    }//GEN-LAST:event_jBBuscarActionPerformed
 public void armarCabecera(){
     modelo.addColumn("Id Membresia");
     modelo.addColumn("Pases Restantes");
     modelo.addColumn("Inicio");
     modelo.addColumn("Fin");
     modelo.addColumn("Costo");
     modelo.addColumn("Estado");
     jTMembresia.setModel(modelo);
 }
   public void borrarFilas(){
       int cantidadFilas= modelo.getRowCount();
       for (int i =cantidadFilas-1; i >= 0; i--) {
           modelo.removeRow(i);
       }
   }
   class FondoPanel extends JPanel {
        private Image imagen;
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/recursos/gym5.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
            setOpaque(false);
            super.paint(g);
            
            
        
    }}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBDarDeBaja;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFDniSocio;
    private javax.swing.JTable jTMembresia;
    // End of variables declaration//GEN-END:variables
}
