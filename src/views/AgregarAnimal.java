/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;
import data.Persistencia;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import domain.Pais;
/**
 *
 * @author USURIO
 *//**
 *
 * @author USURIO
 */
public class AgregarAnimal extends javax.swing.JFrame implements InterfaceAgregar{

    private boolean cambiosRealizados = false;
    /**
     * Creates new form AgregarAnimal
     */
     
    public AgregarAnimal() {
        initComponents();
    }

    public void limpiarCampos() {
        pesoText.setText("");
        pesoText.setText("");
        comboPais.setSelectedIndex(0);
        comboPais.setSelectedIndex(0);
        comboPais.setSelectedIndex(0);
        

        cambiosRealizados = false; // Reiniciás la bandera
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboEspecie1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        comboSectores1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        comboPais = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        edadText1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pesoText = new javax.swing.JTextField();
        botonSalir1 = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Especie");

        comboEspecie1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboEspecie1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEspecie1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sector");

        comboSectores1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboSectores1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSectores1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pais");

        comboPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPaisActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Edad");

        jLabel5.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Peso");

        botonSalir1.setBackground(new java.awt.Color(102, 0, 0));
        botonSalir1.setForeground(new java.awt.Color(255, 255, 255));
        botonSalir1.setText("SALIR");

        botonGuardar.setBackground(new java.awt.Color(0, 153, 153));
        botonGuardar.setText("GUARDAR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(comboEspecie1, 0, 152, Short.MAX_VALUE)
                                .addGap(192, 192, 192))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(comboSectores1, 0, 142, Short.MAX_VALUE)
                                        .addGap(153, 153, 153))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(comboPais, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(edadText1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel5)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(botonGuardar)
                                                            .addComponent(pesoText, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(botonSalir1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboEspecie1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboSectores1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(edadText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pesoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(botonSalir1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPaisActionPerformed

    private void comboEspecie1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEspecie1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEspecie1ActionPerformed

    private void comboSectores1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSectores1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSectores1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonSalir1;
    private javax.swing.JComboBox<String> comboEspecie1;
    private javax.swing.JComboBox<String> comboPais;
    private javax.swing.JComboBox<String> comboSectores1;
    private javax.swing.JTextField edadText1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField pesoText;
    // End of variables declaration//GEN-END:variables
@Override
    public void ejecutar() {
        this.setVisible(true);
    }

    @Override
    public void setControlador(Controlador c) {
        botonSalir1.setActionCommand(botonSalirInt);
        botonSalir1.addActionListener(c);
        botonGuardar.setActionCommand(botonAgregarInt);
        botonGuardar.addActionListener(c);
    }

    @Override
    public int getEdad() {
        try {
            return Integer.parseInt(pesoText.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese una edad válida.", "Error en la entrada", JOptionPane.ERROR_MESSAGE);
            return -1;
        }

    }

    public double getPeso() {
        try {
            return Double.parseDouble(pesoText.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese un peso válido.", "Error en la entrada", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    @Override
    public String getComboPais() {
        try {
            return comboPais.getSelectedItem().toString();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese un pais válido.", "Error en la entrada", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String getComboEspecie() {
        try {
            return comboPais.getSelectedItem().toString();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese una especie válida.", "Error en la entrada", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    @Override
    public int getComboSector() {
        try {
            return Integer.parseInt(comboPais.getSelectedItem().toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese un sector válido.", "Error en la entrada", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    

    

    public void actualizarComboSectores(String especie) {
        comboPais.removeAllItems();

        if (especie.equals("León") || especie.equals("Tigre")) {
            comboPais.addItem("2");
            comboPais.addItem("4");
            setEtiquetaAlimentacion("Carnívoro");
        } else if (especie.equals("Jirafa") || especie.equals("Elefante")) {
            comboPais.addItem("1");
            comboPais.addItem("3");
            setEtiquetaAlimentacion("Herbívoro");
        } else {
            comboPais.addItem("Seleccione la especie");
            setEtiquetaAlimentacion("-");
        }
    }

    public void cargarComboPais(data.Persistencia persistencia) {
        comboPais.removeAllItems();

        for (Pais pais : persistencia.getPaises()) {
            comboPais.addItem(pais.getNombre());
        }
    }

    public boolean isCambiosRealizados() {
        return cambiosRealizados;
    }

    public void setCambiosRealizados(boolean cambiosRealizados) {
        this.cambiosRealizados = cambiosRealizados;
    }

    @Override
    public void cerrar() {
       limpiarCampos(); 
       this.setVisible(false);
    }

    public void setEtiquetaAlimentacion(String carnívoro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
