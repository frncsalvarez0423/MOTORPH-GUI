/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MotorPH_Application_Frames;

import MotorPH_Application.Inventory;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Inventory_Frame extends javax.swing.JFrame {

    /**
     * Creates new form Inventory_Frame
     */
    public Inventory_Frame() {
        initComponents();
        containsOfLinklist();
        JFrame frame = new JFrame();
        frame.setTitle("Inventory Class");
        
    }

    /**
     Instantiate the inventory java class from diff package
     */
    
    
    
     public void  containsOfLinklist(){
        
         LinkedList <Inventory> inventoryList = new LinkedList<Inventory>();
         Inventory i1 = new Inventory ("Nmax", "Yamahaa", "12345679", 100);
         Inventory i2 = new Inventory ("Tmax", "Yamaha", "12345678", 90);
         Inventory i3 = new Inventory ("Xmax", "Yamaha", "12345677", 180);
         Inventory i4 = new Inventory ("Raider 150", "Suzukii", "12345676", 110);
         Inventory i5 = new Inventory ("Barako", "Suzuki", "12345675", 50);
         Inventory i6 = new Inventory ("Barako 150", "Suzuki", "12345674", 70);
         Inventory i7 = new Inventory ("PCX", "Hondaa", "12345673", 120);
         Inventory i8 = new Inventory ("Beat", "Honda", "12345672", 100);
         Inventory i9 = new Inventory ("Click", "Honda", "12345671", 160);
         Inventory i10 = new Inventory ("Barako", "Kawasaki", "12345670", 160);
         Inventory i11 = new Inventory ("Viper", "MotorStar", "12345669", 70);
         Inventory i12 = new Inventory ("Moto X 150", "MotorStar", "12345668", 130);
         Inventory i13 = new Inventory ("M1000", "BMW", "12345667", 100);
         Inventory i14 = new Inventory ("S1000", "BMW", "12345666", 80);
         Inventory i15 = new Inventory ("TC 150", "Rusi", "12345665", 140);
         Inventory i16 = new Inventory ("MP 110", "Rusi", "12345664", 50);
         Inventory i17 = new Inventory ("Trident 660", "Triumph", "12345663", 60);
         Inventory i18 = new Inventory ("Street Triple", "Triumph", "12345672", 40);
         Inventory i19 = new Inventory ("Monster", "Ducati", "12345661", 110);
         Inventory i20 = new Inventory ("Panigale", "Ducati", "12345660", 95);
         
         
         
         inventoryList.add(i1);
         inventoryList.add(i2);
         inventoryList.add(i3);
         inventoryList.add(i4);
         inventoryList.add(i5);
         inventoryList.add(i6);
         inventoryList.add(i7);
         inventoryList.add(i8);
         inventoryList.add(i9);
         inventoryList.add(i10);
         inventoryList.add(i11);
         inventoryList.add(i12);
         inventoryList.add(i13);
         inventoryList.add(i14);
         inventoryList.add(i15);
         inventoryList.add(i16);
         inventoryList.add(i17);
         inventoryList.add(i18);
         inventoryList.add(i19);
         inventoryList.add(i20);
         
         
         
     DefaultTableModel table = (DefaultTableModel)tblInventory.getModel();
     Object[] row;
     for(int i= 0; i < inventoryList.size(); i++){
         
         row = new Object [5];
         
         row [0] = inventoryList.get(i)._model;
         row [1] = inventoryList.get(i)._brand;
         row [2] = inventoryList.get(i)._carNumber;
         row [3] = inventoryList.get(i)._availableUnits;
     
         
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
        lblUnits = new javax.swing.JLabel();
        lblSerialNumber = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        txtUnits = new javax.swing.JTextField();
        txtSerialNumber = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
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
                "Model", "Brand", "Serial Number", "Available Units"
            }
        ));
        tblInventory.setDropMode(javax.swing.DropMode.ON);
        tblInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblInventoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblInventory);
        if (tblInventory.getColumnModel().getColumnCount() > 0) {
            tblInventory.getColumnModel().getColumn(0).setResizable(false);
            tblInventory.getColumnModel().getColumn(2).setResizable(false);
        }

        lblBrand.setText("Brand");

        lblModel.setText("Model");

        lblUnits.setText("Units");

        lblSerialNumber.setText("Serial Number");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
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
                        .addComponent(btnInsert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblUnits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSerialNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblBrand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblModel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUnits, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtModel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBrand, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))))
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
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUnits)
                    .addComponent(txtUnits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSerialNumber)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate)
                    .addComponent(btnInsert))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancel.setText("Cancel");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addComponent(btnCancel)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        this.dispose();
        
        
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        if(txtModel.getText().equals("") || txtBrand.getText().equals(" ") || txtSerialNumber.getText().equals(" ") || txtUnits.getText().equals(" ")){
                JOptionPane.showMessageDialog(this, "Error : Kindly fill up the neccessary information!");
        }else {
        
        String data[] = {txtModel.getText(),txtBrand.getText(),txtSerialNumber.getText(),txtUnits.getText() };
        DefaultTableModel table = (DefaultTableModel)tblInventory.getModel();
        table.addRow(data);
            JOptionPane.showMessageDialog(null,"Inserted successfully!" );
        
            
            txtModel.setText("");
            txtBrand.setText("");
            txtSerialNumber.setText("");
            txtUnits.setText("");
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel)tblInventory.getModel();
        if(tblInventory.getSelectedRowCount()== 1){
             table.removeRow(tblInventory.getSelectedRow());
             JOptionPane.showMessageDialog(this, "Deleted Successfully!");
        }else{
            if(tblInventory.getRowCount() == 0){
                JOptionPane.showMessageDialog(this, "Error : Table is currently empty!");
            }else {
                JOptionPane.showMessageDialog(this, "Error : Kindly Select row to delete!");
            }
        
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblInventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInventoryMouseClicked
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel)tblInventory.getModel();
        
        String tblModel = table.getValueAt(tblInventory.getSelectedRow(), 0).toString();
        String tblBrand = table.getValueAt(tblInventory.getSelectedRow(), 1).toString();
        String tblSerialNumber = table.getValueAt(tblInventory.getSelectedRow(), 2).toString();
        String tblUnits = table.getValueAt(tblInventory.getSelectedRow(), 3).toString();
        
        txtModel.setText(tblModel);
        txtBrand.setText(tblBrand);
        txtSerialNumber.setText(tblSerialNumber);
        txtUnits.setText(tblUnits);
        
    }//GEN-LAST:event_tblInventoryMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel)tblInventory.getModel();
        //set the containers
        if(tblInventory.getSelectedRowCount() == 1){
        
        
        String Model = txtModel.getText();
        String Brand = txtBrand.getText();
        String SerialNumber = txtSerialNumber.getText();
        String Units = txtUnits.getText();
        //updating the values inside the JTable
        table.setValueAt(Model,tblInventory.getSelectedRow(), 0 );
        table.setValueAt(Brand,tblInventory.getSelectedRow(), 1 );
        table.setValueAt(SerialNumber,tblInventory.getSelectedRow(), 2);
        table.setValueAt(Units,tblInventory.getSelectedRow(), 3 );
        
        //Show success message  using JOptionPane
        JOptionPane.showMessageDialog(this, "Updated Successfully!");
        
        }else{
            if(tblInventory.getRowCount() == 0){
                JOptionPane.showMessageDialog(this, "Error : Table is Empty!");
            }else{
                JOptionPane.showMessageDialog(this, "Error : Kindly Select a row to update..");
            }
        }

    }//GEN-LAST:event_btnUpdateActionPerformed
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblSerialNumber;
    private javax.swing.JLabel lblUnits;
    private javax.swing.JTable tblInventory;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtSerialNumber;
    private javax.swing.JTextField txtUnits;
    // End of variables declaration//GEN-END:variables
}
