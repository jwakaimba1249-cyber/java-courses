package week6;

public class BookTest {
    public static void main(String[] args){
        Book myBook = new Book("Java Programming", "John Doe", 1500.00);
        myBook.displayBookInfo();
        System.out.println("Attempting to change the price to a negative value...");
        myBook.setPrice(-500.00); // This should trigger the validation message
        System.out.println("Borrowing the book...");
        myBook.borrowBook();
        myBook.displayBookInfo();
        System.out.println("Returning the book...");
        myBook.returnBook();
        myBook.displayBookInfo();
        Book anotherBook = new Book("Python Programming", "Jane Smith", 1200.00);
        anotherBook.displayBookInfo();
    }
}
