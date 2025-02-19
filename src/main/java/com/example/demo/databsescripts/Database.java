package com.example.demo.databsescripts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

@Repository
public class Database {
private Connection connection;

private Database()  throws ClassNotFoundException, SQLException {
	Class.forName("org.postgresql.Driver");
	connection = DriverManager.getConnection("jdbc:postgresql://dpg-cuer8htumphs73aia8d0-a.singapore-postgres.render.com/recidapp","vedu","tD28GiMYZkHhfJjPPuIOvtEKu8r27A2o");
}

public ResultSet executequery(String query) throws SQLException {
	PreparedStatement ps = connection.prepareStatement(query);
	ResultSet rs = ps.executeQuery();
	
	return rs;
}

public void runquery(String query) throws SQLException {
	connection.prepareCall(query);
}



}
