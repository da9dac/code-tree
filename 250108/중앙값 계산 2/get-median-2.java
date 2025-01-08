import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> list = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st.nextToken()));

            if (i % 2 == 0) {
                Collections.sort(list);
                sb.append(list.get(list.size() / 2)).append(" ");
            }
        }

        System.out.println(sb);
    }
}