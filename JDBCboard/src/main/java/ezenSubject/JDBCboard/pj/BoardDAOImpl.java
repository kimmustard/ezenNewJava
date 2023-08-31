package ezenSubject.JDBCboard.pj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class BoardDAOImpl implements DAO {

	
	//DB연결
	private Connection conn;
	private PreparedStatement pst;
	private String query="";
	

	
	public BoardDAOImpl() {
		//데이터 베이스 객체생성 연결 
		DatabaseConnection dbc = DatabaseConnection.getInstance();
		conn = dbc.getConnection();
	}
	
	
	
	@Override
	public int insert(BoardVO b) {
		System.out.println("insert DAO success!");
		query = "insert board (title, writer, content) value (?,?,?)";
		
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, b.getTitle());
			pst.setString(2, b.getWriter());
			pst.setString(3, b.getContent());
			return pst.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("update error");
			e.printStackTrace();
		}
		
		return 0;
	}



	@Override
	public List<BoardVO> selectlist() {
		System.out.println("list DAO success!");
		query = "select * from board order by bno desc";
		List<BoardVO> list = new ArrayList<>();
		
		try {
			pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				list.add(new BoardVO(
						rs.getInt("bno"),
						rs.getString("title"),
						rs.getString("writer"),
						rs.getString("content"),
						rs.getString("regdate"),
						rs.getInt("readcount")));
		}
			return list;
			
		}catch (SQLException e) {
			// TODO: handle exception
			System.out.println("selectList error");
			e.printStackTrace();
		}
			
		
		return null;
	}



	@Override
	public BoardVO selectOne(int bno) {
		System.out.println("detail_DAO success!");
		
		query = "select * from board where bno = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, bno);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				return new BoardVO(
						rs.getInt("bno"),
						rs.getString("title"),
						rs.getString("writer"),
						rs.getString("content"),
						rs.getString("regdate"),
						rs.getString("moddate"),
						rs.getInt("readcount")
						);
			}
		}catch (SQLException e) {
			// TODO: handle exception
			System.out.println("selectOne error");
			e.printStackTrace();
		}
		
		return null;
	}



	@Override
	public int update(BoardVO b) {
		System.out.println("modify_DAO success!");
		query = "update board set title = ?, writer=?, content=? where bno =?";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, b.getTitle());
			pst.setString(2, b.getWriter());
			pst.setString(3, b.getContent());
			pst.setInt(4, b.getBno());
			return pst.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("update error");
			e.printStackTrace();
		}
		return 0;
	}



	@Override
	public int delete(int bno) {
		System.out.println("delete DAO success!!");
		//delete from product where pno = ?
		query = "delete from board where bno = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, bno);
			return pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("delete error");
			e.printStackTrace();
		}
		return 0;
	}



	@Override
	public int readCount(int bno) {
		query = "update board set readcount = readcount + 1 where bno = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, bno);
			return pst.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
		
	
	}
	


}
