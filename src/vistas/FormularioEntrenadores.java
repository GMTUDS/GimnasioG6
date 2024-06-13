
package vistas;

import accesoADatos.EntrenadorData;
import entidades.Entrenador;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class FormularioEntrenadores extends javax.swing.JInternalFrame {
    FondoPanel fondo = new FondoPanel();
     EntrenadorData entrenadorData= new EntrenadorData();
     Entrenador entrenadorActual = null;
    public FormularioEntrenadores() {
        this.setContentPane(fondo);
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

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 17)); // NOI18N
        jLabel1.setText("FORMULARIO ENTRENADORES");
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel2.setText("idEntrenador");
        jLabel2.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel3.setText("Dni");
        jLabel3.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel4.setText("Apellido");
        jLabel4.setOpaque(true);

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel5.setText("Nombre");
        jLabel5.setOpaque(true);

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel6.setText("Especialidad");
        jLabel6.setOpaque(true);

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel7.setText("Estado");
        jLabel7.setOpaque(true);

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
                .addGap(58, 82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                    .addComponent(jTDniEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTEspecialidadEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRBEstadoEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBBuscarI)
                    .addComponent(jBBuscarA))
                .addGap(130, 130, 130))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jBNuevo)
                        .addGap(29, 29, 29)
                        .addComponent(jBGuardar)
                        .addGap(34, 34, 34)
                        .addComponent(jBEliminar)
                        .addGap(34, 34, 34)
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(190, 190, 190)
                                .addComponent(jBBuscarN))
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTDniEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTEspecialidadEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTIdEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBBuscarI))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jBBuscarA))))
                            .addComponent(jTApellidoEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTNombreEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBBuscarN)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel5)))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRBEstadoEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
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
class FondoPanel extends JPanel {
        private Image imagen;
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/recursos/ve_.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
            setOpaque(false);
            super.paint(g);
            
            
        
    }}
}
