package com.teachingassistantsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookContoller {

	
	@RequestMapping(value = "/firstcsbook.htm")
	public String firstyearbook(Model model) {
		return "firstyearcsbook";
	}
	@RequestMapping(value = "/secondcsbook.htm")
	public String secondtearCSbook(Model model) {
		return "secondyearcsbook";
	}
	
	@RequestMapping(value = "/secondctbook.htm")
	public String secondyearCTbook(Model model) {
		return "secondyearctbook";
	}
	
	@RequestMapping(value = "/thirdcsbook.htm")
	public String thirdyearCSbook(Model model) {
		return "thirdyearcsbook";
	}
	@RequestMapping(value = "/thirdctbook.htm")
	public String thirdyearCTbook(Model model) {
		return "thirdyearctbook";
	}
	@RequestMapping(value = "/fourthcsbook.htm")
	public String fourthyearCSbook(Model model) {
		return "fourthyearcsbook";
	}
	@RequestMapping(value = "/fourthctbook.htm")
	public String fourthyearCTbook(Model model) {
		return "fourthyearctbook";
	}
	@RequestMapping(value = "/fifthcsbook.htm")
	public String fifthyearCSbook(Model model) {
		return "fifthyearcsbook";
	}
	@RequestMapping(value = "/fifthctbook.htm")
	public String fifthyearCTbook(Model model) {
		return "fifthyearctbook";
	}
}
