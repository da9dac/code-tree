import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char[] binaries = br.readLine().toCharArray();

        int n = 0;
        int len = binaries.length;

        for (int i = 0; i < len; i++) {
            int x = binaries[i] - '0';
            n += x * Math.pow(2, len - 1 - i);
        }

        System.out.println(n);
    }
}