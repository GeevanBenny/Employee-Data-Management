package com.example.EmployeeDataManagement.repository;

import com.example.EmployeeDataManagement.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee,String> {
}
