import java.io.*;

public class Main {

    static int[] nums;
    static int len;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] charNums = br.readLine().toCharArray();
        len = charNums.length;

        nums = new int[len];

        for (int i = 0; i < len; i++) {
            nums[i] = charNums[i] - '0';
        }

        System.out.println(solve(0));
    }

    static int solve(int cur) {
        if (cur == len) {
            return 0;
        }

        return (nums[cur] * nums[cur]) + solve(cur + 1);
    }
}