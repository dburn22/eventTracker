package data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import entities.Garage;

@Transactional
public class GarageDAOImpl implements GarageDAO {
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Garage> index() {
		String query = "Select g from Garage g where g.make IS NOT NULL" ;
		return em.createQuery(query, Garage.class).getResultList();
	}

	@Override
	public Garage show(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Garage create(Garage make) {
		em.persist(make);
		em.flush();
		return make;
	}

	@Override
	public Garage update(int id, Garage garage) {
		Garage g = em.find(Garage.class, id);
		g.setMake(garage.getMake());
		em.flush();
		return g;
	}

	@Override
	public boolean destroy(int id) {
		Garage g = em.find(Garage.class, id);
		em.remove(g);
		return !em.contains(g);
	}
	

}
