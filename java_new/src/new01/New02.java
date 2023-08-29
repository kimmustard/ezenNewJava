package new01;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class New02 {

	public static void main(String[] args) {
	
		/*
		 * 	for문을 이용하여 1~10가지중에 짝수만 출력
		 * 
		 * 	1부터 내가 입력한 수까지 5의 배수를 출력
		 * 
		 * */
		
		System.out.println("====1~10중에 짝수만 출력====");
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) {
				System.out.print(i+ " ");
			}
		}
		
		System.out.println();
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 입력>");
		int num = scan.nextInt();
		

		
//		
//		
//		int[] arr = new int[num];
//		for(int i=1; i<=num; i++) {
//			arr[i] = i;
//		}
//		
//		
//		Stream<Integer> test = Arrays.stream(arr)
//				.filter(n -> n%5 ==0)
//				.collect(collectors.toList);
//									
//								
//		
		
		
		
//		System.out.println("====5의 배수 출력====");
//		for(int i=1; i<=num; i++) {
//			if(i%5== 0) {
//				System.out.print(i + " ");
//			}
//		}
//		
//		
//		
		
	}

}
