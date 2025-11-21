
/**
 * Write a description of class TimeConverter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class DayConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total days: ");
        int totalDays = sc.nextInt();
        int years = totalDays / 365;
        int remainingDays = totalDays % 365;
        int months = remainingDays / 30;
        int days = remainingDays % 30;
        System.out.println("Years: " + years + "\n" + "Months:"  + months + "\n" + "Days: "  + days);
        

    }
}
