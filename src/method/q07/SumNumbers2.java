package method.q07;

public class SumNumbers2 {
	public static void main(String[] args) {

		double a = 5;
		double b = 3.3;

		double result = calculateSum(5, 3.3);
		System.out.println("第一引数 : " + a);
		System.out.println("第二引数 : " + b);
		System.out.println("加算結果 : " + Math.round(result));
	}

	static double calculateSum(double a, double b) {
		double sum = a + b;
		return sum;
	}
}
