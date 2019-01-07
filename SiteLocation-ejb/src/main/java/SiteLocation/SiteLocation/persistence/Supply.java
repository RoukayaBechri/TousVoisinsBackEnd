package SiteLocation.SiteLocation.persistence;


import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
@DiscriminatorValue(value="Supply")
public class Supply extends Publication {
	
	private TypeSypply category;
	private int Duration;
	private float budget;
	private String city;
	private String state;
	
	public Supply() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Supply(String description, Date datePub, boolean isValidState) {
		super(description, datePub, isValidState);
		// TODO Auto-generated constructor stub
	}

	
public Supply(String description, TypeSypply category, int duration, float budget, String city, String state) {
		super();
		
	
		this.category = category;
		this.Duration=duration;
		this.budget = budget;
		this.city = city;
		this.state=state;
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
