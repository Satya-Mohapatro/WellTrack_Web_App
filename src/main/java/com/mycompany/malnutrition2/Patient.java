/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.malnutrition2;

import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author hp
 */
public class Patient implements Serializable{
    private String name;
    private String date;
    private boolean isPreg;

    public Patient(String name, String date, boolean isPreg) {
        this.name = name;
        this.date = date;
        this.isPreg = isPreg;
    }

    public String getName() {
        return name;
    }
    public Vector getVector()
    {
        Vector v=new Vector();
        v.add(name);
        v.add(date);
        v.add(isPreg);
        return v;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isIsPreg() {
        return isPreg;
    }

    public void setIsPreg(boolean isPreg) {
        this.isPreg = isPreg;
    }
    
}
