package BOJ_1297;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int D, H, W;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		D = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		W = Integer.parseInt(st.nextToken());

		// 실제 대각길이 D, 높이 대 너비 비율 H : W
		// D^2 = (HX)^2 + (WX)^2 = X^2 * ( H^2 + W^2 )
		// 우리가 구하고자 하는 것은 실제 높이와 길이
		// 즉, HX, WX 를 구하려고 한다
		// X = D^2 / (H^2 + W^2)
		
		// 실제 높이나 너비가 소수점이 나오면, 그 수보다 작으면서 가장 큰 정수 -> floor
		double X = Math.pow((double) D*D /(H*H + W*W), 0.5);
		System.out.println((int)(H * X) + " " + (int)(W * X));
	}

}
