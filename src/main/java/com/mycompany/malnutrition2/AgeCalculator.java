/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.malnutrition2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeCalculator {

    public static int calculateAgeYears(String inputDate) {
        try {
            LocalDate birthDate = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("d/M/yyyy"));
            LocalDate now = LocalDate.now();
            Period period = Period.between(birthDate, now);
            return period.getYears();
        } catch (Exception er) {

        }
        return -1;
    }

    public static int calculateAgeMonths(String inputDate) {
        try {
            LocalDate birthDate = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("d/M/yyyy"));
            LocalDate now = LocalDate.now();
            Period period = Period.between(birthDate, now);
            return period.getMonths();
        } catch (Exception er) {

        }
        return -1;
    }

    public static int calculateAgeDays(String inputDate) {
        try {
            LocalDate birthDate = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("d/M/yyyy"));
            LocalDate now = LocalDate.now();
            Period period = Period.between(birthDate, now);
            return period.getDays();
        } catch (Exception er) {

        }
        return -1;

    }

    public static void main(String[] args) {
        String inputDate = "0/21/2024";
        int ageY = calculateAgeYears(inputDate);
        int ageM = calculateAgeMonths(inputDate);
        int ageD = calculateAgeDays(inputDate);

        System.out.println("Age Years: " + ageY);
        System.out.println("Age Months: " + ageM);
        System.out.println("Age Days: " + ageD);
    }
}
