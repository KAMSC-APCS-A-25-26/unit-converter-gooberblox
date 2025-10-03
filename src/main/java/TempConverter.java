import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        // TODO: Implement temperature converter
        // Requirements:
        // - Menu with options: 1. Convert Fahrenheit to Celsius, 2. Convert Celsius to Fahrenheit, 3. Exit
        // - Loop until user chooses to exit
        // - Use formulas: C = (F - 32) * 5/9 and F = C * 9/5 + 32
        // - Display conversion results
        // - Handle invalid menu choices
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Choose conversion direction\n1. Convert Fahrenheit to Celsius\n2. Convert Celsius to Fahrenheit\n3. Exit");
            System.out.print("Enter your choice (1, 2, or 3): ");
            int choice = scan.nextInt();
            double input, result;

            switch(choice) {
                case 1:
                    System.out.print("\nEnter temperature in Fahrenheit: ");
                    input = scan.nextDouble();
                    System.out.println("Conversion Results:\nFahrenheit: "+input);
                    result = (input-32) * ((double) 5 /9);
                    System.out.println("Celsius: "+result);
                    break;
                case 2:
                    System.out.print("\nEnter temperature in Celsius: ");
                    input = scan.nextDouble();
                    System.out.println("Conversion Results:\nCelsius: "+input);
                    result = input * ((double) 9/5) +32;
                    System.out.println("Fahrenheit: "+result);
                    break;
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