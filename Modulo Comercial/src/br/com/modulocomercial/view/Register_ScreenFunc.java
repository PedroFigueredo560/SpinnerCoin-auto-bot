package br.com.modulocomercial.view;

import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author joanb
 */


public class Register_ScreenFunc extends javax.swing.JFrame {

    /**
     * Creates new form Register_Screen
     */
    public Register_ScreenFunc() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanelRS = new javax.swing.JPanel();
        jPanelES = new javax.swing.JPanel();
        jLabelEmployeeRegis = new javax.swing.JLabel();
        jTextFieldCPFES = new javax.swing.JFormattedTextField();
        jTextFieldNameES = new javax.swing.JFormattedTextField();
        jTextFieldUsernameES = new javax.swing.JFormattedTextField();
        jTextFieldPasswordES = new javax.swing.JFormattedTextField();
        jComboBoxFunctionES = new javax.swing.JComboBox<>();
        jButtonRETURNES = new javax.swing.JButton();
        jButtonREGISTERES = new javax.swing.JButton();
        jLabelFunctionES = new javax.swing.JLabel();
        jLabelCPFES = new javax.swing.JLabel();
        jLabelPasswordES = new javax.swing.JLabel();
        jLabelUsernameES = new javax.swing.JLabel();
        jLabelNameES = new javax.swing.JLabel();
        jLabelBackgroundES = new javax.swing.JLabel();

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo-azul-do-gradiente-de-luxo-abstrato-liso-azul-escuro-com-vinheta-preta-studio-banner.jpg"))); // NOI18N
        jLabel4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo-azul-do-gradiente-de-luxo-abstrato-liso-azul-escuro-com-vinheta-preta-studio-banner.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register Screen");

        jPanelRS.setBackground(new java.awt.Color(33, 54, 76));
        jPanelRS.setForeground(new java.awt.Color(204, 204, 204));
        jPanelRS.setMaximumSize(new java.awt.Dimension(0, 0));
        jPanelRS.setMinimumSize(new java.awt.Dimension(600, 400));
        jPanelRS.setPreferredSize(new java.awt.Dimension(600, 470));
        jPanelRS.setLayout(null);

        jPanelES.setBackground(new java.awt.Color(15, 27, 54));

        jLabelEmployeeRegis.setFont(new java.awt.Font("Impact", 0, 22)); // NOI18N
        jLabelEmployeeRegis.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmployeeRegis.setText("EMPLOYEE REGISTRATION");

        javax.swing.GroupLayout jPanelESLayout = new javax.swing.GroupLayout(jPanelES);
        jPanelES.setLayout(jPanelESLayout);
        jPanelESLayout.setHorizontalGroup(
            jPanelESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelESLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabelEmployeeRegis))
        );
        jPanelESLayout.setVerticalGroup(
            jPanelESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelESLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabelEmployeeRegis)
                .addContainerGap())
        );

        jPanelRS.add(jPanelES);
        jPanelES.setBounds(0, 0, 380, 50);

        jTextFieldCPFES.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldCPFES.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldCPFES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCPFESActionPerformed(evt);
            }
        });
        jPanelRS.add(jTextFieldCPFES);
        jTextFieldCPFES.setBounds(130, 230, 220, 30);

        jTextFieldNameES.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldNameES.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldNameES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameESActionPerformed(evt);
            }
        });
        jPanelRS.add(jTextFieldNameES);
        jTextFieldNameES.setBounds(130, 80, 220, 30);

        jTextFieldUsernameES.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldUsernameES.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldUsernameES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameESActionPerformed(evt);
            }
        });
        jPanelRS.add(jTextFieldUsernameES);
        jTextFieldUsernameES.setBounds(130, 130, 220, 30);

        jTextFieldPasswordES.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldPasswordES.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldPasswordES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPasswordESActionPerformed(evt);
            }
        });
        jPanelRS.add(jTextFieldPasswordES);
        jTextFieldPasswordES.setBounds(130, 180, 220, 30);

        jComboBoxFunctionES.setBackground(new java.awt.Color(51, 51, 51));
        jComboBoxFunctionES.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        jComboBoxFunctionES.setForeground(new java.awt.Color(51, 51, 51));
        jComboBoxFunctionES.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxFunctionES.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxFunctionES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFunctionESActionPerformed(evt);
            }
        });
        jPanelRS.add(jComboBoxFunctionES);
        jComboBoxFunctionES.setBounds(130, 280, 220, 30);

        jButtonRETURNES.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jButtonRETURNES.setForeground(new java.awt.Color(204, 0, 0));
        jButtonRETURNES.setText("RETURN");
        jButtonRETURNES.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRETURNES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRETURNESMouseClicked(evt);
            }
        });
        jPanelRS.add(jButtonRETURNES);
        jButtonRETURNES.setBounds(260, 340, 90, 30);

        jButtonREGISTERES.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jButtonREGISTERES.setForeground(new java.awt.Color(0, 102, 153));
        jButtonREGISTERES.setText("REGISTER");
        jButtonREGISTERES.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonREGISTERES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonREGISTERESMouseClicked(evt);
            }
        });
        jPanelRS.add(jButtonREGISTERES);
        jButtonREGISTERES.setBounds(130, 340, 100, 30);

        jLabelFunctionES.setFont(new java.awt.Font("Unispace", 0, 16)); // NOI18N
        jLabelFunctionES.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFunctionES.setText("FUNCTION:");
        jPanelRS.add(jLabelFunctionES);
        jLabelFunctionES.setBounds(40, 290, 90, 16);

        jLabelCPFES.setFont(new java.awt.Font("Unispace", 0, 16)); // NOI18N
        jLabelCPFES.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCPFES.setText("CPF:");
        jPanelRS.add(jLabelCPFES);
        jLabelCPFES.setBounds(90, 240, 40, 21);

        jLabelPasswordES.setFont(new java.awt.Font("Unispace", 0, 16)); // NOI18N
        jLabelPasswordES.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPasswordES.setText("PASSWORD:");
        jPanelRS.add(jLabelPasswordES);
        jLabelPasswordES.setBounds(40, 190, 90, 21);

        jLabelUsernameES.setFont(new java.awt.Font("Unispace", 0, 16)); // NOI18N
        jLabelUsernameES.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsernameES.setText("USERNAME:");
        jPanelRS.add(jLabelUsernameES);
        jLabelUsernameES.setBounds(40, 140, 90, 21);

        jLabelNameES.setFont(new java.awt.Font("Unispace", 0, 16)); // NOI18N
        jLabelNameES.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNameES.setText("NAME:");
        jPanelRS.add(jLabelNameES);
        jLabelNameES.setBounds(80, 90, 50, 21);

        jLabelBackgroundES.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/modulocomercial/imagens/fundo-azul-do-gradiente-de-luxo-abstrato-liso-azul-escuro-com-vinheta-preta-studio-banner.jpg"))); // NOI18N
        jPanelRS.add(jLabelBackgroundES);
        jLabelBackgroundES.setBounds(0, 50, 380, 370);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelRS, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelRS, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCPFESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCPFESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCPFESActionPerformed

    private void jTextFieldNameESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameESActionPerformed

    private void jTextFieldUsernameESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsernameESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsernameESActionPerformed

    private void jTextFieldPasswordESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPasswordESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPasswordESActionPerformed

    private void jComboBoxFunctionESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFunctionESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxFunctionESActionPerformed

    private void jButtonREGISTERESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonREGISTERESMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonREGISTERESMouseClicked

    private void jButtonRETURNESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRETURNESMouseClicked
        Principal_Scren rgf = new Principal_Scren();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonRETURNESMouseClicked

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
            java.util.logging.Logger.getLogger(Register_ScreenFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_ScreenFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_ScreenFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_ScreenFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_ScreenFunc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonREGISTERES;
    private javax.swing.JButton jButtonRETURNES;
    private javax.swing.JComboBox<String> jComboBoxFunctionES;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelBackgroundES;
    private javax.swing.JLabel jLabelCPFES;
    private javax.swing.JLabel jLabelEmployeeRegis;
    private javax.swing.JLabel jLabelFunctionES;
    private javax.swing.JLabel jLabelNameES;
    private javax.swing.JLabel jLabelPasswordES;
    private javax.swing.JLabel jLabelUsernameES;
    private javax.swing.JPanel jPanelES;
    private javax.swing.JPanel jPanelRS;
    private javax.swing.JFormattedTextField jTextFieldCPFES;
    private javax.swing.JFormattedTextField jTextFieldNameES;
    private javax.swing.JFormattedTextField jTextFieldPasswordES;
    private javax.swing.JFormattedTextField jTextFieldUsernameES;
    // End of variables declaration//GEN-END:variables
}
