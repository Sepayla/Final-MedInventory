
package pharmacist;

import Configuration.Session;
import admin.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import login.*;


public class pharmaCheckout extends javax.swing.JFrame {

    
    public pharmaCheckout() {
        initComponents();
        this.setTitle("Medmate");
    }
    
    public static String getLocalDate(){
        
        LocalDateTime currentDateTime = LocalDateTime.now();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String formattedDateTime = currentDateTime.format(formatter);
        
        return formattedDateTime;
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        date_disp = new javax.swing.JLabel();
        time_disp = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        page = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        reciept = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        paymentMethod = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        paymentDate = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        subtotal1 = new javax.swing.JLabel();
        noOfItems = new javax.swing.JLabel();
        pChange = new javax.swing.JLabel();
        pharma = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        cash = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        subtotal = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        payment = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        changes = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        noOfItems1 = new javax.swing.JLabel();
        total1 = new javax.swing.JLabel();
        done = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(238, 247, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(77, 134, 156));
        jPanel2.setForeground(new java.awt.Color(77, 134, 156));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/EEF7FF (1).png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 180, 10));

        jPanel6.setBackground(new java.awt.Color(77, 134, 156));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 247, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/icons8-logout-30.png"))); // NOI18N
        jLabel4.setText(" Logout");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 200, 40));

        jPanel7.setBackground(new java.awt.Color(122, 178, 178));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 247, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/icons8-dashboard-30 (1).png"))); // NOI18N
        jLabel5.setText(" Dashboard");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 200, 40));

        jPanel12.setBackground(new java.awt.Color(77, 134, 156));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
        });
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(238, 247, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/icons8-settings-30 (1).png"))); // NOI18N
        jLabel10.setText(" Settings");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel12.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        jPanel2.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 200, 40));

        date_disp.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        date_disp.setForeground(new java.awt.Color(255, 255, 255));
        date_disp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date_disp.setText("00-00-000");
        jPanel2.add(date_disp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 100, 20));

        time_disp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        time_disp.setForeground(new java.awt.Color(255, 255, 255));
        time_disp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time_disp.setText("00:00:00");
        jPanel2.add(time_disp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, 20));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 180, 10));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 200, 550);

        page.setBackground(new java.awt.Color(255, 255, 255));
        page.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("PRINT RECEIPT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        page.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 260, 40));

        reciept.setBackground(new java.awt.Color(255, 255, 255));
        reciept.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ST.Cecilia's College-Cebu, Inc");
        reciept.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 50, 246, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("MEDMATE");
        reciept.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 21, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText(" Ward 11, Minglanilla, Cebu");
        reciept.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 73, 246, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Pharmacist:");
        reciept.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 105, -1, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Payment Information:");
        reciept.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 136, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Payment Method:");
        reciept.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 159, -1, -1));

        paymentMethod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reciept.add(paymentMethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 182, 135, 18));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Payment Date:");
        reciept.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 159, -1, -1));

        paymentDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reciept.add(paymentDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 182, 101, 18));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("No. of Items:");
        reciept.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Sub-Total:");
        reciept.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("VAT Tax:      00.00");
        reciept.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 250, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Change:");
        reciept.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, 30));

        subtotal1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        subtotal1.setText("00.00");
        reciept.add(subtotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 140, 30));

        noOfItems.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        noOfItems.setText("0");
        reciept.add(noOfItems, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 140, 30));

        pChange.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pChange.setText("00.00");
        reciept.add(pChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 110, 30));
        reciept.add(pharma, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 104, 80, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Total:");
        reciept.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setText("Cash:");
        reciept.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, 30));

        total.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        total.setText("00.00");
        reciept.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 110, 30));

        cash.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cash.setText("00.00");
        reciept.add(cash, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 110, 30));

        page.add(reciept, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 570, 450));

        jPanel1.add(page);
        page.setBounds(500, 20, 580, 520);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subtotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        subtotal.setText("00.00");
        jPanel14.add(subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 140, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("Payment");
        jPanel14.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 80, 30));

        payment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                paymentKeyReleased(evt);
            }
        });
        jPanel14.add(payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 250, 40));
        jPanel14.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 250, 20));

        changes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        changes.setText("00.00");
        jPanel14.add(changes, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 110, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Credit Card" }));
        jPanel14.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 170, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Change:");
        jPanel14.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("No. of Items:");
        jPanel14.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("Sub-Total:");
        jPanel14.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("VAT Tax:      00.00");
        jPanel14.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 250, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("Total:");
        jPanel14.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 30));

        noOfItems1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        noOfItems1.setText("0");
        jPanel14.add(noOfItems1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 140, 30));

        total1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        total1.setText("00.00");
        jPanel14.add(total1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 110, 30));

        done.setBackground(new java.awt.Color(122, 178, 178));
        done.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        done.setForeground(new java.awt.Color(77, 134, 156));
        done.setText("DONE");
        done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });
        jPanel14.add(done, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        jPanel1.add(jPanel14);
        jPanel14.setBounds(220, 20, 270, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1094, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        login logout = new login();
        logout.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel6MouseClicked
    
    
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Timer timer = new Timer(0, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Date now = new Date();
        
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        String time = timeFormat.format(now);
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        String date = dateFormat.format(now);
        
        date_disp.setText(date);
        time_disp.setText(time);
                
            }
        });
        timer.start();
        
        paymentDate.setText(getLocalDate());
    }//GEN-LAST:event_formWindowActivated

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked

    }//GEN-LAST:event_jPanel12MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        printRecord (reciept);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        pharmaDash pDash = new pharmaDash();
        pDash.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        pharmaSettings pSetting = new pharmaSettings();
        pSetting.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void paymentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paymentKeyReleased
        
        
    }//GEN-LAST:event_paymentKeyReleased

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneActionPerformed
        Session sess = Session.getInstance();
        double change =  Double.parseDouble(payment.getText()) - Double.parseDouble(total1.getText());
        changes.setText("" + change);
        cash.setText("" + payment.getText());
        pChange.setText("" + change);
        pharma.setText(sess.getFname() + sess.getLname());
    }//GEN-LAST:event_doneActionPerformed

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
            java.util.logging.Logger.getLogger(pharmaCheckout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pharmaCheckout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pharmaCheckout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pharmaCheckout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new pharmaCheckout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel cash;
    private javax.swing.JLabel changes;
    private javax.swing.JLabel date_disp;
    private javax.swing.JButton done;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    public javax.swing.JLabel noOfItems;
    public javax.swing.JLabel noOfItems1;
    public javax.swing.JLabel pChange;
    private javax.swing.JPanel page;
    private javax.swing.JTextField payment;
    private javax.swing.JLabel paymentDate;
    private javax.swing.JLabel paymentMethod;
    private javax.swing.JLabel pharma;
    private javax.swing.JPanel reciept;
    public javax.swing.JLabel subtotal;
    public javax.swing.JLabel subtotal1;
    private javax.swing.JLabel time_disp;
    public javax.swing.JLabel total;
    public javax.swing.JLabel total1;
    // End of variables declaration//GEN-END:variables

    private void printRecord (JPanel panel){

            PrinterJob printerJob = PrinterJob.getPrinterJob();

            printerJob.setJobName("Print Record");

            printerJob.setPrintable(new Printable() {
                @Override
                public int print(Graphics grphcs, PageFormat pf, int pageIndex) throws PrinterException {

                    if (pageIndex > 0){
                        return Printable.NO_SUCH_PAGE;
                    }

                    Graphics2D graphics2D = (Graphics2D)grphcs;

                    graphics2D.translate(pf.getImageableX()*2, pf.getImageableX()*2 );

                    graphics2D.scale(0.70, 0.70);

                    panel.paint(graphics2D);

                    return Printable.PAGE_EXISTS;
                }
            });

            boolean returningResult = printerJob.printDialog();

            if (returningResult) {
                try {
                    printerJob.print();
                } catch (PrinterException printerException){
                    JOptionPane.showMessageDialog(this, "Print Error " + printerException.getMessage());

                }
            }
        }


}
