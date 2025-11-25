package week3Tutorial;
import java.util.Scanner;



public class GradeEvaluator
{
    public static void main(String[]args){
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter your Grade in Numeric Value");
    int check=sc.nextInt();
    String result=(check>=40)?"Passed":"Failed";
    System.out.println("-----------------");
    System.out.println("You have "+result+" with "+check+"%");
    System.out.println("-----------------");
   
}
}