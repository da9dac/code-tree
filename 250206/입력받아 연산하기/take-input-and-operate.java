import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int newA = a + 87;
        int newB = b % 10;

        System.out.println(newA);
        System.out.println(newB);
        
    }
}