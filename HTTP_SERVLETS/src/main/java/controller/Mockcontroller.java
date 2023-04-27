package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Mockdao;
import dto.Mockdto;

@WebServlet("/send")
public class Mockcontroller extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		System.out.println(id);
		System.out.println(name);
//		resp.getWriter().print(id);
//		resp.getWriter().print(name);
		RequestDispatcher dispatcher = req.getRequestDispatcher("fetch.jsp");
//		HttpSession httpSession=req.
		dispatcher.forward(req, resp);

//		Mockdto mockdto=new Mockdto();
//		mockdto.setId(id);
//		mockdto.setName(name);
//		
//		Mockdao mockdao=new Mockdao();
//		mockdao.insert(mockdto);

	}

}
