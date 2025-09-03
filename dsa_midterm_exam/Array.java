/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_midterm_exam;

/**
 *
 * @author User
 */
public class Array {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.appendNode ("Papaya");
        ll.appendNode ("Mango");
        ll.appendNode ("Strawberry");
        
        ll.showAllNode();
         ll.appendNodeAfter("Mango ", "Apple");
         System.out.println("Updated List");
         ll.showAllNode();
         
         ll.appendNode ("Orange");
         System.out.println("Updated List");
         ll.showAllNode();
         
         System.out.println("Removed Item:"+ ll.delete());
         System.out.println("Updated List");
         ll.showAllNode();
         ll.deleteNode ("Lansones");
         System.out.println("Updated List");
         ll.showAllNode();
    }
    
}
