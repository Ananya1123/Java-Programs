import java.util.*;
public class Average{

    public static int calculateAverage(int a, int b, int c)
    {
        int average =(a+b+c)/3;
        return average;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int avg=calculateAverage(num1, num2, num3);
        System.out.println("The average is: " + avg);
        sc.close();

    }
}

