package bloodmanagmentsystem; 
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class Doner extends javax.swing.JFrame {

    Connection ct = null;
    PreparedStatement ps = null;
    Statement st = null;
    ResultSet rs = null;
 
    String id, name, age, bloodgroup, gender = "", mobile, address;
    private String selecteQuery;

    public Doner() {
        initComponents();
       // selectAllData();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id_txt = new javax.swing.JTextField();
        name_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        age_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mobile_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        address_txt = new javax.swing.JTextField();
        update_button = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        remove_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        rf = new javax.swing.JRadioButton();
        rm = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        Delete = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Shamim Sporshika Uni+BE", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Donar Information");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(330, 20, 330, 50);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 110, 80, 30);

        id_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_txtActionPerformed(evt);
            }
        });
        jPanel1.add(id_txt);
        id_txt.setBounds(180, 100, 260, 40);

        name_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_txtActionPerformed(evt);
            }
        });
        jPanel1.add(name_txt);
        name_txt.setBounds(180, 150, 260, 40);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 150, 80, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Age");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 200, 80, 40);

        age_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                age_txtActionPerformed(evt);
            }
        });
        jPanel1.add(age_txt);
        age_txt.setBounds(180, 200, 260, 40);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BloodGroup");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 250, 210, 40);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gender");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 300, 80, 40);

        mobile_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobile_txtActionPerformed(evt);
            }
        });
        jPanel1.add(mobile_txt);
        mobile_txt.setBounds(180, 350, 260, 40);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Mobile");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 350, 80, 40);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Address");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 400, 80, 40);

        address_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address_txtActionPerformed(evt);
            }
        });
        jPanel1.add(address_txt);
        address_txt.setBounds(180, 400, 260, 40);

        update_button.setBackground(new java.awt.Color(0, 153, 0));
        update_button.setText("Update");
        update_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_buttonMouseClicked(evt);
            }
        });
        update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttonActionPerformed(evt);
            }
        });
        update_button.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                update_buttonKeyPressed(evt);
            }
        });
        jPanel1.add(update_button);
        update_button.setBounds(530, 500, 130, 40);

        Clear.setBackground(new java.awt.Color(0, 153, 0));
        Clear.setText("Add");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel1.add(Clear);
        Clear.setBounds(60, 500, 130, 40);

        remove_button.setBackground(new java.awt.Color(255, 0, 0));
        remove_button.setForeground(new java.awt.Color(255, 255, 255));
        remove_button.setText("Show");
        remove_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(remove_button);
        remove_button.setBounds(360, 500, 130, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Age", "BloodGroup", "Gender", "Mobile", "Address"
            }
        ));
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(450, 100, 540, 340);

        buttonGroup4.add(rf);
        rf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rf.setForeground(new java.awt.Color(255, 255, 255));
        rf.setText("Female");
        jPanel1.add(rf);
        rf.setBounds(260, 310, 110, 30);

        buttonGroup4.add(rm);
        rm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rm.setForeground(new java.awt.Color(255, 255, 255));
        rm.setText("Male");
        jPanel1.add(rm);
        rm.setBounds(180, 310, 70, 30);

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(230, 500, 100, 40);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Blood", "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(180, 250, 260, 40);

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(Delete);
        Delete.setBounds(680, 500, 140, 40);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(910, 20, 60, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1010, 580);

        setSize(new java.awt.Dimension(999, 584));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void id_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_txtActionPerformed

    private void name_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_txtActionPerformed

    private void age_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_age_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_age_txtActionPerformed

    private void mobile_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobile_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobile_txtActionPerformed

    private void address_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_address_txtActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        //add_button
        if (id_txt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Id IS EMpty...");
            id_txt.requestFocus();
        } else if (name_txt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Name IS EMpty");
            name_txt.requestFocus();
        } else if (age_txt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Age IS EMpty");
            age_txt.requestFocus();
       
            } else if (jComboBox1.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "BloodGrour IS EMpty");
            jComboBox1.requestFocus();
             
        } else if (rm.isSelected() == false && rf.isSelected() == false) {
            JOptionPane.showMessageDialog(rootPane, "Gender IS EMpty");
            rm.requestFocus();
        } else if (mobile_txt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Mobile IS EMpty");
            mobile_txt.requestFocus();
        } else if (address_txt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Address IS EMpty");
            address_txt.requestFocus();
        } else {
            try {
               contest();
               String gen; 
               if(rm.isSelected()){
            gen=rm.getText().toString();
            }else if(rf.isSelected()){
            gen=rf.getText().toString();
            }else{
            gen=null;
            }
             String inserQ = "INSERT INTO `donner`(`ID`,`Name`,`Age`,`BloodGroup`,`Gender`,`Mobile`,`Address`)VALUES ('" + id_txt.getText() + "','" + name_txt.getText() + "','" + age_txt.getText() + "','" + jComboBox1.getSelectedItem() + "','" + gen + "','" + mobile_txt.getText() + "','" + address_txt.getText() + "')";
                ps = ct.prepareCall(inserQ);
                int m = ps.executeUpdate();
                if (m > 0) {

                    JOptionPane.showMessageDialog(rootPane, "Success");
                    selectAllData();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Faild");
                }

            } catch (SQLException ex) {
                Logger.getLogger(Doner.class.getName()).log(Level.SEVERE, null, ex);
            }
 
         DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            if (dtm.getRowCount() <= 0) {
                dtm.addRow(new Object[]{id, name, age, bloodgroup, gender, mobile, address});
            }
        }

    }//GEN-LAST:event_ClearActionPerformed

    void selectAllData() {

        try{
            contest();
             DefaultTableModel dt =(DefaultTableModel) jTable1.getModel();
           dt.setRowCount(0);
            
           String selectQuery = "SELECT * FROM  `donner`";
           st = ct.prepareCall(selectQuery);
            rs = st.executeQuery(selectQuery);
            while (rs.next()) {
              
            dt.addRow(new Object[]{
                rs.getInt(1),rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7)
             });
            }
        } catch (SQLException ex) {
            Logger.getLogger(Doner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

void contest(){
        try {
            ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_management", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(Doner.class.getName()).log(Level.SEVERE, null, ex);
        }
}
 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // clear
        data_clr();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void remove_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_buttonActionPerformed
        // show
        
        selectAllData();
        
    }//GEN-LAST:event_remove_buttonActionPerformed

    private void update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttonActionPerformed
        // update
        if (id_txt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Id IS EMpty...");
            id_txt.requestFocus();
        } else if (name_txt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Name IS EMpty");
            name_txt.requestFocus();
        } else if (age_txt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Age IS EMpty");
            age_txt.requestFocus();
       
            } else if (jComboBox1.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "BloodGrour IS EMpty");
            jComboBox1.requestFocus();
             
        } else if (rm.isSelected() == false && rf.isSelected() == false) {
            JOptionPane.showMessageDialog(rootPane, "Gender IS EMpty");
            rm.requestFocus();
        } else if (mobile_txt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Mobile IS EMpty");
            mobile_txt.requestFocus();
        } else if (address_txt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Address IS EMpty");
            address_txt.requestFocus();
        } else {
            try {
               contest();
             int ied=Integer.parseInt(id_txt.getText());
             String namee=name_txt.getText();
             int agee=Integer.parseInt(age_txt.getText());
             String bg=(String) jComboBox1.getSelectedItem();
              String gen; 
               if(rm.isSelected()){
            gen=rm.getText().toString();
            }else if(rf.isSelected()){
            gen=rf.getText().toString();
            }else{
            gen=null;
            }
               int mob=Integer.parseInt(mobile_txt.getText());
               String add= address_txt.getText();
                String inserQ = "UPDATE `blood_management`.`donner`SET `ID` = '"+ied+"',`Name` = '"+namee+"',`Age` = '"+agee+"',`BloodGroup` = '"+bg+"',`Gender` = '"+gen+"',`Mobile` = '"+mob+"',`Address` = '"+add+"'WHERE `ID` = '"+ied+"'";
                ps = ct.prepareCall(inserQ);
                int m = ps.executeUpdate();
                if (m > 0) {

                    JOptionPane.showMessageDialog(rootPane, "Success");
                    selectAllData();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Faild");
                }

            } catch (SQLException ex) {
                Logger.getLogger(Doner.class.getName()).log(Level.SEVERE, null, ex);
            }                 
        }
    }//GEN-LAST:event_update_buttonActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // Delete Button
//        contest();
//        int row =jTable1.getSelectedRow();
//        String value=(jTable1.getModel().getValueAt(row, ICONIFIED)
//        
    }//GEN-LAST:event_DeleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
        jTable1.getModel();
        int ide =(int) dt.getValueAt(jTable1.getSelectedRow(), 0);
        String nama = (String) dt.getValueAt(jTable1.getSelectedRow(), 1);
        int agea =(int) dt.getValueAt(jTable1.getSelectedRow(), 2);
        String b_gp = (String) dt.getValueAt(jTable1.getSelectedRow(), 3);
        String gan = (String) dt.getValueAt(jTable1.getSelectedRow(), 4);
        int mobaile =  (int) dt.getValueAt(jTable1.getSelectedRow(), 5);
        String add = (String) dt.getValueAt(jTable1.getSelectedRow(), 6);
        
        id_txt.setText(""+ide);
        name_txt.setText(nama);
        age_txt.setText(""+agea);
        jComboBox1.setSelectedItem(b_gp);
         
       if(rm.getText().equals(gan)){
           rm.setSelected(true);
            }else{
            rf.setSelected(true);
            }
         mobile_txt.setText(""+mobaile);
        address_txt.setText(add);
         
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // exit
                this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void update_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_buttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_update_buttonMouseClicked

    private void update_buttonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_update_buttonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_buttonKeyPressed

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1AncestorAdded

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
            java.util.logging.Logger.getLogger(Doner.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doner.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doner.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doner.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doner().setVisible(true);
            }
        });
    }

    
    void data_clr(){
    id_txt.setText("");
    name_txt.setText("");
    age_txt.setText("");
   jComboBox1.removeAllItems();
    buttonGroup4.clearSelection();
    mobile_txt.setText("");
    address_txt.setText("");
    }
          
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField address_txt;
    private javax.swing.JTextField age_txt;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JTextField id_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField mobile_txt;
    private javax.swing.JTextField name_txt;
    private javax.swing.JButton remove_button;
    private javax.swing.JRadioButton rf;
    private javax.swing.JRadioButton rm;
    private javax.swing.JButton update_button;
    // End of variables declaration//GEN-END:variables
}
