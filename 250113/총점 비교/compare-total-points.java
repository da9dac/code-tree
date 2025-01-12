import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        Score[] scores =  new Score[n];

        for (int i = 0 ; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            scores[i] = new Score(st);
        }

        Arrays.sort(scores);

        for (Score score : scores) {
            score.appendTo(sb);
        }

        System.out.println(sb);
    }

    static class Score implements Comparable<Score> {
        String name;
        int kor;
        int eng;
        int math;

        Score(StringTokenizer st) {
            this.name = st.nextToken();
            this.kor = Integer.parseInt(st.nextToken());
            this.eng = Integer.parseInt(st.nextToken());
            this.math = Integer.parseInt(st.nextToken());
        }

        public void appendTo(StringBuilder sb) {
            sb.append(name).append(" ").append(kor).append(" ").append(eng).append(" ").append(math).append("\n");
        }

        private int getSum() {
            return this.kor + this.eng + this.math;
        }

        public int compareTo(Score other) {
            return this.getSum() - other.getSum();
        }
    }
}