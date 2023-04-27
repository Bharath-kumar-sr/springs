package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.HOperations;
import dto.HEmployee;

@WebServlet("/fetchall")
public class HFetchall extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HOperations hOperations = new HOperations();
		List<HEmployee> emp = hOperations.fetchall();
		System.out.println("came");
		req.setAttribute("key", emp);
		RequestDispatcher dispatcher = req.getRequestDispatcher("fetchall.jsp");
		dispatcher.include(req, resp);
	}
}
