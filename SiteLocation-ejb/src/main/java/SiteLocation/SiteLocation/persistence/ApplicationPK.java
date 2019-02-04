package SiteLocation.SiteLocation.persistence;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ApplicationPK implements Serializable {
	
	private int idSimpleUser;
	private int idPublication;
	public int getIdSimpleUser() {
		return idSimpleUser;
	}
	public void setIdSimpleUser(int idSimpleUser) {
		this.idSimpleUser = idSimpleUser;
	}
	public int getIdPublication() {
		return idPublication;
	}
	public void setIdPublication(int idPublication) {
		this.idPublication = idPublication;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPublication;
		result = prime * result + idSimpleUser;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApplicationPK other = (ApplicationPK) obj;
		if (idPublication != other.idPublication)
			return false;
		if (idSimpleUser != other.idSimpleUser)
			return false;
		return true;
	}
	
	
	
	

}
