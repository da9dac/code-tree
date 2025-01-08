import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] chs = br.readLine().toCharArray();
        Arrays.sort(chs);

        System.out.println(new String(chs));
    }
}