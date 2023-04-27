package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.HEmployee;

public class HOperations {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void insert(HEmployee employee) {
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}

	public void update(String id, long number) {
		HEmployee employee = entityManager.find(HEmployee.class, id);
		employee.setNumber(number);
		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();
	}

	public void delete(String id) {
		HEmployee employee = entityManager.find(HEmployee.class, id);
		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();
	}

	public HEmployee fetch(String id) {
		HEmployee employee = entityManager.find(HEmployee.class, id);
		return employee;
	}

	public List<HEmployee> fetchall() {
		Query query = entityManager.createQuery("select a from HEmployee a");
		List<HEmployee> employees = query.getResultList();
		return employees;
	}
}
