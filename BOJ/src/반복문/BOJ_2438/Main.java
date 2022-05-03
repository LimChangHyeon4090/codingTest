package 반복문.BOJ_2438;

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
		while(count != N) {
			
			for (int i = 0; i <= count; i++) {
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
