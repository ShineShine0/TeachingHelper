package com.teachingassistantsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookContoller {

	
	@RequestMapping(value = "/firstcsbook.htm")
	public String FirstYearBook(Model model) {
		return "firstyearcsbook";
	}
	@RequestMapping(value = "/secondcsbook.htm")
	public String SecondYearCSBook(Model model) {
		return "secondyearcsbook";
	}
	
	@RequestMapping(value = "/secondctbook.htm")
	public String SecondYearCTBook(Model model) {
		return "secondyearctbook";
	}
	
	@RequestMapping(value = "/thirdcsbook.htm")
	public String ThirdYearCSBook(Model model) {
		return "thirdyearcsbook";
	}
	@RequestMapping(value = "/thirdctbook.htm")
	public String ThirdYearCTBook(Model model) {
		return "thirdyearctbook";
	}
	@RequestMapping(value = "/fourthcsbook.htm")
	public String FourthYearCSBook(Model model) {
		return "fourthyearcsbook";
	}
	@RequestMapping(value = "/fourthctbook.htm")
	public String FourthYearCTBook(Model model) {
		return "fourthyearctbook";
	}
	@RequestMapping(value = "/fifthcsbook.htm")
	public String FifthYearCSBook(Model model) {
		return "firstyearcsbook";
	}
	@RequestMapping(value = "/fifthctbook.htm")
	public String FifthYearCTBook(Model model) {
		return "firstyearcsbook";
	}
}
