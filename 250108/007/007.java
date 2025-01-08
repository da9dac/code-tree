import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        ZZS zzs = new ZZS(st.nextToken(), st.nextToken(), Integer.parseInt(st.nextToken()));

        StringBuilder sb = new StringBuilder();

        sb.append("secret code : ").append(zzs.secret).append("\n")
            .append("meeting point : ").append(zzs.where).append("\n")
            .append("time : ").append(zzs.hour);

        System.out.println(sb);
    }

    static class ZZS {
        String secret;
        String where;
        int hour;

        ZZS(String secret, String where, int hour) {
            this.secret = secret;
            this.where = where;
            this.hour = hour;
        }
    }
}