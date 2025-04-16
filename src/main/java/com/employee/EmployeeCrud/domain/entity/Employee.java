package com.employee.EmployeeCrud.domain.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id ;

    private String name ;

    private Role role ;

    private double salary ;

    private String email ;

    private String password ;

}
