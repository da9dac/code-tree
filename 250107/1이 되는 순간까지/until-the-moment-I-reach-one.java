import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(solve(n));
    }

    static int solve(int n) {
        if (n == 1) {
            return 0;
        }

        return 1 + solve(n % 2 == 0 ? n / 2 : n / 3);
    }
}