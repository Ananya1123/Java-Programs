import java.util.Scanner;

public class Multiply {
   public Multiply() {
   }

   public static int multiply(int a, int b) {
      int product = a * b;
      return product;
   }

   public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int result = multiply(a, b);
      System.out.println(result);
      sc.close();
   }
}

