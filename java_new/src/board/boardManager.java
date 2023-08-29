package board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class boardManager implements boardAdapter{

	private List<board> boardList = new ArrayList<>();
	private int sequence = 1;
	
	
	@Override
	public void addBoard(Scanner scan) {
	
		
		System.out.print("작성자>");
		String name = scan.nextLine();
		
		System.out.print("입력 제목>");
		String title = scan.nextLine();
		
		System.out.print("입력 내용>");
		String content = scan.nextLine();
		
		
		
		boardList.add(new board(name ,title, content, sequence++));
		
	}

	@Override
	public void searchBoard(Scanner scan) {
		System.out.print("조회할 게시글 번호>");
		int num = scan.nextInt();
		
		for(int i=0; i<boardList.size(); i++) {
			if(boardList.get(i).getSequence() == num) {
				
				System.out.println("글번호 : "+boardList.get(i).getSequence());
				System.out.println("글제목 : "+boardList.get(i).getTitle());
				System.out.println("내용 : "+boardList.get(i).getContent());
				System.out.println("날짜 : "+boardList.get(i).getStrNowDate());
				return;
				
			}
			System.out.println("게시글 정보가 없습니다");
		
		}
		
		
	}

	@Override
	public void modifyBoard(Scanner scan) {
		System.out.print("수정할 게시글 번호>");
		int num = scan.nextInt();
		
		for(int i=0; i<boardList.size(); i++) {
			if(boardList.get(i).getSequence() == num) {
				
				System.out.print("변경할 제목>");
				String title = scan.nextLine();
				System.out.print("변경할 내용>");
				String content = scan.nextLine();
				
				boardList.get(i).setTitle(title);
				boardList.get(i).setContent(content);
				
				System.out.println("---------  변경된 게시글 내역 -------");
				System.out.println("글제목 : "+boardList.get(i).getTitle());
				System.out.println("내용 : "+boardList.get(i).getContent());
				return;
				
			}
			System.out.println("게시글 정보가 없습니다");
		
		}
		
	}

	@Override
	public void removeBoard(Scanner scan) {
		
		System.out.print("삭제할 게시글 번호>");
		int num = scan.nextInt();
		
		for(int i=0; i<boardList.size(); i++) {
			if(boardList.get(i).getSequence() == num) {
				
				boardList.remove(i);
				System.out.println("삭제완료");
				return;
				
			}
		
		}
		System.out.println("게시글 정보가 없습니다");
		
		
	}

	@Override
	public void printBoard() {
		System.out.println("------------------ 게시글 목록 ------------------");
		for(int i=0; i<boardList.size(); i++) {
			System.out.println("번호 : "+boardList.get(i).getSequence());
			System.out.println("글제목 : "+boardList.get(i).getTitle());
			System.out.println("--------------------------------------------");
		}
		
	}

}
