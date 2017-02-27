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
package operationplanning.commonFiles;

import javax.swing.table.DefaultTableModel;

/**
 * @abstract
 *
 * @author Diana Botez
 */
public
    class MyUneditableTableModel extends DefaultTableModel
{

    public
        MyUneditableTableModel(Object[] columnNames, int rowCount)
    {
        super(columnNames, rowCount);
    }

    public
        MyUneditableTableModel(Object[][] tableData, Object[] colNames)
    {
        super(tableData, colNames);
    }

    @Override
    public
        boolean isCellEditable(int row, int column)
    {
        return false;
    }

}
