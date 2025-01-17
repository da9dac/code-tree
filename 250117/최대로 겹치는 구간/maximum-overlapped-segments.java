import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] line = new int[201];

        int n = Integer.parseInt(br.readLine());
        int max = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken()) + 100;
            int x2 = Integer.parseInt(st.nextToken()) + 100;

            for (int j = x1; j < x2; j++) {
                line[j]++;
            }
        }

        for (int l : line) {
            max = Math.max(max, l);
        }

        System.out.println(max);
    }
}