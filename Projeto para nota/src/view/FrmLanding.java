/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ClienteController;
import controller.JogoController;

/**
 *
 * @author aluno
 * Fábio Henrique Benedicto - 200126
 * Pedro Losso Quintans - 200146
 */
public class FrmLanding extends javax.swing.JFrame {
    static ClienteController clienteController;
    static JogoController jogoController;

    /**
     * Creates new form FrmLanding
     */
    public FrmLanding() {
        clienteController = new ClienteController();
        jogoController = new JogoController();
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

        jLabel1 = new javax.swing.JLabel();
        btnAbrirGerenciarClientes = new javax.swing.JButton();
        btnAbrirBuscaJogos = new javax.swing.JButton();
        btnClienteInfos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnAbrirBuscaCliente = new javax.swing.JButton();
        btnJogosInfos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("CaixoteStore");

        btnAbrirGerenciarClientes.setText("Gerenciar Clientes");
        btnAbrirGerenciarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirGerenciarClientesActionPerformed(evt);
            }
        });

        btnAbrirBuscaJogos.setText("Buscar jogos");
        btnAbrirBuscaJogos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirBuscaJogosActionPerformed(evt);
            }
        });

        btnClienteInfos.setText("Informações sobre Clientes");
        btnClienteInfos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteInfosActionPerformed(evt);
            }
        });

        jButton1.setText("Gerenciar Jogos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAbrirBuscaCliente.setText("Buscar clientes");
        btnAbrirBuscaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirBuscaClienteActionPerformed(evt);
            }
        });

        btnJogosInfos.setText("Informações sobre Jogos");
        btnJogosInfos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogosInfosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnJogosInfos, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnAbrirGerenciarClientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(btnAbrirBuscaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnAbrirBuscaJogos)
                                    .addGap(2, 2, 2))
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnClienteInfos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(98, 98, 98))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnAbrirGerenciarClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbrirBuscaCliente)
                    .addComponent(btnAbrirBuscaJogos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClienteInfos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnJogosInfos)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirGerenciarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirGerenciarClientesActionPerformed
        FrmCliente clienteForm = FrmCliente.getInstancia();
        clienteForm.setVisible(true);
    }//GEN-LAST:event_btnAbrirGerenciarClientesActionPerformed

    private void btnAbrirBuscaJogosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirBuscaJogosActionPerformed
        FrmBuscaJogo buscaJogoForm = FrmBuscaJogo.getInstancia();
        buscaJogoForm.setVisible(true);
    }//GEN-LAST:event_btnAbrirBuscaJogosActionPerformed

    private void btnClienteInfosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteInfosActionPerformed
        FrmClienteInfos clientesInfoForm = FrmClienteInfos.getInstancia();
        clientesInfoForm.setVisible(true);
    }//GEN-LAST:event_btnClienteInfosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrmJogo jogoForm = FrmJogo.getInstancia();
        jogoForm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAbrirBuscaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirBuscaClienteActionPerformed
        FrmBuscaCliente buscaClienteForm = FrmBuscaCliente.getInstancia();
        buscaClienteForm.setVisible(true);
    }//GEN-LAST:event_btnAbrirBuscaClienteActionPerformed

    private void btnJogosInfosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogosInfosActionPerformed
        FrmJogoInfos clienteInfoForm = FrmJogoInfos.getInstancia();
        clienteInfoForm.setVisible(true);
    }//GEN-LAST:event_btnJogosInfosActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLanding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLanding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLanding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLanding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLanding().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirBuscaCliente;
    private javax.swing.JButton btnAbrirBuscaJogos;
    private javax.swing.JButton btnAbrirGerenciarClientes;
    private javax.swing.JButton btnClienteInfos;
    private javax.swing.JButton btnJogosInfos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}