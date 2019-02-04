package SiteLocation.SiteLocation.persistence;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Embeddable
public class Adresse implements Serializable{
	
	
	 private String street;
	 private String city;
	 private String zipCode;
	 




	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	

	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Adresse( String street, String city, String zipCode) {
		super();
		
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
	}
	 
	 
	 

}
