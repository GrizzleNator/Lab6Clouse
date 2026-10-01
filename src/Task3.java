import java.util.Scanner;
import java.lang.Math;
public class Task3 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        double side1 = 0;
        double side2 = 0;
        double hypot;
        double perimeter;
        double area;
        boolean valid1 = false;
        boolean valid2 = false;
        do {
            System.out.println("Enter your side 1 length in meters");
            if (scan.hasNextDouble()) {
                side1 = scan.nextDouble();
                if (side1 > 0) {
                    valid1 = true;
                }
            } else {
                System.out.println("Error must enter valid length");
            }
            scan.nextLine();
        } while (!valid1);
        do {
            System.out.println("Enter your side 2 length in meters");
            if (scan.hasNextDouble()) {
                side2 = scan.nextDouble();
                if (side2 > 0) {
                    valid2 = true;
                }
            } else {
                System.out.println("Error must enter valid length");
            }
            scan.nextLine();
        } while (!valid2);
        perimeter = (side1 * 2) + (side1 * 2);
        hypot = Math.hypot(side1, side2);
        area = side1 * side2;
        System.out.println("your calculation is: ");
        System.out.printf("%-24s%5.2f%1s", "users perimeter is", perimeter, "m");
        System.out.printf("\n%-24s%-5.2f%1s", "Users hypotenuse is", hypot, "m");
        System.out.printf("\n%-24s%-5.2f%2s", "Users area is", area, "m²");
    }
}
