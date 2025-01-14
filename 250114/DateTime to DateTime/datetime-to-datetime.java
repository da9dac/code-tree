import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int day = 1440;
        int hour = 60;

        int start = 11 * day + 11 * hour + 11;
        int end = a * day + b * hour + c;
        int result = end - start;

        System.out.println(result < 0 ? - 1 : result);
    }
}