package applicationTriangle;

import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        //double xA, xB, xC, yA, yB, yC;
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = input.nextDouble();
        x.b = input.nextDouble();
        x.c = input.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = input.nextDouble();
        y.b = input.nextDouble();
        y.c = input.nextDouble();

        //double p = (x.a + x.a + x.c) / 2.0;
        //double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        //p = (y.a + y.b + y.c) / 2.0;
        //double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
        System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        input.close();
    }
}
