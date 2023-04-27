package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.HOperations;
import dto.HEmployee;

@WebServlet("/fetch")
public class HFetch extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		HOperations hOperations = new HOperations();
		HEmployee employee = hOperations.fetch(id);
		req.setAttribute("key", employee);
		RequestDispatcher dispatcher = req.getRequestDispatcher("fetch.jsp");
		dispatcher.forward(req, resp);
//		String id = req.getParameter("id");
//		String name = req.getParameter("name");
//		System.out.println(id);
//		System.out.println(name);
	}
}
