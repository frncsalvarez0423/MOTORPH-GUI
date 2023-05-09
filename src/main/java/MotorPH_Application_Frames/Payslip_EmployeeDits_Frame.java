/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MotorPH_Application_Frames;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author user
 */


public class Payslip_EmployeeDits_Frame extends javax.swing.JFrame {
    
    
    /**
     * Creates new form Payslip_EmployeeDits_Frame
     */
            
           
    
    

private Map<String, Object[]> employeeData = new HashMap<>();
    public Payslip_EmployeeDits_Frame() {
        initComponents();
        DefaultTableModel model = (DefaultTableModel) tblEmployeedetails.getModel();
        
//                                                  0       1       2           3           4               5               6              7            8           9              10       11          12          13    14    15    16    17   18  19
       
    employeeData.put("10001", new Object[]{"10001", "Crisostomo", "Jose", "February 14, 1988", "17/85 Stracke Via Suite 042, Poblacion, Las Piñas 4783 Dinagat Islands .", "918-621-603", "49-1632020-8", "382189453145", "317-674-022-000", "441093369646", "Regular", "HR Manager", "N/A", 62670.00, 1500.00, 1000.00, 1000.00, 31335.00, 373.04,747.00});
    employeeData.put("10002", new Object[]{"10002", "Mata", "Christian", "October 21, 1987", "90 O'Keefe Spur Apt. 379, Catigbian 2772 Sulu .", "783-776-744", "49-2959312-6", "824187961962", "103-100-522-000", "631052853464", "Regular", "Account Team Leader", "Romualdez, Fredrick", 42975.00, 1500.00, 800.00, 800.00, 21488.00, 255.80,648.00});
    employeeData.put("10003", new Object[]{"10003", "San Jose", "Brad ", "March 15, 1996", "99 Strosin Hills, Poblacion, Bislig 5340 Tawi-Tawi.", "797-009-261", "40-2400714-1", "239192926939", "672-474-690-000", "210850209964", "Regular", "HR Team Leader", "Crisostomo, Jose", 42975.00, 1500.00, 800.00, 800.00, 21488.00, 255.80,609.00});
    employeeData.put("10004", new Object[]{"10004", "Salcedo", "Anthony", "September 14, 1993", "93/54 Shanahan Alley Apt. 183, Santo Tomas 1572 Masbate.", "070-766-300", "26-9647608-3", "126445315651", "210-805-911-000", "218002473454", "Regular", "Payroll Manager", "Crisostomo, Jose", 60825.00, 1500.00, 1000.00, 1000.00, 30413.00, 362.05,648.00});
    employeeData.put("10005", new Object[]{"10005", "Romualdez", "Alice", "May 14, 1992", "12A/33 Upton Isle Apt. 420, Roxas City 1814 Surigao del Norte .", "983-606-799", "55-4476527-2", "545652640232", "888-572-294-000", "211385556888", "Regular", "HR Rank and File", "San Jose, Brad", 22500.00, 1500.00, 500.00, 500.00, 11250.00, 133.93,645.00});
    employeeData.put("10006", new Object[]{"10006", "Atienza", "Rosie ", "September 24, 1948", "90A Dibbert Terrace Apt. 190, San Lorenzo 6056 Davao del Norte.", "266-036-427", "41-0644692-3", "708988234853", "604-997-793-000", "260107732354", "Regular", "HR Rank and File", "San Jose, Brad", 22500.00, 1500.00, 500.00, 500.00, 11250.00, 133.93,648.00});
    employeeData.put("10007", new Object[]{"10007", "Farala", "Martha", "January 11, 1942", "42/25 Sawayn Stream, Ubay 1208 Zamboanga del Norte .", "329-034-366", "45-5656375-0", "233693897247", "210-835-851-000", "631130283546", "Regular", "Payroll Rank and File", "Farala, Martha", 24000.00, 1500.00, 500.00, 500.00, 12000.00, 142.86,741.00});
    employeeData.put("10008", new Object[]{"10008", "Martinez", "Leila", "July 11, 1970", "37/46 Kulas Roads, Maragondon 0962 Quirino .", "877-110-749", "27-2090996-4", "515741057496", "275-792-513-000", "101205445886", "Regular", "Payroll Rank and File", "Farala, Martha", 24000.00, 1500.00, 500.00, 500.00, 12000.00, 142.86,744.00});
    employeeData.put("10009", new Object[]{"10009", "San Jose", "Allison ", "June 24, 1986", "08 Grant Drive Suite 406, Poblacion, Iloilo City 9186 La Union.", "179-075-129", "45-3251383-0", "745148459521", "121-203-336-000", "114901859343", "Regular", "Account Rank and File", "Mata, Christian", 22500.00, 1500.00, 500.00, 500.00, 11250.00, 133.93,692.00});
    employeeData.put("10010", new Object[]{"10010", "Rosario", "Cydney ", "October 6, 1996", "93A/21 Berge Points, Tapaz 2180 Quezon.", "868-819-912", "49-1629900-2", "579253435499", "122-244-511-000", "265104358643", "Regular", "Account Rank and File", "Mata, Christian", 22500.00, 1500.00, 500.00, 500.00, 11250.00, 133.93,729.00});
    employeeData.put("10011", new Object[]{"10011", "Lopez", "Josie ", "January 14, 1937", "49 Springs Apt. 266, Poblacion, Taguig 3200 Occidental Mindoro.", "478-355-427", "44-8563448-3", "431709011012", "218-489-737-000", "113071293354", "Regular", "Payroll Team Leader", "Salcedo, Anthony", 38475.00, 1500.00, 800.00, 800.00, 19238.00, 229.02,717.00});
    employeeData.put("10012", new Object[]{"10012", "De Leon", "Selena ", "February 20, 1945", "89A Armstrong Trace, Compostela 7874 Maguindanao.", "975-432-139", "27-2090208-8", "587272469938", "482-259-498-000", "719007608464", "Regular", "Account Team Leader", "Romualdez, Fredrick", 41850.00, 1500.00, 800.00, 800.00, 20925.00, 249.11,747.00});
    employeeData.put("10013", new Object[]{"10013", "Romualdez", "Fredrick ", "March 10, 1985", "22A/52 Lubowitz Meadows, Pililla 4895 Zambales.", "023-079-009", "26-8768374-1", "308366860059", "598-065-761-000", "223057707853", "Regular", "Account Manager", "Crisostomo, Jose", 63500.00, 1500.00, 1000.00, 1000.00, 31750.00, 377.98,723.00});
    employeeData.put("10014", new Object[]{"10014", "Bautista", "Mark ", "February 12, 1961", "65 Murphy Center Suite 094, Poblacion, Palayan 5636 Quirino.", "683-725-348", "49-1647342-5", "399665157135", "273-970-941-000", "260054585575", "Regular", "Account Rank and File", "Mata, Christian", 23250.00, 1500.00, 500.00, 500.00, 11625.00, 138.39,716.00});
    employeeData.put("10015", new Object[]{"10015", "Lazaro", "Darlene ", "November 25, 1985", "47A/94 Larkin Plaza Apt. 179, Poblacion, Caloocan 2751 Quirino.", "740-721-558", "45-5617168-2", "606386917510", "354-650-951-000", "104907708845", "Probationary", "Account Rank and File", "Mata, Christian", 23250.00, 0.00, 0.00, 0.00, 11625.00, 138.39,723.00});
    employeeData.put("10016", new Object[]{"10016", "Delos Santos", "Kolby ", "February 26, 1980", "06A Gulgowski Extensions, Bongabon 6085 Zamboanga del Sur.", "739-443-033", "52-0109570-6", "357451271274", "187-500-345-000", "113017988667", "Probationary", "Account Rank and File", "Mata, Christian", 24000.00, 0.00, 0.00, 0.00, 12000.00, 142.86,716.00});
    employeeData.put("10017", new Object[]{"10017", "Santos", "Vella ", "December 31, 1983", "99A Padberg Spring, Poblacion, Mabalacat 3959 Lanao del Sur.", "955-879-269", "52-9883524-3", "548670482885", "101-558-994-000", "360028104576", "Probationary", "Account Rank and File", "Mata, Christian", 22500.00, 0.00, 0.00, 0.00, 11250.00, 133.93,723.00});
    employeeData.put("10018", new Object[]{"10018", "Del Rosario", "Tomas", "December 18, 1978", "80A/48 Ledner Ridges, Poblacion, Kabankalan 8870 Marinduque.", "882-550-989", "45-5866331-6", "953901539995", "560-735-732-000", "913108649964", "Probationary", "Account Rank and File", "Mata, Christian", 22500.00, 0.00, 0.00, 0.00, 11250.00, 133.93,710.00});
    employeeData.put("10019", new Object[]{"10019", "Tolentino", "Jacklyn ", "May 19, 1944", "96/48 Watsica Flats Suite 734, Poblacion, Malolos 1844 Ifugao.", "675-757-366", "47-1692793-0", "753800654114", "841-177-857-000", "210546661243", "Probationary", "Account Rank and File", "De Leon, Selena", 24000.00, 0.00, 0.00, 0.00, 12000.00, 142.86,697.00});
    employeeData.put("10020", new Object[]{"10020", "Gutierrez", "Percival ", "December 18, 1970", "58A Wilderman Walks, Poblacion, Digos 5822 Davao del Sur.", "512-899-876", "40-9504657-8", "797639382265", "502-995-671-000", "210897095686", "Probationary", "Account Rank and File", "De Leon, Selena", 24750.00, 0.00, 0.00, 0.00, 12375.00, 147.32,698.00});
    employeeData.put("10021", new Object[]{"10021", "Manalaysay", "Garfield ", "August 28, 1966", "60 Goyette Valley Suite 219, Poblacion, Tabuk 3159 Lanao del Sur.", "948-628-136", "45-3298166-4", "810909286264", "336-676-445-000", "211274476563", "Probationary", "Account Rank and File", "De Leon, Selena", 24750.00, 0.00, 0.00, 0.00, 12375.00, 147.32,723.00});
    employeeData.put("10022", new Object[]{"10022", "Villegas", "Lizeth ", "December 12, 1981", "66/77 Mann Views, Luisiana 1263 Dinagat Islands.", "332-372-215", "40-2400719-4", "934389652994", "210-395-397-000", "122238077997", "Probationary", "Account Rank and File", "De Leon, Selena", 24000.00, 0.00, 0.00, 0.00, 12000.00, 142.86,660.00});
    employeeData.put("10023", new Object[]{"10023", "Ramos", "Carol ", "August 20, 1978", "72/70 Stamm Spurs, Bustos 4550 Iloilo.", "55250-700-38955555", "60-1152206-4", "351830469744", "395-032-717-000", "212141893454", "Probationary", "Account Rank and File", "De Leon, Selena", 22500.00, 0.00, 0.00, 0.00, 11250.00, 133.93,723.00});
    employeeData.put("10024", new Object[]{"10024", "Maceda", "Emelia ", "April 14, 1963", "50A/83 Bahringer Oval Suite 145, Kiamba 7688 Nueva Ecija", "973-358-041", "54-1331005-0", "465087894112", "215-973-013-000", "515012579765", "Probationary", "Account Rank and File", "De Leon, Selena", 22500.00, 0.00, 0.00, 0.00, 11250.00, 133.93,709.00});
    employeeData.put("10025", new Object[]{"10025", "Aguilar", "Delia ", "January 27, 1939", "95 Cremin Junction, Surallah 2809 Cotabato.", "529-705-439", "52-1859253-1", "136451303068", "599-312-588-000", "110018813465", "Probationary", "Account Rank and File", "De Leon, Selena", 22500.00, 0.00, 0.00, 0.00, 11250.00, 133.93,723.00});
    
        for(Object[] employee : employeeData.values()){
            model.addRow(employee);
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployeedetails = new javax.swing.JTable();
        searchField = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        grossWageField = new javax.swing.JTextField();
        netWageField = new javax.swing.JTextField();
        totalSalaryField = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblEmployeedetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblEmployeedetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee #", "Last Name", "First Name", "Birthday", "Address", "Phone Number", "SSS #", "Philhealth #", "TIN #", "Pag-ibig #", "Status", "Position", "Immediate Supervisor", "Basic Salary", "Rice Subsidy", "Phone Allowance", "Clothing Allowance", "Gross Semi-monthly Rate", "Hourly Rate", "Total Hours Worked"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblEmployeedetails.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblEmployeedetails.setEnabled(false);
        jScrollPane1.setViewportView(tblEmployeedetails);
        if (tblEmployeedetails.getColumnModel().getColumnCount() > 0) {
            tblEmployeedetails.getColumnModel().getColumn(0).setPreferredWidth(200);
            tblEmployeedetails.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblEmployeedetails.getColumnModel().getColumn(2).setPreferredWidth(200);
            tblEmployeedetails.getColumnModel().getColumn(3).setPreferredWidth(200);
            tblEmployeedetails.getColumnModel().getColumn(4).setPreferredWidth(200);
            tblEmployeedetails.getColumnModel().getColumn(5).setPreferredWidth(200);
            tblEmployeedetails.getColumnModel().getColumn(6).setPreferredWidth(200);
            tblEmployeedetails.getColumnModel().getColumn(7).setPreferredWidth(200);
            tblEmployeedetails.getColumnModel().getColumn(8).setPreferredWidth(200);
            tblEmployeedetails.getColumnModel().getColumn(9).setPreferredWidth(200);
            tblEmployeedetails.getColumnModel().getColumn(10).setPreferredWidth(200);
            tblEmployeedetails.getColumnModel().getColumn(11).setPreferredWidth(200);
            tblEmployeedetails.getColumnModel().getColumn(12).setPreferredWidth(200);
            tblEmployeedetails.getColumnModel().getColumn(13).setPreferredWidth(200);
            tblEmployeedetails.getColumnModel().getColumn(14).setPreferredWidth(200);
            tblEmployeedetails.getColumnModel().getColumn(15).setPreferredWidth(200);
            tblEmployeedetails.getColumnModel().getColumn(16).setPreferredWidth(200);
            tblEmployeedetails.getColumnModel().getColumn(17).setPreferredWidth(200);
            tblEmployeedetails.getColumnModel().getColumn(18).setPreferredWidth(200);
            tblEmployeedetails.getColumnModel().getColumn(19).setPreferredWidth(200);
        }

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        grossWageField.setEditable(false);
        grossWageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grossWageFieldActionPerformed(evt);
            }
        });

        jTextField1.setText("GrossWage");

        jTextField2.setText("NetWage");

        jTextField3.setText("Total Salary");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnClear)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(grossWageField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(netWageField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(211, 211, 211)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(totalSalaryField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(netWageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grossWageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalSalaryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblEmployeedetails.getModel();
        String searchValue = searchField.getText();
        String searchValueRow = "row"+searchValue;
//        JOptionPane.showMessageDialog(null,"Employee ROWNUM: "+searchValueRow);
        boolean found = false;
        

        
        if(employeeData.containsKey(searchValue)){
            found = true;
            Object[] employee = employeeData.get(searchValue);
            
            String empId = (String) employee[0];
            double hrlyRate = (double) employee[18];
            double totalWorkHrs =  (double) employee[19];
            double _basicSalary =  (double) employee[13];
            double riceSubs = (double) employee[14];
            double phoneAllow = (double) employee[15];
            double clothingAllowance_ = (double) employee[16];
                     
            double hourlyRate = hrlyRate;
            double totalHoursWorked = totalWorkHrs;
            double grossWage = hourlyRate * totalHoursWorked;
            grossWageField.setText(String.valueOf(grossWage));

  
            double basicSalary = _basicSalary;
            double riceSubsidy = riceSubs;
            double clothingAllowance = clothingAllowance_;
            double totalSalary = basicSalary + riceSubsidy + phoneAllow + clothingAllowance;
            totalSalaryField.setText(Double.toString(totalSalary));
            
            double taxRate = 0.18; // 18% pag-ibig+philhealth+sss
            double netWage = grossWage * (1 - taxRate);         
            netWageField.setText(Double.toString(netWage));

        }
        if(!found) {
            JOptionPane.showMessageDialog(null,"Employee not found!");
        }
    }//GEN-LAST:event_searchFieldActionPerformed

    private void grossWageFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grossWageFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grossWageFieldActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        grossWageField.setText("");
        netWageField.setText ("");
        totalSalaryField.setText ("");
        searchField.setText ("");
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(Payslip_EmployeeDits_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payslip_EmployeeDits_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payslip_EmployeeDits_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payslip_EmployeeDits_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payslip_EmployeeDits_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JTextField grossWageField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField netWageField;
    private javax.swing.JTextField searchField;
    private javax.swing.JTable tblEmployeedetails;
    private javax.swing.JTextField totalSalaryField;
    // End of variables declaration//GEN-END:variables
}
