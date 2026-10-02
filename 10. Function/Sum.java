import java.util.*;
public class Sum {
    public static int sum(int a, int b) {
        int total = a + b;
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = sum(a, b);
        System.out.println(result);
        sc.close();
    }
}


