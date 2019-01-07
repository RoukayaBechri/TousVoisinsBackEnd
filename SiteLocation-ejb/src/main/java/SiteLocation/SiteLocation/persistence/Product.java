package SiteLocation.SiteLocation.persistence;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Product {
	@Id
   @GeneratedValue 
	private int id;
	private String description;
	private String category;
	
	@OneToOne(mappedBy="product",cascade=CascadeType.REMOVE)
	private Publication publication;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Publication getPublication() {
		return publication;
	}

	public void setPublication(Publication publication) {
		this.publication = publication;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String description, String category) {
		super();
		this.description = description;
		this.category = category;
	}
	
	
	

}
