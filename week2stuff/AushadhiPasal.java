package week2stuff;

import java.util.Scanner;

public class AushadhiPasal
{
    public static void main(String[]args){
        System.out.println("Aushadhi Pasal Medicine Inventory");
        System.out.println("---------------------------------");
        Scanner sc= new Scanner(System.in);
        
        
        String name;
        float price=200;
        int stock;
        
       
        System.out.println("Enter the Name of the Medicine");
        name=sc.nextLine();
        System.out.println("Enter the amount");
        stock= sc.nextInt();
        System.out.println("The total price is "+(stock*price)+" and the singular price is"+price);
        
        
        
        
    }
}
