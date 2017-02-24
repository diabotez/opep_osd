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
 class PathologiesListPanel_EN extends javax.swing.JScrollPane {
    private MyUneditableTableModel pathologiesTableModelEN;

    /**
     * Creates new form ModifySchedulePanel_ES
     */
    public
        PathologiesListPanel_EN()
    {
        //<editor-fold defaultstate="collapsed" desc="Initialize variables">
        this.pathologiesTableModelEN = new MyUneditableTableModel(
                new String[]{"Pathology", "Avrage duration (min)", "Standard deviation (min)"},
                7) //<editor-fold defaultstate="collapsed" desc="set column classes">
        {
            @Override
            public Class getColumnClass(int col) {
                String name = pathologiesTableModelEN.getColumnName(col);

                if (name.equals("Pathology")) {
                    return java.lang.String.class;
                } else {
                    return java.lang.Integer.class;
                }
            }
        } //</editor-fold> //</editor-fold>
                ;
        //</editor-fold>

        initComponents();

        // <editor-fold defaultstate="collapsed" desc="Load data">
        pathologiesTableModelEN.addRow(new Object[]{"pathology 1", "162", "12"});
        //</editor-fold>


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

        pathologyTable = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(640, 480));

        pathologyTable.setModel(pathologiesTableModelEN);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getViewport());
        getViewport().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pathologyTable, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pathologyTable, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable pathologyTable;
    // End of variables declaration//GEN-END:variables
}
