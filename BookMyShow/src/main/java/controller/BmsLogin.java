package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Operations;
import dto.BookMyShowAccount;

@WebServlet("/login")
public class BmsLogin extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String mail = req.getParameter("mail");
		String password = req.getParameter("password");

		Operations dao = new Operations();
		boolean flag = dao.check(mail, password);
		if (flag == true) {
			RequestDispatcher rd = req.getRequestDispatcher("tickets.jsp");
			rd.forward(req, resp);
		} else {
			req.setAttribute("message", "incorrect");
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			rd.include(req, resp);
		}
		
	}
}
