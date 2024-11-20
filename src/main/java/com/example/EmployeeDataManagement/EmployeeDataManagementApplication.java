package com.example.EmployeeDataManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class EmployeeDataManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDataManagementApplication.class, args);
	}

}
