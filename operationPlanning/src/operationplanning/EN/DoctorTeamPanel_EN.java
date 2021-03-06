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

import java.util.Vector;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import operationplanning.commonFiles.MedicIdentifiers;
import operationplanning.commonFiles.MedicalTeams;
import operationplanning.commonFiles.MyUneditableTableModel;
import operationplanning.commonFiles.TimeTableModels;
import operationplanning.commonFiles.Utils;

/**
 * @abstract
 *
 * @author Diana Botez
 */
public class DoctorTeamPanel_EN extends javax.swing.JPanel {
    private MyUneditableTableModel doctorTeamTableModelEN;
    private MyUneditableTableModel teamPlaningTableModelEN;

    private DefaultComboBoxModel morningStartTimeTableModel;
    private DefaultComboBoxModel morningEndTimeTableModel;

    private JComboBox morningStartTimeTableComboBox = new JComboBox();
    private JComboBox morningEndTimeTableComboBox = new JComboBox();

    private Utils.UserType currentUserType;
    private static int teamIndex;
    private MedicalTeams medicalTeamsInst = MedicalTeams.getInstance();

    /**
     * Creates new form mydoctorTeamPanel
     *
     * @param userType
     */
    public DoctorTeamPanel_EN(Utils.UserType userType, int index) {
        currentUserType = userType;
        teamIndex = index;

        morningStartTimeTableModel = TimeTableModels.getMorningTimeTableModel();
        morningEndTimeTableModel = TimeTableModels.getMorningTimeTableModel();

        doctorTeamTableModelEN = new MyUneditableTableModel(
                new String[]{"Last name", "First Name", "Department"},
                0)        //<editor-fold defaultstate="collapsed" desc="set column classes">
        {
            @Override
            public
                Class getColumnClass(int col)
            {
                return java.lang.String.class;
            }
        } //</editor-fold>
            ;
        teamPlaningTableModelEN = new MyUneditableTableModel(
                new String[]{"Date", "Operation room", "Starting hour", "Ending hour"},
                0)        //<editor-fold defaultstate="collapsed" desc="set column classes">
        {
            @Override
            public
                Class getColumnClass(int col)
            {
                if (col == 0) {
                    return java.util.Date.class;
                }
                else {
                    return java.lang.String.class;
                }
            }
        } //</editor-fold>           
            ;

        morningStartTimeTableComboBox.setModel(morningStartTimeTableModel);
        morningEndTimeTableComboBox.setModel(morningEndTimeTableModel);

        /*Call initComponents method*/
        initComponents();

        /*Update column types with morningStartTimeTableComboBox menu*/
        TableColumn startTimeColumn = teamPlaningTable.getColumnModel().getColumn(2);
        startTimeColumn.setCellEditor(new DefaultCellEditor(morningStartTimeTableComboBox));
        TableColumn endTimeColumn = teamPlaningTable.getColumnModel().getColumn(3);
        endTimeColumn.setCellEditor(new DefaultCellEditor(morningEndTimeTableComboBox));

        /*Add the team medics int the table*/
        Vector<MedicIdentifiers> members = medicalTeamsInst.getMedicalTeam(teamIndex);
        MedicIdentifiers coordinator = medicalTeamsInst.getMedicCoordinator(teamIndex);

        doctorTeamTableModelEN.addRow(new Object[]{coordinator.lastName, coordinator.firstName, coordinator.department});
        for (int i = 0; i < members.size(); i++) {
            doctorTeamTableModelEN.addRow(new Object[]{members.get(i).lastName, members.get(i).firstName, members.get(i).department});
        }

        /*Invalidate the buttons if he userType is "Medic".*/
        if (currentUserType.equals(Utils.UserType.MEDIC)) {
            addMedicButton.setEnabled(false);
            deleteTeamButton.setEnabled(false);
            removeMedicButton.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        doctoresLabel = new javax.swing.JLabel();
        doctorTeamScrollPanel = new javax.swing.JScrollPane();
        doctorTeamTable = new javax.swing.JTable();
        quirofanosUtilisadoLabel = new javax.swing.JLabel();
        teamPlaningScrollPane = new javax.swing.JScrollPane();
        teamPlaningTable = new javax.swing.JTable();
        doctorTeamsubPanel = new javax.swing.JPanel();
        deleteTeamButton = new javax.swing.JButton();
        addMedicButton = new javax.swing.JButton();
        removeMedicButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(640, 480));

        doctoresLabel.setText("Medics");

        doctorTeamTable.setModel(doctorTeamTableModelEN);
        doctorTeamTable.setToolTipText("");
        doctorTeamTable.setColumnSelectionAllowed(true);
        doctorTeamTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        doctorTeamTable.setName(""); // NOI18N
        doctorTeamTable.setSelectionBackground(new java.awt.Color(162, 164, 196));
        doctorTeamTable.setSelectionForeground(new java.awt.Color(75, 70, 70));
        doctorTeamTable.getTableHeader().setReorderingAllowed(false);
        doctorTeamScrollPanel.setViewportView(doctorTeamTable);

        quirofanosUtilisadoLabel.setText("Operation rooms resarved for this team");

        teamPlaningTable.setModel(teamPlaningTableModelEN);
        teamPlaningTable.setColumnSelectionAllowed(true);
        teamPlaningTable.setDragEnabled(true);
        teamPlaningScrollPane.setViewportView(teamPlaningTable);

        deleteTeamButton.setText("Delete this team");
        deleteTeamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTeamButtonActionPerformed(evt);
            }
        });

        addMedicButton.setText("Add medic");
        addMedicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMedicButtonActionPerformed(evt);
            }
        });

        removeMedicButton.setText("Remove medic");
        removeMedicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeMedicButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout doctorTeamsubPanelLayout = new javax.swing.GroupLayout(doctorTeamsubPanel);
        doctorTeamsubPanel.setLayout(doctorTeamsubPanelLayout);
        doctorTeamsubPanelLayout.setHorizontalGroup(
            doctorTeamsubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doctorTeamsubPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteTeamButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(removeMedicButton)
                .addGap(18, 18, 18)
                .addComponent(addMedicButton)
                .addContainerGap())
        );
        doctorTeamsubPanelLayout.setVerticalGroup(
            doctorTeamsubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doctorTeamsubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(deleteTeamButton)
                .addComponent(removeMedicButton)
                .addComponent(addMedicButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(teamPlaningScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addComponent(doctorTeamScrollPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(doctoresLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(quirofanosUtilisadoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(doctorTeamsubPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(doctoresLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doctorTeamScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quirofanosUtilisadoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teamPlaningScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doctorTeamsubPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteTeamButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_deleteTeamButtonActionPerformed
    {//GEN-HEADEREND:event_deleteTeamButtonActionPerformed
        Object[] o = {"Remove", "Cancel"};
        int option = JOptionPane.showOptionDialog(this, "You are about to delete this medical team.\n\n Are you sure you want to remove the team permanently form the data base?", "Warning! Medical team removing", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, o, o[1]);

        if (option == 0) {
            //remove team
            Planning_EN.removeDoctorTeam(this);
        }
    }//GEN-LAST:event_deleteTeamButtonActionPerformed

    private void addMedicButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addMedicButtonActionPerformed
    {//GEN-HEADEREND:event_addMedicButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addMedicButtonActionPerformed

    private void removeMedicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeMedicButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeMedicButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMedicButton;
    private javax.swing.JButton deleteTeamButton;
    private javax.swing.JScrollPane doctorTeamScrollPanel;
    private javax.swing.JTable doctorTeamTable;
    private javax.swing.JPanel doctorTeamsubPanel;
    private javax.swing.JLabel doctoresLabel;
    private javax.swing.JLabel quirofanosUtilisadoLabel;
    private javax.swing.JButton removeMedicButton;
    private javax.swing.JScrollPane teamPlaningScrollPane;
    private javax.swing.JTable teamPlaningTable;
    // End of variables declaration//GEN-END:variables

}
