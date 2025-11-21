import java.util.Scanner;

/**
 * Write a description of class UserInputExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UserInputExample
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber=sc.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber=sc.nextInt();
        int sum=firstNumber+secondNumber;
        System.out.println("The Sum of two number is: "+sum);
        int great=firstNumber>secondNumber?firstNumber:secondNumber;
        System.out.print(great);
    }
}