
package admin;

import Configuration.DBconnector;
import Configuration.Session;
import Configuration.passwordHasher;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class adminChangePass extends javax.swing.JFrame {


    public adminChangePass() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        newPass = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        confirmPass = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(77, 134, 156));
        jPanel1.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Change Password");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 30, 210, 30);

        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        password.setEnabled(false);
        jPanel1.add(password);
        password.setBounds(30, 120, 270, 30);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(30, 60, 270, 10);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Current Password");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 100, 90, 20);

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(180, 380, 120, 30);

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(30, 380, 120, 30);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("New Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 180, 90, 20);

        newPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        newPass.setEnabled(false);
        jPanel1.add(newPass);
        newPass.setBounds(30, 200, 270, 30);

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Confirm Password");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 240, 90, 20);

        confirmPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        confirmPass.setEnabled(false);
        jPanel1.add(confirmPass);
        confirmPass.setBounds(30, 260, 270, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        adminSettings open = new adminSettings();
        open.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Session session = Session.getInstance();
        
        DBconnector dbc =  new DBconnector();
        
        if (password.getText().length() < 8 || newPass.getText().length() < 8 || confirmPass.getText().length() < 8){
            JOptionPane.showMessageDialog(null, "Password must be 8 above");
        } else {   
            try {        
                String query = "SELECT * FROM users_table WHERE Id = '"+ session.getUid() +"'";
                ResultSet resultSet = dbc.getData(query);
                
                if (resultSet.next()){
                    String oldPass = resultSet.getString("Password");
                    try {
                        if (oldPass.equals(passwordHasher.hashPassword(password.getText()))){
                            if (!newPass.getText().equals(confirmPass.getText())){
                                JOptionPane.showMessageDialog(null, "Password doesn't match!");
                            } else{
                                dbc.updateData("UPDATE users_table SET Password = '"+ passwordHasher.hashPassword(confirmPass.getText())+"'WHERE Id = '"+ session.getUid()+"'");
                                
                                //LogIn logOut = new LogIn();
                                //logOut.setVisible(true);
                                this.dispose();
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Your old password doesn't match!");
                        }
                    } catch (NoSuchAlgorithmException ex) {
                        Logger.getLogger(adminChangePass.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch(SQLException ex){
                System.out.println(""+ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed


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
            java.util.logging.Logger.getLogger(adminChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminChangePass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField confirmPass;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField newPass;
    private javax.swing.JTextField password;
    // End of variables declaration//GEN-END:variables
}
