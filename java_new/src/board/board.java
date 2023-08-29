package board;

import java.text.SimpleDateFormat;
import java.util.Date;


public class board {

	
	private String name; //작성자
	private String title; // 제목
	private String content; //내용
	private int sequence; //글번호
	private String strNowDate; //날짜
	
	
	public board() {
		Date nowDate = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일(E) HH:mm:ss"); 
	    strNowDate = simpleDateFormat.format(nowDate); 
	}
	
	public board(String name ,String title, String content, int sequence) {
		this.name = name;
		this.title = title;
		this.content = content;
		this.sequence = sequence;
		Date nowDate = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일(E) HH:mm:ss"); 
	    strNowDate = simpleDateFormat.format(nowDate); 
	}


	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public int getSequence() {
		return sequence;
	}



	public void setSequence(int sequence) {
		this.sequence = sequence;
	}



	public String getStrNowDate() {
		return strNowDate;
	}



	public void setStrNowDate(String strNowDate) {
		this.strNowDate = strNowDate;
	}



	
	
	
	
	
	
}
