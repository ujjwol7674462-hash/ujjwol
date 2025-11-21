/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class MathOperations
{
    public static void main(String[]arg){
        Scanner  sc=new Scanner(System.in);
        System.out.println("Enter Frist Number:");
        int num1=sc.nextInt();
        System.out.println("Enter Second Number:");
        int num2=sc.nextInt();
        
        int sum=num1+num2;
        int subtract=num1-num2;
        float divide=(float)num1/num2;
        int multiply=num1*num2;
        float mod=num1%num2;
        
        String gns=(num1>num2)?num1 + " is greater " +"\n"+ num2 + " is smaller ":num2 + " is greater " +"\n" + num1 + " is smaller ";
        
        System.out.println("Sum = "+sum+"\n"+"Subtract = "+subtract+"\n"+"Divide = "+divide+"\n"+"Multiply = "+multiply+"\n"+"Remainder = "+mod+"\n"+gns);
    }
}