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

@WebServlet("/signup")
public class BmsSignup extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String mail = req.getParameter("mail");
		long phone = Long.parseLong(req.getParameter("phone"));
		String password = req.getParameter("password");
		String confirmpassword = req.getParameter("confirmpassword");

		BookMyShowAccount bms = new BookMyShowAccount();
		bms.setName(name);
		bms.setMail(mail);
		bms.setPh(phone);
		bms.setPassword(password);

		Operations dao = new Operations();
		dao.add(bms);

		RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
		rd.forward(req, resp);

	}
}
