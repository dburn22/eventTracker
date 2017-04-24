package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import data.GarageDAO;
import entities.Garage;

@RestController
public class GarageController {
	@Autowired
	private GarageDAO garagedao;

	// Testing method stub
	@RequestMapping(value = "ping", method = RequestMethod.GET)
	public String ping() {
		return "pong";
	}

	// Method gets a list of all makes
	@RequestMapping(path = "makes", method = RequestMethod.GET)
	public List<Garage> index() {
		return garagedao.index();
	}

}
