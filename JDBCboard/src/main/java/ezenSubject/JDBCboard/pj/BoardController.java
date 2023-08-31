package ezenSubject.JDBCboard.pj;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BoardController {
	

	private Service svc;
	private boolean flag;
	
	
	
	public BoardController() {
		svc = new BoardServiceImpl();
		flag = true;
	}
	



	@GetMapping("hello")
	public String hello(Model model) {
		
		model.addAttribute("data", "hello");
		return "hello";
	}
	
	@GetMapping("board")
	public String board(Model model) {
		List<BoardVO> list = svc.list();
		model.addAttribute("BoardVO", list);
		return "board";
	}
	
	@GetMapping("writer")
	public String writer(Model model) {
		model.addAttribute("data", "hello");
		return "writer";
	}
	
	
}
