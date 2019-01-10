package SiteLocation.SiteLocation.services;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.ws.rs.Path;

import SiteLocation.SiteLocation.persistence.Offre;
import SiteLocation.SiteLocation.persistence.Product;
import SiteLocation.SiteLocation.persistence.Publication;
import SiteLocation.SiteLocation.persistence.SimpleUser;
import SiteLocation.SiteLocation.persistence.SubCategObject;
import SiteLocation.SiteLocation.persistence.Supply;
@Stateless
@Path("/Publication")
public class PublicationService implements PublicationServiceLocal,PublicationServiceRemote,Serializable {
   @PersistenceContext(unitName="SiteLocation-ejb")
   EntityManager em;

	@Override
	public void removePublication(Long idPub) {
		
		em.remove(em.find(Publication.class, idPub));
		
	}
	
	@Override
	public void validatePub(int idPub) {
		Publication p=em.find(Publication.class, idPub);
		p.setValidState(true);
		
	}

	@Override
	public List<Publication> getListPublication() {
 
		return em.createQuery("from Publication",Publication.class).getResultList();
	}

	@Override
	public List<Supply> getListSypply() {
		Query q=em.createQuery("Select s from Supply s");
		return q.getResultList();
	}

	@Override
	public List<Offre> getListOffer() {
		Query q=em.createQuery("Select o from Offre o",Offre.class );
		//q.setParameter("x", "Offre");
		return q.getResultList();
	}

	@Override
	public List<Publication> getListWaitingPub() {
		Query q=em.createQuery("Select p from Publication p where p.isValidState =false");
		return q.getResultList();
	}

	@Override
	public Supply addSupply(Supply s,int idSimpleuser) {
		s.setDatePub(new Date());
		s.setValidState(false);
		SimpleUser sm=em.find(SimpleUser.class, idSimpleuser);
	    s.setSimpleUser(sm);
		em.persist(s);
		return s;
	}

	@Override
	public void editSuply(Long idSupply) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeSupply(Long idSupply) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Offre addOffer(Offre o,int idSimpleuser) {
		o.setDatePub(new Date());
		o.setValidState(false);
		SimpleUser sm=em.find(SimpleUser.class, idSimpleuser);
	    o.setSimpleUser(sm);
		em.persist(o);
		return o;
	}

	@Override
	public void editOffer(Long idOffer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeOffer(Long idOffer) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Publication> PubByUser(int idUser)
	{
		TypedQuery<Publication> query=em.createQuery("Select DISTINCT p from Publication p join p.simpleUser s where s.id=:idUser", Publication.class);
		query.setParameter("idUser", idUser);
		return query.getResultList();
		
	}

	@Override
	public List<Publication> offreByUser(int idUser) {
		TypedQuery<Publication> query=em.createQuery("Select DISTINCT o from Offre o join o.simpleUser s where s.id=:idUser",Publication.class);
		query.setParameter("idUser", idUser);
		return query.getResultList();
	}

	@Override
	public List<Publication> SupplyByUser(int idUser) {
		TypedQuery<Publication> query=em.createQuery("Select DISTINCT su from Supply su join su.simpleUser s where s.id=:idUser",Publication.class);
		query.setParameter("idUser", idUser);
		return query.getResultList();
	}

	@Override
	public List<Publication> PubByCategory(String category) {
		Query q=em.createQuery("Select DISTINCT pub from Publication pub join pub.product prod where prod.catObjet =:category", Publication.class);
			q.setParameter("category",SubCategObject.valueOf(category));
			return q.getResultList();
		}
	}
	
		
	








