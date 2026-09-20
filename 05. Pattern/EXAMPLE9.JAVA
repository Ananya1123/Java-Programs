//PRINT THE PATTERN
import java.util.*;
public class EXAMPLE9{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = 4;
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) 
            {
                int sum = i+j;
                if(sum%2==0){
                    System.out.print("1");    
                }
                else{
                    System.out.print("0");
                }
            System.out.println();
        }
        
    }
}