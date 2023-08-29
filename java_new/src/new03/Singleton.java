package new03;

public class Singleton {
	/*
	 * 싱글톤 패턴 : 디자인 패턴 중 하나 
	 * 객체를 공유하고자 할 때 사용
	 * 
	 * */
	
	// 단 1개만 존재 해야하는 객체의 인스턴스를 생성할 때 사용
	
	private static Singleton instance;
	
	// 생성자를 통해서 객체 생성을 막기위해 생성자를 private 설정
	private Singleton() {
		
	};
	
	
	// getInstance 메서드를 사용하여 instance가 생성되지 않았다면 생성해서 리턴 
	// 아니면 기존의 인스턴스를 리턴
	public static Singleton getInstance() {
		if(instance == null) {	//아직 객체가 생성되지 않았습니다.
			instance = new Singleton();
		}
		return instance;
		
	}
	
}
