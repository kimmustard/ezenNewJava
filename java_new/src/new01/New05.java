package new01;

import java.util.HashMap;
import java.util.Scanner;

public class New05 {

	public static void main(String[] args) {

		/*
		 * 	New04의 내용을 메서드로 분리
		 * 
		 * */
		HashMap<String, String> voca = convert();
		
		
		voca.forEach((key,value) -> {
			System.out.println(key + ":" + value);
		});
		
		
	}
	
	/* 기능 : 단어:의미를 입력 받아서 map을 구성
	 * 리턴 : map
	 * */
	
	public static HashMap<String, String> convert(){
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
		
		return voca;
	}

}
