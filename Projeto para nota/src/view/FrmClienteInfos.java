/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import static view.FrmLanding.clienteController;

/**
 *
 * @author aluno
 */
public class FrmClienteInfos extends javax.swing.JFrame {
    private static FrmClienteInfos clienteInfoForm = null;

    /**
     * Creates new form FrmClienteInfos
     */
    private FrmClienteInfos() {
        initComponents();
    }
    
    public static FrmClienteInfos getInstancia(){
        if(clienteInfoForm == null){
            clienteInfoForm = new FrmClienteInfos();
        }
        return clienteInfoForm;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMaisVelho = new javax.swing.JButton();
        btnMaisJovem = new javax.swing.JButton();
        btnClientesAcima60 = new javax.swing.JButton();
        btnClientesMenoresIdade = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnMediaIdades = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnMaisVelho.setText("Cliente mais velho");
        btnMaisVelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisVelhoActionPerformed(evt);
            }
        });

        btnMaisJovem.setText("Cliente mais novo");
        btnMaisJovem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisJovemActionPerformed(evt);
            }
        });

        btnClientesAcima60.setText("Clientes mais velhos que 60 anos");
        btnClientesAcima60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesAcima60ActionPerformed(evt);
            }
        });

        btnClientesMenoresIdade.setText("Clientes menores de idade");
        btnClientesMenoresIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesMenoresIdadeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Informações sobre Clientes");

        btnMediaIdades.setText("Idade média dos clientes");
        btnMediaIdades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMediaIdadesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnClientesMenoresIdade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMaisJovem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClientesAcima60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMaisVelho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMediaIdades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(btnMaisVelho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMaisJovem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClientesAcima60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClientesMenoresIdade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMediaIdades)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMaisVelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisVelhoActionPerformed
        JOptionPane.showMessageDialog(null, "Cliente cadastrado mais velho: \n" + clienteController.clienteMaisVelho());
    }//GEN-LAST:event_btnMaisVelhoActionPerformed

    private void btnMaisJovemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisJovemActionPerformed
        JOptionPane.showMessageDialog(null, "Cliente cadastrado mais jovem: \n" + clienteController.clienteMaisNovo());
    }//GEN-LAST:event_btnMaisJovemActionPerformed

    private void btnClientesAcima60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesAcima60ActionPerformed
        JOptionPane.showMessageDialog(null, "Número de clientes com idade maior que 60 anos: \n" + clienteController.clienteMaisVelhos60());
    }//GEN-LAST:event_btnClientesAcima60ActionPerformed

    private void btnClientesMenoresIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesMenoresIdadeActionPerformed
        JOptionPane.showMessageDialog(null, "Número de clientes menores de idade: \n" + clienteController.clienteMaisNovos18());
    }//GEN-LAST:event_btnClientesMenoresIdadeActionPerformed

    private void btnMediaIdadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMediaIdadesActionPerformed
        JOptionPane.showMessageDialog(null, "Média de idade dos clientes: \n" + clienteController.clienteMediaIdades());
    }//GEN-LAST:event_btnMediaIdadesActionPerformed

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
            java.util.logging.Logger.getLogger(FrmClienteInfos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmClienteInfos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmClienteInfos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmClienteInfos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmClienteInfos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientesAcima60;
    private javax.swing.JButton btnClientesMenoresIdade;
    private javax.swing.JButton btnMaisJovem;
    private javax.swing.JButton btnMaisVelho;
    private javax.swing.JButton btnMediaIdades;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}