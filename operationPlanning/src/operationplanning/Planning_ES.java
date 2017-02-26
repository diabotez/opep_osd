package operationplanning;

import java.util.Vector;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * @abstract
 *
 * @author Diana Botez
 */
public
    class Planning_ES extends javax.swing.JFrame
{
    private final
        Vector<JPanel> doctorTeamPanel;
    private final
        Vector<JScrollPane> operationRoomPanel;
    private final
        AddNewPatientPanel_ES addNewPatientPanel;
    private final
        AddPatientListPanel_ES addPatientListPanel;
    private final
        CreateSchedulePanel_ES createSchedulePanel;
    private final
        ModifySchedulePanel_ES modifySchedulePanel;

    private
        Utils.UserType currentUserType;

    /**
     *
     * @param userType
     */
    public
        Planning_ES(Utils.UserType userType)
    {
        // <editor-fold defaultstate="collapsed" desc="Initialize variables">

        this.operationRoomPanel = new Vector<>();
        this.doctorTeamPanel = new Vector<>();
        
        currentUserType = userType;

        for (int i = 0; i < Utils.doctorTeamsNumber; i++) {
            doctorTeamPanel.add(new DoctorTeamPanel_ES(currentUserType));
        }
        for (int i = 0; i < Utils.operatingRoomNumber; i++) {
            operationRoomPanel.add(new OperationRoomPanel_ES());
        }

        addNewPatientPanel = new AddNewPatientPanel_ES();
        addPatientListPanel = new AddPatientListPanel_ES();
        createSchedulePanel = new CreateSchedulePanel_ES();
        modifySchedulePanel = new ModifySchedulePanel_ES();
        // </editor-fold> 

        /*Call initComponents method*/
        initComponents();

        // <editor-fold defaultstate="collapsed" desc="Add tabs to main panel">
        for (int i = 0; i < Utils.doctorTeamsNumber; i++) {
            doctorTeamTabbedPanel.addTab("Equipo " + (i + 1), doctorTeamPanel.get(i));
        }
        for (int i = 0; i < Utils.operatingRoomNumber; i++) {
            OperationRoomTabbedPanel.addTab("Quirófano " + (i + 1), operationRoomPanel.get(i));
        }

        addPatientTabbedPanel.addTab("Añadir nuevo paciente", addNewPatientPanel);
        addPatientTabbedPanel.addTab("Añadir lista pacientes", addPatientListPanel);

        scheduleTabbedPanel.addTab("Crear planificación", createSchedulePanel);
        scheduleTabbedPanel.addTab("Cambiar planificación", modifySchedulePanel);
        // </editor-fold> 

        pack();
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPanel = new javax.swing.JTabbedPane();
        doctorTeamTabbedPanel = new javax.swing.JTabbedPane();
        addPatientTabbedPanel = new javax.swing.JTabbedPane();
        OperationRoomTabbedPanel = new javax.swing.JTabbedPane();
        scheduleTabbedPanel = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OPEP [ES]");
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(740, 580));
        setPreferredSize(new java.awt.Dimension(740, 580));

        jTabbedPanel.setMinimumSize(new java.awt.Dimension(640, 480));
        jTabbedPanel.setPreferredSize(new java.awt.Dimension(640, 480));

        doctorTeamTabbedPanel.setAutoscrolls(true);
        jTabbedPanel.addTab("Equipos médicos", null, doctorTeamTabbedPanel, "");
        jTabbedPanel.addTab("Añadir paciente(s)", addPatientTabbedPanel);
        jTabbedPanel.addTab("Quirófanos", OperationRoomTabbedPanel);
        jTabbedPanel.addTab("Planificación", scheduleTabbedPanel);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jTabbedPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jTabbedPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPanel.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane OperationRoomTabbedPanel;
    private javax.swing.JTabbedPane addPatientTabbedPanel;
    private javax.swing.JTabbedPane doctorTeamTabbedPanel;
    private javax.swing.JTabbedPane jTabbedPanel;
    private javax.swing.JTabbedPane scheduleTabbedPanel;
    // End of variables declaration//GEN-END:variables

}
