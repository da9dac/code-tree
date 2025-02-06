import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble();
        double w = sc.nextDouble();

        double b = w / Math.pow((h/100),2);

        System.out.println((int)b);

        if(b >= 25.0){
            System.out.println("Obesity");

        }
    }
}