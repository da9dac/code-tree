import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int cur = 1000;
        int[] line = new int[2001];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            String direction = st.nextToken();

            if (direction.equals("R")) {
                int end = cur + x;
                for (int j = cur; j < end; j++) {
                    line[j]++;
                }
                cur = end;
            } else {
                int end = cur - x;
                for (int j = cur - 1; j >= end; j--) {
                    line[j]++;
                }
                cur = end;
            }
        }

        int cnt = 0;

        for (int l : line) {
            if (l > 1) cnt++;
        }

        System.out.println(cnt);
    }
}