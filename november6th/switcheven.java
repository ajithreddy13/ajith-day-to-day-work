import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        int i = 1;
        int j;
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        k = sc.nextInt();
        while(i <= 10) {
         j = k * i;
         System.out.println(k +" * " + i + " = " + j);
         i++;
        }
        sc.close();
    }
    
}
