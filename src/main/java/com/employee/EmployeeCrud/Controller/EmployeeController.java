package com.employee.EmployeeCrud.Controller;

import com.employee.EmployeeCrud.service.serviceImpl.EmployeeServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeServiceImpl employeeServiceImpl ;

    @PostMapping("/create")
    
}
