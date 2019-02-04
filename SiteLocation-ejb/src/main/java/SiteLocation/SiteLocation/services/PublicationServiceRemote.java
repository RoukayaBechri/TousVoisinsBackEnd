
package SiteLocation.SiteLocation.services;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Remote;
import javax.jws.WebParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import SiteLocation.SiteLocation.persistence.Application;
import SiteLocation.SiteLocation.persistence.Offre;
import SiteLocation.SiteLocation.persistence.Publication;
import SiteLocation.SiteLocation.persistence.Supply;
@Remote

public interface PublicationServiceRemote extends Serializable {
	
	@DELETE
	@Path("/deletePub/{idPub}")
	public void removePublication(@PathParam(value="idPub")Long idPub);
	
	
	@PUT
	@Path("/validatePub/{idPub}")
	public void validatePub(@PathParam(value="idPub")int idPub);
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getListPublication")
	public List<Publication> getListPublication();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getAllSupply")
	public List<Supply> getListSypply();
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getListOffer")
	public List<Offre> getListOffer();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getListOfferById/{idUser}")
	public List<Offre> getListOfferById(@PathParam(value="idUser") int idUser);
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getListSupplyById/{idUser}")
	public List<Supply> getListSupplyById(@PathParam(value="idUser") int idUser);
	
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getAllWaitingPub")
	public List<Publication> getListWaitingPub();
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/addSupply/{idSimpleuser}/{idProduct}")
	public Supply addSupply(@WebParam Supply s, @PathParam(value="idSimpleuser")int idSimpleuser, @PathParam(value="idProduct") int idProduct);
	
	
	public void editSuply(Long idSupply);
	public void removeSupply(Long idSupply);
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/addOffer/{idSimpleuser}/{idProduct}/")
	public Offre addOffer(@WebParam Offre o, @PathParam(value="idSimpleuser")int idSimpleuser, @PathParam(value="idProduct")int idProduct);
	
	public void editOffer(Long idOffer);
	public void removeOffer(Long idOffer);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/PubByUser/{idUser}")
	public List<Publication> PubByUser(@PathParam(value="idUser") int idUser);
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/offreByUser/{idUser}")
	public List<Publication> offreByUser(@PathParam(value="idUser") int idUser);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/SupplyByUser/{idUser}")
	public List<Publication> SupplyByUser(@PathParam(value="idUser")int idUser);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/PubByCategory/{category}")
	public List<Publication> PubByCategory(@PathParam("category")String category);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/offreByCategoryObjet/{category}")
	public List<Offre> offreByCategoryObjet(@PathParam("category")String category);
	
	
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/supplyByCategoryObjet/{category}")
	public List<Supply> supplyByCategoryObjet(@PathParam("category")String category);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/offreByCategoryService/{category}")
	public List<Offre> offreByCategoryService(@PathParam("category")String category);
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/supplyByCategoryService/{category}")
	public List<Supply> supplyByCategoryService(@PathParam("category")String category);
	
	
	
	
	
	
	//Application
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/saveApplication/{idSimpleUser}/{idPublication}")
	public Application saveApplication(@WebParam Application application,@PathParam(value = "idSimpleUser") int idSimpleUser,@PathParam(value = "idPublication") int idPublication);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getApplicationsByPub/{idPublication}")
	public List<Application> getApplicationsByPub( @PathParam(value = "idPublication") int idPublication);
		
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getApplicationsBySimpleUser/{idSimpleUser}")
	public List<Application> getApplicationsBySimpleUser( @PathParam(value = "idSimpleUser") int idSimpleUser);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getApplicationsByUser/{idSUser}")
	public List<Application> getApplicationsBySUser( @PathParam(value = "idSUser") int idUser);
	
	 @PUT
	 @Consumes(MediaType.APPLICATION_JSON)
	 @Path("/updateNotificationAppBySimpleUser/{idSimpleUser}")
	 public List<Application> updateNotificationAppBySimpleUser( @PathParam(value = "idSimpleUser") int idSimpleUser);
	
	 @PUT
	 @Consumes(MediaType.APPLICATION_JSON)
	 @Path("/updateNotificationAppByPub/{idPub}")
	 public List<Application> updateNotificationAppByPub( @PathParam(value = "idPub") int idPub);
	
	 
	 
	 
	 
	 @PUT
	 @Consumes(MediaType.APPLICATION_JSON)
	 @Path("/acceptApplication/{idSimpleUser}/{idPublication}")
	 public Application acceptApp( @PathParam(value = "idSimpleUser") int idSimpleUser, @PathParam(value = "idPublication") int idPublication);
}
