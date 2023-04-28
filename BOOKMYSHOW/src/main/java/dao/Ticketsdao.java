package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Tickets;

public class Ticketsdao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void book(Tickets tickets) {
		entityTransaction.begin();
		entityManager.persist(tickets);
		entityTransaction.commit();
	}

	public Tickets obtain(int bookid) {
		Tickets tickets = entityManager.find(Tickets.class, bookid);
		return tickets;
	}

}
