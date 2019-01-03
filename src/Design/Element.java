package Design;

public class Element {
	private String cost;
	private String name;
	
	public Element (String name, String cost2)
	{
		this.name=name;
		this.cost=cost2;
	}
	
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
