package week2stuff;

import java.util.Scanner;

/**
 * Write a description of class Question4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question4
{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Name");
        String sname= sc.nextLine();
        System.out.println("Enter your Age");
        int age= sc.nextInt();
        System.out.println("Enter your GPA");
        double gpa= sc.nextDouble();
        sc.close();
        System.out.println("Student Name "+sname);
        System.out.println("Student Age "+age);
        System.out.println("Student GPA "+gpa);
        
    }
}
