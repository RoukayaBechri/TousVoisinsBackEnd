package SiteLocation.SiteLocation.persistence;

import java.io.Serializable;

import javax.persistence.Embeddable;


@Embeddable
public class FeedbackPk implements Serializable {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPublication;
		result = prime * result + idUser;
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
		if (idPublication != other.idPublication)
			return false;
		if (idUser != other.idUser)
			return false;
		return true;
	}
	private int idUser;
	private int idPublication;
	
	

}
