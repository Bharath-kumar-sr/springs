package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Operator;

public class Operations {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Operator verify(String email) {
		Operator check = entityManager.find(Operator.class, email);
		return check;
	}

	public void signup(Operator operator) {
		entityTransaction.begin();
		entityManager.persist(operator);
		entityTransaction.commit();
	}

	public Operator login(String email, String password) {
		Operator operator = entityManager.find(Operator.class, email);
		return operator;

	}
}
