import java.io.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        makeNums(n);

        System.out.println(sb);
    }

    static void makeNums(int n) {
        if (n == 0) {
            return;
        }

        sb.append(n).append(" ");
        
        makeNums(n - 1);

        sb.append(n).append(" ");
    }
}