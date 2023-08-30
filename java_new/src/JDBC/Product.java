package JDBC;

public class Product {
/*
 * 번호(pno) : 자동증가 
	상품명(pname) : String varchar(100)
	가격(price) : int
	등록일(regdate) : (default)오늘날짜 설정
	상세설명(madeby) : text
 * 

 * */
	
	private int pno; //자동증가 시퀀스
	private String pname;
	private int price;	//default 0 
	private String regdate;	//default now(오늘날짜)
	private String madeby;
	
	//생성자
	public Product() {
		
	}
	
	
	//상품등록 -> pname, price, madeby (pno, regdate 자동등록)
	public Product(String pname, int price, String madeby) {
		this.pname = pname;
		this.price = price;
		this.madeby = madeby;
	}
	
	
	//상품리스트 -> pno, pname, price, regdate
	public Product(int pno, String pname, int price) {
		
		this.pno = pno;
		this.pname = pname;
		this.price = price;

		
	}
	
	
	//상품수정 -> pno, pname, price, madeby
	public Product(int pno, String pname, String madeby, int price) {
		this(pname,price,madeby);
		this.pno = pno;
		

	}
	
	//상품상세 -> pno, pname, price, legdate, madeby
	public Product(int pno, String pname, int price, String regdate, String madeby) {
		this(pno, pname, price);
		this.regdate = regdate;
		this.madeby = madeby;
	}
	

	

	public int getPno() {
		return pno;
	}



	public void setPno(int pno) {
		this.pno = pno;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getRegdate() {
		return regdate;
	}


	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}


	public String getMadeby() {
		return madeby;
	}


	public void setMadeby(String madeby) {
		this.madeby = madeby;
	}


	@Override
	public String toString() {
		return "Product [pno=" + pno + ", pname=" + pname + ", price=" + price + ", regdate=" + regdate + ", madeby="
				+ madeby + "]";
	}
	
	
	
	
	
	
	
	
	
}
