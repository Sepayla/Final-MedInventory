
package pharmacist;

import Configuration.DBconnector;
import Configuration.Session;
import admin.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.TableModel;
import login.*;
import net.proteanit.sql.DbUtils;


public class pharmaDash extends javax.swing.JFrame {


    public pharmaDash() {
        initComponents();
        medicineList();
        this.setTitle("Medmate");
    }
    
    ArrayList<String> medicineList = new ArrayList<String>();
    ArrayList<Integer> productQty = new ArrayList<>();
    
    int medicineId;
    double productPrice;
    String medicineName;
    int productQuantity;
    double subTotal;
    int Qty;
    double totals = 0;
    
    Session sess = Session.getInstance();
    
    public void medicineList(){
        try{
            DBconnector dbc = new DBconnector();
            ResultSet rs = dbc.getData("SELECT Id, Product_Name, Quantity, Price, Type, Date_Expiration, Status, Availability FROM medicice_list ");
            medicine_list.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        }
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
        jLabel13 = new javax.swing.JLabel();
        date_disp = new javax.swing.JLabel();
        time_disp = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicine_list = new javax.swing.JTable();
        type = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        checkOutBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        purchaseBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();
        subtotal = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        qty = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();

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
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 200, 40));

        jPanel7.setBackground(new java.awt.Color(122, 178, 178));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 247, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/icons8-dashboard-30 (1).png"))); // NOI18N
        jLabel5.setText(" Dashboard");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 200, 40));

        jPanel12.setBackground(new java.awt.Color(77, 134, 156));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
        });
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(238, 247, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/icons8-settings-30 (1).png"))); // NOI18N
        jLabel13.setText(" Settings");
        jPanel12.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

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

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(238, 247, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/icons8-settings-30 (1).png"))); // NOI18N
        jLabel12.setText(" Settings");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 200, 550);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 370, 40));

        medicine_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Price", "Quantity", "Sub-Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        medicine_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medicine_listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(medicine_list);
        if (medicine_list.getColumnModel().getColumnCount() > 0) {
            medicine_list.getColumnModel().getColumn(0).setResizable(false);
            medicine_list.getColumnModel().getColumn(1).setResizable(false);
            medicine_list.getColumnModel().getColumn(2).setResizable(false);
            medicine_list.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 540, 200));

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Liquid", "Tablets", "Capsules", "Topical medicines", "Suppositories", "Drops", "Inhalers", "Injections", "Implants", "patches" }));
        jPanel4.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 160, 40));

        jPanel1.add(jPanel4);
        jPanel4.setBounds(210, 20, 570, 400);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkOutBtn.setText("CHECKOUT");
        checkOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutBtnActionPerformed(evt);
            }
        });
        jPanel13.add(checkOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 11, 100, 78));

        jLabel2.setText("TOTAL:");
        jPanel13.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        total.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        total.setText("00.00");
        jPanel13.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 150, 60));

        jPanel1.add(jPanel13);
        jPanel13.setBounds(500, 440, 280, 100);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Medicine Name");
        jPanel14.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 250, 50));

        purchaseBtn.setBackground(new java.awt.Color(122, 178, 178));
        purchaseBtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        purchaseBtn.setForeground(new java.awt.Color(77, 134, 156));
        purchaseBtn.setText("Purchase");
        purchaseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseBtnActionPerformed(evt);
            }
        });
        jPanel14.add(purchaseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        jLabel7.setText("Subtotal: ");
        jPanel14.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 50, 20));

        jLabel8.setText("Price:");
        jPanel14.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 40, 20));

        jLabel9.setText("Qty: ");
        jPanel14.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 30, 20));

        deleteBtn.setBackground(new java.awt.Color(122, 178, 178));
        deleteBtn.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(77, 134, 156));
        deleteBtn.setText("CLEAR");
        jPanel14.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 130, -1));
        jPanel14.add(subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 40, 20));
        jPanel14.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 30, 20));
        jPanel14.add(qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 50, 40, 20));

        jPanel1.add(jPanel14);
        jPanel14.setBounds(210, 440, 280, 100);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Medical Service.png"))); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(200, -6, 600, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
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

        
    }//GEN-LAST:event_formWindowActivated

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
        pharmaSettings pSetting = new pharmaSettings();
        pSetting.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel12MouseClicked

    private void checkOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutBtnActionPerformed
        pharmaCheckout pCheckout = new pharmaCheckout();
        pCheckout.setVisible(true);
        this.dispose();
        
        
        DBconnector dbc = new DBconnector();
       
        
        pCheckout.noOfItems.setText("" +medicineList.size());
        pCheckout.noOfItems1.setText("" +medicineList.size());
        pCheckout.subtotal.setText("" + totals);
        pCheckout.pChange.setText("" + totals);
        pCheckout.total.setText("" + totals);
        pCheckout.total1.setText("" + totals);
        pCheckout.subtotal1.setText("" + totals);
        
        int totalQty = 0;
        for (int qty : productQty) {
            totalQty += qty;
        }
        
        
        if (dbc.insertData("INSERT INTO transaction (M_Id, P_Id, Date, No_Item, Subtotal, Total) VALUES (" +
                   "'" + medicineId + "', " +
                   "'" + sess.getUid() + "', " +
                   "'" + getLocalDate() + "', " +
                   "'" + medicineList.size() + "', " +
                   "'" + totals + "', " +   
                   "'" + totals + "')")) {
            JOptionPane.showMessageDialog(null, "Inserted Successfully.");
            adminMedicine close = new adminMedicine();
            close.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Connection Error!");
        }
    }//GEN-LAST:event_checkOutBtnActionPerformed

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        pharmaDash pDash = new pharmaDash();
        pDash.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        login logout = new login();
        logout.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void purchaseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseBtnActionPerformed
        if ((int) qty.getValue() > Qty){
            JOptionPane.showMessageDialog(null, "This product has limited stock");
        } else {
            if (Qty != 0){
                
                if ((int) qty.getValue() == 0){
                    JOptionPane.showMessageDialog(null, "Please enter quantity");
                } else {
                    DBconnector dbc = new DBconnector();    
                    subTotal =  productPrice * (int) qty.getValue();
                    totals += subTotal;

                    medicineList.add(medicineName);
                    productQty.add((int) qty.getValue());
                    subtotal.setText("" +subTotal);
                    total.setText("" + totals);

                    String updateQuery = "UPDATE medicice_list SET Quantity = Quantity - '"+ (int) qty.getValue() +"' WHERE Id = '" + medicineId + "'";
                    dbc.updateData(updateQuery);

                    JOptionPane.showMessageDialog(null, "Purchased successfully");

                    subtotal.setText(" ");
                    medicineList();

                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "This product is out of stock!");
                    }
        }
    }//GEN-LAST:event_purchaseBtnActionPerformed

    private void medicine_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicine_listMouseClicked
        int rowIndex = medicine_list.getSelectedRow();
        
        if (rowIndex < 0){
            JOptionPane.showMessageDialog(null, "Please select row to update");
        } else{
         
            try {
                DBconnector dbc = new DBconnector();
                TableModel tbl = medicine_list.getModel();
                ResultSet rs = dbc.getData("SELECT * FROM medicice_list WHERE Id = '"+ tbl.getValueAt(rowIndex, 0) +"'");
                     
                if (rs.next()){      
                    medicineId = rs.getInt("Id");
                    price.setText("" + rs.getDouble("Price"));
                    productPrice = rs.getDouble("Price");
                    medicineName = rs.getString("Product_Name");
                    Qty = rs.getInt("Quantity");
                }
                
            } catch(SQLException ex){
                System.out.println(""+ ex);
            }
        }
    }//GEN-LAST:event_medicine_listMouseClicked

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
            java.util.logging.Logger.getLogger(pharmaDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pharmaDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pharmaDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pharmaDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new pharmaDash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkOutBtn;
    private javax.swing.JLabel date_disp;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JTable medicine_list;
    private javax.swing.JLabel price;
    private javax.swing.JButton purchaseBtn;
    public javax.swing.JSpinner qty;
    private javax.swing.JLabel subtotal;
    private javax.swing.JLabel time_disp;
    private javax.swing.JLabel total;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
