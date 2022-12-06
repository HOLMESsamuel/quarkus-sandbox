package controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ping")
public class PingController {

	@Produces(MediaType.TEXT_PLAIN)
	@GET
	public String ping() {
		return "pong";
	}
}
