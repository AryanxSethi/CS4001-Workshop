package Week4;
import java.util.Scanner;


public class ResultSystem
{
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter your Final Percentage");
        
        double percent= sc.nextDouble();
        
        if(percent<=100 && percent>=95){
            System.out.println("Distinction");
        }
        else if(percent<=94 && percent>=80){
            System.out.println("First Division");
        }else if(percent<=80 && percent>=75){
            System.out.println("Second Division");
        }else if(percent<=74 && percent>=70){
            System.out.println("Third Division");
        }else {
            System.out.println("Fail");
        }
        
        
        
    }
}