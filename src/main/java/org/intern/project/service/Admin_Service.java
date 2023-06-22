package org.intern.project.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.intern.project.dao.Insert_dao;
import org.intern.project.dto.Insert_dto;
import org.intern.project.helper.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;

@Service
public class Admin_Service {
	
	@Autowired
	Insert_dao dao;

	public ModelAndView login(Login login, HttpSession session) {
		ModelAndView andView = new ModelAndView();
		if (login.getEmail().equals("admin@gmail.com") && login.getPassword().equals("admin")) {
			session.setAttribute("admin", "admin");
			andView.setViewName("Admin_dashboard");
			andView.addObject("success", "Login Success");
		} else {
			andView.setViewName("admin_login");
			andView.addObject("fail", "Invalid Email or Password");
		}
		return andView;
	}

	public ModelAndView insert(Insert_dto insert, MultipartFile pic) throws IOException {
		ModelAndView view = new ModelAndView();
		byte[] picture = null;
		if (pic != null) {
			InputStream inputStream = pic.getInputStream();
			picture = new byte[inputStream.available()];
			inputStream.read(picture);
		}

		insert.setPicture(picture);
		dao.save(insert);
		view.addObject("success", "Package added Sucessfully");
		view.setViewName("Admin_dashboard");
		return view;

	}


	public ModelAndView fetchall() {
		ModelAndView andView = new ModelAndView();
		List<Insert_dto> list = dao.fetchall();
		if(list.isEmpty()) {
			andView.setViewName("Admin_dashboard");
			andView.addObject("fail","No list are available");
		}else {
			andView.setViewName("view_all_package");
			andView.addObject("list",list);
		}
		return andView;
	}

	public ModelAndView update(int id) {
		ModelAndView andView = new ModelAndView();
		Insert_dto dto = dao.fetchbyid(id);
		andView.addObject("update",dto);
		andView.setViewName("update_package");
		return andView;
		
	}

	public ModelAndView updateby(Insert_dto insert_dto,int id,MultipartFile pic) throws IOException {
		ModelAndView andView = new ModelAndView();
		Insert_dto dto = dao.fetchbyid(id);
		if(dto!=null) {
			byte[] picture = null;
			if (pic != null) {
				InputStream inputStream = pic.getInputStream();
				picture = new byte[inputStream.available()];
				inputStream.read(picture);
			}
			insert_dto.setPicture(picture);
			andView.addObject("success","Updated sucessfully");
			andView.setViewName("Admin_dashboard");
			dao.save(insert_dto);
		}else {
			andView.addObject("fail","fail to Update");
			andView.setViewName("Admin_dashboard");
		}
		return andView;
	}

	public ModelAndView delete_fetchall() {
		ModelAndView andView = new ModelAndView();
		List<Insert_dto> list = dao.fetchall();
		if(list.isEmpty()) {
			andView.setViewName("Admin_dashboard");
			andView.addObject("fail","No list are available");
		}else {
			andView.setViewName("view_all_package_delete");
			andView.addObject("list",list);
		}
		return andView;
	}

	public ModelAndView delete(int id) {
		ModelAndView andView = new ModelAndView();
		Insert_dto dto = dao.fetchbyid(id);
		if(dto!=null) {
			dao.delete(id);
			andView.addObject("success","Deleted sucessfully");
			andView.setViewName("Admin_dashboard");
		}else {
			andView.addObject("fail","fail to Delete");
			andView.setViewName("Admin_dashboard");
		}
		return andView;
	}
}
