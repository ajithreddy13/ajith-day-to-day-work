import java.util.Scanner;
public class prime { 
    public static void main(String[]aargs) {
        int i = 1;
        int count = 0;
        int j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        j = sc.nextInt();
        while(i <= j){
            if(j % i == 0){
                count++;
            }
            i++;
        }
        if(count == 2){
            System.out.println("it is a prime number");
        }else 
        {
            System.out.println("it is not a prime number");
        }
         sc.close();
        }

    }

    

