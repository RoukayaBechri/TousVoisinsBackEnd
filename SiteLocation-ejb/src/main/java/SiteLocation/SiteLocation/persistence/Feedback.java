package SiteLocation.SiteLocation.persistence;



import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Feedback implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Embedded
	FeedbackPk feedbackPk;
	private String description;
	
	@Temporal(TemporalType.DATE)
	private Date dateFeedback;
    private int runk;

@ManyToOne
@JoinColumn(name="idSimpleUser1",referencedColumnName="id",insertable=false,updatable=false)
private SimpleUser simpleUser1;


@ManyToOne
@JoinColumn(name="idSimpleUser2",referencedColumnName="id",insertable=false,updatable=false)
private SimpleUser simpleUser2;
//private feedbakRunk;


public FeedbackPk getFeedbackPk() {
	return feedbackPk;
}


public void setFeedbackPk(FeedbackPk feedbackPk) {
	this.feedbackPk = feedbackPk;
}




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


public Date getDateFeedback() {
	return dateFeedback;
}


public void setDateFeedback(Date dateFeedback) {
	this.dateFeedback = dateFeedback;
}






public SimpleUser getSimpleUser1() {
	return simpleUser1;
}


public void setSimpleUser1(SimpleUser simpleUser1) {
	this.simpleUser1 = simpleUser1;
}


public SimpleUser getSimpleUser2() {
	return simpleUser2;
}


public void setSimpleUser2(SimpleUser simpleUser2) {
	this.simpleUser2 = simpleUser2;
}



public int getRunk() {
	return runk;
}


public void setRunk(int runk) {
	this.runk = runk;
}


public Feedback(FeedbackPk feedbackPk, String description, Date dateFeedback, SimpleUser simpleUser1,
		SimpleUser simpleUser2) {
	super();
	this.feedbackPk = feedbackPk;
	this.description = description;
	this.dateFeedback = dateFeedback;
	this.simpleUser1 = simpleUser1;
	this.simpleUser2 = simpleUser2;
}


public Feedback() {
	super();
	
}










}
