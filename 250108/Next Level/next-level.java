import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        User user = new User();
        sb.append(user.toString()).append("\n");

        StringTokenizer st = new StringTokenizer(br.readLine());

        user.user = st.nextToken();
        user.lv = Integer.parseInt(st.nextToken());

        sb.append(user.toString());

        System.out.println(sb);
    }

    static class User {
        String user;
        int lv;

        User() {
            this.user = "codetree";
            this.lv = 10;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();

            sb.append("user").append(" ").append(user).append(" ").append("lv").append(" ").append(lv);

            return sb.toString();
        }
    }
}