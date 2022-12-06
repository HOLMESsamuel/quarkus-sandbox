package repository;

import entity.Cat;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CatRepository implements PanacheRepositoryBase<Cat, Long> {

	public Cat findByName(String name) {
		return find("name", name).firstResult();
	}

}
