import java.util.Scanner;

public class MinToYears&Days {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // Prompt user to input the number of minutes
    System.out.println("Enter the number of minutes:");
    int minutes = input.nextInt();

     // Converting minutes years and days
    int year = minutes / 525600;
    int day = minutes / 1440;
    int remainingMinutes = day % 365;

    System.out.println(minutes + " minutes is " + year + " years and "  +  remainingMinutes + " days ");
    }
}
