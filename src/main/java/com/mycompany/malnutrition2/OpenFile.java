/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.malnutrition2;

import java.awt.Desktop;
import java.io.File;

/**
 *
 * @author DELL
 */
public class OpenFile {

    public static void open(String fileN) {
        try {
            File file = new File(fileN);
            if (!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not
                return;
            
            Desktop desktop = Desktop.getDesktop();
            if (file.exists()) //checks file exists or not  
            {
                desktop.open(file);              //opens the specified file  
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
