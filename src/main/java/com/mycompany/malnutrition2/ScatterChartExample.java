/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.malnutrition2;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.XYSeries;
import org.knowm.xchart.style.Styler;
import org.knowm.xchart.style.markers.Circle;
import org.knowm.xchart.style.markers.SeriesMarkers;
import org.knowm.xchart.style.theme.Theme;

public class ScatterChartExample {

    public static void getChart(String title, double[] xDataA, double[] yDataA, double[] yDataA2, double[] yDataA3, double[] yDataA4) {

        // Create Chart
        XYChart chart = new XYChartBuilder().width(800).height(600).build();
        chart.setXAxisTitle("Overall Risk");
        // Customize Chart
        chart.getStyler().setDefaultSeriesRenderStyle(XYSeries.XYSeriesRenderStyle.Scatter);
        chart.getStyler().setChartTitleVisible(false);
        chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideSW);
        chart.getStyler().setMarkerSize(16);

        // Series
        List<Double> xData = new LinkedList<Double>();
        List<Double> yData = new LinkedList<Double>();
        List<Double> yData2 = new LinkedList<Double>();
        List<Double> yData3 = new LinkedList<Double>();
        List<Double> yData4 = new LinkedList<Double>();
        int size = xDataA.length;
        for (int i = 0; i < size; i++) {
            xData.add(xDataA[i]);
            yData.add(yDataA[i]);
            yData2.add(yDataA2[i]);
            yData3.add(yDataA3[i]);
            yData4.add(yDataA4[i]);
        }
        chart.addSeries("Risk Score vs MUAC", xData, yData);
        chart.addSeries("Risk Score vs BMI", xData, yData2);
        chart.addSeries("Risk Score vs HB", xData, yData3);
        chart.addSeries("Risk Score vs Weight", xData, yData4);

        chart.setTitle(title);
        SwingWrapper sw = new SwingWrapper(chart);
        sw.setTitle("Malnutrition WeightLoss vs MUAC vs BMI vs HB Vs RISK");
        JFrame frame = sw.displayChart();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
    
    public static void getChartScore(String title, double[] xDataA, double[] yDataA, double[] yDataA2) {

        // Create Chart
        XYChart chart = new XYChartBuilder().width(800).height(600).build();
        chart.setXAxisTitle("Risk Score");
        // Customize Chart
        chart.getStyler().setDefaultSeriesRenderStyle(XYSeries.XYSeriesRenderStyle.Scatter);
        chart.getStyler().setChartTitleVisible(false);
        chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideSW);
        chart.getStyler().setMarkerSize(16);

        // Series
        List<Double> xData = new LinkedList<Double>();
        List<Double> yData = new LinkedList<Double>();
        List<Double> yData2 = new LinkedList<Double>();
        List<Double> yData3 = new LinkedList<Double>();
        List<Double> yData4 = new LinkedList<Double>();
        int size = xDataA.length;
        for (int i = 0; i < size; i++) {
            xData.add(xDataA[i]);
            yData.add(yDataA[i]);
            yData2.add(yDataA2[i]);
        }
        chart.addSeries("Risk Score vs Weight Loss Score", xData, yData);
        chart.addSeries("Risk Score vs BMI Score", xData, yData2);

        chart.setTitle(title);
        SwingWrapper sw = new SwingWrapper(chart);
        sw.setTitle("Malnutrition Score - WeightLoss vs BMI vs AD Vs RISK");
        JFrame frame = sw.displayChart();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
    
    public static void getChartWeightvsRisk(String title, double[] xDataA, double[] yDataA) {

        // Create Chart
        XYChart chart = new XYChartBuilder().width(800).height(600).build();
        chart.setXAxisTitle("Weight Loss");
        // Customize Chart
        chart.getStyler().setDefaultSeriesRenderStyle(XYSeries.XYSeriesRenderStyle.Scatter);
        chart.getStyler().setChartTitleVisible(false);
        chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideSW);
        chart.getStyler().setMarkerSize(16);

        // Series
        List<Double> xData = new LinkedList<Double>();
        List<Double> yData = new LinkedList<Double>();
        int size = xDataA.length;
        for (int i = 0; i < size; i++) {
            xData.add(xDataA[i]);
            yData.add(yDataA[i]);
        }
        chart.addSeries("Weight Loss vs Risk Score", xData, yData);

        chart.setTitle(title);
        SwingWrapper sw = new SwingWrapper(chart);
        sw.setTitle("WeightLoss vs Malnutrition Risk");
        JFrame frame = sw.displayChart();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
    
    public static void getChartBMIvsRisk(String title, double[] xDataA, double[] yDataA) {

        // Create Chart
        XYChart chart = new XYChartBuilder().width(800).height(600).build();
        chart.setXAxisTitle("BMI");
        // Customize Chart
        chart.getStyler().setDefaultSeriesRenderStyle(XYSeries.XYSeriesRenderStyle.Scatter);
        chart.getStyler().setChartTitleVisible(false);
        chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideSW);
        chart.getStyler().setMarkerSize(16);

        // Series
        List<Double> xData = new LinkedList<Double>();
        List<Double> yData = new LinkedList<Double>();
        int size = xDataA.length;
        for (int i = 0; i < size; i++) {
            xData.add(xDataA[i]);
            yData.add(yDataA[i]);
        }
        chart.addSeries("Orverall risk vs BMI", xData, yData);

        chart.setTitle(title);
        SwingWrapper sw = new SwingWrapper(chart);
        sw.setTitle("Malnutrition Risk vs BMI");
        JFrame frame = sw.displayChart();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}
