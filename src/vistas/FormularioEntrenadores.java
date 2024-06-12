
package vistas;

import accesoADatos.EntrenadorData;
import entidades.Entrenador;
import java.util.Date;
import javax.swing.JOptionPane;


public class FormularioEntrenadores extends javax.swing.JInternalFrame {
    
     EntrenadorData entrenadorData= new EntrenadorData();
     Entrenador entrenadorActual = null;
    public FormularioEntrenadores() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTIdEntrenador = new javax.swing.JTextField();
        jTDniEntrenador = new javax.swing.JTextField();
        jTApellidoEntrenador = new javax.swing.JTextField();
        jTNombreEntrenador = new javax.swing.JTextField();
        jTEspecialidadEntrenador = new javax.swing.JTextField();
        jBNuevo = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jRBEstadoEntrenador = new javax.swing.JRadioButton();
        jBBuscarN = new javax.swing.JButton();
        jBBuscarA = new javax.swing.JButton();
        jBBuscarI = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel1.setText("FORMULARIO ENTRENADORES");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setText("idEntrenador");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setText("Dni");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setText("Apellido");

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel5.setText("Nombre");

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel6.setText("Especialidad");

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel7.setText("Estado");

        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBBuscarN.setText("Buscar");
        jBBuscarN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarNActionPerformed(evt);
            }
        });

        jBBuscarA.setText("Buscar");
        jBBuscarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarAActionPerformed(evt);
            }
        });

        jBBuscarI.setText("Buscar");
        jBBuscarI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarIActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(58, 100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTEspecialidadEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTNombreEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTApellidoEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(jTIdEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTDniEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(228, 228, 228))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(85, 85, 85)
                                .addComponent(jRBEstadoEntrenador))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBBuscarN)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBBuscarA)
                                    .addComponent(jBBuscarI)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jBNuevo)
                        .addGap(41, 41, 41)
                        .addComponent(jBGuardar)
                        .addGap(34, 34, 34)
                        .addComponent(jBEliminar)
                        .addGap(34, 34, 34)
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel2)
                                                            .addComponent(jTIdEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(25, 25, 25)
                                                        .addComponent(jLabel4))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jBBuscarI)
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jTApellidoEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jBBuscarA))))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(20, 20, 20)
                                                        .addComponent(jTNombreEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(33, 33, 33)
                                                        .addComponent(jLabel5))))
                                            .addComponent(jBBuscarN))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3))
                                    .addComponent(jTDniEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addComponent(jLabel6))
                            .addComponent(jTEspecialidadEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addComponent(jLabel7))
                    .addComponent(jRBEstadoEntrenador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jBGuardar)
                    .addComponent(jBEliminar)
                    .addComponent(jBSalir))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        
        try{
        
            Integer dni=Integer.parseInt(jTDniEntrenador.getText());
            String apellido = jTApellidoEntrenador.getText();
            String nombre= jTNombreEntrenador.getText();
            String especialidad = jTEspecialidadEntrenador.getText();
            boolean estado = jRBEstadoEntrenador.isSelected();
            
            if (entrenadorActual==null){
                String dnis = String.valueOf(dni);
                entrenadorActual = new Entrenador (dnis, apellido, nombre, especialidad, estado);
                entrenadorData.guardarEntrenador(entrenadorActual);
            }else{
                String dnis = String.valueOf(dni);
            entrenadorActual.setDni(dnis);
            entrenadorActual.setApellido(apellido);
            entrenadorActual.setNombre(nombre);
            entrenadorActual.setEspecialidad(especialidad);
            entrenadorActual.setEstado(estado);
            entrenadorData.modificarEntrenador(entrenadorActual);
            }
            }catch(NumberFormatException e){
           JOptionPane.showMessageDialog(this,"Por favor, ingrese un dni valido");
             }catch(Exception ex){
                 JOptionPane.showMessageDialog(this,"Exception"+ex.getMessage());
                 ex.printStackTrace();
            }
                    
            
            
        
        
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        limpiarCampos();
       entrenadorActual=null;
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBBuscarNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarNActionPerformed
        
        try{
        String nombre = jTNombreEntrenador.getText();
        entrenadorActual= entrenadorData.buscarEntrenadorPorNombre(nombre);
        
        if(entrenadorActual!= null){
            
        jTIdEntrenador.setText(String.valueOf(entrenadorActual.getIdEntrenador()));
        jTDniEntrenador.setText(entrenadorActual.getDni());
        jTApellidoEntrenador.setText(entrenadorActual.getApellido());
        jTEspecialidadEntrenador.setText(entrenadorActual.getEspecialidad());
        jRBEstadoEntrenador.setSelected(entrenadorActual.isEstado());
        }
        
         }catch(IllegalArgumentException e){
           JOptionPane.showMessageDialog(this,"Ingrese un nombre valido"+e.getMessage());
           e.printStackTrace();
        }
    }//GEN-LAST:event_jBBuscarNActionPerformed

    private void jBBuscarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarAActionPerformed
         try{
        String apellido = jTApellidoEntrenador.getText();
        entrenadorActual= entrenadorData.buscarEntrenadorPorApellido(apellido);
        
        if(entrenadorActual!= null){
        jTIdEntrenador.setText(String.valueOf(entrenadorActual.getIdEntrenador()));
        jTDniEntrenador.setText(entrenadorActual.getDni());
        jTNombreEntrenador.setText(entrenadorActual.getNombre());
        jTEspecialidadEntrenador.setText(entrenadorActual.getEspecialidad());
        jRBEstadoEntrenador.setSelected(entrenadorActual.isEstado());
        }
        
         }catch(IllegalArgumentException e){
           JOptionPane.showMessageDialog(this,"Ingrese un apellido valido"+e.getMessage());
           e.printStackTrace();
        }
    }//GEN-LAST:event_jBBuscarAActionPerformed

    private void jBBuscarIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarIActionPerformed
        try{
           Integer id=Integer.parseInt(jTIdEntrenador.getText());
 
           entrenadorActual= entrenadorData.buscarEntrenadorPorId(id);
                   
            if(entrenadorActual!= null){
                jTNombreEntrenador.setText(entrenadorActual.getNombre());
                jTApellidoEntrenador.setText(entrenadorActual.getApellido());
                jRBEstadoEntrenador.setSelected(entrenadorActual.isEstado());
                jTEspecialidadEntrenador.setText(entrenadorActual.getEspecialidad());
                jTDniEntrenador.setText(entrenadorActual.getDni());
            }
            
       }catch(NumberFormatException e){
           JOptionPane.showMessageDialog(this,"ingrese un id valido");
       }catch(Exception ex){
           JOptionPane.showMessageDialog(this,"Exception"+ex.getMessage());
           ex.printStackTrace();
       }
    }//GEN-LAST:event_jBBuscarIActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
                                                  
         if(entrenadorActual != null){
            entrenadorData.eliminarEntrenador(entrenadorActual.getIdEntrenador());
            entrenadorActual=null;
            limpiarCampos();
        }else{
            JOptionPane.showMessageDialog(this,"No existe el entrenador a eliminar");
        }
          
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed
    
    
    private void limpiarCampos(){
       jTIdEntrenador.setText("");
       jTDniEntrenador.setText("");
       jTNombreEntrenador.setText("");
       jTApellidoEntrenador.setText("");
       jRBEstadoEntrenador.setSelected(true);
       jTEspecialidadEntrenador.setText("");
       
       
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscarA;
    private javax.swing.JButton jBBuscarI;
    private javax.swing.JButton jBBuscarN;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRBEstadoEntrenador;
    private javax.swing.JTextField jTApellidoEntrenador;
    private javax.swing.JTextField jTDniEntrenador;
    private javax.swing.JTextField jTEspecialidadEntrenador;
    private javax.swing.JTextField jTIdEntrenador;
    private javax.swing.JTextField jTNombreEntrenador;
    // End of variables declaration//GEN-END:variables
}