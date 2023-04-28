package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Bms;

public class Bmsdao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void add(Bms bms) {
		entityTransaction.begin();
		entityManager.persist(bms);
		entityTransaction.commit();
	}

	public boolean check(String mailfrompage, String passwordfrompage) {
		Bms bms = entityManager.find(Bms.class, mailfrompage);
		String email = bms.getMail();
		String password = bms.getPassword();

		if (mailfrompage.equals(email) && passwordfrompage.equals(password)) {
			return true;
		} else {
			return false;
		}
	}

}
