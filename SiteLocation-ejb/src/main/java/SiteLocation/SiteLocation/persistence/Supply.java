package SiteLocation.SiteLocation.persistence;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
/**@Table(name="Supply")
@AttributeOverrides({
    @AttributeOverride(name="description", column=@Column(name="description")),
    @AttributeOverride(name="datePub", column=@Column(name="datePub")),
    @AttributeOverride(name="isValidState", column=@Column(name="isValidState"))
})*/

@DiscriminatorValue(value="Supply")
public class Supply extends Publication implements Serializable {
	
	private TypeSypply category;
	private int Duration;
	private float budget;
	private String city;
	private String state;
	
	public Supply(TypeSypply category, int duration, float budget, String city, String state) {
		super();
		this.category = category;
		Duration = duration;
		this.budget = budget;
		this.city = city;
		this.state = state;
	}

	public int getDuration() {
		return Duration;
	}

	public void setDuration(int duration) {
		Duration = duration;
	}

	public Supply() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	
	public TypeSypply getCategory() {
		return category;
	}
	public void setCategory(TypeSypply category) {
		this.category = category;
	}
	public int getDuree() {
		return Duration;
	}
	public void setDuree(int duree) {
		Duration = duree;
	}
	public float getBudget() {
		return budget;
	}
	public void setBudget(float budget) {
		this.budget = budget;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
