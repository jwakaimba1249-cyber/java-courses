import java.util.Scanner;
public class PatternGenerator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pattern: ");
        int rows = scanner.nextInt();
        System.out.println("===PATTERN 1: RIGHT-ANGLE TRIANGLE===");
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("===PATTERN 2: INVERTED RIGHT-ANGLE TRIANGLE===");
        for(int i = rows; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("===PATTERN 3: PYRAMID===");
        for(int i = 1; i<= rows; i++){
            for(int j = 1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("===PATTERN 4: NUMBER TRIANGLE===");
        for(int i = 1; i<=rows; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("===PATTERN 5: MULTIPLICATION TABLE===");
        for(int i = 1; i<=rows; i++){
            for(int j = 1; j<=rows; j++){
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }

















        scanner.close();
    }

}