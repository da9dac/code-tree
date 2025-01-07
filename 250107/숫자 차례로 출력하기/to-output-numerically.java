import java.io.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        first(n);
        sb.append("\n");
        second(n);

        System.out.println(sb);
    }

    static void first(int n) {
        if (n == 0) {
            return;
        }

        first(n - 1);

        sb.append(n).append(" ");
    }

    static void second(int n) {
        if (n == 0) {
            return;
        }

        sb.append(n).append(" ");

        second(n - 1);
    }
}