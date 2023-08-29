package board;

import java.util.Scanner;

public class boardMain {

	public static void main(String[] args) {
		
	
		Scanner scan = new Scanner(System.in);
		boardManager bm = new boardManager();
		boolean run = true;
		
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1.등록|2.조회|3.수정|4.삭제|5.목록보기|6.종료");
			System.out.println("------------------------------------");
			System.out.print("입력> ");
			int menu = scan.nextInt();
			String temp = scan.nextLine();
			
			
			
			switch(menu) {
			
			case 1: 
				bm.addBoard(scan);
				break;
			case 2: 
				bm.searchBoard(scan);
				break;
			case 3: 
				bm.modifyBoard(scan);
				break;
			case 4: 
				bm.removeBoard(scan);
				break;
			case 5: 
				bm.printBoard();
				break;
			case 6: 
				
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("메뉴를 정확히 입력해 주세요.");
			
			
			
			
			}
			
		}
		
		
		
	}

}
