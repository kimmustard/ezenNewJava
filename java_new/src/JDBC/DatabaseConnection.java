package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


//DB 연결
public class DatabaseConnection {
	
	// DB 접속
	// DB Driver, Url, user, password
	// com.mysql.cj.jdbc.Driver
	// jdbc:mysql://localhost:3306/productdb
	
	private static DatabaseConnection dbc = new DatabaseConnection();
	private Connection conn = null;
	private String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	private String jdbcUrl = "jdbc:mysql://localhost:3306/productdb";
	
	//생성자를 private 생성
	
	private DatabaseConnection() {
		
		//DB 연결시 반드시 try~catch를 사용해야 함.
		
		
		try {
			Class.forName(jdbcDriver); //드라이버를 로드하기위해 사용되는 메서드
			conn = DriverManager.getConnection(jdbcUrl, "root", "1234"); //url을 연결하기 위한 메서드 url ,user,  password
			
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("드라이버를 찾을 수 없습니다.");
			e.printStackTrace();
		
		} catch (SQLException e) {
			System.out.println("URL, id, password의 연결정보가 정확하지 않습니다.");
			e.printStackTrace();
			
		}
		
	}
	
	
	public static DatabaseConnection getInstance() {
		return dbc;
	}
	
	public Connection getConnection() {
		return conn;
	}
	
}
