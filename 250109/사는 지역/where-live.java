import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());

        People[] peoples = new People[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            peoples[i] = new People(st.nextToken(), st.nextToken(), st.nextToken());
        }

        Arrays.sort(peoples);

        System.out.println(peoples[n - 1].toString());
    }

    static class People implements Comparable<People> {
        String name;
        String addr;
        String region;

        People(String name, String addr, String region) {
            this.name = name;
            this.addr = addr;
            this.region = region;
        }

        public int compareTo(People other) {
            return this.name.compareTo(other.name);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();

            sb.append("name").append(" ").append(name).append("\n")
                .append("addr").append(" ").append(addr).append("\n")
                .append("city").append(" ").append(region);
            
            return sb.toString();
        }
    }
}