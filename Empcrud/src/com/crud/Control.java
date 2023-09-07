package com.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Control {
	private final EmpInterface ed;

	@Autowired
	public Control(EmpInterface ed) {
		this.ed = ed;
	}

	// @RequestMapping(value = "/crud", method = RequestMethod.GET)
	// public String login(Model mod, @RequestParam("click") String click) {
	// mod.addAttribute("Emp", ed.getEmp(click));
	// return "table";
	// }

	@RequestMapping(value = "/table", method = RequestMethod.GET)
	public String getAllEmployees(Model model) {
		System.out.println("Employee List jsp requested");
		List<Employee> empList = ed.getAllEmployees();
		System.out.println(empList.size());
		model.addAttribute("size", empList.size());
		model.addAttribute("elist", empList);
		return "table";
	}

}