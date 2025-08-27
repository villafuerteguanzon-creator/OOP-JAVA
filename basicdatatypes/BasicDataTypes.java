/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basicdatatypes;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class BasicDataTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println(" Input a degree in Fahrenheit:");
        double fahrenhelt = input.nextDouble();
        
        double celsius = (fahrenhelt - 32) /5  / 9 ;
        System.out.println(fahrenhelt + "  inches is " + celsius+ "");
        
    
    
}
}