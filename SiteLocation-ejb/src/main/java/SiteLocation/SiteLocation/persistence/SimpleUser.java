package SiteLocation.SiteLocation.persistence;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="SimpleUser")
@AttributeOverrides({
    @AttributeOverride(name="name", column=@Column(name="FULLNAME")),
    @AttributeOverride(name="password", column=@Column(name="PASSWORD")),
    @AttributeOverride(name="email", column=@Column(name="EMAIL"))
})
public class SimpleUser extends User {
	
	
	private long phoneNumber;
	
	
	@OneToOne
	private Adresse adresse;
	private Runk runk;
	
	@OneToMany
	private List<Application> listApplicatins;
	
	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Runk getRunk() {
		return runk;
	}

	public void setRunk(Runk runk) {
		this.runk = runk;
	}

	public List<Application> getListApplicatins() {
		return listApplicatins;
	}

	public void setListApplicatins(List<Application> listApplicatins) {
		this.listApplicatins = listApplicatins;
	}

	
	
	
	

}
