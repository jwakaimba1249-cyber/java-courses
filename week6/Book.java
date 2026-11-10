package week6;

public class Book {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        setPrice(price);
        this.isAvailable = true;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price){
        if(price >= 0){
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }

    }
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have borrowed the book: " + title);
        } else {
            System.out.println("Sorry, the book is currently not available.");
        }
    }
    public void returnBook(){
        if(!isAvailable){
            isAvailable = true;
            System.out.println("You have returned the book: " + title);
        } else {
            System.out.println("This book was not borrowed.");
        }
    }
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.printf("Price: Ksh %.2f%n" , price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }
    

}
