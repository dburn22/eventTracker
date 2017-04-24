package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="garage")
public class Garage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String make;

	private String model;

	private String color;

	private int whp;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWhp() {
		return whp;
	}

	public void setWhp(int whp) {
		this.whp = whp;
	}

	@Override
	public String toString() {
		return "Garage [id=" + id + ", make=" + make + ", model=" + model + ", color=" + color + ", whp=" + whp + "]";
	}
}
