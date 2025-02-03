import java.io.*;
import java.util.*;

public class Main {
	static int[][] map = new int[41][41];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] xys = parseInt(st);
		paint(xys, 1);

		st = new StringTokenizer(br.readLine());
		int[] xyss = parseInt(st);
		paint(xyss, 2);

		System.out.println(solve(xys));
	}

	static int[] parseInt(StringTokenizer st) {
		return new int[]{
				Integer.parseInt(st.nextToken()) + 20,
				Integer.parseInt(st.nextToken()) + 20,
				Integer.parseInt(st.nextToken()) + 20,
				Integer.parseInt(st.nextToken()) + 20
		};
	}

	static void paint(int[] xys, int color) {
		int x1 = xys[0];
		int y1 = xys[1];
		int x2 = xys[2];
		int y2 = xys[3];

		for (int i = y1; i < y2; i++) {
			for (int j = x1; j < x2; j++) {
				map[i][j] = color;
			}
		}
	}

	static int solve(int[] xys) {
		int x1 = xys[0];
		int y1 = xys[1];
		int x2 = xys[2];
		int y2 = xys[3];

		int h = 0;
		int w = 0;

		for (int i = x1; i < x2; i++) {
			int cnt = 0;
			for (int j = y1; j < y2; j++) {
				if (map[j][i] == 1) cnt++;
			}
			h = Math.max(h, cnt);
		}

		for (int i = y1; i < y2; i++) {
			int cnt = 0;
			for (int j = x1; j < x2; j++) {
				if (map[i][j] == 1) cnt++;
			}
			w = Math.max(w, cnt);
		}

		return h * w;
	}
}