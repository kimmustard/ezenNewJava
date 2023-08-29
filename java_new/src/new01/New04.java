package new01;

import java.util.HashMap;
import java.util.Scanner;

public class New04 {

	public static void main(String[] args) {
		/*
		 * 단어장
		 * 
		 * 단어 : 의미 map으로 생성 입력 받을 단어의 개수를 받아서 그 만큼 map에 추가 콘솔에 찍기
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		HashMap<String, String> voca = new HashMap<>();
		System.out.print("단어 입력받을 개수> ");
		int num = scan.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.print("단어 입력>");
			String word = scan.next();

			System.out.print("뜻 입력>");
			String mean = scan.next();

			voca.put(word, mean);
		}

		System.out.println("=====단어 출력====");
		voca.forEach((word, mean) -> {
			System.out.println("단어: " + word + " | " + "뜻: " + mean);
		});

	}

}
