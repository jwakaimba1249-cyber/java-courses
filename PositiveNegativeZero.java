import java.util.Scanner;
public class PositiveNegativeZero {
    public static void main(String[] args){
        Scanner number =new Scanner(System.in); 
        System.out.println("Enter a number: ");
        int num = number.nextInt();
        // You can change this value to test different cases

        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        number.close();
    }
}