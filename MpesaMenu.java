import java.util.Scanner;
public class MpesaMenu {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Welcome to M-Pesa Menu");
        System.out.println("1. Send Money");
        System.out.println("2. Withdraw Cash");
        System.out.println("3. Buy Airtime");
        System.out.println("4. check balance");
        System.out.print("Please select an option (1-4): ");
        int choice = scanner.nextInt();
        switch (choice){
        case 1:
            System.out.println("You selected Send Money");
            break;
        case 2:
            System.out.println("You selected Withdraw Cash");
            break;
        case 3:
            System.out.println("You selected Buy Airtime");
            break;
        case 4:
            System.out.println("Your balance is Ksh 1000");
            break;
            default:
            System.out.println("Invalid option selected");
            break;
        }
        scanner.close();
    }
}
