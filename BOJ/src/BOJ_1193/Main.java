package BOJ_1193;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int X;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		X = Integer.parseInt(br.readLine());
		
		// n(n+1)/2 를 사용해서 X가 위치하는 n을 구하고, 거기서 부터 시작
		for (int i = 0; i < X; i++) {
			if ( i*(i+1) / 2 < X && (i+2)*(i+1) / 2 >= X ) {
				// i + 1 번째 라인에 값이 존재한다
				// i + 1 번째 라인의 좌표 합은 i + 2 이다
				// 해당 라인에서 몇 번째 위치인지 파악
				int count = X - i*(i+1) / 2;
				
				// i가 홀수이냐 짝수이냐에 따라 방향이 결정됨
				if ( (i+1) % 2 == 0 ) {
					// 짝수의 경우, 정방향 | 정방향의 경우, count수 만큼, 좌표 앞자리가 정해진다
					System.out.println(count + "/" + (i + 2 - count));
				} else {
					// 홀수의 경우, 역방향 | 역방향의 경우, count수 만큼, 좌표 뒷자리가 정해진다
					System.out.println((i + 2 - count) + "/" + count);
				}
				break;
			}
		}
		
	}

}
