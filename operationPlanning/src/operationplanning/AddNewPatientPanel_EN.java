/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operationplanning;

/**
 * @abstract
 *
 * @author Diana Botez
 */
public
    class AddNewPatientPanel_EN extends javax.swing.JPanel
{

    /**
     * Creates new form AddNewPatientPanelES
     */
    public
        AddNewPatientPanel_EN()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lastNameLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        medicalTeamLabel = new javax.swing.JLabel();
        medicLabel = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        firstNameTextField = new javax.swing.JTextField();
        medicalTeamsComboBox = new javax.swing.JComboBox<>();
        medicsComboBox = new javax.swing.JComboBox<>();
        patientNumberLabel = new javax.swing.JLabel();
        patientNumberTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        surgeryLabel = new javax.swing.JLabel();
        patologyLabel = new javax.swing.JLabel();
        patologyComboBox = new javax.swing.JComboBox<>();
        surgeryComboBox = new javax.swing.JComboBox<>();
        resetButton = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(640, 480));
        setPreferredSize(new java.awt.Dimension(640, 480));

        lastNameLabel.setText("Last name");
        lastNameLabel.setMaximumSize(new java.awt.Dimension(200, 40));
        lastNameLabel.setMinimumSize(new java.awt.Dimension(150, 30));
        lastNameLabel.setPreferredSize(new java.awt.Dimension(150, 30));

        firstNameLabel.setText("First name");
        firstNameLabel.setMaximumSize(new java.awt.Dimension(200, 40));
        firstNameLabel.setMinimumSize(new java.awt.Dimension(150, 30));
        firstNameLabel.setPreferredSize(new java.awt.Dimension(150, 30));

        medicalTeamLabel.setText("Medical team");
        medicalTeamLabel.setMaximumSize(new java.awt.Dimension(200, 40));
        medicalTeamLabel.setMinimumSize(new java.awt.Dimension(150, 30));
        medicalTeamLabel.setPreferredSize(new java.awt.Dimension(150, 30));

        medicLabel.setText("Medic");
        medicLabel.setMaximumSize(new java.awt.Dimension(200, 40));
        medicLabel.setMinimumSize(new java.awt.Dimension(150, 30));
        medicLabel.setPreferredSize(new java.awt.Dimension(150, 30));

        lastNameTextField.setToolTipText("The last name of the patient");
        lastNameTextField.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        lastNameTextField.setMinimumSize(new java.awt.Dimension(350, 30));
        lastNameTextField.setPreferredSize(new java.awt.Dimension(350, 30));

        firstNameTextField.setToolTipText("The first name of the patient");
        firstNameTextField.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        firstNameTextField.setMinimumSize(new java.awt.Dimension(350, 30));
        firstNameTextField.setPreferredSize(new java.awt.Dimension(350, 30));

        medicalTeamsComboBox.setMaximumRowCount(20);
        medicalTeamsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medical Lead 1", "Medical Lead 2", "Medical Lead 3", "Medical Lead 4", "Medical Lead 5" }));
        medicalTeamsComboBox.setToolTipText("The medical team leader");
        medicalTeamsComboBox.setMaximumSize(new java.awt.Dimension(32767, 40));
        medicalTeamsComboBox.setMinimumSize(new java.awt.Dimension(350, 30));
        medicalTeamsComboBox.setPreferredSize(new java.awt.Dimension(350, 30));

        medicsComboBox.setMaximumRowCount(20);
        medicsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medic 1", "Medic 2", "Medic 3", "Medic 4" }));
        medicsComboBox.setToolTipText("The medic inside the team selected above");
        medicsComboBox.setMaximumSize(new java.awt.Dimension(32767, 40));
        medicsComboBox.setMinimumSize(new java.awt.Dimension(350, 30));
        medicsComboBox.setPreferredSize(new java.awt.Dimension(350, 30));

        patientNumberLabel.setText("Patient number");
        patientNumberLabel.setMaximumSize(new java.awt.Dimension(108000, 40));
        patientNumberLabel.setMinimumSize(new java.awt.Dimension(150, 30));
        patientNumberLabel.setPreferredSize(new java.awt.Dimension(150, 30));

        patientNumberTextField.setToolTipText("Add the patient number to be searched in the data base");
        patientNumberTextField.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        patientNumberTextField.setMinimumSize(new java.awt.Dimension(350, 30));
        patientNumberTextField.setPreferredSize(new java.awt.Dimension(350, 30));

        searchButton.setText("Search");

        saveButton.setText("Save");

        surgeryLabel.setText("Surgery");
        surgeryLabel.setMaximumSize(new java.awt.Dimension(200, 40));
        surgeryLabel.setMinimumSize(new java.awt.Dimension(150, 30));
        surgeryLabel.setPreferredSize(new java.awt.Dimension(150, 30));

        patologyLabel.setText("Pathology");
        patologyLabel.setMaximumSize(new java.awt.Dimension(200, 40));
        patologyLabel.setMinimumSize(new java.awt.Dimension(150, 30));
        patologyLabel.setPreferredSize(new java.awt.Dimension(150, 30));

        patologyComboBox.setMaximumRowCount(20);
        patologyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pathology 1", "Pathology 2", "Pathology 3" }));
        patologyComboBox.setToolTipText("The medical team leader");
        patologyComboBox.setMaximumSize(new java.awt.Dimension(32767, 40));
        patologyComboBox.setMinimumSize(new java.awt.Dimension(350, 30));
        patologyComboBox.setPreferredSize(new java.awt.Dimension(350, 30));

        surgeryComboBox.setMaximumRowCount(20);
        surgeryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Surgery 1", "Surgery 2", "Surgery 3" }));
        surgeryComboBox.setToolTipText("The medic inside the team selected above");
        surgeryComboBox.setMaximumSize(new java.awt.Dimension(32767, 40));
        surgeryComboBox.setMinimumSize(new java.awt.Dimension(350, 30));
        surgeryComboBox.setPreferredSize(new java.awt.Dimension(350, 30));

        resetButton.setText("Reset");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(medicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(medicsComboBox, 0, 376, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(medicalTeamLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(medicalTeamsComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(firstNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(patientNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(patientNumberTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(resetButton)
                                .addComponent(surgeryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(patologyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patologyComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(surgeryComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(saveButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(patientNumberTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medicalTeamLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(medicalTeamsComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medicLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(medicsComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patologyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(patologyComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surgeryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(surgeryComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(89, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JLabel medicLabel;
    private javax.swing.JLabel medicalTeamLabel;
    private javax.swing.JComboBox<String> medicalTeamsComboBox;
    private javax.swing.JComboBox<String> medicsComboBox;
    private javax.swing.JLabel patientNumberLabel;
    private javax.swing.JTextField patientNumberTextField;
    private javax.swing.JComboBox<String> patologyComboBox;
    private javax.swing.JLabel patologyLabel;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> surgeryComboBox;
    private javax.swing.JLabel surgeryLabel;
    // End of variables declaration//GEN-END:variables
}
