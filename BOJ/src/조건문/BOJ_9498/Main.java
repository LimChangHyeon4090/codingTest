package 조건문.BOJ_9498;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int N;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		if (N >= 90 && N <= 100) System.out.println("A");
		else if (N >= 80 && N < 90) System.out.println("B");
		else if (N >= 70 && N < 80) System.out.println("C");
		else if (N >= 60 && N < 70) System.out.println("D");
		else System.out.println("F");
	}

}
