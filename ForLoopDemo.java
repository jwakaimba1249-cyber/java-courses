public class ForLoopDemo {
    public static void main(String[] args){
        for(int i=1; i<=10; i++){
            System.out.print(i+ " ");
        } System.out.println(); // Move to the next line after the first loop
        for(int j=10; j>=1; j--){
            System.out.print(j+ " ");
        }
        String students[] = {"Alice", "Bob", "Charlie", "David", "Eve"};
        System.out.println(); // Move to the next line after the second loop
        for(String student : students){
            System.out.println("Student: " + student);
        }
    }
}
