import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        if (n == 0) sb.append(0);

        while (n > 0) {
            int r = n % 2;
            sb.append(r);
            n /= 2;
        }

        System.out.println(sb.reverse().toString());
    }
}