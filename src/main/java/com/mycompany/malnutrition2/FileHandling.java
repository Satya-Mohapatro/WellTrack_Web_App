/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.malnutrition2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class FileHandling {

    public static boolean save(Vector<Patient> PV) {
        File f = new File("PatientData.dat");
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(PV);
            return true;
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
            Logger.getLogger(FileHandling.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (Exception er) {
                System.out.println("Error: " + er);
            }
        }
        return false;
    }
    public static Vector<Patient> read() {
        File f = new File("PatientData.dat");
        Vector<Patient> pv = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try
        {
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            pv = (Vector<Patient>) ois.readObject();
        }
        catch(Exception er) {
            System.out.println("Exception: " + er);
        }
        finally {
            try {
                if (ois != null) {
                    ois.close();
                }
                if (fis != null) {
                    fis.close();
                }
            } catch (Exception er) {
                System.out.println("Error: " + er);
            }
        }
        return pv;
    }
}
