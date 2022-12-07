package service;

import entity.FunFact;
import org.eclipse.microprofile.opentracing.Traced;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Service client rest d'une API meteo
 */
@RegisterRestClient
@Produces(MediaType.APPLICATION_JSON)
@Traced
public interface FunFactService {

	@GET
	@Path("/fact")
	FunFact getCatFunFact();
}
