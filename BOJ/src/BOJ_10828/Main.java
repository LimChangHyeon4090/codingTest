package BOJ_10828;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	static int N;
	static String op;
	static Stack<Integer> stack = new Stack<>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			op = br.readLine();
			String[] ops = op.split(" ");
			
			// pop, size, empty, top
			if (ops.length == 1) {
				if (op.equals("pop")) {
					if (stack.isEmpty()) {
						System.out.println("-1");
					} else {
						System.out.println(stack.pop());
					}
				} else if (op.equals("size")) {
					System.out.println(stack.size());
				} else if (op.equals("empty")) {
					if (stack.isEmpty()) {
						System.out.println("1");
					} else {
						System.out.println("0");
					}
				} else if (op.equals("top")) {
					if (stack.isEmpty()) {
						System.out.println("-1");
					} else {
						System.out.println(stack.peek());
					}
				}
			}
			// push
			else {
				stack.push(Integer.parseInt(ops[1]));
			}

		}
		
	}

}
