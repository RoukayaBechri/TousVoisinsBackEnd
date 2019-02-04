package SiteLocation.SiteLocation.persistence;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Product implements Serializable {
	@Id
    @GeneratedValue 
	private int id;
	private String productName;
	private double productPrice;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public Product() {
		super();
		
	}

	public Product(String productName, double productPrice) {
		super();
		
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	
	
	
	
	
	

	



	
	
	


	

	
	
	
	

}
