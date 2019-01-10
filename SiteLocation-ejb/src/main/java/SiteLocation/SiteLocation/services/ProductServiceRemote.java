package SiteLocation.SiteLocation.services;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Remote;
import javax.jws.WebParam;
import javax.persistence.Query;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import SiteLocation.SiteLocation.persistence.Objet;
import SiteLocation.SiteLocation.persistence.Product;
import SiteLocation.SiteLocation.persistence.Publication;
import SiteLocation.SiteLocation.persistence.Service;
import SiteLocation.SiteLocation.persistence.SubCategObject;

@Remote
@Path("/product")
public interface ProductServiceRemote extends Serializable {
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/addProduct")
	public Product addProduct(@WebParam(name="produit")Product p);
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/addService")
	public Service addService(@WebParam Service s);
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/addObjet")
	public Objet addObjet(@WebParam Objet o);
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/ProdByCategory/{category}")
	public List<Product> ProdByCategory(@PathParam("category")String category);
	

}
