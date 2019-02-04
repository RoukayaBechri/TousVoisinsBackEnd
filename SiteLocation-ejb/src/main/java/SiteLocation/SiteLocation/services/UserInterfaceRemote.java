package SiteLocation.SiteLocation.services;

import java.io.Serializable;
import java.sql.Blob;
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
import javax.ws.rs.core.MediaType;



import SiteLocation.SiteLocation.persistence.SimpleUser;
import SiteLocation.SiteLocation.persistence.User;

@Remote

public interface UserInterfaceRemote extends Serializable {
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/addUser")
	public SimpleUser addUser(@WebParam SimpleUser u);
	    
	
	
	@DELETE
	@Path("/deleteUser/{idUser}")
	public void deleteUser(@PathParam(value="idUser")int  idUser);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getAllUser")
	public List<SimpleUser> getAllUser();
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getUserByID/{idUser}")
	public User getUserByID(@PathParam(value="idUser")int idUser);
	
	
	@PUT
	@Consumes(MediaType.TEXT_PLAIN)
	@Path("/addUserPhoto/{idUser}")
	public User addUserPhoto( @PathParam(value="idUser")int idUser, @WebParam  String photo );
	
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/updateUser/{idUser}")
	public User updateUser( @PathParam(value="idUser")int idUser, @WebParam SimpleUser user );
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getPhotoByUser/{idUser}")
	public String getPhotoByUser(@PathParam(value="idUser")int idUser);
	
	
	
	
	public List<User> getUsersByAdresse(String city);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getNbSupplyByUser/{idUser}")
	public long getNbSupplyByUser(@PathParam(value="idUser")int idUser);
	
}
