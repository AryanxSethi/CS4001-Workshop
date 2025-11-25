package Week4;
import java.util.Scanner;


public class EvenorOdd

{
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter an Integer number ");
        int check= sc.nextInt();
        if (check%2==0){
            System.out.println(check+" is even Number");
        }
        else {
            System.out.println(check+" is odd Number"); 
        }
    }
}