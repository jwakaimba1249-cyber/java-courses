package week6;

public class Vehicle {
       public void start() { 
        System.out.println("Vehicle is starting..."); 
    } 
} 
 
class Car extends Vehicle { 
    @Override 
    public void start() { 
        // Call the parent's start() method first 
        super.start();  
         
        // Then add Car-specific behavior 
        System.out.println("Car engine is running smoothly."); 
    } 
    
}
