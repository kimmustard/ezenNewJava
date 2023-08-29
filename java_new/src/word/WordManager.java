package word;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordManager {
	private ArrayList<Word> voca = new ArrayList<>();


	public void insertVoca(Scanner scan) {
		
		System.out.print("등록 단어 입력>");
		String word = scan.next();

		System.out.print("등록 뜻 입력>");
		String mean = scan.next();
		
		voca.add(new Word(word, mean));
		
	}

	public void searchVoca(Scanner scan) {
		
		System.out.print("찾을 단어 입력>");
		String word = scan.next();
		
		for(int i=0; i<voca.size(); i++) {
			if(voca.get(i).getWord().equals(word)) {
				System.out.println(voca.get(i).getWord() +":"+ voca.get(i).getMean());
				return;
			}
		}
		System.out.println("검색 결과가 없습니다.");
		
		
		
	}

	public void updateVoca(Scanner scan) {
		
		System.out.print("수정할 단어 입력>");
		String word = scan.next();
		
		for(int i=0; i<voca.size(); i++) {
			if(voca.get(i).getWord().equals(word)) {
				System.out.print("바꿀 단어>");
				String tempWord = scan.next();
				System.out.print("바꿀 뜻>");
				String tempMean = scan.next();
				voca.get(i).setWord(tempWord);
				voca.get(i).setMean(tempMean);
				System.out.println("수정완료!");
				return;
			}
		}
		System.out.println("검색 결과가 없습니다.");
		
	}
	public void filePrint() throws IOException {
		
		//파일로 출력
		FileWriter fw = new FileWriter("word.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		StringBuffer sb = new StringBuffer();
		
		
		String data = ""; 
		int cnt = 0;
		
		
		while(cnt < voca.size()) {	//리스트가 모두 소진될때까지
			
			sb.append(voca.get(cnt).toString());
			sb.append("\r\n");	//줄바꿈
			data = sb.toString();
			cnt++;
			
		}
		System.out.println(data);
		fw.write(data);
		fw.close();

		
		
	}
	
	

	public void printVoca() {
		System.out.println("----단어장----");
		voca.forEach(i -> System.out.println(i.getWord() + ":" + i.getMean()));
	
	}

	
	
	
	
	
	
	
	
	
}
