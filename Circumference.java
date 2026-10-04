import java.util.Scanner;
public class Circumference {
    public static double calculateCircumference(double radius) {
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        
        double circumference = calculateCircumference(radius);
        System.out.println("The circumference of the circle is: " + circumference);
        
        sc.close();
    }
    
}
