package method.q10;

public class EvenNumber {
	public static void main(String[] args) {
		int[] array = { 3, 2, 5, 6, 7, 25, 10, 51, 88, 98 };

		int result = getEvenNumbers(3, 2, 5, 6, 7, 25, 10, 51, 88, 98);
		System.out.println("[3, 2, 5, 6, 7, 25, 10, 51, 88, 98]には、偶数が" + result + "個あります。");
	}

	private static int getEvenNumbers(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j) {
		int[] array = { 3, 2, 5, 6, 7, 25, 10, 51, 88, 98 };
		int count = 0;
		for (int n = 0; n < array.length; n++) {
			if (array[n] % 2 == 0) {
				count++;
			}
		}
		return count;
	}
}