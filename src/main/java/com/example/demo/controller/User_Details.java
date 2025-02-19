package com.example.demo.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class User_Details {
	
	public int id;
	public String name;
	public String phone;
	public String email;
	public String pass;
	public int r_no;
	public int info_no;
	public boolean owner;
	
	public void setValues(ResultSet rs) throws SQLException {
		this.id = rs.getInt(1);
		this.name = rs.getString(2);
		this.phone = rs.getString(3);
		this.email = rs.getString(4);
		this.pass = rs.getString(5);
		this.r_no = rs.getInt(6);
		this.info_no = rs.getInt(7);
		this.owner = rs.getBoolean(8);
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public String getPhone() {
		return this.phone;
	}

	public String getEmail() {
		return this.email;
	}

	public String getPass() {
		return this.pass;
	}

	public int getR_no() {
		return this.r_no;
	}

	public int getInfo_no() {
		return this.info_no;
	}

	public boolean isOwner() {
		return this.owner;
	}

	@Override
	public String toString() {
		return "User_Details [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", pass=" + pass
				+ ", r_no=" + r_no + ", info_no=" + info_no + ", owner=" + owner + "]";
	}
	
	@SuppressWarnings({ "null", "rawtypes", "unchecked" })
	public Map getMap() {
		HashMap map = new HashMap();
		map.put("id",this.id);
		map.put("name",this.name);
		map.put("phone",this.phone);
		map.put("email",this.email);
		map.put("pass",this.pass);
		map.put("r_no",this.r_no);
		map.put("info_no",this.info_no);
		map.put("owner",this.owner);
		return map;
	}

	

}
