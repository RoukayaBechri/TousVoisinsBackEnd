package SiteLocation.SiteLocation.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import SiteLocation.SiteLocation.persistence.SimpleUser;
import SiteLocation.SiteLocation.persistence.User;

public class UserService implements UserInterfaceRemote {
    @PersistenceContext(unitName="SiteLocation-ejb")
    EntityManager em;
    
    
	@Override
	public User addUser(SimpleUser u) {
		em.persist(u);
		return u;
	}

	@Override
	public void deleteUser(Long idUser) {
		em.remove(em.find(SimpleUser.class, idUser));
		
	}

	@Override
	public List<SimpleUser> getAllUser() {
		Query q=em.createQuery("Select u from SimpleUser");
		return q.getResultList();
	}

	@Override
	public SimpleUser getUserByID(Long idUser) {
		SimpleUser u=em.find(SimpleUser.class, idUser);
		return u;
	}

	@Override
	public List<User> getUsersByAdresse(String city) {
		Query q=em.createQuery("Select u from SimpleUser u where u.adresse.city like:x");
		q.setParameter("x", city);
		return q.getResultList();
	}

}
