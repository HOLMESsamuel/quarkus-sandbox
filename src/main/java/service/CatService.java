package service;

import entity.Cat;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CatService {

	public Cat getCat() {
		return new Cat("Razmo", "2");
	}
}
