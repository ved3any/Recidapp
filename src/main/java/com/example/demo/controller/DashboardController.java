package com.example.demo.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.databsescripts.Database;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;

@Controller
public class DashboardController {
	
@Autowired
Database db;
@Autowired
Authenticator_Service auth;
@Autowired
User_Details ud;

	@GetMapping("/login")
	public String getlogin(){
		
		return "login";
	}
	
	@PostMapping("/dashboard")
	public String postlogin(@RequestParam String name,@RequestParam String pass,Model model) throws SQLException{
		if (auth.Authenticate_User(name, pass)) {
			model.addAllAttributes(ud.getMap());
			return "dashboard";
		}
		else {
			return "login";
		}
	}
	@GetMapping("/dashboard")
	public String getdash(Model model) {
		model.addAttribute("site", "login");
		return "redirect";
		
	}
		
}
