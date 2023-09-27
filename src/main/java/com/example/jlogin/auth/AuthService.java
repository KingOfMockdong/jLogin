package com.example.jlogin.auth;

import com.example.jlogin.entity.Emp;
import com.example.jlogin.repository.EmpRepository;
import com.example.jlogin.spring.WrongIdPasswordException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

	private final EmpRepository empRepository;

	@Autowired
	public AuthService(EmpRepository empRepository) {
		this.empRepository = empRepository;
	}

	public boolean authenticate(Long empno, String password) {
		Emp emp = empRepository.findByEmpno(empno);
		if (emp == null) {
			throw new WrongIdPasswordException();
		}
		if (!emp.matchPassword(password)) {
			throw new WrongIdPasswordException();
		}
		return true;
	}
}
