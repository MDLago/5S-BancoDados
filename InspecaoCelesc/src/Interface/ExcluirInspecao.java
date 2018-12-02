/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.sql.Connection;
import javax.swing.JOptionPane;
import Core.Inspecao;

/**
 *
 * @author marco
 */
public class ExcluirInspecao extends javax.swing.JFrame {

    /**
     * Creates new form ExcluirInspecao
     */
    public ExcluirInspecao() {
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

        ExcluirPostePainel1 = new javax.swing.JPanel();
        excluirInspecaoLabel1 = new javax.swing.JLabel();
        excluirInspecaoLabel2 = new javax.swing.JLabel();
        excluirInspecaoCampo1 = new javax.swing.JTextField();
        excluirInspecaoBtn1 = new javax.swing.JButton();
        excluirInspecaoBtn3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        excluirInspecaoLabel1.setText("Excluir Inspeção");

        excluirInspecaoLabel2.setText("ID");

        excluirInspecaoCampo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirInspecaoCampo1ActionPerformed(evt);
            }
        });

        excluirInspecaoBtn1.setText("Apagar");
        excluirInspecaoBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirInspecaoBtn1ActionPerformed(evt);
            }
        });

        excluirInspecaoBtn3.setText("Cancelar");
        excluirInspecaoBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirInspecaoBtn3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ExcluirPostePainel1Layout = new javax.swing.GroupLayout(ExcluirPostePainel1);
        ExcluirPostePainel1.setLayout(ExcluirPostePainel1Layout);
        ExcluirPostePainel1Layout.setHorizontalGroup(
            ExcluirPostePainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExcluirPostePainel1Layout.createSequentialGroup()
                .addGroup(ExcluirPostePainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ExcluirPostePainel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ExcluirPostePainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(excluirInspecaoBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(excluirInspecaoLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ExcluirPostePainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(excluirInspecaoCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(excluirInspecaoBtn3)))
                    .addGroup(ExcluirPostePainel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(excluirInspecaoLabel1)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        ExcluirPostePainel1Layout.setVerticalGroup(
            ExcluirPostePainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExcluirPostePainel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(excluirInspecaoLabel1)
                .addGap(30, 30, 30)
                .addGroup(ExcluirPostePainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(excluirInspecaoLabel2)
                    .addComponent(excluirInspecaoCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(ExcluirPostePainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(excluirInspecaoBtn1)
                    .addComponent(excluirInspecaoBtn3))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExcluirPostePainel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExcluirPostePainel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void excluirInspecaoCampo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirInspecaoCampo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_excluirInspecaoCampo1ActionPerformed

    private void excluirInspecaoBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirInspecaoBtn1ActionPerformed
        Connection con = null;
        try {
            con = SGBD.Conexao.getConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", 0);
            return;
        }

        int id;
        id = Integer.parseInt(this.excluirInspecaoCampo1.getText());

        try{
            Inspecao.apagarInspecao(con, id);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", 0);
            return;
        }

        JOptionPane.showMessageDialog(null, "Excluido com sucesso", "Informação", 1);
    }//GEN-LAST:event_excluirInspecaoBtn1ActionPerformed

    private void excluirInspecaoBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirInspecaoBtn3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_excluirInspecaoBtn3ActionPerformed

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
            java.util.logging.Logger.getLogger(ExcluirInspecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExcluirInspecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExcluirInspecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExcluirInspecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExcluirInspecao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ExcluirPostePainel1;
    private javax.swing.JButton excluirInspecaoBtn1;
    private javax.swing.JButton excluirInspecaoBtn3;
    private javax.swing.JTextField excluirInspecaoCampo1;
    private javax.swing.JLabel excluirInspecaoLabel1;
    private javax.swing.JLabel excluirInspecaoLabel2;
    // End of variables declaration//GEN-END:variables
}