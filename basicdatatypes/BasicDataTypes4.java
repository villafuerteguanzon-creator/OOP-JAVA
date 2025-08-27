package basicdatatypes;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class BasicDataTypes4 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Input weight in pounds:");
        double weight = sc.nextDouble();
        System.out.println("Input height to inches:");
        double height = sc.nextDouble();
        
        double weightInKilograms = weight * 0.45359237;
        double heightInMeters = height * 0.0254;
        
        double BMI = weightInKilograms / (heightInMeters * heightInMeters);
        System.out.println("Body Mass Index is:" + BMI);
    }
    
}
