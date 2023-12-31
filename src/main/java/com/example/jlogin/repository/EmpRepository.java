package com.example.jlogin.repository;


import com.example.jlogin.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository<Emp, Long> {  //emp를 프라이머리키의 타입을 쓴다.
    Emp findByEmpno(Long empno);
}
