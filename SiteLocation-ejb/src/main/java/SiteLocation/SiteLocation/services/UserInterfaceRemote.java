package SiteLocation.SiteLocation.services;

import java.util.List;

import javax.ejb.Remote;
import javax.ws.rs.Path;

import SiteLocation.SiteLocation.persistence.SimpleUser;
import SiteLocation.SiteLocation.persistence.User;

@Remote
@Path("/User")
public interface UserInterfaceRemote {
	public User addUser(SimpleUser u);
	public void deleteUser(Long  idUser);
	public List<SimpleUser> getAllUser();
	public User getUserByID(Long idUser);
	public List<User> getUsersByAdresse(String city);
	
	



	
	
	

}
