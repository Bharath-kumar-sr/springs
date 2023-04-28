package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Bmsdao;

@WebServlet("/login")
public class BmsLogin extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String mail = req.getParameter("mail");
		String password = req.getParameter("password");

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		Bmsdao dao = new Bmsdao();
		boolean flag = dao.check(mail, password);
		if (flag == true) {
			RequestDispatcher rd = req.getRequestDispatcher("tickets.html");
			rd.forward(req, resp);
		} else {
			out.println("Incorrect username or password");
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
			rd.include(req, resp);
		}

	}
}
