package SiteLocation.SiteLocation.persistence;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="typePub",discriminatorType=DiscriminatorType.STRING)
public class Publication implements Serializable{
	@Id
	@GeneratedValue
	private int id;
	private String nomPublication;
	private String description;
	private String photo;
	@Temporal(TemporalType.DATE)
	private Date datePub;
	private boolean validState;
	
	@OneToOne
	private Product product;
	
	
	@ManyToOne
	private SimpleUser simpleUser;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

	public boolean isValidState() {
		return validState;
	}

	public void setValidState(boolean validState) {
		this.validState = validState;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDatePub() {
		return datePub;
	}

	public void setDatePub(Date datePub) {
		this.datePub = datePub;
	}



	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	

	public SimpleUser getSimpleUser() {
		return simpleUser;
	}

	public void setSimpleUser(SimpleUser simpleUser) {
		this.simpleUser = simpleUser;
	}

	
	public String getNomPublication() {
		return nomPublication;
	}

	public void setNomPublication(String nomPublication) {
		this.nomPublication = nomPublication;
	}
	

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Publication() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Publication(String nomPublication, String description, Date datePub, boolean validState, Product product,
			SimpleUser simpleUser) {
		super();
		this.nomPublication = nomPublication;
		this.description = description;
		this.datePub = datePub;
		this.validState = validState;
		this.product = product;
		this.simpleUser = simpleUser;
	}
	
	

}
