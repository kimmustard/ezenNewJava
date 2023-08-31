package JDBCboard;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/main")
public class BoardController {
	

	private Service svc;
	private boolean flag;
	
	
	
	public BoardController() {
		svc = new BoardServiceImpl();
		flag = true;

		
	}
	


	private void remove() {

		int isOk = svc.remove(bno);
		System.out.println("수정완료" +((isOk > 0) ? "성공" : "실패" ));
	}


	private void modify() {
		
		BoardVO b = new BoardVO(bno, title, writer, content);
		int isOk = svc.modify(b);
		System.out.println("수정완료" +((isOk > 0) ? "성공" : "실패" ));
	}


	private void detail() {
		

		
		BoardVO b = svc.detail(bno);
		b.printDetail();
	}


	private void list() {
		List<BoardVO> list = svc.list();
		
		for(BoardVO b : list) {
			System.out.println(b);
		}
	}
	
	
	
	
	
	@GetMapping("/add")
	public void registerForm() {
		
		return
	}

	@PostMapping("/add")
	public void register(Model model) {

		
		BoardVO b = new BoardVO(title, writer, content);
		
		int isOk = svc.register(b);
		System.out.println("등록완료" +((isOk > 0) ? "성공" : "실패" ));
		return
	}
	
}
