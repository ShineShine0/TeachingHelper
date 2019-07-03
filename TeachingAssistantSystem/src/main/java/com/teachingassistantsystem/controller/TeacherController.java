package com.teachingassistantsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class TeacherController {

	
	@RequestMapping(value = "/first.htm")
	public String FirstWelcome(Model model) {
		return "first";
	}
	@RequestMapping(value = "/second.htm")
	public String SecondWelcome(Model model) {
		return "second";
	}
	@RequestMapping(value = "/third.htm")
	public String ThirdWelcome(Model model) {
		return "third";
	}
	@RequestMapping(value = "/fourth.htm")
	public String FourthWelcome(Model model) {
		return "fourth";
	}
	@RequestMapping(value = "/fifth.htm")
	public String FifthWelcome(Model model) {
		return "fifth";
	}
	
}
