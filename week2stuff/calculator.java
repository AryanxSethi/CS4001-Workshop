package week2stuff;

import java.util.Scanner;

public class calculator{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        double firstnum= sc.nextDouble();
        System.out.println("Enter second number");
        double secondnum= sc.nextDouble();
        System.out.println("The sum of two numbers is "+(firstnum+secondnum));
        System.out.println("The subtraction of two numbers is "+(firstnum-secondnum));
        System.out.println("The product of two numbers is "+(firstnum*secondnum));
        System.out.println("The divison of two numbers is "+(firstnum/secondnum));
        sc.close();
    }
}
