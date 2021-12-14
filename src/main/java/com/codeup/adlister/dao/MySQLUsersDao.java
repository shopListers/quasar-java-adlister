package com.codeup.adlister.dao;

import com.codeup.adlister.Config;
import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java.sql.*;
import com.mysql.cj.jdbc.Driver;

public class MySQLUsersDao implements Users {
	private Connection connection;

	public MySQLUsersDao(Config config) {
		try {
			DriverManager.registerDriver(new Driver());
			this.connection = DriverManager.getConnection(
					config.getUrl(),
					config.getUser(),
					config.getPassword()
			);
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
	}



	@Override
	public User findByUsername(String username) {
		String query = "SELECT * FROM users WHERE username = ? LIMIT 1";
		try {
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setString(1, username);
			return extractUser(stmt.executeQuery());
		} catch (SQLException e) {
			throw new RuntimeException("Error finding a user by username", e);
		}
	}

	@Override
	public Long insert(User user) {
		String query = "INSERT INTO users(username, email, password, nickname, food, birthday, address) VALUES (?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, user.getUsername());
			stmt.setString(2, user.getEmail());
			stmt.setString(3, user.getPassword());
			stmt.setString(4, user.getNickname());
			stmt.setString(5, user.getFood());
			stmt.setString(6, user.getBirthday());
			stmt.setString(7, user.getAddress());
			stmt.executeUpdate();
			ResultSet rs = stmt.getGeneratedKeys();
			rs.next();
			return rs.getLong(1);
		} catch (SQLException e) {
			throw new RuntimeException("Error creating new user, username already taken", e);
		}
	}

	private User extractUser(ResultSet rs) throws SQLException {
		if (! rs.next()) {
			return null;
		}
		return new User(
				rs.getLong("id"),
				rs.getString("username"),
				rs.getString("email"),
				rs.getString("password"));
	}

}

//pls work