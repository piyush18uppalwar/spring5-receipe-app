package piyush.springframework.spring5receipeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReceipeController {
	
	@RequestMapping({"","/","index","index.html"})
	private String getReceipe() {
		return "index";
	}
	

}
