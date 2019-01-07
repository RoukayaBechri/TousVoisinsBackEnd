package SiteLocation.SiteLocation.services;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import SiteLocation.SiteLocation.persistence.Offre;
import SiteLocation.SiteLocation.persistence.Publication;
import SiteLocation.SiteLocation.persistence.Supply;

public class PublicationService implements PublicationServiceLocal,PublicationServiceRemote,Serializable {
   @PersistenceContext(unitName="SiteLocation-ejb")
   EntityManager em;

	@Override
	public void removePublication(Long idPub) {
		
		em.remove(em.find(Publication.class, idPub));
		
	}
	
	@Override
	public void validatePub(Long idPub) {
		Publication p=em.find(Publication.class, idPub);
		p.setValidState(true);
		
	}

	@Override
	public List<Publication> getListPublication() {
      Query q=em.createQuery("Select p from Publication p");
		return q.getResultList();
	}

	@Override
	public List<Publication> getListSypply() {
		Query q=em.createQuery("Select p from Publication p.TYPE_PUB like :x");
		q.setParameter("x", "Supply");
		return q.getResultList();
	}

	@Override
	public List<Publication> getListOffer() {
		Query q=em.createQuery("Select p from Publication p.TYPE_PUB like :x");
		q.setParameter("x", "Offer");
		return q.getResultList();
	}

	@Override
	public List<Publication> getListWaitingPub() {
		Query q=em.createQuery("Select p from Publication p.isValidState=:true");
		return q.getResultList();
	}

	@Override
	public Supply addSypply(Supply s) {
		// TODO Auto-generated method stub
		return null;
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
	public Offre addOffer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editOffer(Long idOffer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeOffer(Long idOffer) {
		// TODO Auto-generated method stub
		
	}
	
	








}
