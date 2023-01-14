package com.example.ControllerProtection.salary.repositories;

import com.example.ControllerProtection.salary.entities.Salary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaryRepository extends JpaRepository<Salary, Long>  {

    Salary findByUserId(Long id);


}
