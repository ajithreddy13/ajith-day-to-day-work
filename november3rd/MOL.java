class ajith { //create class name
static int add(int a, int b) { //add two integers a and b
return a + b; 
} 
 static double add(double a , double b) { //add two decimal points
 return a + b;
 }
}
 public class mol {
 public static void main(String[] args) {
 System.out.println(ajith.add(19,30));
 System.out.println(ajith.add(12.32,15.32));
 }
 }
in class ajith we have two same methods called add but we have two different parameters named int and double this process 
is called method overloading.
