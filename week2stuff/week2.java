package week2stuff;

import java.util.Scanner;

/**
 * Write a description of class week2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week2
{
    public static void main (String[]args) //main method
    {
     int x; //variable declaration
     x=67;
    System.out.println("The boy screamed "+x);
    int pr1=100,pr2=300,pr3=800;
    int total=pr1+pr2+pr3;
    System.out.println("The total price is "+total);
    
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the first number");
    int firstNumber=sc.nextInt();
    System.out.println("Enter the second number");
    int secondNumber=sc.nextInt();
    
    int r=firstNumber*secondNumber;
    System.out.println("The product of two numbers is "+r);
    
    
    }

    
}
