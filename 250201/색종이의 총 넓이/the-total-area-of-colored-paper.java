import java.io.*;
import java.util.*;

public class Main {
    static int[][] map = new int[201][201];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            paint(st);
        }
        
        int cnt = 0;

        for (int i = 0; i < 201; i++) {
            for (int j = 0; j < 201; j++) {
                if (map[i][j] == 1) cnt++;
            }
        }

        System.out.println(cnt);
    }

    static void paint(StringTokenizer st) {
        int x1 = Integer.parseInt(st.nextToken()) + 100;
        int y1 = Integer.parseInt(st.nextToken()) + 100;
        int x2 = x1 + 8;
        int y2 = y1 + 8;

        for (int i = y1; i < y2; i++) {
            for (int j = x1; j < x2; j++) {
                map[i][j] = 1;
            }
        }
    }
}