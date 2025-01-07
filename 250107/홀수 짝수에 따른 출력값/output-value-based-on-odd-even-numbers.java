import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(solve(n));
    }

    static int solve(int n) {
        if (n < 1) return 0;

        return n + solve(n - 2);
    }
}