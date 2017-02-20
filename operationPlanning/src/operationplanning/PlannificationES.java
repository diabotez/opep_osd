/*
 * Copyright (c) 2010, Oracle. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice,
 *   this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * * Neither the name of Oracle nor the names of its contributors
 *   may be used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */

package operationplanning;

public class PlannificationES extends javax.swing.JFrame {
    
    /** Creates new form Antenna */
    public PlannificationES() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPanel = new javax.swing.JTabbedPane();
        doctorTeamTabbedPanel = new javax.swing.JTabbedPane();
        doctorTeam1Panel = new javax.swing.JPanel();
        doctorTeam1ScrollPanel = new javax.swing.JScrollPane();
        doctorTeam1Table = new javax.swing.JTable();
        doctorTeam1subPanel = new javax.swing.JPanel();
        addDoctor1Button = new javax.swing.JButton();
        saveTeam1Button = new javax.swing.JButton();
        deleteTeam1Button = new javax.swing.JButton();
        removeDoctorTeam1Button = new javax.swing.JButton();
        doctorTeam2Panel = new javax.swing.JPanel();
        doctorTeam2ScrollPanel = new javax.swing.JScrollPane();
        doctorTeam2Table = new javax.swing.JTable();
        doctorTeam2subPanel = new javax.swing.JPanel();
        addDoctor2Button = new javax.swing.JButton();
        saveTeam2Button = new javax.swing.JButton();
        deleteTeam2Button = new javax.swing.JButton();
        removeDoctorTeam2Button = new javax.swing.JButton();
        addPatientTabbedPanel = new javax.swing.JTabbedPane();
        addNewPatientScrollPanel = new javax.swing.JScrollPane();
        addPatientListScrollPanel = new javax.swing.JScrollPane();
        OperationRoomTabbedPanel = new javax.swing.JTabbedPane();
        operationRoom1ScrollPanel = new javax.swing.JScrollPane();
        operationRoom2ScrollPanel = new javax.swing.JScrollPane();
        scheduleTabbedPanel = new javax.swing.JTabbedPane();
        createScheduleScrollPanel = new javax.swing.JScrollPane();
        modifyScheduleScrollPanel = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Planification");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        doctorTeamTabbedPanel.setAutoscrolls(true);

        doctorTeam1Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Apellidos", "Nombre", "Servicio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        doctorTeam1Table.setToolTipText("");
        doctorTeam1Table.setColumnSelectionAllowed(true);
        doctorTeam1Table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        doctorTeam1Table.setDragEnabled(true);
        doctorTeam1Table.setName("What name"); // NOI18N
        doctorTeam1Table.setSelectionBackground(new java.awt.Color(162, 164, 196));
        doctorTeam1Table.setSelectionForeground(new java.awt.Color(75, 70, 70));
        doctorTeam1ScrollPanel.setViewportView(doctorTeam1Table);

        addDoctor1Button.setText("Añadir médico");
        addDoctor1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDoctor1ButtonActionPerformed(evt);
            }
        });

        saveTeam1Button.setText("Guardar");
        saveTeam1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveTeam1ButtonActionPerformed(evt);
            }
        });

        deleteTeam1Button.setText("Borrar equipo");
        deleteTeam1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTeam1ButtonActionPerformed(evt);
            }
        });

        removeDoctorTeam1Button.setText("Borrar médico");

        org.jdesktop.layout.GroupLayout doctorTeam1subPanelLayout = new org.jdesktop.layout.GroupLayout(doctorTeam1subPanel);
        doctorTeam1subPanel.setLayout(doctorTeam1subPanelLayout);
        doctorTeam1subPanelLayout.setHorizontalGroup(
            doctorTeam1subPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(doctorTeam1subPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(deleteTeam1Button)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(removeDoctorTeam1Button)
                .add(18, 18, 18)
                .add(addDoctor1Button)
                .add(18, 18, 18)
                .add(saveTeam1Button)
                .addContainerGap())
        );
        doctorTeam1subPanelLayout.setVerticalGroup(
            doctorTeam1subPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, doctorTeam1subPanelLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(doctorTeam1subPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(addDoctor1Button)
                    .add(saveTeam1Button)
                    .add(deleteTeam1Button)
                    .add(removeDoctorTeam1Button))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout doctorTeam1PanelLayout = new org.jdesktop.layout.GroupLayout(doctorTeam1Panel);
        doctorTeam1Panel.setLayout(doctorTeam1PanelLayout);
        doctorTeam1PanelLayout.setHorizontalGroup(
            doctorTeam1PanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(doctorTeam1ScrollPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, doctorTeam1subPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        doctorTeam1PanelLayout.setVerticalGroup(
            doctorTeam1PanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(doctorTeam1PanelLayout.createSequentialGroup()
                .add(doctorTeam1ScrollPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(doctorTeam1subPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        doctorTeamTabbedPanel.addTab("Equipo 1", doctorTeam1Panel);

        doctorTeam2Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Apellidos", "Nombre", "Servicio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        doctorTeam2Table.setToolTipText("");
        doctorTeam2Table.setColumnSelectionAllowed(true);
        doctorTeam2Table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        doctorTeam2Table.setDragEnabled(true);
        doctorTeam2Table.setName("What name"); // NOI18N
        doctorTeam2Table.setSelectionBackground(new java.awt.Color(162, 164, 196));
        doctorTeam2Table.setSelectionForeground(new java.awt.Color(75, 70, 70));
        doctorTeam2ScrollPanel.setViewportView(doctorTeam2Table);

        addDoctor2Button.setText("Añadir médico");
        addDoctor2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDoctor2ButtonActionPerformed(evt);
            }
        });

        saveTeam2Button.setText("Guardar");
        saveTeam2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveTeam2ButtonActionPerformed(evt);
            }
        });

        deleteTeam2Button.setText("Borrar equipo");
        deleteTeam2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTeam2ButtonActionPerformed(evt);
            }
        });

        removeDoctorTeam2Button.setText("Borrar médico");

        org.jdesktop.layout.GroupLayout doctorTeam2subPanelLayout = new org.jdesktop.layout.GroupLayout(doctorTeam2subPanel);
        doctorTeam2subPanel.setLayout(doctorTeam2subPanelLayout);
        doctorTeam2subPanelLayout.setHorizontalGroup(
            doctorTeam2subPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(doctorTeam2subPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(deleteTeam2Button)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(removeDoctorTeam2Button)
                .add(18, 18, 18)
                .add(addDoctor2Button)
                .add(18, 18, 18)
                .add(saveTeam2Button)
                .addContainerGap())
        );
        doctorTeam2subPanelLayout.setVerticalGroup(
            doctorTeam2subPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, doctorTeam2subPanelLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(doctorTeam2subPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(addDoctor2Button)
                    .add(saveTeam2Button)
                    .add(deleteTeam2Button)
                    .add(removeDoctorTeam2Button))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout doctorTeam2PanelLayout = new org.jdesktop.layout.GroupLayout(doctorTeam2Panel);
        doctorTeam2Panel.setLayout(doctorTeam2PanelLayout);
        doctorTeam2PanelLayout.setHorizontalGroup(
            doctorTeam2PanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(doctorTeam2ScrollPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, doctorTeam2subPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        doctorTeam2PanelLayout.setVerticalGroup(
            doctorTeam2PanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(doctorTeam2PanelLayout.createSequentialGroup()
                .add(doctorTeam2ScrollPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(doctorTeam2subPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        doctorTeamTabbedPanel.addTab("Equipo 2", doctorTeam2Panel);

        jTabbedPanel.addTab("Equipos médicos", null, doctorTeamTabbedPanel, "");

        addPatientTabbedPanel.addTab("Añadir nuevo paciente", addNewPatientScrollPanel);
        addPatientTabbedPanel.addTab("Añadir lista pacientes", addPatientListScrollPanel);

        jTabbedPanel.addTab("Añadir paciente(s)", addPatientTabbedPanel);

        OperationRoomTabbedPanel.addTab("Quirófano 1", operationRoom1ScrollPanel);
        OperationRoomTabbedPanel.addTab("Quirófano 2", operationRoom2ScrollPanel);

        jTabbedPanel.addTab("Quirófanos", OperationRoomTabbedPanel);

        scheduleTabbedPanel.addTab("Crear planificación", createScheduleScrollPanel);
        scheduleTabbedPanel.addTab("Cambiar planificación", modifyScheduleScrollPanel);

        jTabbedPanel.addTab("Planificación", scheduleTabbedPanel);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jTabbedPanel))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jTabbedPanel))
        );

        jTabbedPanel.getAccessibleContext().setAccessibleDescription("scehule ");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addDoctor1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDoctor1ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addDoctor1ButtonActionPerformed

    private void deleteTeam1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTeam1ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteTeam1ButtonActionPerformed

    private void saveTeam1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveTeam1ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveTeam1ButtonActionPerformed

    private void addDoctor2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDoctor2ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addDoctor2ButtonActionPerformed

    private void saveTeam2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveTeam2ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveTeam2ButtonActionPerformed

    private void deleteTeam2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTeam2ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteTeam2ButtonActionPerformed
    
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
            javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels=javax.swing.UIManager.getInstalledLookAndFeels();
            for (int idx=0; idx<installedLookAndFeels.length; idx++)
                if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
                    javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
                    break;
                }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlannificationES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlannificationES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlannificationES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlannificationES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlannificationES().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane OperationRoomTabbedPanel;
    private javax.swing.JButton addDoctor1Button;
    private javax.swing.JButton addDoctor2Button;
    private javax.swing.JScrollPane addNewPatientScrollPanel;
    private javax.swing.JScrollPane addPatientListScrollPanel;
    private javax.swing.JTabbedPane addPatientTabbedPanel;
    private javax.swing.JScrollPane createScheduleScrollPanel;
    private javax.swing.JButton deleteTeam1Button;
    private javax.swing.JButton deleteTeam2Button;
    private javax.swing.JPanel doctorTeam1Panel;
    private javax.swing.JScrollPane doctorTeam1ScrollPanel;
    private javax.swing.JTable doctorTeam1Table;
    private javax.swing.JPanel doctorTeam1subPanel;
    private javax.swing.JPanel doctorTeam2Panel;
    private javax.swing.JScrollPane doctorTeam2ScrollPanel;
    private javax.swing.JTable doctorTeam2Table;
    private javax.swing.JPanel doctorTeam2subPanel;
    private javax.swing.JTabbedPane doctorTeamTabbedPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPanel;
    private javax.swing.JScrollPane modifyScheduleScrollPanel;
    private javax.swing.JScrollPane operationRoom1ScrollPanel;
    private javax.swing.JScrollPane operationRoom2ScrollPanel;
    private javax.swing.JButton removeDoctorTeam1Button;
    private javax.swing.JButton removeDoctorTeam2Button;
    private javax.swing.JButton saveTeam1Button;
    private javax.swing.JButton saveTeam2Button;
    private javax.swing.JTabbedPane scheduleTabbedPanel;
    // End of variables declaration//GEN-END:variables
    
}
