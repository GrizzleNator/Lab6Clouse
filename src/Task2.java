import java.util.Scanner;
public class Task2 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        double userNumBattery = 0;
        double userCharMinutes = 0;
        double userCost = 0;
        double availableMin;
        double cost60;
        boolean valid1 = false;
        boolean valid2 = false;
        boolean valid3 = false;
        do {
            System.out.println("Enter your number of charges");
            if (scan.hasNextDouble()) {
                userNumBattery = scan.nextDouble();
                if (userNumBattery >= 0) {
                    valid1 = true;
                }
            } else {
                System.out.println("Error must enter valid value");
            }
            scan.nextLine();
        } while (!valid1);
        do {
            System.out.println("Enter your number of robot operation minutes per full charge");
            if (scan.hasNextDouble()) {
                userCharMinutes = scan.nextDouble();
                if (userCharMinutes > 0) {
                    valid2 = true;
                }
            } else {
                System.out.println("Error must enter valid value");
            }
            scan.nextLine();
        } while (!valid2);
        do {
            System.out.println("Enter your number of dollars it costs to recharge one battery fully");
            if (scan.hasNextDouble()) {
                userCost = scan.nextDouble();
                if (userCost > 0) {
                    valid3 = true;
                }
            } else {
                System.out.println("Error must enter valid value");
            }
            scan.nextLine();
        } while (!valid3);
        availableMin = userNumBattery * userCharMinutes;
        cost60 = userCost * (60 / userCharMinutes);
        System.out.println("your calculation: ");
        System.out.printf("%-25s%5.2f", "Users available min", availableMin);
        System.out.printf("\n%-25s$%-5.2f", "Users cost to run 60 min", cost60);
    }
}