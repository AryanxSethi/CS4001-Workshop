package week2stuff;

import java.util.Scanner;

public class WaterLevelMonitor
{
    public static void main(String[]args){
        double dangerlvl=1000;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the water level in liters");
        double wtlvl= sc.nextDouble();
        System.out.println("The water current water level in liters is: "+wtlvl);
        String lable= (wtlvl>dangerlvl)?"WARNING":"Normal";
        System.out.println(lable);
        sc.close();
    }
}
