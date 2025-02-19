package com.example.demo.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.databsescripts.Database;

@Service
public class Authenticator_Service {
	@Autowired
	Database db;
	@Autowired
	User_Details ud;
	
	public boolean Authenticate_User(String username, String pass) throws SQLException {
		ResultSet rs = db.executequery("select * from public.users where name = '" + username.toLowerCase() + "' and pass = '" + pass.toLowerCase()+"'");
		if (rs.next()) {
			ud.setValues(rs);
			return true;
		}
		else {
			return false;
		}
	}
	

}
