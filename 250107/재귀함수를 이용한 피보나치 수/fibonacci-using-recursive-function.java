import java.io.*;

public class Main {

    static int[] arr = new int[21];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        arr[1] = arr[2] = 1;

        System.out.println(fibo(n));
    }

    static int fibo(int n) {
        if (arr[n] != 0) {
            return arr[n];
        }

        return fibo(n - 1) + fibo(n - 2);
    }
}