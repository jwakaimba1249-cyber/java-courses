public class BooleanAnalysis {
    public static void main(String[] args) {
        boolean part1 = (5>3); 
        boolean part2 = (4<2);
        boolean part3 = true; // (10==10) is always true
        System.out.println("5 > 3: " + part1);
        System.out.println("4 < 2: " + part2);
        System.out.println("10 == 10: " + part3);
        boolean intermediateResult = part1 && part2;
        System.out.println("Intermediate Result (part1 && part2): " + intermediateResult);
        boolean finalResult = intermediateResult || part3;
        System.out.println("Final Result (intermediateResult || part3): " + finalResult);
        boolean directResult = (5>3) && (4<2) || part3;
        System.out.println("Direct Result ((5>3) && (4<2) || (10==10)): " + directResult);
    }
}
