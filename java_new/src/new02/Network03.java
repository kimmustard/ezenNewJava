package new02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Network03 {

	public static void main(String[] args){
		//크롤링
		
		
		// https://www.joyu.co.kr/index.html
		URL url = null;
		BufferedReader input = null;
		String addr = "https://www.joyu.co.kr/index.html";
		String line = "";
		
		try {
			url = new URL(addr);
			input = new BufferedReader(new InputStreamReader(url.openStream()));
			 while((line = input.readLine()) != null) {
				 System.out.println(line);
			 }
			 input.close();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
