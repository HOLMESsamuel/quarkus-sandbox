package controller;

import entity.Cat;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import service.CatService;
import service.FunFactService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Path("/cat")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
public class CatController {

	@Inject
	CatService catService;

	//restClient annotation is needed to inject the client
	@Inject
	@RestClient
	FunFactService funFactService;

	@GET
	public List<Cat> getCat() {
		return catService.getCat();
	}

	@GET
	@Path("/{name}")
	public Cat getCat(@PathParam("name") String name) {
		return catService.getCat(name);
	}

	@POST
	public Response createCat(Cat cat) {
		if (cat.getName() == null || catService.getCat(cat.getName()) != null) {
			return Response.status(409).build();
		}
		catService.createCat(cat);
		return Response.created(URI.create("/" + cat.getName())).build();
	}

	@DELETE
	@Path("/{name}")
	public void deleteCat(@PathParam("name") String name) {
		catService.deleteCat(name);
	}

	@GET
	@Path("/funfact")
	@Produces(MediaType.TEXT_PLAIN)
	public String getFunFact() {
		return funFactService.getCatFunFact().getFact();
	}

}
