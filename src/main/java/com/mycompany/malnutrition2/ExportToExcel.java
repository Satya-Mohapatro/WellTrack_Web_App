/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.malnutrition2;

import java.io.File;
import javax.swing.table.TableModel;
import jxl.*;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

/**
 *
 * @author DELL
 */
public class ExportToExcel {

    public static void excelAll(TableModel model, File file) {
        try {
            WritableWorkbook workbook1 = Workbook.createWorkbook(file);
            WritableSheet sheet1 = workbook1.createSheet("First Sheet", 0);

            for (int i = 0; i < model.getColumnCount(); i++) {
                Label column = new Label(i, 0, model.getColumnName(i));
                sheet1.addCell(column);
            }
            int j = 0;
            for (int i = 0; i < model.getRowCount(); i++) {
                for (j = 0; j < model.getColumnCount(); j++) {
                    Label row = new Label(j, i + 1,
                            model.getValueAt(i, j).toString());
                    sheet1.addCell(row);
                }
            }
            workbook1.write();
            workbook1.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void excelResultOnly(TableModel model, File file, boolean EC[]) {
        try {
            WritableWorkbook workbook1 = Workbook.createWorkbook(file);
            WritableSheet sheet1 = workbook1.createSheet("First Sheet", 0);

            int k = 0;
            for (int i = 0; i < model.getColumnCount(); i++) {
                if (i == 0 || i == 1 || i == 2 || i ==3 || !EC[i]) {
                    Label column = new Label(k++, 0, model.getColumnName(i));
                    sheet1.addCell(column);
                }
            }
            int j = 0;
            
            for (int i = 0; i < model.getRowCount(); i++) {
                int c=0;        
                for (j = 0; j < model.getColumnCount(); j++) {
                    if (j == 0 || j == 1 || j == 2 || j == 3 || !EC[j]) {
                        Label row = new Label(c++, i + 1, model.getValueAt(i, j).toString());
                        sheet1.addCell(row);
                    }
                }       
            }
            workbook1.write();
            workbook1.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
     public static void excelInputOnly(TableModel model, File file, boolean EC[]) {
        try {
            WritableWorkbook workbook1 = Workbook.createWorkbook(file);
            WritableSheet sheet1 = workbook1.createSheet("First Sheet", 0);

            int k = 0;
            for (int i = 0; i < model.getColumnCount(); i++) {
                if (i == 0 || i == 1 || i == 2 || i ==3 || EC[i]) {
                    Label column = new Label(k++, 0, model.getColumnName(i));
                    sheet1.addCell(column);
                }
            }
            int j = 0;
            
            for (int i = 0; i < model.getRowCount(); i++) {
                int c=0;        
                for (j = 0; j < model.getColumnCount(); j++) {
                    if (j == 0 || j == 1 || j == 2 || j == 3 || EC[j]) {
                        Label row = new Label(c++, i + 1, model.getValueAt(i, j).toString());
                        sheet1.addCell(row);
                    }
                }       
            }
            workbook1.write();
            workbook1.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
