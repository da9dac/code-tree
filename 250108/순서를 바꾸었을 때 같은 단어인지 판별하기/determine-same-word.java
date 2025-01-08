import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();

        int[] count = new int[26];

        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i) - 'a']++;
        }

        boolean isEqual = true;

        if (a.length() != b.length()) {
            isEqual = false;
        } else {
            for (int i = 0; i < b.length(); i++) {
                int idx = b.charAt(i) - 'a';
                count[idx]++;
                if (count[idx] < 0) {
                    isEqual = false;
                    break;
                }
            }
        }

        System.out.println(isEqual ? "Yes" : "No");
    }
}