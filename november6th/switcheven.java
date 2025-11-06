import java.util.Scanner;
public class switcheven {
 public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int num = sc.nextInt();
    int result = num % 2;
    switch(result){
        case 0:
         System.out.println("It is a even number");
         break;
         default:
         System.out.println("it is a odd number");
    }
    sc.close();
 }
    
}
