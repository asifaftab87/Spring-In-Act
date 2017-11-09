package org.asif.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/thymeleaf")
public class HomeController {

	@RequestMapping(method=RequestMethod.GET)
	public String view(){
		return "welcome";
	}
	
	
}
