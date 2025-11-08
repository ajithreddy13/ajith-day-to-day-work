import java.util.*;
public class hashmap {
    public static void main(String[] args) {
    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "Java");
    map.put(2, "Python");
    map.put(3, "C");
    System.out.println("Programming Languages: " + map);
    System.out.println("Value at key 2: " + map.get(2));
    }
}
