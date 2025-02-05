import java.io.*;
import java.util.*;

public class Main {
    static int color = 1;
    static int[][] map = new int[201][201];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());

            paint(st, color);

            color *= -1;
        }

        int cnt = 0;

        for (int[] line : map) {
            for (int x : line) {
                if (x == -1) cnt++;
            }
        }

        System.out.println(cnt);
    }

    static void paint(StringTokenizer st, int color) {
        int x1 = Integer.parseInt(st.nextToken()) + 100;
        int y1 = Integer.parseInt(st.nextToken()) + 100;
        int x2 = Integer.parseInt(st.nextToken()) + 100;
        int y2 = Integer.parseInt(st.nextToken()) + 100;

        for (int i = y1; i < y2; i++) {
            for (int j = x1; j < x2; j++) {
                map[i][j] = color;
            }
        }
    }
}