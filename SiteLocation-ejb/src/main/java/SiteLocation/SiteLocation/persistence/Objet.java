package SiteLocation.SiteLocation.persistence;

public class Objet extends Product{
	private int id;
	private String action;//A louer ou A acheter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public Objet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Objet(String description, String category) {
		super(description, category);
		// TODO Auto-generated constructor stub
	}
	public Objet(String action) {
		super();
		this.action = action;
	}

}
