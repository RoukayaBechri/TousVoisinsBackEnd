package SiteLocation.SiteLocation.services;

import java.util.List;

import javax.ejb.Remote;
import javax.jws.WebParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import SiteLocation.SiteLocation.persistence.Offre;
import SiteLocation.SiteLocation.persistence.Publication;
import SiteLocation.SiteLocation.persistence.Supply;
@Remote
@Path("/publication")
public interface PublicationServiceRemote {
	
	@DELETE
	@Path("/deletePub/{idPub}")
	public void removePublication(@PathParam(value="idPub")Long idPub);
	
	
	@PUT
	@Path("/validatePub/{idPub}")
	public void validatePub(@PathParam(value="idPub")Long idPub);
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getAllPublication")
	public List<Publication> getListPublication();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getAllSupply")
	public List<Publication> getListSypply();
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getAllOffer")
	public List<Publication> getListOffer();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getAllWaitingPub")
	public List<Publication> getListWaitingPub();
	
	
	public Supply addSypply(Supply s);
	public void editSuply(Long idSupply);
	public void removeSupply(Long idSupply);
	
	
	public Offre addOffer();
	public void editOffer(Long idOffer);
	public void removeOffer(Long idOffer);



}
