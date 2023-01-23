package utils;

import org.eclipse.microprofile.rest.client.ext.ClientHeadersFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;

@ApplicationScoped
public class RequestHeaderFactory implements ClientHeadersFactory {

	@Override
	public MultivaluedMap<String, String> update(MultivaluedMap<String, String> incomingHeaders, MultivaluedMap<String, String> clientOutgoingHeaders) {
		MultivaluedMap<String, String> result = new MultivaluedHashMap<>();
		//exemples de champs a ajouter en header
//		result.add("pe-nom-application", "da028");
//		result.add("Accept", "application/json");
		return result;
	}
}
