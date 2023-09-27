package com.example.jlogin.service;

import com.example.jlogin.entity.Emp;
import com.example.jlogin.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
    private final EmpRepository empRepository;

    @Autowired
    public EmpService(EmpRepository empRepository) {
        this.empRepository = empRepository;
    }

    public void insertEmp(Emp emp) {
        empRepository.save(emp);
    }
    public Emp selectByEmpno(Long empno) {
        return empRepository.findByEmpno(empno);
    }
}
