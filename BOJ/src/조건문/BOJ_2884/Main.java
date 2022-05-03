package 조건문.BOJ_2884;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int H, M;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		H = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		if (M >= 45) System.out.println(H + " " + (M-45));
		else System.out.println(Math.floorMod(H-1, 24) + " " + Math.floorMod(M-45, 60));
	}

}
