
package MotorPH_Application_Frames;
import MotorPH_Application.Buyer_Interface;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Buyers_Frame extends javax.swing.JFrame {

    /**
     * Creates new form Buyers_Frame
     */
    public Buyers_Frame() {
        initComponents();
        containsOfLinklist();
        
        
    }

     public void  containsOfLinklist(){
        
         LinkedList <Buyer_Interface> BuyerList = new LinkedList<Buyer_Interface>();
         
         Buyer_Interface b1 = new Buyer_Interface ("Nmax", "Yamahaa", "12345679", 140000);
         Buyer_Interface b2 = new Buyer_Interface ("Tmax", "Yamaha", "12345678", 140000);
         Buyer_Interface b3 = new Buyer_Interface ("Xmax", "Yamaha", "12345677", 140000);
         Buyer_Interface b4 = new Buyer_Interface ("Raider 150", "Suzuki", "12345676", 140000);
         Buyer_Interface b5 = new Buyer_Interface ("Barako", "Suzuki", "12345675", 140000);
         Buyer_Interface b6 = new Buyer_Interface ("Barako 150", "Suzukii", "12345674", 140000);
         Buyer_Interface b7 = new Buyer_Interface ("PCX", "Hondaa", "12345673", 140000);
         Buyer_Interface b8   = new Buyer_Interface ("Beat", "Honda", "12345672", 140000);
         Buyer_Interface b9   = new Buyer_Interface ("Click", "Honda", "12345671", 140000);
         Buyer_Interface b10  = new Buyer_Interface ("Barako 155", "Kawasaki", "12345670", 140000);
         Buyer_Interface b11  = new Buyer_Interface ("Viper", "MotorStar", "12345669", 140000);
         Buyer_Interface b12  = new Buyer_Interface ("Moto X 150", "MotorStar", "12345668", 140000);
         Buyer_Interface b13  = new Buyer_Interface ("M1000", "BMW", "12345667", 140000);
         Buyer_Interface b14  = new Buyer_Interface ("S1000", "BMW", "12345666", 140000);
         Buyer_Interface b15  = new Buyer_Interface ("TC 150", "Rusi", "12345665", 140000);
         Buyer_Interface b16  = new Buyer_Interface ("MP 110", "Rusi", "12345664", 140000);
         Buyer_Interface b17  = new Buyer_Interface ("Trident 660", "Triumph", "12345663", 140000);
         Buyer_Interface b18  = new Buyer_Interface ("Street Triple", "Triumph", "12345662", 140000);
         Buyer_Interface b19  = new Buyer_Interface ("Monster", "Ducati", "12345661", 140000);
         Buyer_Interface b20  = new Buyer_Interface ("Panigale", "Ducati", "12345660", 140000);
         
         
         
         
         BuyerList.add(b1);
         BuyerList.add(b2);
         BuyerList.add(b3);
         BuyerList.add(b4);
         BuyerList.add(b5);
         BuyerList.add(b6);
         BuyerList.add(b7);
         BuyerList.add(b8);
         BuyerList.add(b9);
         BuyerList.add(b10);
         BuyerList.add(b11);
         BuyerList.add(b12);
         BuyerList.add(b13);
         BuyerList.add(b14);
         BuyerList.add(b15);
         BuyerList.add(b16);
         BuyerList.add(b17);
         BuyerList.add(b18);
         BuyerList.add(b19);
         BuyerList.add(b20);
           
         
         
         
         DefaultTableModel table = (DefaultTableModel)tblInventory.getModel();
     Object[] row;
    
         for(int i = 0; i < BuyerList.size();  i++){
         row = new Object [5];
         
         row [0] = BuyerList.get(i)._model;
         row [1] = BuyerList.get(i)._brand;
         row [2] = BuyerList.get(i)._carNumber;
         row [3] = BuyerList.get(i)._price;
     
         
        
         table.addRow(row);
         }
         
    }
         
         
         
         
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblInventory = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblBrand = new javax.swing.JLabel();
        lblModel = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblSerialNumber = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtSerialNumber = new javax.swing.JTextField();
        btnBuy = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtAmountPaid = new javax.swing.JTextField();
        lblAmountPaid = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblInventory.setBackground(new java.awt.Color(242, 242, 242));
        tblInventory.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 151, 230)));
        tblInventory.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        tblInventory.setForeground(new java.awt.Color(0, 151, 230));
        tblInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Model", "Brand", "Serial Number", "Price"
            }
        ));
        tblInventory.setDropMode(javax.swing.DropMode.ON);
        tblInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblInventoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblInventory);

        lblBrand.setText("Brand");

        lblModel.setText("Model");

        lblPrice.setText("Price");

        lblSerialNumber.setText("Serial Number");

        btnBuy.setText("Buy");
        btnBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyActionPerformed(evt);
            }
        });

        lblAmountPaid.setText("Amount Paid");

        btnCancel.setText("Cancel");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancel)
                        .addGap(39, 39, 39)
                        .addComponent(btnBuy))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSerialNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblBrand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblModel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAmountPaid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAmountPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBrand)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModel)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSerialNumber)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAmountPaid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAmountPaid, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuy)
                    .addComponent(btnCancel))
                .addGap(73, 73, 73))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                        .addGap(71, 71, 71))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblInventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInventoryMouseClicked
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel)tblInventory.getModel();

        String tblModel = table.getValueAt(tblInventory.getSelectedRow(), 0).toString();
        String tblBrand = table.getValueAt(tblInventory.getSelectedRow(), 1).toString();
        String tblSerialNumber = table.getValueAt(tblInventory.getSelectedRow(), 2).toString();
        String tblPrice= table.getValueAt(tblInventory.getSelectedRow(), 3).toString();

        txtModel.setText(tblModel);
        txtBrand.setText(tblBrand);
        txtSerialNumber.setText(tblSerialNumber);
        txtPrice.setText(tblPrice);

    }//GEN-LAST:event_tblInventoryMouseClicked

    private void btnBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyActionPerformed
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel)tblInventory.getModel();
        //set the containers
        if(tblInventory.getSelectedRowCount() == 1){

            String Model = txtModel.getText();
            String Brand = txtBrand.getText();
            String SerialNumber = txtSerialNumber.getText();
            String Price = txtPrice.getText();
            //updating the values inside the JTable
            table.setValueAt(Model,tblInventory.getSelectedRow(), 0 );
            table.setValueAt(Brand,tblInventory.getSelectedRow(), 1 );
            table.setValueAt(SerialNumber,tblInventory.getSelectedRow(), 2);
            table.setValueAt(Price,tblInventory.getSelectedRow(), 3 );
            
            
            String AmountPaid = txtAmountPaid.getText();
                if(txtPrice.getText().equals(txtAmountPaid.getText())){
                    JOptionPane.showMessageDialog(this, "Item successfully purchased!");
                      
                }else{
                    JOptionPane.showMessageDialog(this, "Error : Insufficient Amount Paid!");
                }

        }else{
            if(tblInventory.getRowCount() == 0){
                JOptionPane.showMessageDialog(this, "Error : Table is Empty!");
            }else{
                JOptionPane.showMessageDialog(this, "Error : Kindly Select a product to buy!");
            }
        }
    }//GEN-LAST:event_btnBuyActionPerformed

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        this.dispose();

    }//GEN-LAST:event_btnCancelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuy;
    private javax.swing.JButton btnCancel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAmountPaid;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblSerialNumber;
    private javax.swing.JTable tblInventory;
    private javax.swing.JTextField txtAmountPaid;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSerialNumber;
    // End of variables declaration//GEN-END:variables
}
