//PRINT A PATTERN
import java.util.*;
public class EXAMPLE8 {
    public static void main(String[] args) {
        int n = 4;
        int number = 1;
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=i ; j++) 
            {
                System.out.print(number+" ");
                number++;//number=number+1
            }
            System.out.println();
        }
    }
}
