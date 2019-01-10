package SiteLocation.SiteLocation.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.Path;

import SiteLocation.SiteLocation.persistence.Objet;
import SiteLocation.SiteLocation.persistence.Product;
import SiteLocation.SiteLocation.persistence.Service;
import SiteLocation.SiteLocation.persistence.SubCategObject;
@Path("Product")
@Stateless
public class ProductService implements ProductServiceRemote {
	 @PersistenceContext(unitName="SiteLocation-ejb")
	   EntityManager em;
	
	@Override
	public Product addProduct(Product p) {
		em.persist(p);
		return p;
	}

	@Override
	public Service addService(Service s) {
		em.persist(s);
		return s;
	}

	@Override
	public Objet addObjet(Objet o) {
		em.persist(o);
		return o;
	}

	@Override
	public List<Product> ProdByCategory(String category) {
		Query q=em.createQuery("Select DISTINCT p from Product p where p.catObjet =:category", Product.class);
		q.setParameter("category",SubCategObject.valueOf(category));
		return q.getResultList();
	}

	
	
	

}
