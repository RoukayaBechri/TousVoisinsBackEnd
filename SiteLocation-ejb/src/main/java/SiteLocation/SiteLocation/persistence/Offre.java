package SiteLocation.SiteLocation.persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;


/**@Table(name="Offre")
@AttributeOverrides({
    @AttributeOverride(name="description", column=@Column(name="description")),
    @AttributeOverride(name="datePub", column=@Column(name="datePub")),
    @AttributeOverride(name="isValidState", column=@Column(name="isValidState"))
})*/
@Entity
@DiscriminatorValue(value="Offre")
public class Offre extends Publication implements Serializable {
	private String offerType;
	String dateExpiration;
	private String offerAdress;
	
	

	public String getDateExpiration() {
		return dateExpiration;
	}
	public void setDateExpiration(String dateExpiration) {
		this.dateExpiration = dateExpiration;
	}
	public String getOfferType() {
		return offerType;
	}
	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}
	
	public String getOfferAdress() {
		return offerAdress;
	}
	public void setOfferAdress(String offerAdress) {
		this.offerAdress = offerAdress;
	}
	
		// TODO Auto-generated constructor stub
	
	
	public Offre() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Offre(String nomPublication, String description, Date datePub, boolean isValidState, Product product, SimpleUser simpleUser, String offerType, String dateExpiration, String offerAdress) {
		super(nomPublication, description, datePub, isValidState, product, simpleUser);
		this.offerType = offerType;
		this.dateExpiration = dateExpiration;
		this.offerAdress = offerAdress;
	}
	
	
	
	
	

}
