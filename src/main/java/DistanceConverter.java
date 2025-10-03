import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        // TODO: Implement distance converter
        // Requirements:
        // - Menu with options: 1. Convert Miles to Kilometers, 2. Convert Kilometers to Miles, 3. Exit
        // - Loop until user chooses to exit
        // - Use conversion factor: 1 mile = 1.60935 kilometers
        // - Display conversion results
        // - Handle invalid menu choices
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Choose conversion direction:\n1. Convert Miles to Kilometers\n2. Convert Kilometers to Miles\n3. Exit");
            System.out.print("Enter your choice (1, 2, or 3): ");
            int choice = scan.nextInt();

            double fart, result;
            switch(choice) {
                case 1:
                    System.out.print("\nEnter distance in miles: ");
                     fart = scan.nextDouble();
                     result = fart*1.60935;
                    System.out.println("Conversion Results: Miles: "+fart+"mi"+"\nKilometers: "+result+"km");
                    break;

                case 2:
                    System.out.print("\nEnter distance in kilometers: ");
                     fart = scan.nextDouble();
                     result = fart/1.60935;
                     System.out.println("Conversion Results: \nKilometers: "+fart+"km"+"\nMiles: "+result+"mi");

                case 3:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.Please enter 1, 2, or 3");
                    break;

            }
            if(choice == 3) break;
        }


    }
}