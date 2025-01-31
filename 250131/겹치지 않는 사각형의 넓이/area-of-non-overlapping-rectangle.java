import java.io.*;
import java.util.*;

public class Main {
    static int[][] map = new int[2001][2001];
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        paint(st, 1);

        st = new StringTokenizer(br.readLine());
        paint(st, 1);

        st = new StringTokenizer(br.readLine());
        paint(st, 0);

        System.out.println(cnt);
    }

    static void paint(StringTokenizer st, int color) {
        int x1 = Integer.parseInt(st.nextToken()) + 1000;
        int y1 = Integer.parseInt(st.nextToken()) + 1000;
        int x2 = Integer.parseInt(st.nextToken()) + 1000;
        int y2 = Integer.parseInt(st.nextToken()) + 1000;

        for (int i = y1; i < y2; i++) {
            for (int j = x1; j < x2; j++) {
                int x = map[i][j];

                if (color == 1) {
                    if (x == 1) continue;
                    else {
                        cnt++;
                        map[i][j] = color;
                    }
                } else {
                    if (x == 1) {
                        cnt--;
                        map[i][j] = color;
                    }
                }
            }
        }
    }
}