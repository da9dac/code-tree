import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] counts = new int[101];

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            counts[Integer.parseInt(st.nextToken())]++;
        }

        st = new StringTokenizer(br.readLine());

        boolean isEqual = true;

        for (int i = 0; i < n; i++) {
            int idx = Integer.parseInt(st.nextToken());
            counts[idx]--;

            if (counts[idx] < 0) {
                isEqual = false;
                break;
            }
        }

        System.out.println(isEqual ? "Yes" : "No");
    }
}