package hotel.management.system;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Aditi Kukreti
 */
public class editEmployee extends javax.swing.JFrame {

    /**
     * Creates new form editEmployee
     */
    public editEmployee() 
    {
        initComponents();
        try
        {
            conn c= new conn();
            String str = "select Emp_ID,Emp_Name,Emp_Gender,Emp_Contact_No,Salary,Emp_Age,Designation from employee";
            ResultSet rs = c.s.executeQuery(str);
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        JTextField [] tfs = {empName,empAge,empPhone,empSalary};
        HintText(tfs);
    }
    
    private void HintText(JTextField []tfs)
    {
        for(JTextField jtf : tfs)
        {
            jtf.addFocusListener(new FocusListener(){
                @Override
                public void focusGained(FocusEvent e) {
                    
                    
                    if(jtf.getText().equals("Name"))
                        jtf.setText("");
                    else if(jtf.getText().equals("Contact Number"))
                        jtf.setText("");
                    else if(jtf.getText().equals("Age"))
                        jtf.setText("");
                    else if(jtf.getText().equals("Salary"))
                        jtf.setText("");
                }

                @Override
                public void focusLost(FocusEvent e) {
               
                    if(jtf.equals(empName) && jtf.getText().equals(""))
                    jtf.setText("Name");
                    else if(jtf.equals(empPhone) && jtf.getText().equals(""))
                    jtf.setText("Contact Number");
                    else if(jtf.equals(empAge) && jtf.getText().equals(""))
                    jtf.setText("Age");
                    else if(jtf.equals(empSalary) && jtf.getText().equals(""))
                    jtf.setText("Salary");
                }
                
            });
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

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        deleteEmpBtn = new javax.swing.JButton();
        updateEmpBtn = new javax.swing.JButton();
        empName = new javax.swing.JTextField();
        empPhone = new javax.swing.JTextField();
        empAge = new javax.swing.JTextField();
        empSalary = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        empGender = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(102, 0, 153));
        kGradientPanel1.setkStartColor(new java.awt.Color(153, 0, 153));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Edit Employee");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/system/icons/customer_50px.png"))); // NOI18N

        jButton3.setBackground(new java.awt.Color(153, 0, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/system/icons/back.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        deleteEmpBtn.setBackground(new java.awt.Color(153, 0, 51));
        deleteEmpBtn.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        deleteEmpBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteEmpBtn.setText("D E L E T E    E M P L O Y E E");
        deleteEmpBtn.setBorder(null);
        deleteEmpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEmpBtnActionPerformed(evt);
            }
        });

        updateEmpBtn.setBackground(new java.awt.Color(51, 153, 0));
        updateEmpBtn.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        updateEmpBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateEmpBtn.setText("U P D A T E ");
        updateEmpBtn.setBorder(null);
        updateEmpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEmpBtnActionPerformed(evt);
            }
        });

        empName.setBackground(new java.awt.Color(255, 255, 255));
        empName.setText("Name");
        empName.setPreferredSize(new java.awt.Dimension(81, 30));

        empPhone.setBackground(new java.awt.Color(255, 255, 255));
        empPhone.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        empPhone.setText("Contact Number");
        empPhone.setMinimumSize(new java.awt.Dimension(14, 35));
        empPhone.setPreferredSize(new java.awt.Dimension(150, 30));
        empPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empPhoneActionPerformed(evt);
            }
        });

        empAge.setBackground(new java.awt.Color(255, 255, 255));
        empAge.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        empAge.setText("Age");
        empAge.setMinimumSize(new java.awt.Dimension(14, 35));
        empAge.setPreferredSize(new java.awt.Dimension(150, 30));
        empAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empAgeActionPerformed(evt);
            }
        });

        empSalary.setBackground(new java.awt.Color(255, 255, 255));
        empSalary.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        empSalary.setText("Salary");
        empSalary.setMinimumSize(new java.awt.Dimension(14, 35));
        empSalary.setPreferredSize(new java.awt.Dimension(150, 30));
        empSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empSalaryActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(17, 71, 125));
        jLabel5.setText("Gender");

        empGender.setBackground(new java.awt.Color(255, 255, 255));
        empGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        empGender.setPreferredSize(new java.awt.Dimension(116, 30));
        empGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empGenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(empPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateEmpBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteEmpBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(empAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(empSalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(empGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(empName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(empName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(empGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(empPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(empAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(empSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateEmpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteEmpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        jTable1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(51, 51, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Gender", "Contact No.", "Salary", "Age", "Designation"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAlignmentX(0.0F);
        jTable1.setAlignmentY(0.0F);
        jTable1.setRowHeight(35);
        jTable1.setSelectionBackground(new java.awt.Color(153, 0, 153));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateEmpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEmpBtnActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
        
        //delete row in gui
        if(jTable1.getSelectedRowCount()==1)
        {
            String newName = empName.getText();
            String newPhone = empPhone.getText();
            String newAge = empAge.getText();
            String newSalary = empSalary.getText();
            String newGender = (String)empGender.getSelectedItem();
            
            String tbID = tb.getValueAt(jTable1.getSelectedRow(),0).toString();
           
            String updateRow ="UPDATE employee SET Emp_Name= '"+newName+"',Emp_Age= '"+newAge+"',Emp_Contact_No= '"+newPhone+"',Salary= '"+newSalary+"',Emp_Gender= '"+newGender+"' WHERE (Emp_ID= '"+tbID+"')";
            
            try 
            {   
                    conn c= new conn();
                    c.s.executeUpdate(updateRow); 
                    JOptionPane.showMessageDialog(this, "Employee Updated successfully!");
                    
                    tb.setValueAt(newName,jTable1.getSelectedRow(),1);
                    tb.setValueAt(newGender,jTable1.getSelectedRow(),2);
                    tb.setValueAt(newPhone,jTable1.getSelectedRow(),3);
                    tb.setValueAt(newSalary,jTable1.getSelectedRow(),4);
                    tb.setValueAt(newAge,jTable1.getSelectedRow(),5);
                    
            } 
            catch (Exception e) 
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        else
        {
            if(jTable1.getRowCount()==0) //empty table
            {
                JOptionPane.showMessageDialog(this, "Table is empty!");
            }
            else
            {
                 JOptionPane.showMessageDialog(this, "Please select any single row to be updated");
            }
        }
        
    }//GEN-LAST:event_updateEmpBtnActionPerformed

    private void deleteEmpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEmpBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
        
        //delete row in gui
        if(jTable1.getSelectedRowCount()==1)
        {
            int row = jTable1.getSelectedRow();
            String eve = String.valueOf(tb.getValueAt(row,0));
            String delRow = "delete from employee where Emp_ID='"+eve+"'";
            
            try 
            {   
                //confirmation message
                int input = JOptionPane.showConfirmDialog(null, "Delete employee permanently?", "Confirmation",
                JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
                
                
                if(input==0)
                {
                    conn c= new conn();
                    c.s.executeUpdate(delRow); 
                    JOptionPane.showMessageDialog(this, "Employee deleted successfully");
                    tb.removeRow(jTable1.getSelectedRow());
                }
                
            } 
            catch (Exception e) 
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        else
        {
            if(jTable1.getRowCount()==0) //empty table
            {
                JOptionPane.showMessageDialog(this, "Table is empty!");
            }
            else
            {
                 JOptionPane.showMessageDialog(this, "Please select any single row to be deleted.");
            }
        }
        
    }//GEN-LAST:event_deleteEmpBtnActionPerformed

    private void empPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empPhoneActionPerformed

    private void empAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empAgeActionPerformed

    private void empSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empSalaryActionPerformed

    private void empGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empGenderActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
        String tbName = tb.getValueAt(jTable1.getSelectedRow(),1).toString();
        String tbGender = tb.getValueAt(jTable1.getSelectedRow(),2).toString();
        String tbPhone = tb.getValueAt(jTable1.getSelectedRow(),3).toString();
        String tbSalary = tb.getValueAt(jTable1.getSelectedRow(),4).toString();
        String tbAge = tb.getValueAt(jTable1.getSelectedRow(),5).toString();
        
        empName.setText(tbName);
        empPhone.setText(tbPhone);
        empAge.setText(tbAge);
        empSalary.setText(tbSalary);
        empGender.getModel().setSelectedItem(tbGender);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new ManageEmployees().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(editEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteEmpBtn;
    private javax.swing.JTextField empAge;
    private javax.swing.JComboBox<String> empGender;
    private javax.swing.JTextField empName;
    private javax.swing.JTextField empPhone;
    private javax.swing.JTextField empSalary;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton updateEmpBtn;
    // End of variables declaration//GEN-END:variables
}
