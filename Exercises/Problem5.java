/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercises;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem5 {
    public static void main(String[] args) {
        //to accept user input
    Scanner sc = new Scanner(System.in);
 

        System.out.println("Input First Number: ");
        int firstnum = sc.nextInt();
        System.out.println("Input Second Number: ");
         int secondnum = sc.nextInt();
        System.out.println("Expected Output:");
        
        int product = firstnum * secondnum;
        System.out.println(firstnum + " * " + secondnum + " = " + product);
        
 
    }
 
}
