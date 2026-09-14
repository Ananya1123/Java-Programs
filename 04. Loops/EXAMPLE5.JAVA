//PROGRAM TO PRINT THE TABLE OF A NUMBER INPUT BY USER 
import java.util.Scanner;
public class EXAMPLE5{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=11;i++)
        {
            System.out.println(n*i);
        }
    }
}