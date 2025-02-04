import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = br.readLine().length();
        int y = br.readLine().length();
        int z = br.readLine().length();

        int min = Math.min(x, Math.min(y, z));
        int max = Math.max(x, Math.max(y, z));

        System.out.println(max - min);
    }
}