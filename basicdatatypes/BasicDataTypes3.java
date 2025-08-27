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
public class BasicDataTypes3 {
    public static void main(String[] args) {
      int minuteInDay = 60 * 24;
      int dayInYear = 365;
      
      Scanner sc = new Scanner (System.in);
        System.out.println("Input the numbers of minutes:");
        int minutes = sc.nextInt();
        
        int year = minutes / (minuteInDay  * dayInYear);
        int day = (minutes % (minuteInDay * dayInYear)) / minuteInDay;
         
        
        System.out.println(minutes + " minutes is approximately " + year + " years " + day + " days ");
        
     
        
        
        
    }
    
}
