/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Blood_Management_f;

/**
 *
 * @author Nazirul
 */
public class Login_Page extends javax.swing.JFrame {
 
    public Login_Page() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        id_txt1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("Login Page");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(300, 70, 260, 80);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("ID               :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(140, 190, 200, 48);

        id_txt.setText(" ");
        jPanel1.add(id_txt);
        id_txt.setBounds(340, 190, 320, 50);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setText("Password  :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(140, 270, 200, 48);

        id_txt1.setText(" ");
        jPanel1.add(id_txt1);
        id_txt1.setBounds(340, 260, 320, 50);

        jButton2.setBackground(new java.awt.Color(153, 0, 0));
        jButton2.setFont(new java.awt.Font("Shorif Podmoboti Unicode", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(440, 350, 120, 40);

        jButton3.setBackground(new java.awt.Color(0, 153, 0));
        jButton3.setFont(new java.awt.Font("Shorif Podmoboti Unicode", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(270, 350, 120, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Blood_Management_f/blood-image-large-r1.jpg"))); // NOI18N
        jLabel5.setText(" ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(-500, -90, 1400, 770);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 790, 580);

        setSize(new java.awt.Dimension(801, 584));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // submit button
         nextPage();
        
    }//GEN-LAST:event_jButton3ActionPerformed
 
    void nextPage(){
     Login_Page hm = new Login_Page();
        hm.setVisible(true);
         for(int i = -1;i<=99;){
             i++;
              
            if(i==99){
                    Doner d = new Doner();
                    d.setVisible(true);
                    hm.dispose();
                }
         
    }}
    
    
    public static void main(String args[]) {
    Login_Page hm = new Login_Page();
        hm.setVisible(true);
         for(int i = -1;i<=99;){
             i++;
            if(i==99){
                    Doner d = new Doner();
                    d.setVisible(true);
                    hm.setVisible(false);
                }
         
    }
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id_txt;
    private javax.swing.JTextField id_txt1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
