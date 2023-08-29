package new01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Stream;

public class New03 {

	public static void main(String[] args) {
		
		
		/*
		 * 	컬렉션 프레임 워크
		 *  - List : 순서를 보장, 중복저장 가능
		 *  - Set : 순서보장 X , 중복허용 X
		 *  - Map : 2가지 데이터를 쌍으로 저장, 순서보장x
		 * 	- key(중복불가능), value(중복가능)
		 * */
		
		//리스트를 생성하고, 1~10까지 등록한 후 출력
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1; i<=10; i++) {
			list.add(i);
		}
		
		System.out.println(list);
		
//		for(Integer tmp : list) {
//			System.out.println(tmp + " ");
//			
//		}
//		
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		Stream<Integer> test = list.stream();		
		test.forEach(n -> System.out.print(n+ " "));
		System.out.println();
		System.out.println("----------------------------------");
		
		//정수를 입력 받아서 입력받은 만큼 오늘의 할일을 입력하고 출력
		//기존 리스트를 비우고 입력받기
//		ArrayList<String> strList = new ArrayList<>();
//
//		
//		
//		System.out.print("오늘 할일의 숫자> ");
//		int num = scan.nextInt();
//		
//	
//		for(int i=0; i<num; i++) {
//			System.out.print((i+1)+"개 할일입력> ");
//			String str = String.valueOf(i+1+". ");
//			str += scan.next();
//			strList.add(str);
//		}
//		
//		System.out.println("=== 오늘 할일 ===");
//		Stream<String> toDaySchedule = strList.stream();
//		toDaySchedule.forEach(n -> System.out.println(n));
		
		
		
		
		
		
		
		/*
		 * Map을 이용하여 이름 : 점수 형태로 3명만 입력
		 * */
		
		
		HashMap<String,Integer> scores = new HashMap<>();
		
		for(int i=0; i<3; i++) {
			
			System.out.print("이름>");
			String name = scan.next();
			System.out.print("점수>");
			int score = scan.nextInt();
			scores.put(name, score);
			
			
		}
		
		
//		//향샹된 for문
//		for(String name : scores.keySet()) {
//			int score = scores.get(name);
//			System.out.println(name + ":" + score);
//		}
//		
//		
//		//iterator
//		Iterator<String> iter = scores.keySet().iterator();
//		while(iter.hasNext()) {
//			String name = iter.next();
//			int score = scores.get(name);
//			
//			sum += score;
//			System.out.println(name + ":" + score);
//			
//		}
//		double avg =(double) sum / 3;
//		System.out.println("총합 : "+ sum);
//		System.out.println("평균 : "+ avg);
//		
		
		System.out.println("------ 점수 내역 ------");
		int sum = 0;
		
		//람다식 forEach 이용
		scores.forEach((name, score)-> {
			System.out.println(name+" : "+score);
		});
		
		
		
		
		
		
		
	}

}
