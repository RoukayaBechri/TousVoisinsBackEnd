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
	private String description;
	@Temporal(TemporalType.DATE)
	private Date datePub;
	private boolean isValidState;
	
	@OneToOne
	private Product product;
	
	
	@ManyToOne
	private SimpleUser simpleUser;
	
	//@OneToMany(mappedBy="publication")
	//private List<Application> applications;
	
	//@OneToMany(mappedBy="publication")
	//private List<Feedback> feedbacks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public boolean isValidState() {
		return isValidState;
	}

	public void setValidState(boolean isValidState) {
		this.isValidState = isValidState;
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

	public Publication() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Publication(String description, Date datePub, boolean isValidState) {
		super();
		this.description = description;
		this.datePub = datePub;
		this.isValidState = isValidState;
	}
	

}
