package SiteLocation.SiteLocation.persistence;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;

@Entity
@DiscriminatorValue(value="Objet")
public class Objet extends Product implements Serializable{
	@Enumerated(EnumType.ORDINAL)
	//@Column(name = "venue_type")
	private SubCategObject catObjet;
	private String modeExpl;//A louer ou A acheter

	public Objet(SubCategObject catObjet, String modeExpl) {
		super();
		this.catObjet = catObjet;
		this.modeExpl = modeExpl;
	}

	public SubCategObject getCatObjet() {
		return catObjet;
	}

	public void setCatObjet(SubCategObject catObjet) {
		this.catObjet = catObjet;
	}


	public String getModeExpl() {
		return modeExpl;
	}

	public void setModeExpl(String modeExpl) {
		this.modeExpl = modeExpl;
	}

	public Objet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Objet(String name, double price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	public Objet(String modeExpl) {
		super();
		this.modeExpl = modeExpl;
	}
	
	

}
