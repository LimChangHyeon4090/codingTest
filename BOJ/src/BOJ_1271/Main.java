package BOJ_1271;
/*
 * 	int나 long으로 표현하기 힘들 정도로 큰 숫자를 다룰 때는, BigInteger를 사용한다
 * 	java.math 패키지에 포함되어있는 클래스
 * 	add, substract, multiply, divide, remainder 같은 연산들 역시 사용할 수 있다
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	static BigInteger n, m;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = new BigInteger(st.nextToken());
		m = new BigInteger(st.nextToken());
		
		System.out.println(n.divide(m));
		System.out.println(n.remainder(m));
	}

}
