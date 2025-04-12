package method.q08;

public class SumLoop {
	public static void main(String[] args) {
		int m = 1;
		int M = 100;

		int result = sumLoop(1, 100);
		System.out.println("最小値 : " + m);
		System.out.println("最大値 : " + M);
		System.out.println("加算結果 : " + result);
	}

	static int sumLoop(int m, int M) {
		int sum = 0;
		for (int i = m; i <= M; i++) {
			sum = sum + i;

		}
		return sum;
	}
}