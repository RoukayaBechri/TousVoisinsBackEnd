package SiteLocation.SiteLocation.persistence;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="Service")

public class Service extends Product implements Serializable {
 private SubCategService catService;
  

public Service(SubCategService catService) {
	super();
	this.catService = catService;
}


public SubCategService getCatService() {
	return catService;
}


public void setCatService(SubCategService catService) {
	this.catService = catService;
}


public Service() {
	super();
	// TODO Auto-generated constructor stub
}

   
}
