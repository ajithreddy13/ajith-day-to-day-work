import java.util.Scanner;
public class speed{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
     System.out.print("Enter the speed: ");
        int speed = sc.nextInt(); 
        if (speed < 40) {
            System.out.println("Slow");
        }
        else if (speed >= 40 && speed <= 80) {
            System.out.println("Normal");
        }
        else {
            System.out.println("Over speed");
        }
       sc.close();
    }
}
