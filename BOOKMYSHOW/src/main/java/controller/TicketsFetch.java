package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Ticketsdao;
import dto.Tickets;

@WebServlet("/fetch")
public class TicketsFetch extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String s1 = req.getParameter("bookingid");
		int bookid = Integer.parseInt(s1);

		Ticketsdao dao = new Ticketsdao();
		Tickets a = dao.obtain(bookid);
		resp.getWriter().print(a);

	}
}
