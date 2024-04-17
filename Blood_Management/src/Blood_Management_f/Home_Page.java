 
package Blood_Management_f;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Home_Page extends javax.swing.JFrame {
 
    public Home_Page() {
        initComponents();
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setLayout(null);

        jProgressBar1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jProgressBar1);
        jProgressBar1.setBounds(180, 390, 730, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Blood_Management_f/blood-g4e28dcb97_1920.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-380, -40, 1510, 700);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1020, 550);

        setSize(new java.awt.Dimension(1036, 562));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     
    public static void main(String args[]) { 
        Home_Page hm = new Home_Page();
        hm.setVisible(true);
         for(int i = -1;i<=99;){
             i++;
             try { 
                 Thread.sleep(10);
                jProgressBar1.setValue(i);
                if(i==99){
                    Login_Page d = new Login_Page();
                    d.setVisible(true);
                    hm.setVisible(false);
                }
                
             } catch (InterruptedException ex) {
                 Logger.getLogger(Home_Page.class.getName()).log(Level.SEVERE, null, ex);
             }
         
         }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
