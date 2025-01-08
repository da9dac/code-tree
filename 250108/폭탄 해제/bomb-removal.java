import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Bomb bomb = new Bomb(st.nextToken(), st.nextToken(), Integer.parseInt(st.nextToken()));

        System.out.println(bomb.toString());
    }

    static class Bomb {
        String code;
        String color;
        int second;

        Bomb(String code, String color, int second) {
            this.code = code;
            this.color = color;
            this.second = second;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();

            sb.append("code : ").append(code).append("\n")
                .append("color : ").append(color).append("\n")
                .append("second : ").append(second);

            return sb.toString();
        }
    }
}