import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner letter = new Scanner(System.in);
        System.out.print("Enter marks (0-100): ");
        int marks = letter.nextInt();
        if (marks >= 0 && marks <= 100) {
        if (marks >= 80){
            System.out.println("Grade: A");
        } else if (marks >= 60){
            System.out.println("Grade: B");
        } else if (marks >= 50){
            System.out.println("Grade: C");
        } else if (marks >= 45){
            System.out.println("Grade: D");
        } else if (marks >= 25){
            System.out.println("Grade: E");
        } else  {
            System.out.println("Grade: F");
        } }
        else {
            System.out.println("Invalid marks entered.");
        }
        letter.close();
    }
    
}
