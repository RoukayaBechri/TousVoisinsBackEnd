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
import javax.ws.rs.PathParam;

import SiteLocation.SiteLocation.persistence.Application;
import SiteLocation.SiteLocation.persistence.ApplicationPK;
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
	public Supply addSupply(Supply s,int idSimpleuser, int idProduct) {
		s.setDatePub(new Date());
		s.setValidState(false);
		SimpleUser sm=em.find(SimpleUser.class, idSimpleuser);
		Product p = em.find(Product.class, idProduct);
	    s.setSimpleUser(sm);
	    s.setProduct(p);
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
	public Offre addOffer(Offre o,int idSimpleuser, int idProduct) {
		o.setDatePub(new Date());
		o.setValidState(false);
		SimpleUser sm=em.find(SimpleUser.class, idSimpleuser);
		Product p = em.find(Product.class, idProduct);
	    o.setSimpleUser(sm);
	    o.setProduct(p);
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
	public List<Offre> getListOfferById(int idUser) {
		TypedQuery<Offre> query=em.createQuery("Select DISTINCT o from Offre o join o.simpleUser s where s.id=:idUser", Offre.class);
		query.setParameter("idUser", idUser);
		return query.getResultList();
	}
	
	
	

	@Override
	public List<Supply> getListSupplyById(int idUser) {
		TypedQuery<Supply> query=em.createQuery("Select DISTINCT o from Supply o join o.simpleUser s where s.id=:idUser", Supply.class);
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
			q.setParameter("category",category);
			return q.getResultList();
		}
	
	
	
	
	@Override
	public List<Offre> offreByCategoryObjet(String category) {
		Query q=em.createQuery("Select DISTINCT off from Offre off join off.product prod where prod.catObjet =:category", Offre.class);
		q.setParameter("category", category);
		return q.getResultList();
	}

	@Override
	public List<Supply> supplyByCategoryObjet(String category) {
		Query q=em.createQuery("Select DISTINCT supp from Supply supp join supp.product prod where prod.catObjet =:category", Supply.class);
		q.setParameter("category", category);
		return q.getResultList();
	}
	
	
	

	@Override
	public List<Offre> offreByCategoryService(String category) {
		Query q=em.createQuery("Select DISTINCT off from Offre off join off.product prod where prod.catService =:category", Offre.class);
		q.setParameter("category", category);
		return q.getResultList();
		
	}

	@Override
	public List<Supply> supplyByCategoryService(String category) {
		Query q=em.createQuery("Select DISTINCT supp from Supply supp join supp.product prod where prod.catService =:category", Supply.class);
		q.setParameter("category", category);
		return q.getResultList();
	}

	//Application
	@Override
	public Application saveApplication(Application application, int idSimpleUser, int idPublication) {	
		
			SimpleUser simpleUser = em.find( SimpleUser.class, idSimpleUser );
	        Publication publication= em.find( Publication.class, idPublication );
	        
	        ApplicationPK applicationPK = new ApplicationPK();
	        applicationPK.setIdSimpleUser(simpleUser.getId());
	        applicationPK.setIdPublication(publication.getId());
	        
	        application.setApplicationPK(applicationPK);
	        application.setDateApplication(new Date());
	        em.persist(application);
	        
	        return application;
	}


	@Override
	public List<Application> getApplicationsByPub(int idPublication) {
		TypedQuery<Application>  q =  em.createQuery("Select DISTINCT a from Application a join a.applicationPK p where p.idPublication =:idPublication   ", Application.class);
		q.setParameter("idPublication", idPublication);
		return q.getResultList();
	}
	
	@Override
    public List<Application> getApplicationsBySimpleUser(int idSimpleUser) {
        TypedQuery<Application>  q =  em.createQuery("Select DISTINCT a from Application a join a.publication p join p.simpleUser s where s.id =:idSimpleUser ", Application.class);
        q.setParameter("idSimpleUser", idSimpleUser);
        return q.getResultList();
    }
	
	
	
	@Override
	public List<Application> getApplicationsBySUser(int idUser) {
		 TypedQuery<Application>  q =  em.createQuery("Select DISTINCT a from Application a join a.simpleUser s   where s.id =:idUser ", Application.class);
	        q.setParameter("idUser", idUser);
	        return q.getResultList();
	}

	@Override
    public List<Application> updateNotificationAppBySimpleUser(int idSimpleUser) {
        TypedQuery<Application>  q =  em.createQuery("Select DISTINCT a from Application a join a.publication p join p.simpleUser s where s.id =:idSimpleUser ", Application.class);
        q.setParameter("idSimpleUser", idSimpleUser);

        for (int i = 0; i < q.getResultList().size(); i++) {
            
            Application app = q.getResultList().get(i);
            app.setReadApp(true);
            app.setValidApp(true);
            
        }
        return q.getResultList();        
        
    }
	
	

	@Override
	public List<Application> updateNotificationAppByPub(int idPub) {
		
		TypedQuery<Application>  q =  em.createQuery("Select DISTINCT a from Application a join a.publication p where p.id =:idPub ", Application.class);
        q.setParameter("idPub", idPub);

        for (int i = 0; i < q.getResultList().size(); i++) {
            
            Application app = q.getResultList().get(i);
            app.setReadApp(true);
           
            
        }
        return q.getResultList(); 
	}

	@Override
	public Application acceptApp(int idSimpleUser, int idPublication) {
		TypedQuery<Application>  q =  em.createQuery("Select DISTINCT a from Application a join  a.simpleUser u join a.publication p where p.id =:idPublication and  u.id=:idSimpleUser ", Application.class);
		 q.setParameter("idSimpleUser", idSimpleUser);
		 q.setParameter("idPublication", idPublication);
		 Application app=q.getSingleResult();
		 app.setValidApp(true);
		 return q.getSingleResult();
	}
 
	
	
	

	}
	
		
	








