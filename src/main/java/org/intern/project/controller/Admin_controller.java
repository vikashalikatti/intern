package org.intern.project.controller;

import java.io.IOException;

import org.intern.project.dto.Insert_dto;
import org.intern.project.helper.Login;
import org.intern.project.service.Admin_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("admin")
public class Admin_controller {
	@Autowired
	Admin_Service admin_service;

	@PostMapping("login")
	public ModelAndView login(@ModelAttribute Login login, HttpSession session) {
		return admin_service.login(login, session);
	}

	@PostMapping("insert")
	public ModelAndView insert(@ModelAttribute Insert_dto insert, @RequestParam MultipartFile photo) throws IOException {
		return admin_service.insert(insert,photo);
	}
	
	@GetMapping("fetchall")
	public ModelAndView fetchall() {
		return admin_service.fetchall();
	}
	@GetMapping("update/{id}")
	public ModelAndView update(@PathVariable int id) {
		return admin_service.update(id);
	}
	@PostMapping("updateby/{id}")
	public ModelAndView updateby(@ModelAttribute Insert_dto insert_dto,@PathVariable int id,@RequestParam MultipartFile photo) throws IOException {
		return admin_service.updateby(insert_dto,id,photo);
	}
	
	@GetMapping("fetchdelete")
	public ModelAndView delete_fetchall() {
		return admin_service.delete_fetchall();
	}
	
	@GetMapping("delete/{id}")
	public ModelAndView delete(@PathVariable int id) {
		return admin_service.delete(id);
	}
}
