package 조건문.BOJ_14681;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int x, y;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		x = Integer.parseInt(br.readLine());
		y = Integer.parseInt(br.readLine());
		
		if (x > 0 && y > 0) System.out.println("1");
		else if (x < 0 && y > 0) System.out.println("2");
		else if (x < 0 && y < 0) System.out.println("3");
		else if (x > 0 && y < 0) System.out.println("4");
	}

}
