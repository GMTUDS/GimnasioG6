/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import accesoADatos.AsistenciaData;
import accesoADatos.ClaseData;
import accesoADatos.SocioData;
import entidades.Asistencia;
import entidades.Clase;
import entidades.Socio;
import java.awt.Graphics;
import java.awt.Image;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author elise
 */
public class FormularioAsistencias extends javax.swing.JInternalFrame {
    /**
     * Creates new form Asistencias
     */
    FondoPanel fondo = new FondoPanel();
    
    SocioData socioData = new SocioData();
    ClaseData claseData = new ClaseData();
    LocalDate fechaActual = LocalDate.now();
    AsistenciaData asistenciaData = new AsistenciaData();
    Asistencia asistencia = null;

    private DefaultTableModel modelo;
    Socio socio = null;
    Clase clase = null;

    public FormularioAsistencias() {
        this.setContentPane(fondo);
        initComponents();
        modelo = new DefaultTableModel();
        jLFecha.setText(fechaActual.toString());
        armarCabecera();
        llenarCBClases();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLControlAsistencia = new javax.swing.JLabel();
        jTFdni = new javax.swing.JTextField();
        jLDNI = new javax.swing.JLabel();
        jBBuscar = new javax.swing.JButton();
        jTFNyASocio = new javax.swing.JTextField();
        jCBNombreClase = new javax.swing.JComboBox<>();
        jLNombreClase = new javax.swing.JLabel();
        jLHorario = new javax.swing.JLabel();
        jCBHorario = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jT = new javax.swing.JTable();
        jBMarcarAsistencia = new javax.swing.JButton();
        jLFecha = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLControlAsistencia.setText("Control de Asistencia");

        jLDNI.setText("DNI");

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jTFNyASocio.setText("Nombre y apellido del Socio");

        jCBNombreClase.setSelectedIndex(-1);
        jCBNombreClase.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBNombreClaseItemStateChanged(evt);
            }
        });

        jLNombreClase.setText("Nombre de la Clase");

        jLHorario.setText("Horario");

        jCBHorario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBHorarioItemStateChanged(evt);
            }
        });

        jT.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jT.setRowHeight(30);
        jScrollPane2.setViewportView(jT);

        jBMarcarAsistencia.setText("Marcar Asistencia");
        jBMarcarAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMarcarAsistenciaActionPerformed(evt);
            }
        });

        jLFecha.setText("Fecha: 11/06/2024");

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLNombreClase)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBNombreClase, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLHorario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLControlAsistencia)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jLFecha)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(jBMarcarAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBSalir))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTFNyASocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLDNI)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTFdni, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBBuscar)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLControlAsistencia)
                    .addComponent(jLFecha))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLDNI)
                    .addComponent(jBBuscar))
                .addGap(18, 18, 18)
                .addComponent(jTFNyASocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBNombreClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNombreClase)
                    .addComponent(jLHorario)
                    .addComponent(jCBHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBMarcarAsistencia)
                    .addComponent(jBSalir))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        // TODO add your handling code here:
        socio = socioData.buscarSocioPorDni(jTFdni.getText());
        if (socio != null) {
            jTFNyASocio.setText(socio.getNombre() + " " + socio.getApellido());
        } else {
            JOptionPane.showMessageDialog(this, "No existe el socio");
        }

    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jCBNombreClaseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBNombreClaseItemStateChanged
        // TODO add your handling code here:
//        borrarFila();

        String nombreClase = (String) jCBNombreClase.getSelectedItem();
        List<Clase> clasesHorarios = claseData.listarClasesPorNombre(nombreClase);
        limpiarItemsComboBox();
        for (Clase clasesHorario : clasesHorarios) {
            jCBHorario.addItem(clasesHorario.getHorario());
        }
        jCBHorario.setSelectedIndex(0);
    }//GEN-LAST:event_jCBNombreClaseItemStateChanged

    private void jCBHorarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBHorarioItemStateChanged
        // TODO add your handling code here:
//        borrarFila();

        if (jCBHorario.getSelectedItem() != null) {
            borrarFila();
            clase = claseData.buscarClasePorHorario((LocalTime) jCBHorario.getSelectedItem());

            String entrenador = clase.getEntrenador().getNombre() + " " + clase.getEntrenador().getApellido();

            modelo.addRow(new Object[]{clase.getIdClase(), entrenador, clase.getCapacidad()});
        }

    }//GEN-LAST:event_jCBHorarioItemStateChanged

    private void jBMarcarAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMarcarAsistenciaActionPerformed
        // TODO add your handling code here:
        if (socio == null) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un socio");
        } else if (clase == null) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una clase");
        }else{
            asistencia = new Asistencia(socio, clase, fechaActual);
            asistenciaData.agregarAsistencia(asistencia);
        }

//        asistencia.setClase(clase);
//        asistencia.setFechaAsistencia(fechaActual);
//        asistencia.setSocio(socio);
    }//GEN-LAST:event_jBMarcarAsistenciaActionPerformed
    private void limpiarItemsComboBox() {

        for (int i = jCBHorario.getItemCount() - 1; i >= 0; i--) {
            jCBHorario.removeItemAt(i);
        }
    }
    private void llenarCBClases(){
        List<String> nombresDeClases = claseData.listarNombresUnicosDeClases();
        for (String nombresDeClase : nombresDeClases) {
            jCBNombreClase.addItem(nombresDeClase);
        }
    }
    private void borrarFila() {
        if (jT.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }

    public void armarCabecera() {
        modelo.addColumn("idClase");
        modelo.addColumn("Entrenador");
        modelo.addColumn("Capacidad");
//        modelo.addColumn("Especialidad");
        jT.setModel(modelo);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBMarcarAsistencia;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<LocalTime> jCBHorario;
    private javax.swing.JComboBox<String> jCBNombreClase;
    private javax.swing.JLabel jLControlAsistencia;
    private javax.swing.JLabel jLDNI;
    private javax.swing.JLabel jLFecha;
    private javax.swing.JLabel jLHorario;
    private javax.swing.JLabel jLNombreClase;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jT;
    private javax.swing.JTextField jTFNyASocio;
    private javax.swing.JTextField jTFdni;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    class FondoPanel extends JPanel {
        private Image imagen;
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/recursos/fondogym2.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
            setOpaque(false);
            super.paint(g);
            
            
        
    }}

}
