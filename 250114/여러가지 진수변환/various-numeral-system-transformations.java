import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        if (n == 0) {
            System.out.println(0);
        } else {
            while (n > 0) {
                int r = n % b;
                sb.append(r);
                n /= b;
            }

            System.out.println(sb.reverse().toString());
        }
    }
}