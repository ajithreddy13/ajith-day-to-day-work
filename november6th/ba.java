import java.util.Scanner;
public class ba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(); 
        int b = sc.nextInt();
        int temp = a; 
        a = b;   
        b = temp;    
        System.out.println("After swapping: a = " + a + " and b = " + b);
        sc.close(); 
    }
}
