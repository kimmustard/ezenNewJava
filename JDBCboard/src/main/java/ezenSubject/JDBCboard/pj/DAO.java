package ezenSubject.JDBCboard.pj;

import java.util.List;

public interface DAO {

	int insert(BoardVO b);

	List<BoardVO> selectlist();

	BoardVO selectOne(int bno);

	int update(BoardVO b);

	int delete(int bno);

	int readCount(int bno);

}
