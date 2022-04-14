package BOJ_1076;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static String[] color = new String[3];
	static long answer;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		color[0] = br.readLine();
		color[1] = br.readLine();
		color[2] = br.readLine();
		
		switch(color[0]) {
		case "black": answer += 0*10; break;
		case "brown": answer += 1*10; break;
		case "red": answer += 2*10; break;
		case "orange": answer += 3*10; break;
		case "yellow": answer += 4*10; break;
		case "green": answer += 5*10; break;
		case "blue": answer += 6*10; break;
		case "violet": answer += 7*10; break;
		case "grey": answer += 8*10; break;
		case "white": answer += 9*10; break;
		}
		
		switch(color[1]) {
		case "black": answer += 0; break;
		case "brown": answer += 1; break;
		case "red": answer += 2; break;
		case "orange": answer += 3; break;
		case "yellow": answer += 4; break;
		case "green": answer += 5; break;
		case "blue": answer += 6; break;
		case "violet": answer += 7; break;
		case "grey": answer += 8; break;
		case "white": answer += 9; break;
		}
		
		switch(color[2]) {
		case "black": answer *= 1; break;
		case "brown": answer *= 10; break;
		case "red": answer *= 100; break;
		case "orange": answer *= 1000; break;
		case "yellow": answer *= 10000; break;
		case "green": answer *= 100000; break;
		case "blue": answer *= 1000000; break;
		case "violet": answer *= 10000000; break;
		case "grey": answer *= 100000000; break;
		case "white": answer *= 1000000000; break;
		}
		
		System.out.println(answer);
	}

}
