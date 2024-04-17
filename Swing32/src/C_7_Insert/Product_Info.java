/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package C_7_Insert;

import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Product_Info extends javax.swing.JFrame {

    Connection ct = null;
    PreparedStatement ps = null;

    public Product_Info() {
        initComponents();
    }

    void contest() {
        try {
            ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_management", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(Product_Info.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id_txt = new javax.swing.JTextField();
        pName_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pPrice_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Modern No. 20", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Product Information");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 20, 900, 90);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Product Id");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(280, 100, 250, 50);

        id_txt.setText(" ");
        id_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_txtActionPerformed(evt);
            }
        });
        jPanel1.add(id_txt);
        id_txt.setBounds(280, 150, 380, 50);

        pName_txt.setText(" ");
        pName_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pName_txtActionPerformed(evt);
            }
        });
        jPanel1.add(pName_txt);
        pName_txt.setBounds(280, 260, 380, 50);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Product Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(280, 210, 250, 50);

        pPrice_txt.setText(" ");
        pPrice_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pPrice_txtActionPerformed(evt);
            }
        });
        jPanel1.add(pPrice_txt);
        pPrice_txt.setBounds(280, 360, 380, 50);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Product Price");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(280, 310, 250, 50);

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(380, 430, 170, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 550);

        setSize(new java.awt.Dimension(912, 557));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void id_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_txtActionPerformed

    private void pName_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pName_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pName_txtActionPerformed

    private void pPrice_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pPrice_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pPrice_txtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //Add
        if (id_txt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Id is EMpty....");
            id_txt.requestFocus();
        } else if (pName_txt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Product Name is EMpty....");
            pName_txt.requestFocus();
        } else if (pPrice_txt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Product Price is EMpty....");
            pPrice_txt.requestFocus();
        } else {
            try {
                contest();
                String inserQ = "INSERT INTO `product_info`(`P_id`,`P_Name`,`P_Price`)VALUES(?,?,?)";

                ps = ct.prepareCall(inserQ);
                ps.setString(1, id_txt.getText());
                ps.setString(2, pName_txt.getText());
                ps.setString(3, pPrice_txt.getText());

                int m = ps.executeUpdate();
                if (m > 0) {
                    JOptionPane.showMessageDialog(rootPane, "Success");
                    id_txt.setText("");
                    pName_txt.setText("");
                    pPrice_txt.setText("");
                    id_txt.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Fails");
                }

            } catch (SQLException ex) {
                Logger.getLogger(Product_Info.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Product_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product_Info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pName_txt;
    private javax.swing.JTextField pPrice_txt;
    // End of variables declaration//GEN-END:variables
}
