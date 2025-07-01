import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("Welcome to the calculator!");

            System.out.print("Choose an operation (addition, subtraction, multiplication, division): ");
            String operation = scanner.nextLine();

            System.out.print("Enter the first number: ");
            double number1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double number2 = scanner.nextDouble();

            // Clear newline character from buffer
            scanner.nextLine();

            double result = 0;
            boolean validOperation = true;

            switch (operation.toLowerCase()) {
                case "addition":
                    result = number1 + number2;
                    break;
                case "subtraction":
                    result = number1 - number2;
                    break;
                case "multiplication":
                    result = number1 * number2;
                    break;
                case "division":
                    if (number2 != 0) {
                        result = number1 / number2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        validOperation = false;
                    }
                    break;
                default:
                    System.out.println("Invalid operation.");
                    validOperation = false;
            }

            if (validOperation) {
                System.out.println("Result: " + result);
            }

            System.out.print("Would you like to perform another operation? (y/n): ");
            String answer = scanner.nextLine();

            if (!answer.equalsIgnoreCase("y")) {
                keepRunning = false;
                System.out.println("Thanks for using the calculator!");
            }
        }

        scanner.close();
    }
}
