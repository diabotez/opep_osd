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
import operationplanning.commonFiles.Utils;

/**
 * @abstract
 *
 * @author user
 */
public class Planning_EN extends javax.swing.JFrame {

    private static AddNewMedicalTeamPanel_EN addMedicalTeamPannel;
    private static Vector<DoctorTeamPanel_EN> doctorTeamPanels;

    private static Vector<OperationRoomPanel_EN> operationRoomPanel;

    private static AddNewPatientPanel_EN addNewPatientPanel;
    private static AddPatientListPanel_EN addPatientListPanel;
    private static SeePatientListPanel_EN seePatientListPanel;

    private static CreateSchedulePanel_EN createSchedulePanel;
    private static ModifySchedulePanel_EN modifySchedulePanel;

    private static PathologiesListPanel_EN pathologiesListPannel;

    private static Utils.UserType currentUserType;

    /**
     * Creates new form Antenna
     *
     * @param userType
     */
    public Planning_EN(Utils.UserType userType) {
        // <editor-fold defaultstate="collapsed" desc="Initialize variables">
        currentUserType = userType;

        doctorTeamPanels = new Vector<>();
        operationRoomPanel = new Vector<>();

        for (int i = 0; i < Utils.doctorTeamsNumber; i++) {
            doctorTeamPanels.add(i, new DoctorTeamPanel_EN(currentUserType, i));
        }
        for (int i = 0; i < Utils.operatingRoomNumber; i++) {
            operationRoomPanel.add(i, new OperationRoomPanel_EN(i < (Utils.operatingRoomNumber - 1)));
        }

        addMedicalTeamPannel = new AddNewMedicalTeamPanel_EN();

        addNewPatientPanel = new AddNewPatientPanel_EN();
        addPatientListPanel = new AddPatientListPanel_EN();
        seePatientListPanel = new SeePatientListPanel_EN();

        createSchedulePanel = new CreateSchedulePanel_EN();
        modifySchedulePanel = new ModifySchedulePanel_EN();

        pathologiesListPannel = new PathologiesListPanel_EN();

        // </editor-fold> 

        /*Call initComponents method*/
        initComponents();

        // <editor-fold defaultstate="collapsed" desc="Add tabs to main panel">
        for (int i = 0; i < Utils.doctorTeamsNumber; i++) {
            doctorTeamTabbedPanel.addTab("Medical team " + (i + 1), doctorTeamPanels.get(i));
        }
        for (int i = 0; i < Utils.operatingRoomNumber; i++) {
            operationRoomTabbedPanel.addTab("Operation room " + (i + 1), operationRoomPanel.get(i));
        }

        doctorTeamTabbedPanel.addTab("Add new medical team", addMedicalTeamPannel);

        addPatientTabbedPanel.addTab("See patient list", seePatientListPanel);
        addPatientTabbedPanel.addTab("Add new patient", addNewPatientPanel);
        addPatientTabbedPanel.addTab("Add list of patients", addPatientListPanel);

        scheduleTabbedPanel.addTab("Create schedule", createSchedulePanel);
        scheduleTabbedPanel.addTab("Modify schedule", modifySchedulePanel);

        pathologiesTabbedPanel.addTab("List", pathologiesListPannel);
        // </editor-fold> 

        pack();
    }

    /**
     *
     * @param pannel
     */
    public static void removeDoctorTeam(DoctorTeamPanel_EN pannel) {
        int i = 0;
        doctorTeamTabbedPanel.removeAll();
        doctorTeamPanels.remove(pannel);
        for (DoctorTeamPanel_EN team : doctorTeamPanels) {
            doctorTeamTabbedPanel.addTab("Medical team " + (i + 1), team);
            i++;
        }
        doctorTeamTabbedPanel.addTab("Add new medical team", addMedicalTeamPannel);
        jTabbedPanel.repaint();
    }

    public static void addNewMedicalTeam() {
        int idx = doctorTeamPanels.size();
        int i = 0;

        doctorTeamPanels.addElement(new DoctorTeamPanel_EN(currentUserType, idx));

        doctorTeamTabbedPanel.removeAll();
        for (DoctorTeamPanel_EN team : doctorTeamPanels) {
            doctorTeamTabbedPanel.addTab("Medical team " + (i + 1), team);
            i++;
        }
        doctorTeamTabbedPanel.addTab("Add new medical team", addMedicalTeamPannel);
    }

    public static void removeOperatingRoom(OperationRoomPanel_EN pannel) {
        int i = 0;
        operationRoomTabbedPanel.removeAll();
        operationRoomPanel.remove(pannel);
        for (OperationRoomPanel_EN room : operationRoomPanel) {
            operationRoomTabbedPanel.addTab("Medical team " + (i + 1), room);
            i++;
        }

        jTabbedPanel.repaint();
    }

    public static void addNewOperationRoom(boolean morning) {
        int idx = operationRoomPanel.size();
        int i = 0;
        operationRoomPanel.addElement(new OperationRoomPanel_EN(morning));

        operationRoomTabbedPanel.removeAll();
        for (OperationRoomPanel_EN room : operationRoomPanel) {
            operationRoomTabbedPanel.addTab("Operation room " + (i + 1), room);
            i++;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPanel = new javax.swing.JTabbedPane();
        doctorTeamTabbedPanel = new javax.swing.JTabbedPane();
        addPatientTabbedPanel = new javax.swing.JTabbedPane();
        pathologiesTabbedPanel = new javax.swing.JTabbedPane();
        operationRoomTabbedPanel = new javax.swing.JTabbedPane();
        scheduleTabbedPanel = new javax.swing.JTabbedPane();
        surgeriesPerformedTabbedPane = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OPEP [EN]");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(740, 580));

        jTabbedPanel.setMinimumSize(new java.awt.Dimension(640, 480));
        jTabbedPanel.setPreferredSize(new java.awt.Dimension(640, 480));

        doctorTeamTabbedPanel.setAutoscrolls(true);
        jTabbedPanel.addTab("Doctor teams", null, doctorTeamTabbedPanel, "");
        jTabbedPanel.addTab("Patients", addPatientTabbedPanel);
        jTabbedPanel.addTab("Pathologies", pathologiesTabbedPanel);
        jTabbedPanel.addTab("OR time table", operationRoomTabbedPanel);
        jTabbedPanel.addTab("Schedule", scheduleTabbedPanel);
        jTabbedPanel.addTab("Details of performed surgeries", surgeriesPerformedTabbedPane);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jTabbedPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jTabbedPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane addPatientTabbedPanel;
    private static javax.swing.JTabbedPane doctorTeamTabbedPanel;
    private static javax.swing.JTabbedPane jTabbedPanel;
    private static javax.swing.JTabbedPane operationRoomTabbedPanel;
    private javax.swing.JTabbedPane pathologiesTabbedPanel;
    private javax.swing.JTabbedPane scheduleTabbedPanel;
    private javax.swing.JTabbedPane surgeriesPerformedTabbedPane;
    // End of variables declaration//GEN-END:variables

}
