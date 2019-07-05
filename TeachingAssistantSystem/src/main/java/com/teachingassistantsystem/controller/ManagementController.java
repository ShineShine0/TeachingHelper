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

	@RequestMapping(value = "/teachermanagement.htm")
	public String teacherManagement(Model model) {
		return "teachermanagement";
	}

	@RequestMapping(value = "/bookmanagement.htm")
	public String dookManagement(Model model) {
		return "bookmanagement";
	}
}
