package SiteLocation.SiteLocation.persistence;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="Offer")
public class Offre extends Publication {
	private String offerType;
	int offerDuration;
	private String offerAdress;

	public String getOfferType() {
		return offerType;
	}
	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}
	public int getOfferDuration() {
		return offerDuration;
	}
	public void setOfferDuration(int offerDuration) {
		this.offerDuration = offerDuration;
	}
	public String getOfferAdress() {
		return offerAdress;
	}
	public void setOfferAdress(String offerAdress) {
		this.offerAdress = offerAdress;
	}
	
		// TODO Auto-generated constructor stub
	
	public Offre(String offerType, int offerDuration, String offerAdress) {
		super();
		this.offerType = offerType;
		this.offerDuration = offerDuration;
		this.offerAdress = offerAdress;
	}
	public Offre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Offre(String description, Date datePub, boolean isValidState) {
		super(description, datePub, isValidState);
		// TODO Auto-generated constructor stub
	}
	

}
