package basic.q08;

import java.util.Scanner;

public class InputProduct {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("商品名を入力してください：");
		
		String input_text = scanner.nextLine();
		
		System.out.println("価格を入力してください：");
		
		String input_text_2 = scanner.nextLine();

		System.out.println("商品名は" + input_text + "です。価格は" +input_text_2 + "円です。");
		
	}
}
