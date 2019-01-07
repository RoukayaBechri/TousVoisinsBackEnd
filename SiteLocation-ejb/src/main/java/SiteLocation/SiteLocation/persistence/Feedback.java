package SiteLocation.SiteLocation.persistence;



import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Feedback {
	
	@EmbeddedId
	FeedbackPk feedbackPk;
	
	private String object;
	
	@Temporal(TemporalType.DATE)
	private Date dateFeedback;



public FeedbackPk getFeedbackPk() {
		return feedbackPk;
	}


	public void setFeedbackPk(FeedbackPk feedbackPk) {
		this.feedbackPk = feedbackPk;
	}


	public String getObject() {
		return object;
	}


	public void setObject(String object) {
		this.object = object;
	}


	public Date getDateFeedback() {
		return dateFeedback;
	}


	public void setDateFeedback(Date dateFeedback) {
		this.dateFeedback = dateFeedback;
	}


	public SimpleUser getUser() {
		return user;
	}


	public void setUser(SimpleUser user) {
		this.user = user;
	}


	public Publication getPublication() {
		return publication;
	}


	public void setPublication(Publication publication) {
		this.publication = publication;
	}


@ManyToOne
@JoinColumn(name="idUser",referencedColumnName="id",insertable=false,updatable=false)
private SimpleUser user;


@ManyToOne
@JoinColumn(name="idPublication",referencedColumnName="id",insertable=false,updatable=false)
private Publication publication;
//private feedbakRunk;



public Feedback() {
	super();
	// TODO Auto-generated constructor stub
}


public Feedback(FeedbackPk feedbackPk, String object, Date dateFeedback, SimpleUser user, Publication publication) {
	super();
	this.feedbackPk = feedbackPk;
	this.object = object;
	this.dateFeedback = dateFeedback;
	this.user = user;
	this.publication = publication;
}


}
