import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[] tiles = new int[200001];
        int cur = 100000;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            String dir = st.nextToken();

            if (dir.equals("R")) {
                while (x-- > 0) {
                    tiles[cur] = 1;
                    if (x > 0) cur++;
                }
            } else {
                while (x-- > 0) {
                    tiles[cur] = -1;
                    if (x > 0) cur--;
                }
            }
        }

        int white = 0;
        int black = 0;

        for (int tile : tiles) {
            if (tile == 1) black++;
            else if(tile == -1) white++;
        }

        System.out.println(white + " " + black);
    }
}