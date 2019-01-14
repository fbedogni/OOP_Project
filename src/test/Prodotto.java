package test;

import Design.Update_Orders;

public class Prodotto {
	private int id;
	private String name;
	private double price;
	private boolean initialized;

	public Prodotto() {
		initialized = false;
	}
	public static Prodotto create_Prodotto(int id) {
		Update_Orders handler = new Update_Orders();
		return handler.get_Prodotto(id);
	}
	
	public static Prodotto create_Prodotto(String name) {
		Update_Orders handler = new Update_Orders();
		return handler.get_Prodotto(name);
	}
	
	public void initialize(int id, String name, double price) {
		if (initialized == true)
			return;
		initialized = true;
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public boolean isInitialized() {
		return initialized;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Prodotto)
		{
			return this.equals((Prodotto) obj);
		}
		return false;
	}
	
	public boolean equals(Prodotto p) {
		if (this.id == p.id)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
