package SiteLocation.SiteLocation.persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Application implements Serializable {
	@Temporal(TemporalType.DATE)
	private Date dateApplication;
	private boolean validApp;
	private boolean doneApp;
    private boolean readApp;
	private String proposition;
	
	@EmbeddedId
	private ApplicationPK applicationPK;
	
	@ManyToOne 
	@JoinColumn(name="idSimpleUser",referencedColumnName="id",insertable=false,updatable=false)
	private SimpleUser simpleUser;
	
	@ManyToOne 
	@JoinColumn(name="idPublication",referencedColumnName="id",insertable=false,updatable=false)
	private Publication publication;
	
	
	
	
	
	public boolean isReadApp() {
		return readApp;
	}
	public void setReadApp(boolean readApp) {
		this.readApp = readApp;
	}
	public String getProposition() {
		return proposition;
	}
	public void setProposition(String proposition) {
		this.proposition = proposition;
	}
	public ApplicationPK getApplicationPK() {
		return applicationPK;
	}
	public void setApplicationPK(ApplicationPK applicationPK) {
		this.applicationPK = applicationPK;
	}
	public SimpleUser getSimpleUser() {
		return simpleUser;
	}
	public void setSimpleUser(SimpleUser simpleUser) {
		this.simpleUser = simpleUser;
	}
	public Date getDateApplication() {
		return dateApplication;
	}
	public void setDateApplication(Date dateApplication) {
		this.dateApplication = dateApplication;
	}
	
	
	
	
	public boolean isValidApp() {
		return validApp;
	}
	public void setValidApp(boolean validApp) {
		this.validApp = validApp;
	}
	public boolean isDoneApp() {
		return doneApp;
	}
	public void setDoneApp(boolean doneApp) {
		this.doneApp = doneApp;
	}
	public Application() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Publication getPublication() {
		return publication;
	}
	public void setPublication(Publication publication) {
		this.publication = publication;
	}
	public Application(Date dateApplication, boolean isValidApp, boolean isDoneApp) {
		super();
		this.dateApplication = dateApplication;
		this.validApp = isValidApp;
		this.doneApp = isDoneApp;
	}
	

}
