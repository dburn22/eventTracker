package data;

import java.util.List;

import entities.Garage;

public interface GarageDAO {

	public List<Garage> index();

	public Garage show(int id);

	public Garage create(Garage garage);

	public Garage update(int id, Garage garage);

	public boolean destroy(int id);

}
