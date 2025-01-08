import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Agent[] agents = new Agent[5];

        StringTokenizer st;

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());

            agents[i] = new Agent(st.nextToken(), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(agents);

        System.out.println(agents[0].toString());
    }

    static class Agent implements Comparable<Agent> {
        String codeName;
        int score;

        Agent(String codeName, int score) {
            this.codeName = codeName;
            this.score = score;
        }

        public int compareTo(Agent other) {
            return this.score - other.score;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();

            sb.append(codeName).append(" ").append(score);

            return sb.toString();
        }
    }
}