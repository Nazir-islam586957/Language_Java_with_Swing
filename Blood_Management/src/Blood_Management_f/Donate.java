package Blood_Management_f;

import com.sun.org.apache.bcel.internal.generic.Select;
import java.sql.Connection;
import java.util.Date; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.print.attribute.Size2DSyntax.MM;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nazirul
 */
public final class Donate extends javax.swing.JFrame {

    Connection ct = null;
    PreparedStatement ps = null;
    Statement st = null;
    ResultSet rs = null;

    String Donarid, id, age, health, LastDonate, date = "";
    private String selecteQuery;

    public Donate() {
        initComponents();
        selectID();
//        todaydate();
    }

    void todaydate() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
            
   ((JTextField)d_date.getDateEditor().getUiComponent()).setText(""+formatter.format(date));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        age_txt = new javax.swing.JTextField();
        update_b = new javax.swing.JButton();
        show_b = new javax.swing.JButton();
        clear_b = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        health_txt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        d_date = new org.netbeans.modules.form.InvalidComponent();
        l_date = new org.netbeans.modules.form.InvalidComponent();
        add_b = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Donate Information");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(320, 50, 343, 38);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Donar ID Select :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 130, 160, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Age                  :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 180, 150, 40);

        age_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                age_txtActionPerformed(evt);
            }
        });
        jPanel1.add(age_txt);
        age_txt.setBounds(200, 180, 190, 40);

        update_b.setBackground(new java.awt.Color(0, 102, 51));
        update_b.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        update_b.setForeground(new java.awt.Color(255, 255, 255));
        update_b.setText("Update");
        update_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_bActionPerformed(evt);
            }
        });
        jPanel1.add(update_b);
        update_b.setBounds(530, 460, 130, 40);

        show_b.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        show_b.setText("Show");
        show_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_bActionPerformed(evt);
            }
        });
        jPanel1.add(show_b);
        show_b.setBounds(200, 460, 130, 40);

        clear_b.setBackground(new java.awt.Color(255, 0, 0));
        clear_b.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        clear_b.setForeground(new java.awt.Color(255, 255, 255));
        clear_b.setText("Clear");
        clear_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_bActionPerformed(evt);
            }
        });
        jPanel1.add(clear_b);
        clear_b.setBounds(350, 460, 130, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Donar ID Select ", "Age", "Health", "Last Donate", "Donate Date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(410, 120, 570, 290);

        health_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                health_txtActionPerformed(evt);
            }
        });
        jPanel1.add(health_txt);
        health_txt.setBounds(200, 240, 190, 40);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Donate Date  :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 360, 150, 40);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Health             :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 240, 150, 40);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Last Donate    :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(40, 300, 150, 40);

        jPanel1.add(d_date);
        d_date.setBounds(200, 360, 190, 40);

        jPanel1.add(l_date);
        l_date.setBounds(200, 300, 190, 40);

        add_b.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        add_b.setText("Add");
        add_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_bActionPerformed(evt);
            }
        });
        jPanel1.add(add_b);
        add_b.setBounds(40, 460, 130, 40);

        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(200, 130, 190, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Blood_Management_f/th (1).jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(-30, -50, 1230, 700);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, -30, 990, 600);

        setSize(new java.awt.Dimension(1006, 576));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void age_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_age_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_age_txtActionPerformed

    private void health_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_health_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_health_txtActionPerformed

    private void show_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_bActionPerformed
        // Show button

        selectAllData();
    }//GEN-LAST:event_show_bActionPerformed

    private void add_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_bActionPerformed
        // Add button

         if (age_txt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Age IS EMpty");
            age_txt.requestFocus();
        } else if (health_txt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Health IS EMpty");
            health_txt.requestFocus();

        } else if (((JTextField) l_date.getDateEditor().getUiComponent()).getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "last Donate IS EMpty");
            l_date.requestFocus();
        } else if (((JTextField) d_date.getDateEditor().getUiComponent()).getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Donate Date IS EMpty");
            d_date.requestFocus();

        } else {
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            String ldate = sf.format(l_date.getDate());
            String ddate = sf.format(d_date.getDate());
 

            try {              
       
 contest();
                String inserQ = "INSERT INTO `donate`(`Donar_ID_Select`, `Age`,`Health`,`Last_Donate`,`Donate_Date`)VALUES ('" + jComboBox1.getSelectedItem() + "','" + age_txt.getText() + "','" + health_txt.getText() + "','" + ldate+ "','" +ddate + "')";
                ps = ct.prepareCall(inserQ);
                int m = ps.executeUpdate();
                if (m > 0) {

                    JOptionPane.showMessageDialog(rootPane, "Success");
                    selectAllData();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Faild");
                }

            } catch (SQLException ex) {
                Logger.getLogger(Donate.class.getName()).log(Level.SEVERE, null, ex);
            }

            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            if (dtm.getRowCount() <= 0) {
                dtm.addRow(new Object[]{ age, health, LastDonate, date});
            }
        }
    }//GEN-LAST:event_add_bActionPerformed


    private void clear_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_bActionPerformed
        // Clear button

        data_clr();
    }//GEN-LAST:event_clear_bActionPerformed

    private void update_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_bActionPerformed

    void selectAllData() {
   try {
            contest();
            DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
            dt.setRowCount(0);

            String selectQuery = "SELECT `Donar_ID_Select`, `Age`,`Health`,`Last_Donate`,`Donate_Date` FROM  `donate`";
            st = ct.prepareCall(selectQuery);
            rs = st.executeQuery(selectQuery);
            while (rs.next()) {

                dt.addRow(new Object[]{
                    rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getDate(4), rs.getDate(5)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Donate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void contest() {
        try {
            ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_management", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(Donate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void selectID() {
        try {
            contest();
            String idQueary = "SELECT `ID` FROM `donner`";
            ps = ct.prepareCall(idQueary);
            rs = ps.executeQuery(idQueary);
            while (rs.next()) {
                jComboBox1.addItem("" + rs.getInt(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Donate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void data_clr() {
        jComboBox1.removeAllItems();
        age_txt.setText("");
        health_txt.setText("");
        l_date.cleanup();
        d_date.cleanup();

    }

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
            java.util.logging.Logger.getLogger(Donate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Donate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Donate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Donate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Donate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_b;
    private javax.swing.JTextField age_txt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear_b;
    private org.netbeans.modules.form.InvalidComponent d_date;
    private javax.swing.JTextField health_txt;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private org.netbeans.modules.form.InvalidComponent l_date;
    private javax.swing.JButton show_b;
    private javax.swing.JButton update_b;
    // End of variables declaration//GEN-END:variables
}
