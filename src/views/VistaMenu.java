
package views;

import java.awt.event.ActionListener;
import static views.InterfaceMenu.botonAgregarInt;
import static views.InterfaceMenu.botonListarInt;
import static views.InterfaceMenu.botonSalirInt;

public class VistaMenu extends javax.swing.JFrame implements InterfaceMenu {

   
    public VistaMenu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        botonAgregar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        botonListar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 112, 70));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonSalir.setBackground(new java.awt.Color(244, 192, 80));
        botonSalir.setFont(new java.awt.Font("Leelawadee", 2, 24)); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.setBorder(null);
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 100, 30));

        botonAgregar.setBackground(new java.awt.Color(0, 0, 0));
        botonAgregar.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        botonAgregar.setText("Agregar");
        botonAgregar.setBorder(null);
        botonAgregar.setContentAreaFilled(false);
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(botonAgregar);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 170, -1));

        botonListar.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        botonListar.setText("Listar");
        botonListar.setBorder(null);
        botonListar.setContentAreaFilled(false);
        botonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListarActionPerformed(evt);
            }
        });
        jPanel4.add(botonListar);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 170, 40));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("U");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("M");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("E");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("N");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonListarActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAgregarActionPerformed

   
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
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonListar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

    @Override
    public void ejecutar() {
        this.setVisible(true);
    }

    @Override
    public void setControlador(views.Controlador c) {
        botonListar.setActionCommand(botonListarInt);
        botonAgregar.setActionCommand(botonAgregarInt);
        botonSalir.setActionCommand(botonSalirInt);

        botonListar.addActionListener((ActionListener) c);
        botonAgregar.addActionListener((ActionListener) c);
        botonSalir.addActionListener((ActionListener) c);
    }

    @Override
    public void salir() {
        this.dispose();
    }

}
