package BOJ_1212;
/*
 * 	숫자 자릿수가 333334 를 넘지 않는다
 * 	즉, 숫자 변수를 사용해서 문제를 해결할 수 없다는 것
 * 	String으로 사용한 다음, 각 자리를 잘라서 변환을 해주여야 한다
 * 	2진수와 8진수의 관계이기 때문에 가능한 문제
 * 
 * 	8진수의 값을 3자리 2진수 값으로 치환하여 문제를 해결한다
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static String o;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		o = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < o.length(); i++) {
			String s = o.substring(i, i+1);
			sb.append(String.format("%03d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(s, 8)))));
		}
		
		if (sb.substring(0, 3).equals("000")) System.out.println("0");
		else if (sb.substring(0, 2).equals("00")) System.out.println(sb.substring(2, sb.length()));
		else if (sb.substring(0, 1).equals("0")) System.out.println(sb.substring(1, sb.length()));
		else System.out.println(sb.toString());
	}

}
