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
public
    class MyUneditableTableModel extends DefaultTableModel
{
    
    public MyUneditableTableModel(Object[] columnNames, int rowCount){
        super(columnNames,rowCount);
    }
    
    public MyUneditableTableModel(Object[][] tableData, Object[] colNames) {
      super(tableData, colNames);
    }
    
    @Override
    public boolean isCellEditable(int row, int column) {
      return false;
    }
    
}
