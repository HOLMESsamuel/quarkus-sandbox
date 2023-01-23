package service;

import entity.FunFact;
import org.eclipse.microprofile.opentracing.Traced;
import org.eclipse.microprofile.rest.client.annotation.RegisterClientHeaders;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import utils.RequestHeaderFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Service client rest d'une API meteo
 */
@RegisterRestClient
@Produces(MediaType.APPLICATION_JSON)
//possibilité d'ajouter des headers custom via une classe de fabrication des headers
@RegisterClientHeaders(RequestHeaderFactory.class)
@Traced
public interface FunFactService {

	@GET
	@Path("/fact")
	FunFact getCatFunFact();
}
