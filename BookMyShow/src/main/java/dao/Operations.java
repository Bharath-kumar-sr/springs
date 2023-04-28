package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.BookMyShowAccount;

public class Operations {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void add(BookMyShowAccount bms) {
		entityTransaction.begin();
		entityManager.persist(bms);
		entityTransaction.commit();
	}

	public boolean check(String mailfrompage, String passwordfrompage) {
		BookMyShowAccount bms = entityManager.find(BookMyShowAccount.class, mailfrompage);
		String email = bms.getMail();
		String password = bms.getPassword();

		if (mailfrompage.equals(email) && passwordfrompage.equals(password)) {
			return true;
		} else {
			return false;
		}
	}

}
