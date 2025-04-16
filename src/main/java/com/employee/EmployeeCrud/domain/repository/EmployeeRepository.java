package com.employee.EmployeeCrud.domain.repository;

import com.employee.EmployeeCrud.domain.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface EmployeeRepository extends JpaRepository<Employee, UUID> {


}
