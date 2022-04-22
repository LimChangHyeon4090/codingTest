package BOJ_1002;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int T, x1, y1, r1, x2, y2, r2;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			r1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());
			r2 = Integer.parseInt(st.nextToken());
			
			
			// d를 sqrt를 사용해서 구하지 않고 풀어서 사용하는 이유 
			// -> double값의 비교는 부동소수점이라 정확하지 않는 경우가 존재하기 때문
			
			// 수학적인 접근으로 문제 해결	
			// 두 원의 중심이 같고, 반지름이 같다			x1==x2 && y1==y2 && r1==r2
			// 두 원이 만나지 않는 경우
			//		두 원이 멀리 떨어져 있는 경우			(x2-x1)^2 + (y2-y1)^2 > (r1+r2)^2
			//		한 원이 다른 원 안에 있는 경우			(x2-x1)^2 + (y2-y1)^2 < (r2-r1)^2
			// 두 원이 한 점에서 만나는 경우
			// 		내접									(x2-x1)^2 + (y2-y1)^2 == (r2-r1)^2
			//		외접									(x2-x1)^2 + (y2-y1)^2 == (r1+r2)^2
			// 나머지는 두 원이 두 점에서 만나는 경우
			
			int d_pow = (int) ( Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) );
			
			if (x1 == x2 && y1 == y2 && r1 == r2) System.out.println(-1);
			else if (d_pow > Math.pow(r1 + r2, 2)) System.out.println(0);
			else if (d_pow < Math.pow(r2 - r1, 2)) System.out.println(0);
			else if (d_pow == Math.pow(r2 - r1, 2)) System.out.println(1);
			else if (d_pow == Math.pow(r1 + r2, 2)) System.out.println(1);
			else System.out.println(2);
		}
	}

}
