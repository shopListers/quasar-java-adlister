package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.dao.MySQLUsersDao;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "controllers.EditProfileServlet", urlPatterns = "/editProfile")
public class EditProfileServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getSession().getAttribute("user") == null) {
			response.sendRedirect("/login");
			return;
		}
		request.getRequestDispatcher("/WEB-INF/editProfile.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String nickname = request.getParameter("nickname");
		String food = request.getParameter("food");
		String birthday = request.getParameter("birthday");
		String address = request.getParameter("address");
	}


	User user = new User(nickname, food, birthday, address);
        MySQLUsersDao.insert(user);
        response.sendRedirect("/profile");
}
