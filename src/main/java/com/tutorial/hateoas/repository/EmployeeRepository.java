package com.tutorial.hateoas.repository;

import com.tutorial.hateoas.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
