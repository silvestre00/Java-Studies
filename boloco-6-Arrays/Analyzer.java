import java.util.Scanner;
public class Analyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int bigger = 0;
        int minor = 0;
        System.out.println("How many numbers do you want to include in the list?");
        number = sc.nextInt();
        int[] listNumbers = new int[number];

        for (int i = 0; i < number; i++){
            System.out.println("Include the number: ");
            listNumbers[i] = sc.nextInt();
        }
        System.out.println("All numbers in the list are: ");
        for (int n : listNumbers){
            if (n > bigger) {
                bigger = n;
            }
            if (n < minor) {
                minor = n;
            }
            System.out.printf("%d, ", n);
        }
        System.out.printf("%nThe largest number on the list is: %d%n", bigger);
        System.out.printf("The smallest number in the list is: %d%n", minor);
    }
}
