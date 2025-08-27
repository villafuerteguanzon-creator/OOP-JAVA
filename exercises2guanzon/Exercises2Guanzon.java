/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercises2guanzon;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Exercises2Guanzon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        System.out.print("Input a Number:");
        int num = sc.nextInt();
       
        if (num > 0){
            System.out.println(num + " Is Positive");
                 
    } else if (num < 0) {
            System.out.println(num + " Is Negative");
       
}
        
    }      
 }
    


