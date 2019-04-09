/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniaestesting;

/**
 *
 * @author 1105864
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     * Mini-AES.png, encryptButton.png and DecryptButton.png images will need to be added to the miniaestesting project files
     */
    public GUI() {
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

        encryptButton = new javax.swing.JButton();
        decryptButton = new javax.swing.JButton();
        enterPlaintextField = new javax.swing.JTextField();
        enterKeyField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputField = new javax.swing.JTextArea();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        encryptButton.setBackground(new java.awt.Color(153, 51, 255));
        encryptButton.setForeground(new java.awt.Color(255, 51, 204));
        encryptButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniaestesting/encrypt.png"))); // NOI18N
        encryptButton.setMargin(new java.awt.Insets(2, 13, 2, 13));
        encryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptButtonActionPerformed(evt);
            }
        });
        getContentPane().add(encryptButton);
        encryptButton.setBounds(500, 240, 170, 40);

        decryptButton.setBackground(new java.awt.Color(255, 51, 255));
        decryptButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniaestesting/DecryptButton.png"))); // NOI18N
        decryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptButtonActionPerformed(evt);
            }
        });
        getContentPane().add(decryptButton);
        decryptButton.setBounds(800, 240, 170, 40);

        enterPlaintextField.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        enterPlaintextField.setText("Enter Plaintext");
        enterPlaintextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterPlaintextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(enterPlaintextField);
        enterPlaintextField.setBounds(50, 110, 930, 50);

        enterKeyField.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        enterKeyField.setText("Enter Key");
        enterKeyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterKeyFieldActionPerformed(evt);
            }
        });
        getContentPane().add(enterKeyField);
        enterKeyField.setBounds(50, 170, 930, 50);

        outputField.setColumns(20);
        outputField.setForeground(new java.awt.Color(255, 255, 255));
        outputField.setRows(5);
        jScrollPane1.setViewportView(outputField);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(500, 300, 480, 410);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniaestesting/Mini-Aes.png"))); // NOI18N
        Background.setText("jLabel1");
        getContentPane().add(Background);
        Background.setBounds(0, 0, 1062, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void encryptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_encryptButtonActionPerformed

    private void decryptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_decryptButtonActionPerformed

    private void enterPlaintextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterPlaintextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterPlaintextFieldActionPerformed

    private void enterKeyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterKeyFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterKeyFieldActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton decryptButton;
    private javax.swing.JButton encryptButton;
    private javax.swing.JTextField enterKeyField;
    private javax.swing.JTextField enterPlaintextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea outputField;
    // End of variables declaration//GEN-END:variables
}