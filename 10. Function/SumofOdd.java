//PROGRAM TO PRINT SUM OF ALL ODD NUMBERS BETWEEN 1 TO N
import java.util.Scanner;

public class SumofOdd {
    public static int calculateSum(int n) {
        if (n < 1) {
            return 0;
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) { // Check if the number is odd
                sum = sum +i;
            }

        
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();

        int sum = calculateSum(num);
        System.out.println("The sum of odd numbers from 1 to " + num + " is: " + sum);
        sc.close();
    }
}