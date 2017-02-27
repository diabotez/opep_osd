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

import operationplanning.EN.UpdateRemovePathology_EN;
import java.util.Vector;
import operationplanning.commonFiles.MyUneditableTableModel;

/**
 * @abstract
 *
 * @author Diana Botez
 */
public
 class PathologiesListPanel_EN extends javax.swing.JPanel {
    private static MyUneditableTableModel pathologiesTableModelEN;

    private static Vector<String> pathologies;
    private static Vector<String> surgeries;
    private static Vector<Integer> avgDurations;
    private static Vector<Integer> stdDeviations;

    /**
     * Creates new form ModifySchedulePanel_ES
     */
    public
        PathologiesListPanel_EN()
    {
        //<editor-fold defaultstate="collapsed" desc="Initialize variables">
        this.pathologiesTableModelEN = new MyUneditableTableModel(
                new String[]{"Pathology", "Surgery", "Avrage duration (min)", "Standard deviation (min)"},
                0) //<editor-fold defaultstate="collapsed" desc="set column classes">
        {
            @Override
            public Class getColumnClass(int col) {
                String name = pathologiesTableModelEN.getColumnName(col);

                if (name.equals("Pathology") || name.equals("Surgery")) {
                    return java.lang.String.class;
                } else {
                    return java.lang.Integer.class;
                }
            }
        } //</editor-fold> //</editor-fold>
                ;

        pathologies = new Vector<>();
        surgeries = new Vector<>();
        avgDurations = new Vector<>();
        stdDeviations = new Vector<>();
        //</editor-fold>

        initComponents();

        // <editor-fold defaultstate="collapsed" desc="Load data from data base">
//        pathologiesTableModelEN.addRow(new Object[]{"pathology 1", "Surgery 1", "162", "12"});
        //</editor-fold>
    }

    public static void addNewPathologyEntry(String ptg, String srg, String avg, String std) {
        pathologies.addElement(ptg);
        surgeries.addElement(srg);
        avgDurations.addElement(Integer.parseInt(avg));
        stdDeviations.addElement(Integer.parseInt(std));

        pathologiesTableModelEN.addRow(new Object[]{ptg, srg, avg, std});

        //TODO: add data in Data Base
    }

    public static boolean checkIfPathologyExists(String ptg) {
        for (String pathology : pathologies) {
            if (pathology.equals(ptg)) {
                return true;
            }
        }

        return false;
    }

    public static void updatePathologyEntry(String ptg, String srg, String avg, String std) {
        int idx = pathologies.indexOf(ptg);

        surgeries.set(idx, srg);
        avgDurations.set(idx, Integer.parseInt(avg));
        stdDeviations.set(idx, Integer.parseInt(std));

//        pathologiesTableModelEN.setValueAt();
        for (int i = 0; i < pathologiesTableModelEN.getRowCount(); i++) {
            pathologiesTableModelEN.removeRow(i);
        }

        for (String ptgString : pathologies) {
            int i = pathologies.indexOf(ptgString);
            String srgString = surgeries.get(i);
            int avgInt = avgDurations.get(i);
            int stdInt = stdDeviations.get(i);

            pathologiesTableModelEN.addRow(new Object[]{ptgString, srgString, avgInt, stdInt});
        }

        pathologiesTableModelEN.fireTableDataChanged();
        //TODO: add data in Data Base
    }

    public static void removePathology(String ptg) {
        int idx = pathologies.indexOf(ptg);
        pathologies.remove(idx);
        surgeries.remove(idx);
        avgDurations.remove(idx);
        stdDeviations.remove(idx);

        for (int i = 0; i < pathologiesTableModelEN.getRowCount(); i++) {
            pathologiesTableModelEN.removeRow(i);
        }

        for (String ptgString : pathologies) {
            int i = pathologies.indexOf(ptgString);
            String srgString = surgeries.get(i);
            int avgInt = avgDurations.get(i);
            int stdInt = stdDeviations.get(i);

            pathologiesTableModelEN.addRow(new Object[]{ptgString, srgString, avgInt, stdInt});
        }

        pathologiesTableModelEN.fireTableDataChanged();
        //TODO: remove data from Data Base
    }

    /**
     * @return the pathologies vector
     */
    public static Vector<String> getPathologies() {
        return pathologies;
    }

    /**
     * @return the surgeries vector
     */
    public static Vector<String> getSurgeries() {
        return surgeries;
    }

    /**
     * @return the average duration vector
     */
    public static Vector<Integer> getAvgDurations() {
        return avgDurations;
    }

    /**
     * @return the standard deviation vector
     */
    public static Vector<Integer> getStdDeviations() {
        return stdDeviations;
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

        pathologyListScrollPane = new javax.swing.JScrollPane();
        pathologyTable = new javax.swing.JTable();
        buttonsPanel = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        updateRemoveButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(640, 480));

        pathologyTable.setModel(pathologiesTableModelEN);
        pathologyListScrollPane.setViewportView(pathologyTable);

        addButton.setText("Add Pathology");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateRemoveButton.setText("Update / Remove");
        updateRemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateRemoveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateRemoveButton)
                .addContainerGap())
        );
        buttonsPanelLayout.setVerticalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(updateRemoveButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pathologyListScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addComponent(buttonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pathologyListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        new AddNewPathologyWindow_EN().setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateRemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateRemoveButtonActionPerformed
        new UpdateRemovePathology_EN().setVisible(true);
    }//GEN-LAST:event_updateRemoveButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JScrollPane pathologyListScrollPane;
    private static javax.swing.JTable pathologyTable;
    private javax.swing.JButton updateRemoveButton;
    // End of variables declaration//GEN-END:variables

}
