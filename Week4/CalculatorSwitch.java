package Week4;
import java.util.Scanner;

public class CalculatorSwitch{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first Number");
        double fn= sc.nextDouble();
        System.out.print("Enter the second Number");
        double sn=sc.nextDouble();

        System.out.println("Enter the Operator Sign (+,-,*,/)");
        char op= sc.next().charAt(0);

        switch (op){
            case '+': System.out.println("The sum of "+fn+" and "+sn+" is "+(fn+sn));
                break;
            case '-': System.out.println("The difference of "+fn+" and "+sn+" is "+(fn-sn));
                break;
            case '*': System.out.println("The product of "+fn+" and "+sn+" is "+(fn*sn));
                break;
            case '/': System.out.println("The division of "+fn+" and "+sn+" is "+(fn/sn));
                break;
            default : System.out.println("Inavlid Input");
        }
    }
}