package com.ems.ThymeLeaf.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ems.ThymeLeaf.entity.Employee;
import com.ems.ThymeLeaf.repository.EmployeeRepo;
import com.ems.ThymeLeaf.service.employeeService;

@Controller
public class WebController{
	
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
	@ResponseBody
	public Employee showEmployee(@PathVariable(value = "id") String id, Model model) {
		Employee employee = employeeService.getEmployeeById(Integer.parseInt(id));
		System.out.println(employee);
		model.addAttribute("employee",employee);
		return employee;
	}
	@GetMapping("/login?role={role}")
	public String login(@PathVariable("role") String role) {
		System.out.println(role);
		return "login";
	}
}
