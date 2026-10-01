import java.util.Scanner;
public class Task1 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        double userDistance = 0;
        double finalValue;
        boolean validDistance = false;
            do{
                System.out.println("Enter your distance of trail in kilometers");
                if(scan.hasNextDouble()){
                    userDistance = scan.nextDouble();
                    if(userDistance > 0){
                        validDistance = true;
                    }
                }
                else {
                    System.out.println("Error must enter valid distance");
                }
                scan.nextLine();
            }while (!validDistance);
        finalValue = userDistance * 0.621371;
        System.out.println("Distance: ");
        System.out.printf("%-10s%7.2f", "Users Mi", userDistance);
        System.out.printf("\n%-10s%7.2f", "Users Km", finalValue);











    }
}
