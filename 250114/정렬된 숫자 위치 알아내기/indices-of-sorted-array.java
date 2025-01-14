import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine().trim());
        st = new StringTokenizer(br.readLine());

        Element[] before = new Element[n];
        Element[] after = new Element[n];

        for (int i = 0; i < n; i++) {
            Element element = new Element(i + 1, Integer.parseInt(st.nextToken()));

            before[i] = element;
            after[i] = element;
        }

        Arrays.sort(after);

        for (int i = 0; i < n; i++) {
            after[i].after = i + 1;
        }

        for (Element element : before) {
            sb.append(element.after).append(" ");
        }

        System.out.println(sb);
    }

    static class Element implements Comparable<Element> {
        int before;
        int num;
        int after;

        Element(int before, int num) {
            this.before = before;
            this.num = num;
        }

        public int compareTo(Element other) {
            return this.num != other.num ? this.num - other.num : this.before - other.before;
        }
    }
}