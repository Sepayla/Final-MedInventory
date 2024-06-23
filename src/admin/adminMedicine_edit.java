/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import Configuration.DBconnector;
import javax.swing.JOptionPane;

/**
 *
 * @author w10
 */
public class adminMedicine_edit extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public adminMedicine_edit() {
        initComponents();
    }

    public int productId;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        uid = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        productName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        quant = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        dateManufactured = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dateExpiration = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        status = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        type1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(77, 134, 156));
        jPanel1.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Edit Medicine");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(40, 30, 210, 30);

        uid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        uid.setEnabled(false);
        jPanel1.add(uid);
        uid.setBounds(40, 90, 130, 30);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(40, 60, 270, 10);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Product ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 70, 70, 20);

        productName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(productName);
        productName.setBounds(40, 140, 270, 30);

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Product Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 120, 70, 20);

        quant.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(quant);
        quant.setBounds(40, 190, 130, 30);

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quantity");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 170, 70, 20);

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Price");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(180, 170, 70, 20);

        price.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(price);
        price.setBounds(180, 190, 130, 30);

        dateManufactured.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(dateManufactured);
        dateManufactured.setBounds(40, 240, 130, 30);

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Type");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 270, 100, 20);

        dateExpiration.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(dateExpiration);
        dateExpiration.setBounds(180, 240, 130, 30);

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date Expiration");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(180, 220, 80, 20);

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date Manufactured");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 220, 100, 20);

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Liquid", "Tablets", "Capsules", "Topical medicines", "Suppositories", "Drops", "Inhalers", "Injections", "Implants", "patches" }));
        jPanel1.add(type);
        type.setBounds(40, 290, 130, 30);

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Not Expired", "Expired Drug" }));
        jPanel1.add(status);
        status.setBounds(40, 340, 270, 30);

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Status");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 320, 100, 20);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(40, 390, 120, 30);

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(183, 390, 120, 30);

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Availability");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(180, 270, 100, 20);

        type1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "On Stock", "Out of Stock" }));
        jPanel1.add(type1);
        type1.setBounds(180, 290, 130, 30);

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        adminMedicine open = new adminMedicine();
        open.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DBconnector dbc = new DBconnector();

        if (productName.getText().isEmpty() || quant.getText().isEmpty() || price.getText().isEmpty() || dateManufactured.getText().isEmpty() || dateExpiration.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!");
        } else {
            
            dbc.updateData("UPDATE medicice_list SET Product_Name = '"+ productName.getText() +"', Quantity = '"+ quant.getText() +"', Price = '"+ price.getText() +"', Date_Manufactured = '"+ type.getSelectedItem()+"', "
                        + "Date_Expiration = '"+ status.getSelectedItem()+"' WHERE Id = '"+ uid.getText()+"'");
            
            this.dispose();
        }  
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(adminMedicine_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminMedicine_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminMedicine_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminMedicine_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminMedicine_edit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField dateExpiration;
    public javax.swing.JTextField dateManufactured;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTextField price;
    public javax.swing.JTextField productName;
    public javax.swing.JTextField quant;
    public javax.swing.JComboBox<String> status;
    public javax.swing.JComboBox<String> type;
    public javax.swing.JComboBox<String> type1;
    public javax.swing.JTextField uid;
    // End of variables declaration//GEN-END:variables
}
