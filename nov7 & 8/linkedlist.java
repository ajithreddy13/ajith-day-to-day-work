import java.util.*;
public class linkedlist {
    public static void main(String[] args) {
    LinkedList<String> names = new LinkedList<>();
    names.add("Ajith");
    names.add("Ajay");
    names.add("Vishnu");
    System.out.println("Names: " + names);
    names.remove("Ajay");
    System.out.println("After removal: " + names);
    }
}

