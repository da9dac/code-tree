import java.io.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        printStar(n);

        System.out.println(sb);
    }

    static void printStar(int n) {
        if (n == 0) {
            return;
        }

        printStar(n - 1);

        for (int i = 0; i < n; i++) {
            sb.append("*");
        }

        sb.append("\n");
    }
}