package BOJ_1085;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int x, y, w, h, answer;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		w = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		
		answer = Integer.MAX_VALUE;
		answer = Math.min(answer, x);
		answer = Math.min(answer, w-x);
		answer = Math.min(answer, y);
		answer = Math.min(answer, h-y);
		
		System.out.println(answer);
	}

}
