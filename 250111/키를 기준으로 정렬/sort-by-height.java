import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        People[] peoples =  new People[n];

        for (int i = 0 ; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            peoples[i] = new People(st);
        }

        Arrays.sort(peoples);

        for (People people : peoples) {
            people.appendTo(sb);
        }

        System.out.println(sb);
    }

    static class People implements Comparable<People> {
        String name;
        int height;
        int weight;

        People(StringTokenizer st) {
            this.name = st.nextToken();
            this.height = Integer.parseInt(st.nextToken());
            this.weight = Integer.parseInt(st.nextToken());
        }

        public void appendTo(StringBuilder sb) {
            sb.append(name).append(" ").append(height).append(" ").append(weight).append("\n");
        }

        public int compareTo(People other) {
            return this.height - other.height;
        }
    }
}