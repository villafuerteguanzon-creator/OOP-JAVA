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
public class BasicDataTypes2 {
    public static void main(String[] args) {
    
        double inchToMeters = 0.0254;
        
        Scanner sc = new  Scanner (System.in);
        System.out.println("Input a value for inches:");
        double inch = sc.nextDouble();
        
        
        double meter = inch * inchToMeters;
        System.out.println(inch + " inches " + meter +" Meters ");
    }
    
}
