import java.util.Objects;
import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        // TODO: Implement time converter
        // Requirements:
        // - Prompt for hours, minutes, and seconds
        // - Display conversion results and calculation breakdown
        // - Ask user if they want to convert another time (y/n)
        // - Loop until user chooses to exit
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Convert time to total seconds\n");
            int hrs, mins, secs,tot;

            System.out.print("Enter hours: ");
            hrs = scan.nextInt();
            System.out.print("\nEnter minutes: ");
            mins = scan.nextInt();
            System.out.print("\nEnter seconds: ");
            secs = scan.nextInt();

            System.out.println("\nTime Conversion:");
            System.out.println(hrs+" hour, "+mins+" minute, and "+secs+" second");
            tot = secs+(mins*60)+(hrs*60*60);
            System.out.println("Total seconds: "+tot);

            System.out.println("\nCalculation:");
            System.out.println(hrs+" hours x 3600 = "+hrs*3600+" seconds");
            System.out.println(mins+" minutes x 60 = "+mins*60+" seconds");
            System.out.println(secs+" seconds = "+secs+" seconds");
            System.out.println("Total seconds: "+tot);

            System.out.println("Do you want to convert another time? (y/n): ");
            String choice = scan.next();
            if(!Objects.equals(choice, "y")) {
                System.out.println("Goodbye!");
                break;
            }

        }
    }
}