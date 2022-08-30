package com.hit.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;
	private String empName;
	private Integer empSalary;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Integer empSalary) {
		this.empSalary = empSalary;
	}
	
	
	
	
}
package com.hit.springboot.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hit.springboot.entity.Employee;
import com.hit.springboot.repository.EmployeeRepository;

@RestController
public class EmployeeRestController {
    @Autowired
	EmployeeRepository employeeRepository;
	@PostMapping(value = "savaEmployee")
    public Employee saveEmployee(Employee employee) {
    	
    	Employee employee2=employeeRepository.save(employee);
    	return employee2;
    	
    }
    
    
}
