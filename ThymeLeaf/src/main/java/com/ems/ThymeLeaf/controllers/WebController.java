package com.ems.ThymeLeaf.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ems.ThymeLeaf.entity.Employee;
import com.ems.ThymeLeaf.repository.EmployeeRepo;
import com.ems.ThymeLeaf.service.employeeService;

@Controller
public class WebController {
	
	@Autowired
	private employeeService employeeService;
	
	@Autowired
	private EmployeeRepo employeeRepository;
	
	@GetMapping("/")
	public String homePage() {
		return "home";
	}
	
	
	@RequestMapping("/showall")
	public String showall() {
		return "showemp";
	}
	@RequestMapping("/addemp")
	public String add_emp() {
		return "add_emp";
	}
	
	@PostMapping("/register")
	public String empRegister(@ModelAttribute Employee e) {
		System.out.println(e);
		employeeService.saveEmployee(e);
		return "add_emp";
	}
	
	@GetMapping("/showEmployee/{id}")
	public String showEmployee(@PathVariable(value = "id") int id, Model model) {
		Employee employee = employeeService.getEmployeeById(id);
		model.addAttribute("employee",employee);
		return "showEmployee";
	}
	@GetMapping("/login")
	public String login() {
		return"login";
	}
}
