package new01;


public class New01 {
	public static void main(String[] args) {
		/*
		 * 홍길동의 주민등록번호는 881122-1234567 출력 형태 => 생년월일 : 881122, 성별 : 남
		 */
		String pin = "881122-1234567";
		String str = pin.substring(0, 6);
		String brith = pin.substring(7, 8);
		String gender = "";
		
		if (brith.equals("1") || brith.equals("3")) {
			gender = "남";
		} else if (brith.equals("2") || brith.equals("4")) {
			gender = "여";
		} else {
			gender = "식별 불가능";
		}

		System.out.println("생년월일: " + str + " | " + "성별: " + gender);
		
		
		
		

	}

}
