package com.teachingassistantsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class TeacherController {

	
	@RequestMapping(value = "/first.htm")
	public String firstWelcome(Model model) {
		return "first";
	}
	@RequestMapping(value = "/second.htm")
	public String secondWelcome(Model model) {
		return "second";
	}
	@RequestMapping(value = "/third.htm")
	public String thirdWelcome(Model model) {
		return "third";
	}
	@RequestMapping(value = "/fourth.htm")
	public String fourthWelcome(Model model) {
		return "fourth";
	}
	@RequestMapping(value = "/fifth.htm")
	public String fsifthWelcome(Model model) {
		return "fifth";
	}
	
	
	
	@RequestMapping(value = "/teachingfirst.htm")
	public String teacherlearningfirstWelcome(Model model) {
		return "teacherlearningfirst";
	}
	@RequestMapping(value = "/teachingsecondcs.htm")
	public String teacherlearningsecondcsWelcome(Model model) {
		return "teacherlearningsecondcs";
	}
	@RequestMapping(value = "/teachingsecondct.htm")
	public String teacherlearningsecondctWelcome(Model model) {
		return "teacherlearningsecondct";
	}
	@RequestMapping(value = "/teachingthirdcs.htm")
	public String teacherlearningthirdcsWelcome(Model model) {
		return "teacherlearningthirdcs";
	}
	@RequestMapping(value = "/teachingthirdct.htm")
	public String teacherlearningthirdctWelcome(Model model) {
		return "teacherlearningthirdct";
	}
	@RequestMapping(value = "/teachingfourthcs.htm")
	public String teacherlearningfourthcsWelcome(Model model) {
		return "teacherlearningfourthcs";
	}
	@RequestMapping(value = "/teachingfourthct.htm")
	public String teacherlearningfourthctWelcome(Model model) {
		return "teacherlearningfourthct";
	}
	@RequestMapping(value = "/teachingfifthcs.htm")
	public String teacherlearningfifthcsWelcome(Model model) {
		return "teacherlearningfifthcs";
	}
	@RequestMapping(value = "/teachingfifthct.htm")
	public String teacherlearningfifthcttWelcome(Model model) {
		return "teacherlearningfifthct";
	}
	
	@RequestMapping(value = "/teachingactivitiesfirst.htm")
	public String teacheractivitiesfirstWelcome(Model model) {
		return "teacheractivitiesfirst";
	}
	@RequestMapping(value = "/teachingactivitiessecondcs.htm")
	public String teacheractivitiessecondcsWelcome(Model model) {
		return "teacheractivitiessecondcs";
	}
	@RequestMapping(value = "/teachingactivitiessecondct.htm")
	public String teacheractivitiessecondctWelcome(Model model) {
		return "teacheractivitiessecondct";
	}
	@RequestMapping(value = "/teachingactivitiesthirdcs.htm")
	public String teacheractivitiesthirdcstWelcome(Model model) {
		return "teacheractivitiesthirdcs";
	}
	@RequestMapping(value = "/teachingactivitiesthirdct.htm")
	public String teacheractivitiesthirdctWelcome(Model model) {
		return "teacheractivitiesthirdct";
	}
	@RequestMapping(value = "/teachingactivitiesfourthcs.htm")
	public String teacheractivitiesfourthcsWelcome(Model model) {
		return "teacheractivitiesfourthcs";
	}
	@RequestMapping(value = "/teachingactivitiesfourthct.htm")
	public String teacheractivitiesfourthctWelcome(Model model) {
		return "teacheractivitiesfourthct";
	}
	@RequestMapping(value = "/teachingactivitiesfifthcs.htm")
	public String teacheractivitiesfifthcsWelcome(Model model) {
		return "teacheractivitiesfifthcs";
	}
	@RequestMapping(value = "/teachingactivitiesfifthct.htm")
	public String teacheractivitiesfifthctWelcome(Model model) {
		return "teacheractivitiesfifthct";
	}
	
	

	@RequestMapping(value = "/teachngattendancefirst.htm")
	public String teachingfirstattendancewelcome(Model model) {
		return "teacherattendancefirst";
	}
	@RequestMapping(value = "/teachingattendancesecondcs.htm")
	public String teachingsecondattendancewelcome(Model model) {
		return "teacherattendancesecondcs";
	}
	@RequestMapping(value = "/teachingattendancethirdcs.htm")
	public String teachingthirdattendancewelcome(Model model) {
		return "teacherattendancethirdcs";
	}
	
	@RequestMapping(value = "/teachingattendancefourthcs.htm")
	public String teachingfourthattendancewelcome(Model model) {
		return "teacherattendancefourthcs";
	}
	@RequestMapping(value = "/teachingattendancefifthcs.htm")
	public String teachingfifthattendancewelcome(Model model) {
		return "teacherattendancefifthcs";
	}
/**/
}
