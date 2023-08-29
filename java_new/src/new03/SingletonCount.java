package new03;

import java.util.Calendar;

public class SingletonCount {

	public static void main(String[] args) {
		
		//객체를 두개 
		
		Counter c = Counter.getInstance();
		Counter c2 = Counter.getInstance();
		
		
		System.out.println(c.countMethod());
		System.out.println(c2.countMethod());
		
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		
		
	}

}




class Counter{
	//싱글톤으로 객체 만들기
	private static Counter instance;
	private int count;
	
	//private 생성자
	private Counter() {
		
	}
	
	
	//getInstance()
	

	public static Counter getInstance() {
		if(instance == null) {
			instance = new Counter();
		}
		return instance;
	}
	
	// count() 멤버 변수의 count가 1씩증가
	public int countMethod() {
		count++;
		return count;
	}
	
	
}