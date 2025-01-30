import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        People[] peoples = new People[n];

        for (int i = 0; i < n; i++) {
            peoples[i] = new People(new StringTokenizer(br.readLine()));
        }

        Arrays.sort(peoples);

        StringBuilder sb = new StringBuilder();

        for (People people : peoples) {
            sb.append(people.name).append(" ").append(people.h).append(" ").append(people.w).append("\n");
        }

        System.out.println(sb);
    }

    static class People implements Comparable<People> {
        String name;
        int h;
        int w;

        People(StringTokenizer st) {
            this.name = st.nextToken();
            this.h = Integer.parseInt(st.nextToken());
            this.w = Integer.parseInt(st.nextToken());
        }

        public int compareTo(People other) {
            return this.h != other.h ? this.h - other.h : other.w - this.w;
        }
    }
}