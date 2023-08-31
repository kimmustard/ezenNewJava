package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAOImpl implements DAO {

	//DB 연결
	private Connection conn;
	
	
	//SQL 구문을 실행시키는 기능을 갖는 객체
	private PreparedStatement pst;
	private String query =""; //쿼리 구문 저장
	
	
	public ProductDAOImpl() {
		DatabaseConnection dbc = DatabaseConnection.getInstance();
		conn = dbc.getConnection();
	}
	
	
	//SQL 구문 처리
	@Override
	public int insert(Product p) {
		System.out.println("insert DAO success!!");
		query ="insert into product (pname, price, madeby) values(?,?,?)";
		
		try {
			//연결정보 가져와서 쿼리를 날린다 라는 뜻
			pst = conn.prepareStatement(query);
			pst.setString(1, p.getPname());
			pst.setInt(2, p.getPrice());
			pst.setString(3, p.getMadeby());
			//excuteQuery() <<결과값 리턴
			//insert, update, delete => executeUpdate() return 건수 int값 반환
			//CREATE / DROP 관련 구문에서는 -1 을 반환
			return pst.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("insert Error!!");
			e.printStackTrace();
			
		}
		return 0;
	}


	@Override
	public List<Product> selectList() {
		System.out.println("list DAO success!!");
		//내림차순 order by 튜플 desc
		query = "select * from product order by pno desc";
		List<Product> list = new ArrayList<>();
		try {
			pst = conn.prepareStatement(query);
			// 객체로 주기때문에 ResultSet으로 줘서 list로 변경해야한다.
			// ResultSet은 SELECT문의 결과를 저장하는 객체입니다.
		    ResultSet rs = pst.executeQuery();
		    while(rs.next()) {
		    	//pno, pname, price
		    	list.add( new Product(
		    			rs.getInt("pno"),
		    			rs.getString("pname"),
		    			rs.getInt("price")));
		    }
		    
		    return list;
		    
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("selectList error");
			e.printStackTrace();
		}
		
		return null;
	}


	@Override
	public Product selectOne(int pno) {
		System.out.println("detail_DAO success!!");
		query = "select * from product where pno = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, pno);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				return new Product(rs.getInt("pno"),
							rs.getString("pname"),
							rs.getInt("price"),
							rs.getString("regdate"),
							rs.getString("madeby"));
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("selectOne error");
			e.printStackTrace();
		}
		
		return null;
	}


	@Override
	public int update(Product p) {
		System.out.println("modify DAO success!!");
		//UPDATE table_name SET name = '테스트 변경', country = '대한민국' WHERE id = 1105;
		//regdate = now() 현재 시간값으로 정렬
		query = "update product set pname = ?, madeby = ?, regdate=now() , price = ? where pno = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, p.getPname());
			pst.setString(2, p.getMadeby());
			pst.setInt(3, p.getPrice());
			pst.setInt(4, p.getPno());
			return pst.executeUpdate();
			
		} catch (SQLException e) {
			// Connection연결 오류 or SQL 구문 오류일때 예외발생
			System.out.println("update error");
			e.printStackTrace();
		}
		
		return 0;
	}


	@Override
	public int delete(int pno) {
		System.out.println("delete DAO success!!");
		//delete from product where pno = ?
		query = "delete from product where pno = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, pno);
			return pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("delete error");
			e.printStackTrace();
		}
		
		return 0;
	}
	
	
	
	

}
