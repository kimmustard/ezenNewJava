package JDBC;

import java.util.List;

public class ProductServiceImpl implements Service {

	private DAO dao;
	
	public ProductServiceImpl() {
		dao = new ProductDAOImpl();	//구현체
	}
	
	
	@Override
	public int register(Product p) {
		// 실제 구현 영역
		System.out.println("register_service success!!");
		//dao에서 사용되는 메서드명은 DB 구문과 비슷하게 하는것이 일반적
		return dao.insert(p);
	}


	@Override
	public List<Product> list() {
		System.out.println("list_service success!!");
		return dao.selectList();
	}


	@Override
	public Product detail(int pno) {
		return dao.selectOne(pno);
	}


	@Override
	public int modify(Product p) {
		System.out.println("modify_service success!!");
		return dao.update(p);
	}


	@Override
	public int delete(int pno) {
		System.out.println("delete_service success!!");
		return dao.delete(pno);
	}

}
