/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.malnutrition2;

import java.text.DecimalFormat;
import java.util.Random;

public class HeightGenerator {
    public static String generateHeight(int age) {
        Random random = new Random();

        // Define base height and growth curve parameters based on age groups
        double baseHeight = 0;
        double growthRate = 0;

        if (age < 2) {
            // Handle infancy with limited growth
            baseHeight = 50;
            growthRate = 1;
        } else if (age < 20) {
            // Childhood and adolescence with significant growth
            baseHeight = 70;
            growthRate = 20;
        } else {
            // Adulthood with minimal growth
            baseHeight = 150;
            growthRate = 30;
        }

        // Apply randomness and growth curve
        double randomHeight = random.nextDouble() * growthRate;
        double heightInCM = baseHeight + randomHeight;
        double heightinMtr = heightInCM / 100.0;
        
        DecimalFormat df = new DecimalFormat("00.00");
        String formattedNumber =  df.format(heightinMtr);

        return formattedNumber;
    }
}

