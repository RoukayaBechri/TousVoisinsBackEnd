package SiteLocation.SiteLocation.persistence;

import javax.persistence.Entity;


public class Service extends Product {

  private String category;
  private SubCategService subCategory;
  private double price;
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public SubCategService getSubCategory() {
	return subCategory;
}
public void setSubCategory(SubCategService subCategory) {
	this.subCategory = subCategory;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Service() {
	super();
	// TODO Auto-generated constructor stub
}
public Service(String category, SubCategService subCategory, double price) {
	super();
	this.category = category;
	this.subCategory = subCategory;
	this.price = price;
}
   
}
