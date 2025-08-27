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
public class Problem6 {
    public static void main(String[] args) {
       Scanner sc= new Scanner (System.in);
        System.out.print(" Enter range:");
      int range = sc.nextInt();
      sc.close();
        
        for ( int i = 1; i <= range; i++) {
            for (int j = i; j < range; j++){
            
            System.out.print(i * j +" \t");
            }
            System.out.println();
        }
    }   
}       
            
            
            
            
            
            
            
            
            
            
            
        
