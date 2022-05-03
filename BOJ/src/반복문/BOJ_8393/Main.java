package 반복문.BOJ_8393;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int n;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		System.out.println(n*(n+1)/2);
	}

}
