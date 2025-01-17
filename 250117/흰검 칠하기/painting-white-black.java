import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] black = new int[200001];
        int[] white = new int[200001];
        int[] color = new int[200001];

        int cur = 100000;

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            String dir = st.nextToken();

            if (dir.equals("R")) {
                while (x-- > 0) {
                    color[cur] = 1;
                    black[cur]++;
                    if (x > 0) cur++;
                }

            } else {
                while (x-- > 0) {
                    color[cur] = 2;
                    white[cur]++;
                    if (x > 0) cur--;
                }
            }
        }

        int b = 0;
        int w = 0;
        int g = 0;

        for (int i = 0; i <= 200000; i++) {
            if (black[i] > 1 && white[i] > 1) {
                g++;
                continue;
            }

            if (color[i] == 1) b++;
            else if (color[i] == 2) w++;
        }

        sb.append(w).append(" ").append(b).append(" ").append(g);

        System.out.println(sb);
    }
}