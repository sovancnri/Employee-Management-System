package com.ems.ThymeLeaf.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ems.ThymeLeaf.entity.Employee;
import com.ems.ThymeLeaf.repository.EmployeeRepo;
import com.ems.ThymeLeaf.service.employeeService;
import com.ems.ThymeLeaf.service.employeeServiceImpl;

import jakarta.servlet.http.HttpSession;

@Controller
public class WebController{
	
	@Autowired
	private employeeServiceImpl employeeService;
	
	@Autowired
	private EmployeeRepo employeeRepository;
	
	@GetMapping("/")
	public String homePage() {
		return "home";
	}
	
	@RequestMapping("/addemp")
	public String add_emp() {
		return "add_emp";
	}
	
	@PostMapping("/register")
	public String empRegister(@ModelAttribute Employee e, HttpSession session) {
		System.out.println(e);
		employeeService.saveEmployee(e);
		session.setAttribute("msg", "Employee Added Successfully....");
		return "redirect:/success";
	}
	@RequestMapping("/success")
	public String dashboard() {
		return "success";
	}
	@GetMapping("/showEmployee/{id}")
	@ResponseBody
	public Employee showEmployee(@PathVariable(value = "id") String id, Model model) {
		Employee employee = employeeService.getEmployeeById(Integer.parseInt(id));
		System.out.println(employee);
		model.addAttribute("employee",employee);
		return employee;
	}
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@RequestMapping("/dashboard")
	public String dashBoard() {
		return "dashboard";
	}
	@GetMapping({"/list"})
	public ModelAndView getAllEmployees() {
	ModelAndView mav = new ModelAndView("viewall");
	mav.addObject("employees", employeeRepository.findAll());
	return mav;
	}
	@DeleteMapping("/delete/{id}")
	public String delEmp(@PathVariable(value="id") String eid,HttpSession session) {
			this.employeeService.deleteEmployeeById(Integer.parseInt(eid));
			session.setAttribute("msg","Employee Deleted Successfully..");
			return "redirect:/success";
	}
}
