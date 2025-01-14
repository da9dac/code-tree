import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        Student[] students =  new Student[n];

        for (int i = 0 ; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            students[i] = new Student(st, i + 1);
        }

        Arrays.sort(students);

        for (Student student : students) {
            student.appendTo(sb);
        }

        System.out.println(sb);
    }

    static class Student implements Comparable<Student> {
        int num;
        int height;
        int weight;

        Student(StringTokenizer st, int num) {
            this.num = num;
            this.height = Integer.parseInt(st.nextToken());
            this.weight = Integer.parseInt(st.nextToken());
        }

        public void appendTo(StringBuilder sb) {
            sb.append(height).append(" ").append(weight).append(" ").append(num).append("\n");
        }

        public int compareTo(Student other) {
            return other.height != this.height ? other.height - this.height : 
                    other.weight != this.weight ? other.weight - this.weight : this.num - other.num;
        }
    }
}
