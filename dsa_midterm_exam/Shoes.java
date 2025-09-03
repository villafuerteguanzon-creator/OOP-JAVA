package dsa_midterm_exam;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Shoes {
    public String  Name;
    public String  Size;
    public String  Colors;
    public Double  Price;
    
    public Shoes(String Name,String Size,String Colors,double Price){
        this.Name = Name;
        this.Size = Size;
        this.Colors = Colors;
        this.Price = Price;
       
}
    public Shoes () {
        
    }
        
    @Override
        public String toString(){
        String info = String.format (
        "Name: %-15s Size: %-15s Colors: %-15s Price: %.2f",
                Name,Size,Colors,Price);
               return info;
             
}
}