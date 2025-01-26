import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String x = st.nextToken();
        String y = st.nextToken();

        int a = x.length();
        int b = y.length();

        System.out.println(a == b ? "same" : a > b ? x + " " + a : y + " " + b);
    }
}