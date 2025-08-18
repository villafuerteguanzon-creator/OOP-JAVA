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
public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter First Number:");
         int firstnum = sc.nextInt();
         System.out.println("Enter Second Number:");
          int secondnum = sc.nextInt();
          System.out.println("Enter Third Number:");
           int thirdnum = sc.nextInt();
           
           int mod = firstnum % secondnum & thirdnum;
           System.out.println(firstnum +secondnum +"%"+"="thirdnum + mod);
           
           
           
    }
  
}
