package RealLifeCriticalProblems;
import java.util.Scanner;
public class WaterBillCalculator {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("===WATER BILL CALCULATOR==="); 
//a variable to store the customers name    
System.out.println("Enter customers name: ");
String name = scanner.nextLine();
//variable to store the consumption of water
System.out.println("Enter consumption in m3:");
double waterConsumption = scanner.nextDouble();
int waterCharge = 0;
//variable to store constant service charge
int serviceCharge = 200;
//if else statement to calculate water charge
if(waterConsumption <= 6){
    waterCharge = 50;

}else if(waterConsumption <=16){
    waterCharge = 80;
} else if(waterConsumption <= 36){
    waterCharge = 120;
}else {
    waterCharge = 150;
} 
double sewageCharge = 0.75 * waterCharge;
//variable to store total bill of customer
double waterBill = serviceCharge + waterCharge + sewageCharge;
System.out.println("==BILL FOR" + name + "==");
System.out.println("Fixed service charge:" + serviceCharge);
System.out.println("Water charge:" + waterCharge);
System.out.println("Sewage charge" + sewageCharge);
System.out.println("Total bill: ksh." + waterBill);
  scanner.close();  
}}
