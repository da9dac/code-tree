import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String t = st.nextToken();

        List<String> list = new ArrayList<>();

        while (n-- > 0) {
            String word = br.readLine();

            if (word.startsWith(t)) list.add(word);
        }

        Collections.sort(list);

        System.out.println(list.get(k - 1));
    }
}