import java.io.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        print(Integer.parseInt(br.readLine()));

        System.out.println(sb);
    }

    static void print(int n) {
        if (n == 0) {
            return;
        }

        sb.append("HelloWorld").append("\n");

        print(n - 1);
    }
}