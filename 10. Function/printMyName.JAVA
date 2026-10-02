// Print a given name in a function
import java.util.Scanner;

public class printMyName {
    public static void printMyName(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMyName(name);
        sc.close();
    }
}
