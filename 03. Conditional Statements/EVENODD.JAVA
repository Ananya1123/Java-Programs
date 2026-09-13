//PROGRAM TO CHECK WHETHER A NUMBER IS EVEN OR ODD
import java.util.Scanner;
class EVENODD{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println(num+" is an even number");
        }
        else{
            System.out.println(num+" is an odd number");
        }
    }
}