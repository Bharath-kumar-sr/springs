package programs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.springframework.stereotype.Component;

@Component
public class Operations {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void signup(Emplyoee emplyoee) {
		entityTransaction.begin();
		entityManager.persist(emplyoee);
		entityTransaction.commit();
	}

	public void delete(int id) {
		Emplyoee emplyoee = entityManager.find(Emplyoee.class, id);
		entityTransaction.begin();
		entityManager.remove(emplyoee);
		entityTransaction.commit();
	}

	public Emplyoee fetch(int id) {
		Emplyoee emplyoee = entityManager.find(Emplyoee.class, id);
		return emplyoee;
	}

	public void update(int id, long number) {
		Emplyoee emplyoee = entityManager.find(Emplyoee.class, id);
		emplyoee.setNumber(number);
		entityTransaction.begin();
		entityManager.merge(emplyoee);
		entityTransaction.commit();

	}
}
