package ezenSubject.JDBCboard.pj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	
	private static DatabaseConnection dbc = new DatabaseConnection();
	private Connection conn = null;	//커넥트 연결 변수
	private String jdbcDriver = "com.mysql.cj.jdbc.Driver";	//드라이버
	private String jdbcUrl = "jdbc:mysql://localhost:3306/productdb";	//mysql URL주소
	
	private DatabaseConnection() {
		
		
		try {
			
			Class.forName(jdbcDriver);
			conn = DriverManager.getConnection(jdbcUrl, "root", "1234");
			
		} catch (ClassNotFoundException e) {
			
			System.out.println("드라이버를 찾을 수 없습니다.");
			e.printStackTrace();
			
		} catch (SQLException e) {
			
			System.out.println("URL, id, password의 연결정보가 정확하지 않습니다.");
			e.printStackTrace();
			
		}
	}
	
	
	//싱글톤 패턴이므로 두개의 get으로 접근한다.
	public static DatabaseConnection getInstance() {
		return dbc;
	}
	//싱글톤 패턴이므로 두개의 get으로 접근한다.
	public Connection getConnection() {
		return conn;
	}
	
}
