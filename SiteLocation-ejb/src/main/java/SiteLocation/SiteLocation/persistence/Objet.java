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
	
	private String catObjet;
	private String modeExpl;//A louer ou A acheter
	private String dureeExpl;

	public Objet(String catObjet, String modeExpl, String dureeExpl) {
		super();
		this.catObjet = catObjet;
		this.modeExpl = modeExpl;
		this.dureeExpl= dureeExpl;
	}

	public String getDureeExpl() {
		return dureeExpl;
	}

	public void setDureeExpl(String dureeExpl) {
		this.dureeExpl = dureeExpl;
	}

	public String getCatObjet() {
		return catObjet;
	}

	public void setCatObjet(String catObjet) {
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

	public Objet(String name, double price,String catObjet, String modeExpl, String dureeExpl) {
		super(name, price);
		this.catObjet= catObjet;
		this.modeExpl = modeExpl;
		this.dureeExpl = dureeExpl;
	}

	
	
	

}
