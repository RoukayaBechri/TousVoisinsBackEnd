package SiteLocation.SiteLocation.persistence;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="SimpleUser")
@AttributeOverrides({
    @AttributeOverride(name="userName", column=@Column(name="FULLNAME")),
    @AttributeOverride(name="userPassword", column=@Column(name="PASSWORD")),
    @AttributeOverride(name="userEmail", column=@Column(name="EMAIL"))
})
public class SimpleUser extends User implements Serializable {
	
	
	private String userType;
	private String userDescription;
	@Temporal(TemporalType.DATE)
	private Date userBirthDate;
	private String userGender;
	 @Lob
	 private String userPhoto;
	
	private long userPhone;
	
	@Embedded
	private Adresse userAdresse;
	private double userRank;
	public double getUserRank() {
		return userRank;
	}
	public void setUserRank(double userRank) {
		this.userRank = userRank;
	}
	public SimpleUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SimpleUser(String userName, String userLastName, String userPassword, String userEmail) {
		super(userName, userLastName, userPassword, userEmail);
		// TODO Auto-generated constructor stub
	}
	public SimpleUser(String userType, String userDescription, Date userBirthDate, String userGender,
			String userPhoto, long userPhone, Adresse userAdresse, int userRank) {
		super();
		this.userType = userType;
		this.userDescription = userDescription;
		this.userBirthDate = userBirthDate;
		this.userGender = userGender;
		this.userPhoto = userPhoto;
		this.userPhone = userPhone;
		this.userAdresse = userAdresse;
		this.userRank = userRank;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserDescription() {
		return userDescription;
	}
	public void setUserDescription(String userDescription) {
		this.userDescription = userDescription;
	}
	public Date getUserBirthDate() {
		return userBirthDate;
	}
	public void setUserBirthDate(Date userBirthDate) {
		this.userBirthDate = userBirthDate;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	
	
	
	public String getUserPhoto() {
		return userPhoto;
	}
	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}
	public long getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(long userPhone) {
		this.userPhone = userPhone;
	}
	public Adresse getUserAdresse() {
		return userAdresse;
	}
	public void setUserAdresse(Adresse userAdresse) {
		this.userAdresse = userAdresse;
	}
	
	
	
	
	
	
	
	
	

	

	
	
	
	

}
