package week5;
import java.util.ArrayList;
public class ArrayListBasic {
    public static void main(String[] args){
ArrayList<String> names = new ArrayList<>();
System.out.println("===ADDING ELEMENTS===");
names.add("Alice");
names.add("Bob");
names.add("Charlie");
System.out.println("after adding elements: " + names);
names.add(1, "Diana");
System.out.println("after adding at index 1: " + names);
System.out.println("First element: " + names.get(0));
System.out.println("Element at index 2: " + names.get(2));
System.out.println("Last element:" + names.get(names.size()-1));
System.out.println("Number of names: " + names.size());
System.out.println("===CONTAINS===");
System.out.println("Contains Bob? " + names.contains("Bob"));
System.out.println("Contains Eve? " + names.contains("Eve"));
System.out.println("===FINDING INDEX===");
System.out.println("Index of Charlie: " + names.indexOf("Charlie"));
System.out.println("Index of Eve: " + names.indexOf("Eve"));
System.out.println("===REMOVING ELEMENTS===");
names.remove("Bob");
System.out.println("After removing Bob: " + names);
names.remove(0);
System.out.println("After removing index 0: " + names);
System.out.println("===UPDATING ELEMENTS===");
names.set(0, "Eve");
System.out.println("After updating index 0 to Eve: " + names);
System.out.println("===ITERATING WITH TRADITIONAL FOR LOOP===");
for(int i = 0; i<names.size(); i++){
    System.out.println("Index " + i + ": " + names.get(i));
}
    System.out.println("===ITERATING WITH ENHANCED FOR LOOP===");
  for(String name:names){
        System.out.println("Name: " + name);
    }
System.out.println("CLEARING THE LIST");
names.clear();
System.out.println("After clearing: " + names);
System.out.println("Size after clearing: " + names.size());
System.out.println("Is the list empty? " + names.isEmpty());
    }
}
