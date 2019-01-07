package SiteLocation.SiteLocation.persistence;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Application {
	@Id
    @GeneratedValue
	private int id;
	private Date dateApplication;
	private boolean isValidApp;
	private boolean isDoneApp;
	
	@ManyToOne 
	private SimpleUser user;
	@ManyToOne
	private Publication publication;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateApplication() {
		return dateApplication;
	}
	public void setDateApplication(Date dateApplication) {
		this.dateApplication = dateApplication;
	}
	public boolean isValidApp() {
		return isValidApp;
	}
	public void setValidApp(boolean isValidApp) {
		this.isValidApp = isValidApp;
	}
	public boolean isDoneApp() {
		return isDoneApp;
	}
	public void setDoneApp(boolean isDoneApp) {
		this.isDoneApp = isDoneApp;
	}
	public SimpleUser getUser() {
		return user;
	}
	public void setUser(SimpleUser user) {
		this.user = user;
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
		this.isValidApp = isValidApp;
		this.isDoneApp = isDoneApp;
	}
	

}
