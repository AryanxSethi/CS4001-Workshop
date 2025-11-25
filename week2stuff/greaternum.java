package week2stuff;

import java.util.Scanner;

/**
 * Write a description of class greaternum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class greaternum
{
public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the first number");
    int firstnum= sc.nextInt();
    System.out.println("Enter the second number");
    int secondnum= sc.nextInt();
    int biggernum=(firstnum>secondnum) ?firstnum:secondnum;
    System.out.println("The greatest number among the two numbers is "+biggernum);
    
}
}
