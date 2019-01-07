package SiteLocation.SiteLocation.persistence;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_Pub",discriminatorType=DiscriminatorType.STRING,length=4)
public class Publication {
	@Id
	@GeneratedValue
	private int id;
	private String description;
	private Date datePub;
	private boolean isValidState;
	
	@OneToOne
	private Product product;
	
	@OneToMany(mappedBy="publication")
	private List<Application> applications;
	
	@OneToMany(mappedBy="publication")
	private List<Feedback> feedbacks;

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

	public List<Application> getApplications() {
		return applications;
	}

	public void setApplications(List<Application> applications) {
		this.applications = applications;
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
