
/**
 * Write a description of class TimeConverter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total seconds: ");
        int totalSeconds = sc.nextInt();
        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;
        System.out.println("Hours: " +  hours + "\n" + "Minutes" + minutes + "\n" + "Seconds" + seconds);
        

    }
}
