/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operationplanning;

import javax.swing.table.DefaultTableModel;

/**
 * @abstract
 *
 * @author Diana Botez
 */
public class OperationRoomPanel_ES extends javax.swing.JScrollPane
{
    private DefaultTableModel operationRoomTableModelEN;
    /**
     * Creates new form OperationRoomPanelES
     */
    public
        OperationRoomPanel_ES()
    {
        // <editor-fold defaultstate="collapsed" desc="Initialize variables">
        operationRoomTableModelEN = new DefaultTableModel(
            new String[]{ "Date", "Starting hour", "ending hour" },
            30)
        //<editor-fold defaultstate="collapsed" desc="set column classes">
        {
            @Override
            public
                Class getColumnClass(int col)
            {
                return java.lang.String.class;
            }
        } //</editor-fold>
            ;
         //</editor-fold>
         
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

        operationRoom1Table = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(640, 480));

        operationRoom1Table.setModel(operationRoomTableModelEN);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getViewport());
        getViewport().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(operationRoom1Table, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(operationRoom1Table, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable operationRoom1Table;
    // End of variables declaration//GEN-END:variables
}
