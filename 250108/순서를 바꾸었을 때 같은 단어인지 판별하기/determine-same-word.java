import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();

        int[] count = new int[26];

        for (int i = 0; i < n; i++) {
            count[a.charAt(i) - 'a']++;
        }

        boolean isEqual = true;

        for (int i = 0; i < n; i++) {
            int idx = a.charAt(i) - 'a';
            count[idx]++;
            if (count[idx] < 0) {
                isEqual = false;
                break;
            }
        }

        System.out.println(isEqual ? "Yes" : "No");
    }
}