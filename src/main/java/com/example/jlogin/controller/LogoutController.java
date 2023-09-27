package com.example.jlogin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/logout")
public class LogoutController {

	@RequestMapping
	public String logout(HttpSession session) {


		session.invalidate();
		return"login/loginForm";
	}

}