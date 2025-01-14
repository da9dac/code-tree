import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        char[] n = br.readLine().toCharArray();
        int len = n.length;

        int num = 0;

        for(int i = 0; i < len; i++) {
            int x = n[i] - '0';

            num += x * Math.pow(a, len - 1 - i);
        }

        if (num == 0) {
            System.out.println(0);
        } else {
            StringBuilder sb = new StringBuilder();

            while (num > 0) {
                int r = num % b;
                sb.append(r);
                num /= b;
            }

            System.out.println(sb.reverse().toString());
        }
    }
}