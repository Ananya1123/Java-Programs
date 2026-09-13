//MAKE A PROGRAM THAT TAKES RADIUS OF A CIRCLE AS INPUT AND CALCULATES ITS RADIUS AREA AND PRINT OUTPUT 

import java.util.Scanner;
class ExampleIN{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a radius");
        float radius = sc.nextFloat();
        float area = 3.14f * radius * radius;   
        System.out.println("radius of circle is "+radius);
        System.out.println("area of circle is "+area);
    }
}
        