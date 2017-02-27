/*
 * Copyright (C) 2017 Diana Botez <dia.botez at gmail.com> - All Rights Reserved
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * Althering the content of this licence under any circumstances
 * is strictly forbidden.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 */
package operationplanning.EN;

import operationplanning.EN.Planning_EN;
import javax.swing.JOptionPane;
import operationplanning.commonFiles.MedicIdentifiers;
import operationplanning.commonFiles.MedicalTeams;

/**
 *
 * @author Diana Botez <dia.botez at gmail.com>
 */
public class AddNewMedicalTeamPanel_EN extends javax.swing.JPanel {

    /**
     * Creates new form addNewMedicalTeamPanel
     */
    public AddNewMedicalTeamPanel_EN() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddNewTeamButton = new javax.swing.JButton();
        coordinatorLastNameLabel = new javax.swing.JLabel();
        coordinatorFirstNameLabel = new javax.swing.JLabel();
        coordinatorDepartmentLabel = new javax.swing.JLabel();
        memberDepartmentLabel = new javax.swing.JLabel();
        memberFirstNameLabel = new javax.swing.JLabel();
        memberLastNameLabel = new javax.swing.JLabel();
        coordinatorLastNameTextField = new javax.swing.JTextField();
        coordinatorFirstNameTextField = new javax.swing.JTextField();
        coordinatorDepartmentTextField = new javax.swing.JTextField();
        memberLastNameTextField = new javax.swing.JTextField();
        memberFirstNameTextField = new javax.swing.JTextField();
        memberDepartmentTextField = new javax.swing.JTextField();
        resetButton = new javax.swing.JButton();

        AddNewTeamButton.setText("Add new team");
        AddNewTeamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewTeamButtonActionPerformed(evt);
            }
        });

        coordinatorLastNameLabel.setText("Coordinator's last name");

        coordinatorFirstNameLabel.setText("Coordinator's first name");

        coordinatorDepartmentLabel.setText("Coordinator's department");

        memberDepartmentLabel.setText("Member's department");

        memberFirstNameLabel.setText("Member's first name");

        memberLastNameLabel.setText("Member's last name");

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(coordinatorDepartmentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(coordinatorFirstNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(coordinatorLastNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(memberLastNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(memberFirstNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(memberDepartmentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddNewTeamButton))
                    .addComponent(coordinatorLastNameTextField)
                    .addComponent(coordinatorFirstNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                    .addComponent(coordinatorDepartmentTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                    .addComponent(memberLastNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                    .addComponent(memberFirstNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                    .addComponent(memberDepartmentTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coordinatorLastNameLabel)
                    .addComponent(coordinatorLastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coordinatorFirstNameLabel)
                    .addComponent(coordinatorFirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coordinatorDepartmentLabel)
                    .addComponent(coordinatorDepartmentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memberLastNameLabel)
                    .addComponent(memberLastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memberFirstNameLabel)
                    .addComponent(memberFirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memberDepartmentLabel)
                    .addComponent(memberDepartmentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddNewTeamButton)
                    .addComponent(resetButton))
                .addContainerGap(130, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddNewTeamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewTeamButtonActionPerformed
        MedicalTeams inst = MedicalTeams.getInstance();
        
        String coordinatorLastName = coordinatorLastNameTextField.getText();
        String coordinatorFirstName = coordinatorFirstNameTextField.getText();
        String coordinatorDepartment = coordinatorDepartmentTextField.getText();

        String memberLastName = memberLastNameTextField.getText();
        String memberFirstName = memberFirstNameTextField.getText();
        String memberDepartment = memberDepartmentTextField.getText();

        if("".equals(coordinatorLastName) || "".equals(coordinatorFirstName)
                || "".equals(coordinatorDepartment) || "".equals(memberLastName)
                || "".equals(memberFirstName) || "".equals(memberDepartment))
        {
            JOptionPane.showMessageDialog(this, "One or more fields are empty. Fill them and try again.",
                    "Error adding a new medical team", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Object[] o = {"Add", "Cancel"};
        int option = JOptionPane.showOptionDialog(this, "You are about to add a new medical team with the following data:\n"
                + "\ncoordinator's last name - " + coordinatorLastName
                + "\ncoordinator's first name - " + coordinatorFirstName
                + "\ncoordinator's department - " + coordinatorDepartment
                + "\nmember's last name - " + coordinatorLastName
                + "\nmember's first name - " + coordinatorLastName
                + "\nmember's department - " + coordinatorLastName
                + "\n\nAre you sure you want to add a new medical team with these members?",
                "Adding a new medical team", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, o, o[1]);

        if (option == 1) {
            return;
        }

        MedicIdentifiers coordinator = new MedicIdentifiers(coordinatorLastName, coordinatorFirstName, coordinatorDepartment);
        MedicIdentifiers member = new MedicIdentifiers(memberLastName, memberFirstName, memberDepartment);
        //check names

        // add the new team in the data base
        inst.addNewMedicToMedicalTeam(coordinator, member);

        //add new medical team
        Planning_EN.addNewMedicalTeam();

        resetButtonActionPerformed(null);
    }//GEN-LAST:event_AddNewTeamButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        coordinatorLastNameTextField.setText("");
        coordinatorFirstNameTextField.setText("");
        coordinatorDepartmentTextField.setText("");
        memberLastNameTextField.setText("");
        memberFirstNameTextField.setText("");
        memberDepartmentTextField.setText("");
    }//GEN-LAST:event_resetButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddNewTeamButton;
    private javax.swing.JLabel coordinatorDepartmentLabel;
    private javax.swing.JTextField coordinatorDepartmentTextField;
    private javax.swing.JLabel coordinatorFirstNameLabel;
    private javax.swing.JTextField coordinatorFirstNameTextField;
    private javax.swing.JLabel coordinatorLastNameLabel;
    private javax.swing.JTextField coordinatorLastNameTextField;
    private javax.swing.JLabel memberDepartmentLabel;
    private javax.swing.JTextField memberDepartmentTextField;
    private javax.swing.JLabel memberFirstNameLabel;
    private javax.swing.JTextField memberFirstNameTextField;
    private javax.swing.JLabel memberLastNameLabel;
    private javax.swing.JTextField memberLastNameTextField;
    private javax.swing.JButton resetButton;
    // End of variables declaration//GEN-END:variables
}