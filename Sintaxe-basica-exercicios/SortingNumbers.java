import java.util.Scanner;
public class SortingNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for us to evaluate: ");
        int num1 = sc.nextInt();


        if (num1 == 0){
            System.out.println("The number is zero.");
        }
        else if (num1 > 0) {
            if (num1 % 2 == 0){
                System.out.println("The number is positive and even.");
            }
            else {
                System.out.println("The number is positive and odd.");
            }
        }
        else {
            System.out.println("This number is negative");
        }
    }
}
