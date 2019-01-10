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
	private String name;
	private double price;
	
	
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	


	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
	

}
