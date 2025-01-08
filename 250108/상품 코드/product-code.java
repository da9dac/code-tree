import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Product a = new Product();
        Product b = new Product(st.nextToken(), Integer.parseInt(st.nextToken()));

        StringBuilder sb = new StringBuilder();

        sb.append(a.toString()).append("\n").append(b.toString());

        System.out.println(sb);
    }

    static class Product {
        String name;
        int code;

        Product() {
            this.name = "codetree";
            this.code = 50;
        }

        Product(String name, int code) {
            this.name = name;
            this.code = code;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();

            sb.append("product ").append(code).append(" is ").append(name);

            return sb.toString();
        }
    }
}