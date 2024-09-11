package Biblioteca;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtISBN = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        jComboBoxAutor = new javax.swing.JComboBox<>();
        btnNuevoAutor = new javax.swing.JButton();
        txtSinopsis = new javax.swing.JTextField();
        btnTerror = new javax.swing.JRadioButton();
        btnCienciaFiccion = new javax.swing.JRadioButton();
        btnRomance = new javax.swing.JRadioButton();
        btnFantasia = new javax.swing.JRadioButton();
        jCheckBoxLeido = new javax.swing.JCheckBox();
        jCheckBoxLoTengo = new javax.swing.JCheckBox();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ISBN:");

        jLabel2.setText("Titulo:");

        jLabel3.setText("Autor:");

        jLabel4.setText("Sipnosis:");

        jLabel5.setText("Genero");

        txtISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtISBNActionPerformed(evt);
            }
        });

        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        jComboBoxAutor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAutorActionPerformed(evt);
            }
        });

        btnNuevoAutor.setText("Nuevo Autor");
        btnNuevoAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoAutorActionPerformed(evt);
            }
        });

        txtSinopsis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSinopsisActionPerformed(evt);
            }
        });

        btnTerror.setText("Terror");
        btnTerror.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerrorActionPerformed(evt);
            }
        });

        btnCienciaFiccion.setText("Ciencia Ficción");
        btnCienciaFiccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCienciaFiccionActionPerformed(evt);
            }
        });

        btnRomance.setText("Romance");
        btnRomance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRomanceActionPerformed(evt);
            }
        });

        btnFantasia.setText("Fantasia");
        btnFantasia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFantasiaActionPerformed(evt);
            }
        });

        jCheckBoxLeido.setText("Leido");
        jCheckBoxLeido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxLeidoActionPerformed(evt);
            }
        });

        jCheckBoxLoTengo.setText("Lo tengo");
        jCheckBoxLoTengo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxLoTengoActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNuevoAutor)
                            .addComponent(txtSinopsis)
                            .addComponent(txtISBN)
                            .addComponent(txtTitulo)
                            .addComponent(jComboBoxAutor, 0, 361, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTerror)
                            .addComponent(jCheckBoxLeido))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxLoTengo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRomance)
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnGuardar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnCancelar))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnCienciaFiccion)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnFantasia)))))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnNuevoAutor)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSinopsis, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btnTerror)
                    .addComponent(btnCienciaFiccion)
                    .addComponent(btnRomance)
                    .addComponent(btnFantasia))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxLeido)
                    .addComponent(jCheckBoxLoTengo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtISBNActionPerformed

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    private void jComboBoxAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAutorActionPerformed

    private void btnNuevoAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoAutorActionPerformed

    private void txtSinopsisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSinopsisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSinopsisActionPerformed

    private void btnTerrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerrorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTerrorActionPerformed

    private void btnRomanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRomanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRomanceActionPerformed

    private void btnCienciaFiccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCienciaFiccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCienciaFiccionActionPerformed

    private void btnFantasiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFantasiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFantasiaActionPerformed

    private void jCheckBoxLeidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxLeidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxLeidoActionPerformed

    private void jCheckBoxLoTengoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxLoTengoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxLoTengoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
            // Obtener los valores ingresados
        String isbn = txtISBN.getText();
        String titulo = txtTitulo.getText();
        String autor = (String) jComboBoxAutor.getSelectedItem();
        String sinopsis = txtSinopsis.getText();
        
        // Determinar el género seleccionado
        String genero = "";
        if (btnTerror.isSelected()) {
            genero = "Terror";
        } else if (btnCienciaFiccion.isSelected()) {
            genero = "Ciencia Ficción";
        } else if (btnRomance.isSelected()) {
            genero = "Romance";
        } else if (btnFantasia.isSelected()) {
            genero = "Fantasía";
        }

        // Determinar si el libro ha sido leído o si lo tienes
        boolean leido = jCheckBoxLeido.isSelected();
        boolean loTengo = jCheckBoxLoTengo.isSelected();

        // Guardar la información en un archivo
        guardarLibro(isbn, titulo, autor, sinopsis, genero, leido, loTengo);
    }//GEN-LAST:event_btnGuardarActionPerformed
    private void guardarLibro(String isbn, String titulo, String autor, String sinopsis, String genero, boolean leido, boolean loTengo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("libros.txt", true))) {
            writer.write(isbn + "," + titulo + "," + autor + "," + sinopsis + "," + genero + "," + leido + "," + loTengo);
            writer.newLine();
            JOptionPane.showMessageDialog(this, "Libro guardado correctamente");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar el libro");
        }
    }
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JRadioButton btnCienciaFiccion;
    private javax.swing.JRadioButton btnFantasia;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevoAutor;
    private javax.swing.JRadioButton btnRomance;
    private javax.swing.JRadioButton btnTerror;
    private javax.swing.JCheckBox jCheckBoxLeido;
    private javax.swing.JCheckBox jCheckBoxLoTengo;
    private javax.swing.JComboBox<String> jComboBoxAutor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtSinopsis;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
