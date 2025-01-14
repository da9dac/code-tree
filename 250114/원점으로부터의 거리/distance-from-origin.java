import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        Dot[] dots = new Dot[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            dots[i] = new Dot(i + 1, x, y);
        }

        Arrays.sort(dots);

        for (Dot dot : dots) {
            sb.append(dot.num).append("\n");
        }

        System.out.println(sb);
    }

    static class Dot implements Comparable<Dot> {
        int num;
        int x;
        int y;

        Dot(int num, int x, int y) {
            this.num = num;
            this.x = x;
            this.y = y;
        }

        private int getDistance() {
            return Math.abs(x) + Math.abs(y);
        }

        public int compareTo(Dot other) {
            int a = this.getDistance();
            int b = other.getDistance();

            return a != b ? a - b : this.num - other.num;
        }
    }
}