/*
 * Copyright (C) 2017 Diana Botez <dia.botez at gmail.com>.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package operationplanning;

import javax.swing.JOptionPane;

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

        AddNewTeamButton.setText("Add new team");
        AddNewTeamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewTeamButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddNewTeamButton)
                .addContainerGap(276, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddNewTeamButton)
                .addContainerGap(259, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddNewTeamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewTeamButtonActionPerformed
        Object[] o = {"Add", "Cancel"};
        int option = JOptionPane.showOptionDialog(this, "You are about to add a new medical team.\n\n Are you sure you want to do this?", "Adding a new medical team", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, o, o[1]);

        if (option == 0) {
            //add new medical team
            Planning_EN.addNewMedicalTeam();
        }

    }//GEN-LAST:event_AddNewTeamButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddNewTeamButton;
    // End of variables declaration//GEN-END:variables
}
