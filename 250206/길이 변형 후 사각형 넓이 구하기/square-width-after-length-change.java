import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();

        int newWidth = width + 8;
        int newHeight = height * 3;

        System.out.println(newWidth);
        System.out.println(newHeight);
        System.out.println(newWidth*newHeight);
    }
}