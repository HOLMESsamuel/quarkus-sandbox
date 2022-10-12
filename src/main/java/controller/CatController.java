package controller;

import entity.Cat;
import service.CatService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/cat")
public class CatController {

	@Inject
	CatService catService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Cat getCat() {
		return catService.getCat();
	}
}
