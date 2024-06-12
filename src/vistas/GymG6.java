/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

/**
 *
 * @author elise
 */
public class GymG6 extends javax.swing.JFrame {

    /**
     * Creates new form GymG6
     */
    public GymG6() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMSocio = new javax.swing.JMenu();
        jMClases = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMEntrenadores = new javax.swing.JMenu();
        jMMembresia = new javax.swing.JMenu();
        jMAsistencias = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        jMenuBar1.setToolTipText("");

        jMSocio.setText("Socio");
        jMSocio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMSocioMouseClicked(evt);
            }
        });
        jMSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSocioActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMSocio);

        jMClases.setText("Clases");

        jMenuItem1.setText("Buscar Clases");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMClases.add(jMenuItem1);

        jMenuItem2.setText("Modificar clase");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMClases.add(jMenuItem2);

        jMenuBar1.add(jMClases);

        jMEntrenadores.setText("Entrenadores");
        jMEntrenadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMEntrenadoresMouseClicked(evt);
            }
        });
        jMEntrenadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMEntrenadoresActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMEntrenadores);

        jMMembresia.setText("Membresia");
        jMenuBar1.add(jMMembresia);

        jMAsistencias.setText("Asistencias");
        jMAsistencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMAsistenciasMouseClicked(evt);
            }
        });
        jMAsistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAsistenciasActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMAsistencias);

        setJMenuBar(jMenuBar1);
        jMenuBar1.getAccessibleContext().setAccessibleParent(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        BuscarClase buscarClase = new BuscarClase();
        buscarClase.setVisible(true);
        jDesktopPane1.add(buscarClase);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSocioActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jMSocioActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        AgregarModifClase agreModifClase = new AgregarModifClase();
        agreModifClase.setVisible(true);
        jDesktopPane1.add(agreModifClase);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMEntrenadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMEntrenadoresActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        Entrenadores formEntrenadores = new Entrenadores();
        formEntrenadores.setVisible(true);
        jDesktopPane1.add(formEntrenadores);        // TODO add your handling code here:
    }//GEN-LAST:event_jMEntrenadoresActionPerformed

    private void jMAsistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAsistenciasActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        FormularioAsistencias formAsistencia = new FormularioAsistencias();
        formAsistencia.setVisible(true);
        jDesktopPane1.add(formAsistencia);  // TODO add your handling code here:
    }//GEN-LAST:event_jMAsistenciasActionPerformed

    private void jMSocioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMSocioMouseClicked
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        FormularioSocio formSocio = new FormularioSocio();
        formSocio.setVisible(true);
        jDesktopPane1.add(formSocio);
    }//GEN-LAST:event_jMSocioMouseClicked

    private void jMEntrenadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMEntrenadoresMouseClicked
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        Entrenadores formEntrenadores = new Entrenadores();
        formEntrenadores.setVisible(true);
        jDesktopPane1.add(formEntrenadores);
    }//GEN-LAST:event_jMEntrenadoresMouseClicked

    private void jMAsistenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMAsistenciasMouseClicked
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        FormularioAsistencias formAsistencia = new FormularioAsistencias();
        formAsistencia.setVisible(true);
        jDesktopPane1.add(formAsistencia);
    }//GEN-LAST:event_jMAsistenciasMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GymG6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GymG6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GymG6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GymG6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GymG6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMAsistencias;
    private javax.swing.JMenu jMClases;
    private javax.swing.JMenu jMEntrenadores;
    private javax.swing.JMenu jMMembresia;
    private javax.swing.JMenu jMSocio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
