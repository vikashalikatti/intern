package org.intern.project.controller;

import java.io.IOException;

import org.intern.project.dto.User_dto;
import org.intern.project.helper.Login;
import org.intern.project.repository.User_repository;
import org.intern.project.service.User_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class User_controller {
	@Autowired
	User_service user_service;

	@PostMapping("signup")
	public ModelAndView signup(@ModelAttribute User_dto user_dto) {
		return user_service.singup(user_dto);
	}

	@PostMapping("login")
	public ModelAndView login(@ModelAttribute Login login, HttpSession session) throws IOException {
		return user_service.login(login,session);
	}
	
	@GetMapping("contact")
	public ModelAndView contact(@RequestParam String email)
	{
		ModelAndView view=new ModelAndView("/Home");
		view.addObject("success","We will get back to you on "+email);
		return view;
	}
}
