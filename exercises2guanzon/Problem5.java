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
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Input an Alpabhet:");
        String input = sc.nextLine();
        if (input.length() !=1) {
            System.out.println("Error: Please ente only a single character");
        }
        else {
            char ch = input.charAt(0);
            if (ch =='a'|| ch =='e'||  ch == 'i' || ch == 'o' || ch == 'u' ) {
                System.out.println("Input Alpabhet is Vowel");
            } else {
                System.out.println("Input Alpabhet is Consonant");
            }
        }
            
        
    }
    
}
