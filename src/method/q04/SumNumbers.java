package method.q04;

public class SumNumbers {
	public static void main(String[] args) {

		int a = 3;
		int b = 2;

		int result = calculateSum(3, 2);
		System.out.println("第一引数 : " + a);
		System.out.println("第二引数 : " + b);
		System.out.println("加算結果 : " + result);
	}

	static int calculateSum(int a, int b) {
		int sum = a + b;
		return sum;
	}
}