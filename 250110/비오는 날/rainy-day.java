import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;

        List<Weather> weathers = new ArrayList<>();

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());

            Weather weather = new Weather(st.nextToken(), st.nextToken(), st.nextToken());

            if (weather.weather.equals("Rain")) weathers.add(weather);
        }

        Collections.sort(weathers);

        System.out.println(weathers.get(0).toString());
    }

    static class Weather implements Comparable<Weather> {
        String date;
        String day;
        String weather;

        Weather(String date, String day, String weather) {
            this.date = date;
            this.day = day;
            this.weather = weather;
        }

        public int compareTo(Weather other) {
            return this.date.compareTo(other.date);
        }

        public String toString() {
            return new StringBuilder().append(date).append(" ").append(day).append(" ").append(weather).toString();
        }
    }
}