package SiteLocation.SiteLocation.persistence;

import java.io.Serializable;

import javax.persistence.Embeddable;


@Embeddable
public class FeedbackPk implements Serializable {

	private int idSimpleUser1;
	private int idSimpleUser2;
	public int getIdSimpleUser1() {
		return idSimpleUser1;
	}
	public void setIdSimpleUser1(int idSimpleUser1) {
		this.idSimpleUser1 = idSimpleUser1;
	}
	public int getIdSimpleUser2() {
		return idSimpleUser2;
	}
	public void setIdSimpleUser2(int idSimpleUser2) {
		this.idSimpleUser2 = idSimpleUser2;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idSimpleUser1;
		result = prime * result + idSimpleUser2;
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
		FeedbackPk other = (FeedbackPk) obj;
		if (idSimpleUser1 != other.idSimpleUser1)
			return false;
		if (idSimpleUser2 != other.idSimpleUser2)
			return false;
		return true;
	}
	
	
	
	
	
	
	

}
