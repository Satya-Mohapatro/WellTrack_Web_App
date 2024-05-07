/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.malnutrition2;

import java.util.stream.IntStream;

public class CorrelationMatrix {

    public static void main(double[] riskScore, double[] weightLossScore, double[] bmiScore, double[] acuteDiseaseScore, double[] muacScore, double[] HBScore) {
        // Computing correlation
        double riskWeightCorrelation = computeCorrelation(riskScore, weightLossScore)*100;
        double riskBmiCorrelation = computeCorrelation(riskScore, bmiScore)*100;
        double riskAcuteCorrelation = computeCorrelation(riskScore, acuteDiseaseScore)*100;
        double riskMUACCorrelation = computeCorrelation(riskScore, muacScore)*100;
        double riskHBCorrelation = computeCorrelation(riskScore, HBScore)*100;
        // Add more correlations as needed

        // Output the correlations
       // System.out.println("Correlation between Risk Score and Weight Score: " + riskWeightCorrelation);
       // System.out.println("Correlation between Risk Score and BMI Score: " + riskBmiCorrelation);
       // System.out.println("Correlation between Risk Score and Acute Disease Score: " + riskAcuteCorrelation);
        
        JTablePieChart1.main("Correlation Matrix", 
                                (int)riskWeightCorrelation, 
                                (int)riskBmiCorrelation, 
                                (int)riskAcuteCorrelation,
                                (int)riskMUACCorrelation,
                                (int)riskHBCorrelation
                            );
        // Add more outputs as needed
    }

    public static double computeCorrelation(double[] x, double[] y) {
        double meanX = IntStream.range(0, x.length).mapToDouble(i -> x[i]).average().orElse(Double.NaN);
        double meanY = IntStream.range(0, y.length).mapToDouble(i -> y[i]).average().orElse(Double.NaN);

        double sumProductMeanDiff = IntStream.range(0, x.length).mapToDouble(i -> (x[i] - meanX) * (y[i] - meanY)).sum();
        double sumXSquaredMeanDiff = IntStream.range(0, x.length).mapToDouble(i -> Math.pow(x[i] - meanX, 2)).sum();
        double sumYSquaredMeanDiff = IntStream.range(0, y.length).mapToDouble(i -> Math.pow(y[i] - meanY, 2)).sum();

        return sumProductMeanDiff / (Math.sqrt(sumXSquaredMeanDiff) * Math.sqrt(sumYSquaredMeanDiff));
    }
}
