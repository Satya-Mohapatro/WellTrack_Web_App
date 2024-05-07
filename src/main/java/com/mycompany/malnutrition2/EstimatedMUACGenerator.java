/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.malnutrition2;

import java.util.Random;

public class EstimatedMUACGenerator {

    public static void main(String[] args) {
        System.out.println(generateMUAC(59));
    }

    public static double generateMUAC(int ageInMonth) {
        double estimatedMUAC = 12.0;
        double adjust = 12.0;
        Random r = new Random();
        if (ageInMonth < 13) {
            double val = adjust * r.nextDouble(0.1);
            estimatedMUAC = estimatedMUAC + val;
        } else if (ageInMonth >= 13 && ageInMonth <= 18) {
            double val = adjust * (0.1 + (0.15 - 0.1) * r.nextDouble());
            estimatedMUAC = estimatedMUAC + val;
        } else if (ageInMonth >= 19 && ageInMonth <= 24) {
            double val = adjust * (0.15 + (0.25 - 0.15) * r.nextDouble());
            estimatedMUAC = estimatedMUAC + val;
        } else if (ageInMonth >= 25 && ageInMonth <= 30) {
            double val = adjust * r.nextDouble(0.3);
            estimatedMUAC = estimatedMUAC + val;
        } else if (ageInMonth >= 31 && ageInMonth <= 36) {
            double val = adjust * r.nextDouble(0.25);
            estimatedMUAC = estimatedMUAC + val;
        } else if (ageInMonth >= 37 && ageInMonth <= 48) {
            double val = adjust * (0.25 + (0.3 - 0.25) * r.nextDouble());
            estimatedMUAC = estimatedMUAC + val;
        } else if (ageInMonth >= 49 && ageInMonth <= 60) {
            double val = adjust * (0.3 + (0.35 - 0.3) * r.nextDouble());
            estimatedMUAC = estimatedMUAC + val;
        } else if (ageInMonth >= 61 && ageInMonth <= 120) {
            double val = adjust * (0.35 + (0.5 - 0.35) * r.nextDouble());
            estimatedMUAC = estimatedMUAC + val;
        } else if (ageInMonth >= 121 && ageInMonth <= 168) {
            double val = adjust * (0.5 + (0.7 - 0.5) * r.nextDouble());
            estimatedMUAC = estimatedMUAC + val;
        } else if (ageInMonth >= 169 && ageInMonth <= 216) {
            double val = adjust * (0.7 + (0.88 - 0.7) * r.nextDouble());
            estimatedMUAC = estimatedMUAC + val;
        } else {
            double val = adjust * (0.8 + (0.99 - 0.8) * r.nextDouble());
            estimatedMUAC = estimatedMUAC + val;
        }
        return estimatedMUAC;
    }
}
