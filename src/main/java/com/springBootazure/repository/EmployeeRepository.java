package com.springBootazure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBootazure.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
