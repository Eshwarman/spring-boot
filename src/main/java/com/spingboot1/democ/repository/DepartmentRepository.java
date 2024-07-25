package com.spingboot1.democ.repository;

import com.spingboot1.democ.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Employee,Long> {
}
