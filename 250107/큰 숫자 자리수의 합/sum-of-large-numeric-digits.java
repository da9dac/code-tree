import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int z = Integer.parseInt(st.nextToken());

        int num = x * y * z;

        System.out.println(solve(num));
    }

    static int solve(int num) {
        if (num == 0) return 0;

        return num % 10 + solve(num / 10);
    }
}