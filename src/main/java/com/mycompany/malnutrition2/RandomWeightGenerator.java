/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.malnutrition2;

import java.text.DecimalFormat;
import java.util.Random;

public class RandomWeightGenerator {

    /*public static void main(String[] args) {
        int age = 30; // Replace with desired age

        double weight = generateWeight(age);
        System.out.println("Estimated weight for age " + age + ": " + weight + " kg");
    }
*/
    public static String generateWeight(int age) {
        Random random = new Random();

        // Define base weight and weight gain curve parameters based on age groups
        double baseWeight = 0;
        double weightGain = 0;

        if (age < 2) {
            // Handle infancy with rapid weight gain
            baseWeight = 5;
            weightGain = 0.5;
        } else if (age < 10) {
            // Childhood and adolescence with moderate weight gain
            baseWeight = 15;
            weightGain = 15;
        }else if (age < 20) {
            // Childhood and adolescence with moderate weight gain
            baseWeight = 40;
            weightGain = 15;
        } else {
            baseWeight = 60;
            weightGain = (age - 20) / 10.0; // Weight gain slows down with age
        }

        // Apply randomness and weight gain curve
        double randomWeight = random.nextDouble() * weightGain;
        double weight = baseWeight + randomWeight;
        DecimalFormat df = new DecimalFormat("00.00");
        String formattedNumber =  df.format(weight);
        return formattedNumber;
    }
}
