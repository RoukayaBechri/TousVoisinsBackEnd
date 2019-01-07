package SiteLocation.SiteLocation.persistence;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
@AttributeOverrides({
    @AttributeOverride(name="name", column=@Column(name="FULLNAME")),
    @AttributeOverride(name="password", column=@Column(name="PASSWORD")),
    @AttributeOverride(name="email", column=@Column(name="EMAIL"))
})
    
public class Admin extends User {
	private TypeAdmin adminType;
	
	public TypeAdmin getAdminType() {
		return adminType;
	}

	public void setAdminType(TypeAdmin adminType) {
		this.adminType = adminType;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String name, String password, String email) {
		super(name, password, email);
		// TODO Auto-generated constructor stub
	}

	

}
