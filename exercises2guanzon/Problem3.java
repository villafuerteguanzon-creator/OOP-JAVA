package exercises2guanzon;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *  
 * @author User
 */
public class Problem3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int num1 = 25;
    int num2 = 78;
    int num3 = 87;
    
    int greatest;
    if ( num1 >= num2 && num1 >= num3) {
     greatest = num1;
    }
    else if ( num2 >= num1 && num2 >= num3) {
        greatest = num2;
    } 
    else {
        greatest = num2;
    }
        System.out.println("The Greatest Number is:" + greatest);
            
        }
        
    }
    

