import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Student[] students =  new Student[5];

        for (int i = 0 ; i < 5; i++) {
            st = new StringTokenizer(br.readLine());

            students[i] = new Student(st);
        }

        Arrays.sort(students);

        sb.append("name").append("\n");

        for (Student student : students) {
            student.appendTo(sb);
        }

        Arrays.sort(students, (a, b) -> {
            return b.height - a.height;
        });

        sb.append("\n").append("height").append("\n");

        for (Student student : students) {
            student.appendTo(sb);
        }

        System.out.println(sb);
    }

    static class Student implements Comparable<Student> {
        String name;
        int height;
        double weight;

        Student(StringTokenizer st) {
            this.name = st.nextToken();
            this.height = Integer.parseInt(st.nextToken());
            this.weight = Double.parseDouble(st.nextToken());
        }

        public void appendTo(StringBuilder sb) {
            sb.append(name).append(" ").append(height).append(" ").append(weight).append("\n");
        }

        public int compareTo(Student other) {
            return this.name.compareTo(other.name);
        }
    }
}
