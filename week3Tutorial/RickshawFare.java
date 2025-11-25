package week3Tutorial;
import java.util.Scanner;


public class RickshawFare
{
       
public static void main(String[]args){
     int bfare=20;
     float btfare=2.5f;
     System.out.println("-------------------------------------------------------------------");
     System.out.println("\t\tWelcome to our Rickshaw Service");
     System.out.println("The base fare is Rs. "+bfare+" per KM and Rs. "+btfare+" per minute");
     System.out.println("-------------------------------------------------------------------");
     //first initial output
     
    Scanner sc= new Scanner(System.in);
    //scanner=input
    System.out.println("Are you a Local? (True or False)");
    boolean tlocal= sc.nextBoolean();
    System.out.println("Are you travelling at Night? (True or False)");
    boolean tnight=sc.nextBoolean();
    System.out.println("Enter the Travel Distance in Kilometer(KM)");
    double tdistance= sc.nextDouble();
    System.out.println("Enter the Travel Time in Minutes(M)");
    int ttime= sc.nextInt();
    
    
    
    //calculation part
    double disc=0.2d;
    double surcharge=0.15d;
    
    double dfare= bfare*tdistance;
    double tfare= btfare*ttime;
    double cfare= dfare+tfare;
    double sfare= (tnight==true)?cfare+(cfare*surcharge):cfare;
    double ffare= (tlocal==true)?sfare-(sfare*disc):sfare;
    
    System.out.println("Your final Fare is Rs. "+ffare);
    System.out.println("\t\tThank You for using our Service");
    System.out.println("-------------------------------------------------------------------");
    
    
    
   
}
}