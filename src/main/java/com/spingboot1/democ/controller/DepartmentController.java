package com.spingboot1.democ.controller;

import com.spingboot1.democ.entity.Employee;
import com.spingboot1.democ.service.Depratmentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired
    private Depratmentservice depratmentservice;
    @GetMapping("/")
    public String insertEmployee(){
        Employee employee=new Employee();
        employee.setEmployee_name("Eshwar");
        employee.setEmployee_status("Single");
        Employee emp=depratmentservice.SaveEmployee(employee);


        return "employee name"+emp.getEmployee_name()+":"+emp.getEmployee_id();
    }
}
