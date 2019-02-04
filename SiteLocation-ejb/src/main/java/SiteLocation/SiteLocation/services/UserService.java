package SiteLocation.SiteLocation.services;

import java.sql.Blob;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.ws.rs.Path;

import SiteLocation.SiteLocation.persistence.SimpleUser;
import SiteLocation.SiteLocation.persistence.User;
@Stateless
@Path("/User")
public class UserService implements UserInterfaceRemote {
    @PersistenceContext(unitName="SiteLocation-ejb")
    EntityManager em;
    
    
	@Override
	public SimpleUser addUser(SimpleUser u) {
		em.persist(u);
		return u;
	}

	@Override
	public void deleteUser(int idUser) {
		em.remove(em.find(SimpleUser.class, idUser));
		System.out.println("user removed");
		
	}

	@Override
	public List<SimpleUser> getAllUser() {
		Query q=em.createQuery("Select u from SimpleUser u");
		return q.getResultList();
	}
	
	

	

	
	
	

	@Override
	public User addUserPhoto(int idUser, String photo) {
		SimpleUser u=em.find(SimpleUser.class, idUser);
		u.setUserPhoto(photo);
		return u;
	}
	
	

	@Override
	public User updateUser(int idUser, SimpleUser user) {
		/*
		SimpleUser u=em.find(SimpleUser.class, idUser);
		u.setUserName(user.getUserName());
		u.setUserLastName(user.getUserLastName());
		u.setUserType(user.getUserType());
		u.setUserAdresse(user.getUserAdresse());
		u.setUserBirthDate(user.getUserBirthDate());
		u.setUserDescription(user.getUserDescription());
		u.setUserGender(user.getUserGender());
		u.setUserPhone(user.getUserPhone());
		u.setUserEmail(user.getUserEmail());
		u.setUserPassword(user.getUserPassword());
		u.setUserPhoto(user.getUserPhoto());
		return user;
		*/
		user.setId(idUser);
		em.merge(user);
		return user;
	}

	@Override
	public String getPhotoByUser(int idUser) {
		SimpleUser u=em.find(SimpleUser.class, idUser);
	    return	u.getUserPhoto().toString();
		
	}

	@Override
	public SimpleUser getUserByID(int idUser) {
		SimpleUser u=em.find(SimpleUser.class, idUser);
		return u;
	}

	@Override
	public List<User> getUsersByAdresse(String city) {
		Query q=em.createQuery("Select u from SimpleUser u where u.adresse.city like:x");
		q.setParameter("x", city);
		return q.getResultList();
	}
	
	@Override
	public long getNbSupplyByUser(int idUser) {
		TypedQuery<Long> query = em.createQuery("select count(s) from Supply s join s.simpleUser su where su.id=:idUser", Long.class)
				.setParameter("idUser",idUser);
		return query.getSingleResult();
	
	}

}
