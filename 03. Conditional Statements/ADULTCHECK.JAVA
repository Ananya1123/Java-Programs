// MAKE A PROGRAM TO TAKE INPUT A AGE AND CHECK THE PERSON IS ADULT OR NOT
import java.util.Scanner;
class ADULTCHECK{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("You are an adult");
        }
        else{
            System.out.println("You are not an adult");
        }
    }
}