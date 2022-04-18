package BOJ_1252;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	static BigInteger n, m;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = new BigInteger(st.nextToken(), 2);
		m = new BigInteger(st.nextToken(), 2);

		BigInteger sum = n.add(m);
		
		System.out.println(sum.toString(2));
	}

}
