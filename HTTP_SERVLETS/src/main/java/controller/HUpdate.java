package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.HOperations;

import dto.HEmployee;

@WebServlet("/update")
public class HUpdate extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(arg0, resp);
		System.out.println("data came");
		String id = req.getParameter("id");
		String mno1 = req.getParameter("mno");
		long number = Long.parseLong(mno1);

		HOperations hOperations = new HOperations();
		hOperations.update(id, number);

	}
}
