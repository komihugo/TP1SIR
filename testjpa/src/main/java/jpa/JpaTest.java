package jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import domain.Home;
import domain.Person;

public class JpaTest {
	private EntityManager manager;
	public JpaTest(EntityManager manager) {
		this.manager = manager;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql");
		EntityManager manager = factory.createEntityManager();
		JpaTest test = new JpaTest(manager);
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		try {
			test.createPersons();
		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();
		test.listPersons();
			
   	 manager.close();
		System.out.println(".. done");
	}
	private void createPersons() {
		int numOfPerson = manager.createQuery("Select a From Person a", Person.class).getResultList().size();
		if (numOfPerson == 0) {
			Person personnes = new Person("komi","toto","test@test");
			Person personne1 = new Person("hugo","tchidi","gogo@test");
			manager.persist(personnes);
			manager.persist(personne1);
		}
	}
	private void listPersons() {
		List<Person> resultList = manager.createQuery("Select a From Person a", Person.class).getResultList();
		System.out.println("num of person:" + resultList.size());
		for (Person next : resultList) {
			System.out.println("next person: " + next);
		}
	}
}
