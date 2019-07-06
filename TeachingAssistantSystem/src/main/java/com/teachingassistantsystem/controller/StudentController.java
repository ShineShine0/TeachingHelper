package com.teachingassistantsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class StudentController {

	
	@RequestMapping(value = "/login.htm")
	public String loginelcome(Model model) {
		return "login";
	}

	@RequestMapping(value = "/welcome.htm")
	public String headerwelcome(Model model) {
		return "home";
	}
	
	@RequestMapping(value = "/home.htm")
	public String welcome(Model model) {
		return "welcome";
	}
	@RequestMapping(value = "/firstyear.htm")
	public String firstyearwelcome(Model model) {
		return "firstyear";
	}
	@RequestMapping(value = "/secondyear.htm")
	public String secondyearCSwelcome(Model model) {
		return "secondyearCS";
	}
	@RequestMapping(value = "/secondyearct.htm")
	public String secondyearCTwelcome(Model model) {
		return "secondyearCT";
	}
	@RequestMapping(value = "/thirdyear.htm")
	public String thirdyearCSwelcome(Model model) {
		return "thirdyearCS";
	}
	@RequestMapping(value = "/thirdyearct.htm")
	public String thirdyearCTwelcome(Model model) {
		return "thirdyearCT";
	}
	
	@RequestMapping(value = "/fourthyear.htm")
	public String fourthyearCSwelcome(Model model) {
		return "fourthyearCS";
	}
	@RequestMapping(value = "/fourthyearct.htm")
	public String fourthyearCTwelcome(Model model) {
		return "fourthyearCT";
	}

	@RequestMapping(value = "/fifthyear.htm")
	public String fifthyearCSwelcome(Model model) {
		return "fifthyearCS";
	}

	@RequestMapping(value = "/fifthyearct.htm")
	public String fifthyearCTwelcome(Model model) {
		return "fifthyearCT";
	}
	
	
	
	@RequestMapping(value = "/learning.htm")
	public String learningwelcome(Model model) {
		return "learning";
	}
	@RequestMapping(value = "/learningsecondcs.htm")
	public String learningsecondcswelcome(Model model) {
		return "learningsecondcs";
	}
	
	@RequestMapping(value = "/learningsecondct.htm")
	public String learningsecondctwelcome(Model model) {
		return "learningsecondct";
	}
	@RequestMapping(value = "/learningthirdcs.htm")
	public String learningthirdcswelcome(Model model) {
		return "learningthirdcs";
	}
	@RequestMapping(value = "/learningthirdct.htm")
	public String learningthirdctwelcome(Model model) {
		return "learningthirdct";
	}
	@RequestMapping(value = "/learningfourthcs.htm")
	public String learningfourthcswelcome(Model model) {
		return "learningfourthcs";
	}
	@RequestMapping(value = "/learningfourthct.htm")
	public String learningfourthctwelcome(Model model) {
		return "learningfourthct";
	}
	@RequestMapping(value = "/learningfifthcs.htm")
	public String learningfifthcswelcome(Model model) {
		return "learningfifthcs";
	}
	@RequestMapping(value = "/learningfifthct.htm")
	public String learningfifthctwelcome(Model model) {
		return "learningfifthct";
	}
	
	
	
	@RequestMapping(value = "/activities.htm")
	public String activitieswelcome(Model model) {
		return "activities";
	}
	@RequestMapping(value = "/activitiessecondcs.htm")
	public String activitiessecondcswelcome(Model model) {
		return "activitiessecondcs";
	}
	@RequestMapping(value = "/activitiessecondct.htm")
	public String activitiessecondctwelcome(Model model) {
		return "activitiessecondct";
	}
	@RequestMapping(value = "/activitiesthirdcs.htm")
	public String activitiesthirdcswelcome(Model model) {
		return "activitiesthirdcs";
	}
	@RequestMapping(value = "/activitiesthirdct.htm")
	public String activitiesthirdctwelcome(Model model) {
		return "activitiesthirdct";
	}
	@RequestMapping(value = "/activitiesfourthcs.htm")
	public String activitiesfourthcswelcome(Model model) {
		return "activitiesfourthcs";
	}
	@RequestMapping(value = "/activitiesfourthct.htm")
	public String activitiesfourthctwelcome(Model model) {
		return "activitiesfourthct";
	}
	@RequestMapping(value = "/activitiesfifthcs.htm")
	public String activitiesfifthcswelcome(Model model) {
		return "activitiesfifthcs";
	}
	@RequestMapping(value = "/activitiesfifthct.htm")
	public String activitiesfifthctwelcome(Model model) {
		return "activitiesfifthct";
	}
	
	
	
	@RequestMapping(value = "/attendance.htm")
	public String firstattendancewelcome(Model model) {
		return "attendance";
	}
	@RequestMapping(value = "/attendancesecondcs.htm")
	public String secondattendancewelcome(Model model) {
		return "attendancesecondcs";
	}
	@RequestMapping(value = "/attendancethirdcs.htm")
	public String thirdattendancewelcome(Model model) {
		return "attendancethirdcs";
	}
	
	@RequestMapping(value = "/attendancefourthcs.htm")
	public String fourthattendancewelcome(Model model) {
		return "attendancefourthcs";
	}
	@RequestMapping(value = "/attendancefifthcs.htm")
	public String fifthattendancewelcome(Model model) {
		return "attendancefifthcs";
	}
	
	

	
}
