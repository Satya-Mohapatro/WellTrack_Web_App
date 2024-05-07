/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.malnutrition2;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import org.knowm.xchart.PieChart;
import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYSeries;

public class JTablePieChart {

    public static void main(String title, int val1, int val2, int val3) {

        // Create a PieChart
        PieChart pieChart = new PieChart(500, 500);        
        // Add data to the pie chart
        pieChart.addSeries("High Risk Paitents", val1);
        pieChart.addSeries("Medium Risk Paitents", val2);
        pieChart.addSeries("Low Risk Paitents", val3);
        
        // Show the pie chart
        pieChart.setTitle(title);
        SwingWrapper sw = new SwingWrapper(pieChart);        
        sw.setTitle("Malnutrition Ratio");
        JFrame frame = sw.displayChart();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}