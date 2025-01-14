import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] binaries = br.readLine().toCharArray();
        int len = binaries.length;

        int num = 0;

        for (int i = 0; i < len; i++) {
            int x = binaries[i] - '0';
            num += x * Math.pow(2, len - 1 - i);
        }

        num *= 17;

        if (num == 0) {
            System.out.println(0);
        } else {
            StringBuilder sb = new StringBuilder();

            while (num > 0) {
                int r = num % 2;
                sb.append(r);
                num /= 2;
            }

            System.out.println(sb.reverse().toString());
        }
    }
}