package com.spingboot1.democ.service;

import com.spingboot1.democ.entity.Employee;

import java.util.List;

public interface DepartmentService {
    public Employee SaveEmployee(Employee employee);
   public Employee UpdateEmployee(Employee employee);
    public void DeleteEmployee(Employee employee);
    public List<Employee> FindAll();
}
