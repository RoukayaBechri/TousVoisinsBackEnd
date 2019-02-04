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
	
	
	private int duration;
	private float budget;
	
	
	public Supply( int duration, float budget) {
		super();
		
		this.duration = duration;
		this.budget = budget;
		
	}

	public int getduration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Supply() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getDuree() {
		return this.duration;
	}
	public void setDuree(int duree) {
		this.duration = duree;
	}
	public float getBudget() {
		return budget;
	}
	public void setBudget(float budget) {
		this.budget = budget;
	}


}
