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
	public Garage create(Garage garage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Garage update(int id, Garage garage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean destroy(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
