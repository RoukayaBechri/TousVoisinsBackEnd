package SiteLocation.SiteLocation.persistence;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="Service")

public class Service extends Product implements Serializable {
 private String catService;
 private String typeFacturation;
 
  

public String getTypeFacturation() {
	return typeFacturation;
}


public void setTypeFacturation(String typeFacturation) {
	this.typeFacturation = typeFacturation;
}


public Service(String name, double price) {
	super(name, price);
	// TODO Auto-generated constructor stub
}


public Service( String name, double price, String catService, String typeFacturation) {
	super (name,  price);
	
	this.catService = catService;
	this.typeFacturation= typeFacturation;
}


public String getCatService() {
	return catService;
}


public void setCatService(String catService) {
	this.catService = catService;
}


public Service() {
	super();
	// TODO Auto-generated constructor stub
}

   
}
