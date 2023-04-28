package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Ticketsdao;
import dto.Tickets;

@WebServlet("/tickets")
public class TicketsBook extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String movname = req.getParameter("moviename");
		String seat = req.getParameter("seatnumber");
		String s1 = req.getParameter("ticketprice");
		int price = Integer.parseInt(s1);
		String s2 = req.getParameter("ticketscount");
		int nooftickets = Integer.parseInt(s2);

		int nextprice = nooftickets * price;

		Tickets tickets = new Tickets();
		tickets.setCustomername(name);
		tickets.setMoviename(movname);
		tickets.setSeatnumber(seat);
		tickets.setTicketprice(nextprice);
		tickets.setTicketscount(nooftickets);

		Ticketsdao dao = new Ticketsdao();
		dao.book(tickets);

	}
}
