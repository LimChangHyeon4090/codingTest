package 반복문.BOJ_2439;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static int N;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());
		
		int count = 0;
		while(N != count) {
			for (int i = 0; i < N - count - 1; i++) {
				bw.write(" ");
			}
			for (int i = N - count - 1; i < N; i++) {
				bw.write("*");
			}
			count++;
			bw.write("\n");
		}
		
		
		bw.flush();
		bw.close();
		br.close();
	}

}
