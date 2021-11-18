/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.EcoSystem;

import Business.Employee.Employee;
import Business.Organization;
import Business.Role.CustomerRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    DefaultTableModel customerDirectoryTableModel;
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initPersonDirModel();
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        populateTree();

    }
    
     private void initPersonDirModel() {
        customerDirectoryTableModel = new DefaultTableModel();
        customerDirectoryTableModel.addColumn("Name");
        customerDirectoryTableModel.addColumn("Age");
        customerDirectoryTableModel.addColumn("Address");
        customerDirectoryTableModel.addColumn("Username");
        customerDirectoryTableModel.addColumn("Password");

    } 
    
    public void populateTree(){
        DefaultTreeModel model=(DefaultTreeModel)jTree.getModel();
       // Add the code for draw your system structure shown by JTree
       
        model.reload();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        adminScreenTabbedPane = new javax.swing.JTabbedPane();
        restAdminJpanel = new javax.swing.JPanel();
        deliveryAGentDirJPanel = new javax.swing.JPanel();
        personJPanel = new javax.swing.JPanel();
        personDirectoryScollPanel = new javax.swing.JScrollPane();
        personDirTable = new javax.swing.JTable();
        createButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        personDirLabel = new javax.swing.JLabel();
        personDirAdminHeaderLabel = new javax.swing.JLabel();
        personNameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        ageSlider = new javax.swing.JSlider();
        saveChangesButton = new javax.swing.JButton();
        personNameTextField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        ageLabelValue = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        paswdLabel = new javax.swing.JLabel();
        paswdPaswdField = new javax.swing.JPasswordField();

        setLayout(new java.awt.BorderLayout());

        jTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1194, Short.MAX_VALUE)
        );

        jSplitPane.setLeftComponent(jPanel1);

        adminScreenTabbedPane.setForeground(new java.awt.Color(0, 0, 102));
        adminScreenTabbedPane.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        restAdminJpanel.setForeground(new java.awt.Color(0, 0, 102));
        restAdminJpanel.setAutoscrolls(true);

        javax.swing.GroupLayout restAdminJpanelLayout = new javax.swing.GroupLayout(restAdminJpanel);
        restAdminJpanel.setLayout(restAdminJpanelLayout);
        restAdminJpanelLayout.setHorizontalGroup(
            restAdminJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1559, Short.MAX_VALUE)
        );
        restAdminJpanelLayout.setVerticalGroup(
            restAdminJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 888, Short.MAX_VALUE)
        );

        adminScreenTabbedPane.addTab("Restaurant Admin", restAdminJpanel);

        javax.swing.GroupLayout deliveryAGentDirJPanelLayout = new javax.swing.GroupLayout(deliveryAGentDirJPanel);
        deliveryAGentDirJPanel.setLayout(deliveryAGentDirJPanelLayout);
        deliveryAGentDirJPanelLayout.setHorizontalGroup(
            deliveryAGentDirJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1559, Short.MAX_VALUE)
        );
        deliveryAGentDirJPanelLayout.setVerticalGroup(
            deliveryAGentDirJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 888, Short.MAX_VALUE)
        );

        adminScreenTabbedPane.addTab("Delivery Agents Directory", deliveryAGentDirJPanel);

        personJPanel.setForeground(new java.awt.Color(0, 0, 102));

        personDirTable.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        personDirTable.setForeground(new java.awt.Color(0, 0, 102));
        personDirTable.setModel(customerDirectoryTableModel);
        personDirTable.setRowHeight(40);
        personDirectoryScollPanel.setViewportView(personDirTable);

        createButton.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        createButton.setForeground(new java.awt.Color(0, 0, 102));
        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        updateButton.setForeground(new java.awt.Color(0, 0, 102));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        viewButton.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        viewButton.setForeground(new java.awt.Color(0, 0, 102));
        viewButton.setText("View ");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(0, 0, 102));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        personDirLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        personDirLabel.setForeground(new java.awt.Color(0, 0, 102));
        personDirLabel.setText("Customer Directory");

        personDirAdminHeaderLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        personDirAdminHeaderLabel.setForeground(new java.awt.Color(0, 0, 102));
        personDirAdminHeaderLabel.setText(" ");

        personNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        personNameLabel.setForeground(new java.awt.Color(0, 0, 102));
        personNameLabel.setText("Name :");

        ageLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ageLabel.setForeground(new java.awt.Color(0, 0, 102));
        ageLabel.setText("Age:");

        ageSlider.setForeground(new java.awt.Color(0, 0, 102));
        ageSlider.setMinimum(1);
        ageSlider.setMinorTickSpacing(1);
        ageSlider.setPaintLabels(true);
        ageSlider.setSnapToTicks(true);
        ageSlider.setToolTipText("");
        ageSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ageSliderStateChanged(evt);
            }
        });

        saveChangesButton.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        saveChangesButton.setForeground(new java.awt.Color(0, 0, 102));
        saveChangesButton.setText("Save");
        saveChangesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveChangesButtonActionPerformed(evt);
            }
        });

        personNameTextField.setForeground(new java.awt.Color(0, 0, 102));
        personNameTextField.setText(" ");

        addressLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(0, 0, 102));
        addressLabel.setText("Address: ");

        addressTextField.setForeground(new java.awt.Color(0, 0, 102));
        addressTextField.setText(" ");

        ageLabelValue.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        ageLabelValue.setForeground(new java.awt.Color(0, 0, 102));
        ageLabelValue.setText(" ");

        userNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(0, 0, 102));
        userNameLabel.setText("UserName: ");

        userNameTextField.setForeground(new java.awt.Color(0, 0, 102));
        userNameTextField.setText(" ");
        userNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTextFieldActionPerformed(evt);
            }
        });

        paswdLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        paswdLabel.setForeground(new java.awt.Color(0, 0, 102));
        paswdLabel.setText("Password");

        javax.swing.GroupLayout personJPanelLayout = new javax.swing.GroupLayout(personJPanel);
        personJPanel.setLayout(personJPanelLayout);
        personJPanelLayout.setHorizontalGroup(
            personJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createButton)
                .addGap(18, 18, 18)
                .addComponent(updateButton)
                .addGap(18, 18, 18)
                .addComponent(viewButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteButton)
                .addGap(47, 47, 47))
            .addGroup(personJPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(personJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personJPanelLayout.createSequentialGroup()
                        .addGroup(personJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saveChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(personJPanelLayout.createSequentialGroup()
                        .addGroup(personJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(personJPanelLayout.createSequentialGroup()
                                .addGroup(personJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(personNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(personJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(personNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(personJPanelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(personJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(personDirectoryScollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1506, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(personDirLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(personDirAdminHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(personJPanelLayout.createSequentialGroup()
                                .addComponent(paswdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addGroup(personJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(personJPanelLayout.createSequentialGroup()
                                        .addComponent(ageSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(ageLabelValue, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(paswdPaswdField, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        personJPanelLayout.setVerticalGroup(
            personJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personJPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(personDirLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(personDirectoryScollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(personJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(updateButton)
                    .addComponent(viewButton)
                    .addComponent(createButton)
                    .addComponent(personDirAdminHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(personJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(personNameLabel)
                    .addComponent(personNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(personJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personJPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(userNameLabel))
                    .addGroup(personJPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(personJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paswdLabel)
                    .addComponent(paswdPaswdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(personJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personJPanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(ageSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, personJPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(personJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ageLabelValue, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageLabel))
                        .addGap(47, 47, 47)))
                .addGroup(personJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(saveChangesButton)
                .addGap(80, 80, 80))
        );

        adminScreenTabbedPane.addTab("Customer Directory", personJPanel);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminScreenTabbedPane))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminScreenTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );

        jSplitPane.setRightComponent(jPanel2);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTreeValueChanged
        
        DefaultMutableTreeNode selectedNode= (DefaultMutableTreeNode)jTree.getLastSelectedPathComponent();
        if(selectedNode!=null){
            //lblSelectedNode.setText(selectedNode.toString());
        }
    }//GEN-LAST:event_jTreeValueChanged
    private void updateAdminHeader(String text) {
        personDirAdminHeaderLabel.setText(text);
    }
    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        // TODO add your handling code here:
        updateAdminHeader("Create Person record");
        setAllTextFieldsForCustomerEnabled();
    }//GEN-LAST:event_createButtonActionPerformed
    private void setValuesInForm(int selectedRowIndex) {
        Customer customerRecord = ecosystem.getCustomerDirectory().getPersonAtIndex(selectedRowIndex);
        personNameTextField.setText(customerRecord.getName());
        ageSlider.setValue(customerRecord.getAge());
        addressTextField.setText(customerRecord.getAddress());
        userNameTextField.setText(customerRecord.getUserAccount().getUsername());
        
    }    
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        updateAdminHeader("Update Person record");
        setAllTextFieldsForCustomerEnabled();

        int selectedRowIndex = personDirTable.getSelectedRow();

        if(selectedRowIndex == -1) {
            JOptionPane.showConfirmDialog(null,
                "No record selected to update the row", "Error!",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE);
            return;
        }

        setValuesInForm(selectedRowIndex);
    }//GEN-LAST:event_updateButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        updateAdminHeader("Viewing record below");

        int selectedRowIndex = personDirTable.getSelectedRow();

        if(selectedRowIndex == -1) {
            JOptionPane.showConfirmDialog(null, "No record selected to view the row", "Error!",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE);
            return;
        }

        setValuesInForm(selectedRowIndex);
        setAllTextFieldsForCustomerDisabled();
    }//GEN-LAST:event_viewButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        updateAdminHeader("Deleting selected record.");

        int selectedRowIndex = personDirTable.getSelectedRow();

        if(selectedRowIndex == -1) {
            JOptionPane.showConfirmDialog(null,
                "No record selected to delete the row",
                "Error!",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE);
            return;
        }

        int response = JOptionPane.showConfirmDialog(null, "Do you want to delete selected record?");
        if(response == 0) {
            ecosystem.getCustomerDirectory().removePersonAtIndex(selectedRowIndex);
        }
        populateCustomerDirectoryTable();
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    
    private void populateCustomerDirectoryTable() {
    
        customerDirectoryTableModel.setRowCount(0);
        for(Customer c: ecosystem.getCustomerDirectory().getCustomers()) {
            
            String[] rowData = {c.getName(), Integer.toString(c.getAge()), c.getAddress(), c.getUserAccount().getUsername(), c.getUserAccount().getPassword()};
            customerDirectoryTableModel.addRow(rowData);
        }
    
    }


    private void setAllTextFieldsForCustomerNull () {
        personNameTextField.setText("");
        addressTextField.setText("");
        userNameTextField.setText("");
        ageSlider.setValue(20);
    }


    private void setAllTextFieldsForCustomerEnabled () {
        personNameTextField.setEnabled(true);
        addressTextField.setEnabled(true);
        userNameTextField.setEnabled(true);
        paswdPaswdField.setEnabled(true);
        ageSlider.setEnabled(true);
    }


    private void setAllTextFieldsForCustomerDisabled () {
        personNameTextField.setEnabled(false);
        addressTextField.setEnabled(false);
        userNameTextField.setEnabled(false);
        paswdPaswdField.setEnabled(false);
        ageSlider.setEnabled(false);
    }




    private void ageSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ageSliderStateChanged
        // TODO add your handling code here:

        ageLabelValue.setText(Integer.toString(ageSlider.getValue()));
    }//GEN-LAST:event_ageSliderStateChanged

    private void saveChangesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveChangesButtonActionPerformed
        // TODO add your handling code here:

        if (personDirAdminHeaderLabel.getText().contains("Create")) {

            //ArrayList<Person> personDir = personDirectory.getPeople();
            Customer newCust = new Customer();
            int resp = saveCustChangesFromUItoCustObject(newCust);
            if (resp == 1) {

               Employee newEmployee = ecosystem.getEmployeeDirectory().createEmployee(newCust.getName());
               UserAccount newUserAccount = ecosystem.getUserAccountDirectory().createUserAccount(userNameTextField.getText().trim(),
                       String.valueOf(paswdPaswdField.getPassword()), newEmployee, new CustomerRole());
               newCust.setUserAccount(newUserAccount);
               ecosystem.getCustomerDirectory().createCustomer(newCust);
                populateCustomerDirectoryTable();
                JOptionPane.showConfirmDialog(null,
                    "Created customer record successfully!",
                    "Success!",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE);

                //populateSearchTableHistory(carCatalog.getCars());

            }

        }

        if (personDirAdminHeaderLabel.getText().contains("Update")) {
            int selectedIndex = personDirTable.getSelectedRow();
            Customer personRecord = ecosystem.getCustomerDirectory().getPersonAtIndex(selectedIndex);
            int resp = saveCustChangesFromUItoCustObject(personRecord);
            if (resp == 1) {
                ecosystem.getEmployeeDirectory().setEmployeeName(personRecord.getName(), personRecord.getUserAccount().getEmployee().getId());
                ecosystem.getUserAccountDirectory().updateUserAccountValues(personRecord.getUserAccount().getUserAccountId(), userNameTextField.getText().trim(), String.valueOf(paswdPaswdField.getPassword()));


                ecosystem.getCustomerDirectory().setPersonAtIndex(selectedIndex, personRecord);
                populateCustomerDirectoryTable();

                JOptionPane.showConfirmDialog(null,
                    "Person Record updated successfully!",
                    "Success!",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE);


            }

            setAllTextFieldsForCustomerNull();

        }

        
    }//GEN-LAST:event_saveChangesButtonActionPerformed
    private int saveCustChangesFromUItoCustObject(Customer cust) {
        String name = personNameTextField.getText().trim();
        int age = ageSlider.getValue();
        String address = addressTextField.getText().trim();
        String userName = userNameTextField.getText().trim();
        String password = String.valueOf(paswdPaswdField.getPassword());
               

        if (name.isEmpty()) {

            JOptionPane.showConfirmDialog(null, "Please verify values for Customer name. It should non-empty.", "Error!",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE);
            return 0;

        }

        if (userName.isEmpty()) {
            JOptionPane.showConfirmDialog(null, "Please verify values for User name. It should non-empty.", "Error!",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE);
            return 0;


        }
         if (password.isEmpty()) {
            JOptionPane.showConfirmDialog(null, "Please verify values for Password. It should non-empty.", "Error!",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE);
            return 0;


        }
         
        cust.setAge(age);
        cust.setName(name);
        cust.setAddress(address);

        return 1;

    
    
    }
    
    
    private void userNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JTabbedPane adminScreenTabbedPane;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel ageLabelValue;
    private javax.swing.JSlider ageSlider;
    private javax.swing.JButton createButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JPanel deliveryAGentDirJPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JTree jTree;
    private javax.swing.JLabel paswdLabel;
    private javax.swing.JPasswordField paswdPaswdField;
    private javax.swing.JLabel personDirAdminHeaderLabel;
    private javax.swing.JLabel personDirLabel;
    private javax.swing.JTable personDirTable;
    private javax.swing.JScrollPane personDirectoryScollPanel;
    private javax.swing.JPanel personJPanel;
    private javax.swing.JLabel personNameLabel;
    private javax.swing.JTextField personNameTextField;
    private javax.swing.JPanel restAdminJpanel;
    private javax.swing.JButton saveChangesButton;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField userNameTextField;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
