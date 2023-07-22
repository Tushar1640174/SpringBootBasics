package com.spring.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.spring.Dao.EmployeeDao;
import com.spring.Entity.Employee;

@Component
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	
	
	//Inserting the employee into database
	public Employee insert(Employee employee)
	{
		Employee e=this.employeeDao.save(employee);
		
		return e;
	}
	
	
	//finding Employee by Id
	public Employee findbyid(int id)
	{
		Employee emp=new Employee();
		Optional<Employee> e=this.employeeDao.findById(id);
		
		emp=e.get();
		return emp;
	}
	
	
	
	//Getting all the present employee
	public List<Employee> FindAll()
	{
		List<Employee> list=(List<Employee>) this.employeeDao.findAll();
		return list;
	}
	
	
	//Updating Employee details
	public Employee update(Employee employee,int id)
	{
		
		
		Employee emp=new Employee();
		List<Employee> list=FindAll();
		for(Employee e:list)
		{
			if(e.getId()==id)
			{
				e.setFullname(employee.getFullname());
				e.setAddress(employee.getAddress());
				e.setProfile(employee.getProfile());
				
				emp=e;
				employeeDao.save(emp);
			}
		}
		
		return emp;
		
	}
	
	
	public Employee delete(int id)
	{
		Employee emp=new Employee();
		List<Employee> list=FindAll();
		for(Employee e:list)
		{
			if(e.getId()==id)
			{	
				emp=e;
				
	        }
			
}
		employeeDao.delete(emp);
		return emp;
	}
	
}
		
		
