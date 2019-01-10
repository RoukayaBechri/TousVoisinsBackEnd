package SiteLocation.SiteLocation.persistence;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Adresse implements Serializable{
	@Id
	@GeneratedValue
	 private Long id; 
     private int houseNumber;
	 private String street;
	 private String city;
	 private String zipCode;
	 


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

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

	public Adresse(int houseNumber, String street, String city, String zipCode) {
		super();
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
	}
	 
	 
	 

}
