package com.springBootazure;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springBootazure.repository.EmployeeRepository;

@SpringBootApplication
@RestController
public class SpringBootAzureApplication {
	
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@PostMapping("/product")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
		
	}
	
	
	@GetMapping("/products")
	public List<Employee> getEmployee(){
		return employeeRepository.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAzureApplication.class, args);
	}

}
