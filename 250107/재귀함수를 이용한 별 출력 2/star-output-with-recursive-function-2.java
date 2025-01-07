import java.io.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        solve(n);

        System.out.println(sb);
    }

    static void solve(int n) {
        if (n == 0) {
            return;
        }

        makeStar(n);
        
        solve(n - 1);

        makeStar(n);
    }

    static void makeStar(int n) {
        while (n-- > 0) {
            sb.append("*").append(" ");
        }
        sb.append("\n");
    }
}