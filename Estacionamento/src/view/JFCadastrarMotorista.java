/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.bean.Motorista;
import model.dao.MotoristaDAO;

/**
 *
 * @author 01983820067
 */
public class JFCadastrarMotorista extends javax.swing.JFrame {

    /**
     * Creates new form JFCadastrarMotorista
     */
    public JFCadastrarMotorista() {
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

        BGGenero = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jRBMasc = new javax.swing.JRadioButton();
        jRBFem = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jTFCelular = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTFRg = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTFCpf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTFEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTFSenha = new javax.swing.JTextField();
        jBtnCancelar = new javax.swing.JButton();
        jBtnSalvar = new javax.swing.JButton();
        jBtnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Cadastrar Motorista");

        jLabel2.setText("Nome completo:");

        jTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeActionPerformed(evt);
            }
        });

        jLabel4.setText("Gênero:");

        BGGenero.add(jRBMasc);
        jRBMasc.setText("Masculino");
        jRBMasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBMascActionPerformed(evt);
            }
        });

        BGGenero.add(jRBFem);
        jRBFem.setText("Feminino");
        jRBFem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBFemActionPerformed(evt);
            }
        });

        jLabel5.setText("RG (apenas números):");

        jTFCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCelularActionPerformed(evt);
            }
        });

        jLabel6.setText("CPF (apenas números):");

        jTFRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFRgActionPerformed(evt);
            }
        });

        jLabel7.setText("DDD + Celular (apenas números):");

        jTFCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCpfActionPerformed(evt);
            }
        });

        jLabel8.setText("Email:");

        jTFEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEmailActionPerformed(evt);
            }
        });

        jLabel9.setText("Senha:");

        jTFSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFSenhaActionPerformed(evt);
            }
        });

        jBtnCancelar.setText("Cancelar");

        jBtnSalvar.setText("Salvar");
        jBtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalvarActionPerformed(evt);
            }
        });

        jBtnLimpar.setText("Limpar");
        jBtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFRg)
                            .addComponent(jTFCpf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFCelular)
                            .addComponent(jTFEmail)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRBMasc)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRBFem))
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTFSenha)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 140, Short.MAX_VALUE)
                                .addComponent(jBtnLimpar)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnCancelar)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFNome)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBMasc)
                    .addComponent(jRBFem))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCancelar)
                    .addComponent(jBtnSalvar)
                    .addComponent(jBtnLimpar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeActionPerformed

    private void jRBMascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBMascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBMascActionPerformed

    private void jRBFemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBFemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBFemActionPerformed

    private void jTFCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCelularActionPerformed

    private void jTFRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFRgActionPerformed

    private void jTFCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCpfActionPerformed

    private void jTFEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEmailActionPerformed

    private void jTFSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFSenhaActionPerformed

    private void jBtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalvarActionPerformed
        // TODO add your handling code here:
        Motorista m = new Motorista();
        MotoristaDAO dao = new MotoristaDAO();

        m.setNome(jTFNome.getText());

        if (jRBMasc.isSelected()) {
            m.setHomem(true);
        } else if (jRBFem.isSelected()) {
            m.setHomem(false);
        }

        m.setRg(jTFRg.getText());
        m.setCpf(jTFCpf.getText());
        m.setCelular(jTFCelular.getText());
        m.setEmail(jTFEmail.getText());
        m.setSenha(jTFSenha.getText());

        dao.create(m);

    }//GEN-LAST:event_jBtnSalvarActionPerformed

    private void jBtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimparActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jBtnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(JFCadastrarMotorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCadastrarMotorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCadastrarMotorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCadastrarMotorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCadastrarMotorista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BGGenero;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnLimpar;
    private javax.swing.JButton jBtnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRBFem;
    private javax.swing.JRadioButton jRBMasc;
    private javax.swing.JTextField jTFCelular;
    private javax.swing.JTextField jTFCpf;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFRg;
    private javax.swing.JTextField jTFSenha;
    // End of variables declaration//GEN-END:variables
}
