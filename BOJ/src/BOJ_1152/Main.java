package BOJ_1152;
/*
 * 	split을 사용해서 문제를 해결하는 경우, 공백을 입력했을 때, 1이라는 값이 출력된다
 * 	그 이유는, 공백을 입력하거나 하면 trim()에 의해서 공백이 사라진다
 * 	그리고 남는 것은 빈 문자열이 남게된다
 * 	이것은 null과는 다르다
 * 	null은 할당 자체가 되지 않았다는 의미이지만, 빈 문자열은 변수 안에 빈 문자열이 저장되어 있다는 의미이다
 * 	그렇기 때문에 우리가 생각한 대로 동작하지 않고, 1이라는 값이 출력된다
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		System.out.println(st.countTokens());
	}

}
