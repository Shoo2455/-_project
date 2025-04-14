package method.q10;

import java.util.Arrays;

public class EvenNumber {
	public static void main(String[] args) {
		int[] src = { 3, 2, 5, 6, 7, 25, 10, 51, 88, 98 };

		int result = getEvenNumbers(src);
		System.out.println(Arrays.toString(src) + "には、偶数が" + result + "個あります。");
	}

	private static int getEvenNumbers(int[] src) {
		int count = 0;
		for (int n = 0; n < src.length; n++) {
			if (src[n] % 2 == 0) {
				count++;
			}
		}
		return count;
	}
}