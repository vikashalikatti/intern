package org.intern.project.service;

import java.io.IOException;

import org.intern.project.dao.User_dao;
import org.intern.project.dto.User_dto;
import org.intern.project.helper.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;

@Service
public class User_service {
	@Autowired
	User_dao dao;

	public ModelAndView singup(User_dto user_dto) {
		ModelAndView andView = new ModelAndView();
		dao.save(user_dto);
		andView.addObject("success", "Account Created Successfully");
		andView.setViewName("User_login");
		return andView;
	}

	public ModelAndView login(Login login, HttpSession session) throws IOException {
		ModelAndView view = new ModelAndView();
		User_dto dto = dao.fetch(login.getEmail());
		if (dto == null) {
			view.setViewName("User_login");
			view.addObject("fail", "Email Wrong");
		} else {
			if (login.getPassword().equals(dto.getPassword())) {
				session.setAttribute("dto", dto);
				view.setViewName("Home");
				view.addObject("success", "Login Success");
			} else {
				view.setViewName("User_login");
				view.addObject("fail", "Password Wrong");
			}
		}
		return view;
	}
	

}
