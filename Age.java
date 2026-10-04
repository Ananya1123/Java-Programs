import java.util.Scanner;
public class Age 
{
    public static String Iseligible(int age)
    {
        if(age>=18)
        {
            return "vote";
        }
        else
        {
            return "cannotvote";
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        System.out.println(Iseligible(age));
        sc.close();
    }
}