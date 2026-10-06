
import java.util.*;

public class EXAMPLE4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        sc.nextLine();

        String[] names = new String[size];

        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println("name" + (i + 1) + ": " + names[i]);
        }

        sc.close();
    }
}

    