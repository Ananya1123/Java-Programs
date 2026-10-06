 import java.util.Scanner;

public class EXAMPLE {
   public EXAMPLE() {
   }

   public static void main(String[] var0) {
      Scanner sc= new Scanner(System.in);
      int size = sc.nextInt();
      int numbers[] = new int[size];
   
      for(int i = 0; i < size; ++i) {
         numbers[i] = sc.nextInt();
      }
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;

      for(int i = 0; i< numbers.length; ++i) 
      {
         if (numbers[i] < min) {
             min = numbers[i];
         }
         if (numbers[i] > max) {
             max = numbers[i];
         }
      }

      System.out.println("Minimum length: " + min);
      System.out.println("Maximum length: " + max);

   sc.close();
   }
}


