package applicationSalary;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Employee emp = new Employee();
        System.out.println("Enter employee information: ");
        System.out.println("Name: ");
        emp.name = input.nextLine();

        System.out.println("Gross Salary: ");
        emp.grossSalary = input.nextDouble();

        System.out.println("Tax: ");
        emp.tax = input.nextDouble();

        System.out.println();
        System.out.println("Employee: " + emp);
        System.out.println();

        System.out.println("Which percentage to increse salary? ");
        double percentage = input.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println();
        System.out.println("Update data: " + emp);

        input.close();
    }
}
