package com.teachingassistantsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManagementController {

	
	@RequestMapping(value = "/studentmanagement.htm")
	public String studentManagement(Model model) {
		return "studentmanagement";
	}
	@RequestMapping(value = "/studentregistration.htm")
	public String studentregistrationwelcome(Model model) {
		return "studentregistration";
	}
	@RequestMapping(value = "/editstudentmanagement.htm")
	public String studentmanagementeditwelcome(Model model) {
		return "editstudentmanagement";
	}
	
	
	
	
	
	

	@RequestMapping(value = "/teachermanagement.htm")
	public String teacherManagement(Model model) {
		return "teachermanagement";
	}
	
	@RequestMapping(value = "/teacherregistration.htm")
	public String teacherregistrationwelcome(Model model) {
		return "teacherregistration";
	}
	
	@RequestMapping(value = "/editteachermanagement.htm")
	public String teachereditwelcome(Model model) {
		return "editteachermanagement";
	}
	
	
	

	@RequestMapping(value = "/bookmanagement.htm")
	public String dookManagement(Model model) {
		return "bookmanagement";
	}
	@RequestMapping(value = "/bookregistration.htm")
	public String bookregistrationwelcome(Model model) {
		return "bookregistration";
	}
	
	@RequestMapping(value = "/editbookmanagement.htm")
	public String bookeditwelcome(Model model) {
		return "editbookmanagement";
	}
}
