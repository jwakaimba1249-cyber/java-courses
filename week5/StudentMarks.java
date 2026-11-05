package week5;

public class StudentMarks {
    public static void main(String[] args){
               System.out.println("\n=== STUDENT MARKS TABLE ==="); 
  
        // 2D array with student marks: rows = students, columns = subjects. 
        int[ ][ ] studentMarks = { 
            {85, 90, 78},  // Alice: Math, English, Science 
            {72, 88, 91},  // Bob 
            {65, 75, 80}   // Charlie 
        }; 
  
        String[ ] studentNames = {"Alice", "Bob", "Charlie"}; 
        String[ ] subjects = {"Math", "English", "Science"}; 
 
  
        // Print table header. 
        System.out.print("Student   "); 
        for (String subject : subjects) { 
            System.out.print(subject + "   "); 
        } 
        System.out.println("Average"); 
        System.out.println("-------------------------------------------"); 
  
        // Loop through each student. 
        for (int i = 0; i < studentMarks.length; i++) { 
            // Print student name. 
            System.out.print(studentNames[i] + "    "); 
  
            // Variable for total marks. 
            int total = 0; 
  
            // Print each mark and accumulate total. 
            for (int j = 0; j < studentMarks[i].length; j++) { 
                System.out.print(studentMarks[i][j] + "      "); 
                total += studentMarks[i][j]; 
            } 
  
            // Calculate and print the average. 
            double avg = (double) total / studentMarks[i].length; 
            System.out.printf("%.2f%n", avg); 
} 
} 
} 
    

