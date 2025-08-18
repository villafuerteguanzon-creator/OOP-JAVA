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
public class Problem6 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
          System.out.println("Input first Number:");
          int firstnum = sc.nextInt();
          System.out.println("Input Second Number:");
          int secondnum = sc.nextInt();
          
          int sum = firstnum + secondnum;
        System.out.println(firstnum + " + " + secondnum + " = " + sum);
        int diff = firstnum - secondnum;
        System.out.println(firstnum + " - " + secondnum + " = " + diff);
        int quot = firstnum  * secondnum;
        System.out.println(firstnum + " * " + secondnum + " = " + quot);
         int product = firstnum  / secondnum;
         System.out.println(firstnum + " / " + secondnum + " = " + product);
          int mod = firstnum  % secondnum;
          System.out.println(firstnum + " % " + secondnum + " = " + mod);
          
          
    }
 
}
