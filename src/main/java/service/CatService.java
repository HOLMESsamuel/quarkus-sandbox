package service;

import entity.Cat;
import org.eclipse.microprofile.opentracing.Traced;
import org.jboss.logging.Logger;
import repository.CatRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class CatService {

	//opentracing log
	private static final Logger LOG = Logger.getLogger(CatService.class);

	@Inject
	CatRepository catRepository;

	public List<Cat> getCat() {
		LOG.info("searching cats");
		return catRepository.listAll();
	}

	public Cat getCat(String name) {
		return catRepository.findByName(name);
	}

	public void createCat(Cat cat) {
		catRepository.persist(cat);
	}

	public void deleteCat(String name) {
		Cat cat = catRepository.findByName(name);
		if(cat != null) {
			catRepository.delete(cat);
		}
	}
}
