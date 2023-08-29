package word;

import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) {

		/*
		 * 단어장 프로그램 작성
		 * word 클래스 생성
		 * 단어, 의미
		 * 메뉴 
		 * 1.단어등록
		 * 2.단어검색
		 * 3.단어수정
		 * 4.단어출력
		 * 
		 * 
		 * ArrayList<Word>
		 * 
		 * */

		
	
		Scanner scan = new Scanner(System.in);
		WordManager wd = new WordManager();
		boolean run = true;
		
		
		while(run) {
			
			System.out.println("=========================");
			System.out.println("1.단어등록|2.단어검색|3.단어수정");
			System.out.println("4.단어출력|5.파일출력|6.종료");
			System.out.println("=========================");
	        System.out.print("메뉴> ");
	        int menu = scan.nextInt();

	        
	        try {
	        	
	       
		        switch(menu) {
		        
		        case 1:
		        	wd.insertVoca(scan);
		        	break;
		        case 2:
		        	wd.searchVoca(scan);
		        	break;
		        case 3:
		        	wd.updateVoca(scan);
		        	break;
		        case 4:
		        	wd.printVoca();
		        	break;
		        case 5:
					wd.filePrint();
					break;
				case 6:
					System.out.println("프로그램을 종료합니다.");
					run = false;
					break;
				default:
					System.out.println("메뉴를 정확히 입력해주세요.");
				}
	        
	        }catch (Exception e) {
	        	
	        }
			
		}
		
		
		
		
		
		
		
		

		
	}

}
