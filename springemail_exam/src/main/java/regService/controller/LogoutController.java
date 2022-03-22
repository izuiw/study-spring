package regService.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogoutController {
	
	@RequestMapping("/member/logout")
	public String handleLogout(HttpSession session) {
		session.invalidate();
		return "redirect:/main";
		
	}
}
