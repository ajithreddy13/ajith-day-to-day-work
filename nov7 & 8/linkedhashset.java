import java.util.*;
public class linkedhashset {
    public static void main(String[] args) {
    LinkedHashSet<String> fruits = new LinkedHashSet<>();
    fruits.add("cotton");
    fruits.add("mirchi");
    fruits.add("cotton");
    fruits.add("sweetcorn"); 
    System.out.println(fruits);
    fruits.remove("sweetcorn");
    System.out.println("After removing sweetcorn: " + fruits);
    }
}
