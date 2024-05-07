/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.malnutrition2;

public class StandardHemoglobinGenerator {

    private static final double[][] hemoglobinRanges = {
        // Age group (years), Min Hemoglobin (g/dL), Max Hemoglobin (g/dL)
        {0, 14.0, 24.0}, // Newborn
        {0.5, 12.0, 20.0}, // 0-6 months
        {1, 10.0, 17.0}, // 6 months - 1 year
        {5, 9.5, 14.0}, // 1-5 years
        {11, 11.9, 15.0}, // 5-11 years
        {18, 11.9, 15.0}, // 11-18 years (females)
        {18, 12.7, 17.7}, // 11-18 years (males)
        {65, 12.0, 16.0}, // Adults (females) - Adjust for older adults if needed
        {65, 14.0, 18.0} // Adults (males) - Adjust for older adults if needed
    };

    public static double generateStandardHemoglobin(int ageInMonth) {
        if (ageInMonth < 0) {
            throw new IllegalArgumentException("Invalid age. Please enter a positive value.");
        }
        double age = ageInMonth / 12;

        double minHemoglobin = Double.MIN_VALUE;
        double maxHemoglobin = Double.MAX_VALUE;

        // Find the appropriate age group in the lookup table
        for (int i = 0; i < hemoglobinRanges.length-1; i++) {
            double min = hemoglobinRanges[i][0];
            double max = hemoglobinRanges[i+1][0];
            if (age >=  min && age < max) {
                minHemoglobin = hemoglobinRanges[i][1];
                maxHemoglobin = hemoglobinRanges[i][2];
                break;
            }
        }

        // Handle cases where age falls outside the table range
        if (minHemoglobin == Double.MIN_VALUE) {
            minHemoglobin = hemoglobinRanges[8][1];
            maxHemoglobin = hemoglobinRanges[8][2];
        }

        // Generate a random value within the standard range
        double randomHemoglobin = minHemoglobin + Math.random() * (maxHemoglobin - minHemoglobin);        
        return randomHemoglobin;
    }

    public static void main(String[] args) {
        int age = 100*12; // Example age

        double generatedHemoglobin = generateStandardHemoglobin(age);
        if (generatedHemoglobin != -1.0) {
            System.out.println("Generated standard Hemoglobin value (g/dL): " + generatedHemoglobin);
        }
    }
}
