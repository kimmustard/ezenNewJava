package JDBCboard;

import java.util.List;
import java.util.Scanner;

import board.board;

public class BoardController {
	
	
	private Scanner scan;
	private Service svc;
	private boolean flag;
	
	
	
	public BoardController() {
		scan = new Scanner(System.in);
		svc = new BoardServiceImpl();
		flag = true;
		printMenu();
		
	}
	
	
	private void printMenu() {
		while(flag) {
		System.out.println("-----------게시판 프로그램 ----------");
		System.out.println("1. 글쓰기|2. 글목록|3. 게시글조회");
		System.out.println("4. 글수정|5. 글삭제|6. 종료");
		System.out.print("메뉴선택> ");
		int menu = scan.nextInt();
		
		switch(menu) {
		
		case 1: 
			register();
			break;
		case 2: 
			list();
			break;
		case 3: 
			detail();
			break;
		case 4: 
			modify();
			break;
		case 5: 
			remove();
			break;
		default:
			flag=false;
			break;
		
		
		}
		}
		
	}


	private void remove() {
		System.out.println("삭제번호>");
		int bno = scan.nextInt();
		
		int isOk = svc.remove(bno);
		System.out.println("수정완료" +((isOk > 0) ? "성공" : "실패" ));
	}


	private void modify() {
		System.out.println("수정번호>");
		int bno = scan.nextInt();
		
		System.out.println("수정할 제목> ");
		String title = scan.next();
		
		System.out.println("수정할 작성자> ");
		String writer = scan.next();
		
		System.out.println("수정할 내용> ");
		scan.nextLine();
		String content = scan.nextLine();
		
		BoardVO b = new BoardVO(bno, title, writer, content);
		int isOk = svc.modify(b);
		System.out.println("수정완료" +((isOk > 0) ? "성공" : "실패" ));
	}


	private void detail() {
		
		System.out.println("확인번호>");
		int bno = scan.nextInt();
		
		BoardVO b = svc.detail(bno);
		b.printDetail();
	}


	private void list() {
		List<BoardVO> list = svc.list();
		
		for(BoardVO b : list) {
			System.out.println(b);
		}
	}


	private void register() {
		System.out.println("제목>>");
		String title = scan.next();
		System.out.println("작성자>>");
		String writer = scan.next();
		System.out.println("내용>>");
		scan.nextLine(); //위쪽 공백처리
		String content = scan.nextLine();
		
		BoardVO b = new BoardVO(title, writer, content);
		
		int isOk = svc.register(b);
		System.out.println("등록완료" +((isOk > 0) ? "성공" : "실패" ));
	}
	
}
