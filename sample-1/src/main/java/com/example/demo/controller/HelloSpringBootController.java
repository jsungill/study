package com.example.demo.controller;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HelloSpringBootController {

	@RequestMapping("/hello")
	public String index(Model model) {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("hello");
//		mv.addObject("name", "SpringBlog from Millky");
//		System.out.println("2");
		return "hello";
	}
}

