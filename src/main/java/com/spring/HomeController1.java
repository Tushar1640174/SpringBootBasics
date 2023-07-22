package com.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.spring.Entity.Address;
import com.spring.Entity.Employee;
import com.spring.Services.EmployeeService;

@RestController
public class HomeController1 {

	@Autowired
	private EmployeeService employeeService;
	
	
	
	//Adding the Employee to database
	@PostMapping("/employee")
	public Employee insert(@RequestBody Employee employee)
	{
		
		Employee e=employeeService.insert(employee);
		return e;
	}
	
	
	//finding a single employee by id
	@GetMapping("/employee/{id}")
	public Employee getEmployeebyId(@PathVariable("id") int id)
	{
		Employee emp=employeeService.findbyid(id);
		return emp;
	}
	
	
	
	
	//Finding list of all the Employees present
	@GetMapping("/employee")
	public List<Employee> FindAll()
	{
		List<Employee> list=employeeService.FindAll();
		return list;
	}
	
	
	
	//Updating the employee details
	@PutMapping("/employee/{id}")
	public Employee update(@RequestBody Employee employee,@PathVariable("id") int id)
	{
		Employee emp=employeeService.update(employee,id);
		return emp;
	}
	
	
	
	@DeleteMapping("/employee/{id}")
	public Employee delete(@PathVariable("id") int id)
	{
		Employee emp=this.employeeService.delete(id);
		return emp;
	}
}
