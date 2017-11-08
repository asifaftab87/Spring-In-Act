package org.asif.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/tiles")
public class HomeController {

	@RequestMapping(method=RequestMethod.GET)
	public String view(Model model){
		return "home";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String register(){
		return "registerForm";
	}
	
	@RequestMapping(value="/profile", method=RequestMethod.GET)
	public String profile(){
		return "profile";
	}
}
