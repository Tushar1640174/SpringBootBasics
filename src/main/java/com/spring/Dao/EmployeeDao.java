package com.spring.Dao;

import com.spring.Entity.*;
import org.springframework.data.repository.CrudRepository;



public interface EmployeeDao extends CrudRepository<Employee, Integer>


{

}
