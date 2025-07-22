import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;


        do {
            System.out.println("---MENU---");
            System.out.println("1 - Multiplication table");
            System.out.println("2 - Odd or even check");
            System.out.println("0 - Close");
            System.out.print("Choose one of the options above: ");
            choice = sc.nextInt();
            switch (choice){
                case 0:
                    break;
                case 1:
                    System.out.println("Do you want to know the multiplication table of which number? ");
                    int number = sc.nextInt();
                    System.out.printf("The multiplication table of %d is: %n", number);
                    for (int i = 0; i < 11; i++) {
                        int operationResult = number * i;
                        System.out.println(operationResult);
                    }
                    break;
                case 2:
                    System.out.println("What number do you want me to check if it is odd or even?");
                    number = sc.nextInt();
                    int operationResult = number % 2;
                    if (operationResult == 0){
                        System.out.println("It's even");
                    }
                    else {
                        System.out.println("It's odd");
                    }
                    break;
                default:
                    choice = 0;
                    System.out.println("Invalid option! Please try again.");
            }
        }
        while (choice!= 0);
        System.out.println("Thank you for using the system!");
    }
}
