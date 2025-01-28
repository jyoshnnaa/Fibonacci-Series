import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();
        sc.close();
        int num1 = 0;
        int num2 = 1;
        System.out.println("Fibonacci series upto "+n+" terms:");
        for(int i=1; i<=n;i++){
            System.out.println(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}
