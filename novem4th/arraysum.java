public class arraysum {
public static void main(String[]args) {
int numbers[] = {10,2,30,4,45};
int sum = 0;
for(int i = 0; i<numbers.length; i++) {
    sum = sum + numbers[i];
}
System.out.println("sum of array is : " +sum);
}
    
}
