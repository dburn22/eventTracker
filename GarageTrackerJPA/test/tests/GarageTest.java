package tests;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entities.Garage;

public class GarageTest {
	private EntityManagerFactory emf = null;
	private EntityManager em = null;

	@Before
	public void setUp() throws Exception {
		emf = Persistence.createEntityManagerFactory("Garage");
		em = emf.createEntityManager();

	}

	@After
	public void tearDown() throws Exception {
		em.close();
		emf.close();
	}

	@Test
	public void testingDb() {
		Garage garage = em.find(Garage.class, 1);
		assertEquals("Porsche", garage.getMake());

	}

	@Test
	public void test() {
		boolean pass = true;
		assertEquals(pass, true);
	}

}
