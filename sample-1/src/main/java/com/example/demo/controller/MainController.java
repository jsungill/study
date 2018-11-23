package com.example.demo.controller;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class MainController {

	@RequestMapping("/main")
	public String index(Model model) {
		model.addAttribute("name", "JSL");
		return "main";
	}
}

