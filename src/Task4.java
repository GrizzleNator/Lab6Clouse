import java.util.Scanner;
import java.lang.Math;
public class Task4 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        int usersInput = 0;
        boolean valid1 = false;
        int ticketValue = (int) (Math.random() * 15) + 20;
        do {
            System.out.println("Enter your guess 20-35");
            if (scan.hasNextInt()) {
                usersInput = scan.nextInt();
                if (usersInput >= 20 && usersInput <= 35) {
                    valid1 = true;
                }
            } else {
                System.out.println("Error must enter valid value");
            }
            scan.nextLine();
        } while (!valid1);
        System.out.println(ticketValue + ", " + usersInput);

        if(usersInput > ticketValue){
            System.out.println("your value was above the estimate");
        } else if (usersInput == ticketValue){
            System.out.println("you matched the estimate");
        }
        else{
            System.out.println("Your guess was lower than the estimate");
        }
    }
}