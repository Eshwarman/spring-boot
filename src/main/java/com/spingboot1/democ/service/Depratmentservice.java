package com.spingboot1.democ.service;

import com.spingboot1.democ.entity.Employee;
import com.spingboot1.democ.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Depratmentservice implements DepartmentService{
    @Autowired
    private DepartmentRepository repository;
    @Override
    public Employee SaveEmployee(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public Employee UpdateEmployee(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public void DeleteEmployee(Employee employee) {
        repository.delete(employee);
    }

    @Override
    public List<Employee> FindAll() {
        return repository.findAll();
    }
}
