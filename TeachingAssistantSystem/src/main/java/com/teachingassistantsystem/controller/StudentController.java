package com.teachingassistantsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class StudentController {

	
	@RequestMapping(value = "/login.htm")
	public String LoginWelcome(Model model) {
		return "login";
	}

	@RequestMapping(value = "/welcome.htm")
	public String HeaderWelcome(Model model) {
		return "home";
	}
	
	@RequestMapping(value = "/home.htm")
	public String Welcome(Model model) {
		return "welcome";
	}
	@RequestMapping(value = "/firstyear.htm")
	public String FirstYearWelcome(Model model) {
		return "firstyear";
	}
	@RequestMapping(value = "/secondyear.htm")
	public String SecondYearCSWelcome(Model model) {
		return "secondyearCS";
	}
	@RequestMapping(value = "/secondyearCT.htm")
	public String SecondYearCTWelcome(Model model) {
		return "secondyearCT";
	}
	@RequestMapping(value = "/thirdyear.htm")
	public String ThirdYearCSWelcome(Model model) {
		return "thirdyearCS";
	}
	
	@RequestMapping(value = "/fourthyear.htm")
	public String FourthYearCSWelcome(Model model) {
		return "fourthyearCS";
	}

	@RequestMapping(value = "/fifthyear.htm")
	public String FifthYearCSWelcome(Model model) {
		return "fifthyearCS";
	}
	
	
	
	
}
