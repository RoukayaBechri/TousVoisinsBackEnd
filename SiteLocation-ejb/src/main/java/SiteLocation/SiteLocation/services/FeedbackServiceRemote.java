package SiteLocation.SiteLocation.services;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Remote;
import javax.jws.WebParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import SiteLocation.SiteLocation.persistence.Feedback;
@Remote
public interface FeedbackServiceRemote extends Serializable {
	
	 @POST
	    @Consumes(MediaType.APPLICATION_JSON)
	    @Path("/saveFeedback/{idSimpleUser1}/{idSimpleUser2}")
	    Feedback saveFeedback(@WebParam Feedback feedback, @PathParam(value = "idSimpleUser1") int idSimpleUser1, @PathParam(value = "idSimpleUser2") int idSimpleUser2);

	 @POST
	    @Consumes(MediaType.APPLICATION_JSON)
	    @Path("/saveRunk/{idSimpleUser1}/{idSimpleUser2}")
	    Feedback saveRunk(@WebParam Feedback feedback, @PathParam(value = "idSimpleUser1") int idSimpleUser1, @PathParam(value = "idSimpleUser2") int idSimpleUser2);

	 
	    @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    @Path("/getFeedbacksBySimpleUser/{idSimpleUser}")
	    List<Feedback> getFeedbacksBySimpleUser(@PathParam(value = "idSimpleUser") int idSimpleUser);

	    @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    @Path("/getRunk/{idSimpleUser}")
	    double getRunk(@PathParam(value = "idSimpleUser") int idSimpleUser);

}
