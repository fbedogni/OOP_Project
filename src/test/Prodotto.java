package test;

import Design.Update_orders;

public class Prodotto {
	private int id;
	private String name;
	private double price;
	private String category;
	private boolean initialized=false;
	
	public static Prodotto create_Prodotto(int id) {
		Update_orders handler = new Update_orders();
		return handler.get_Prodotto(id);
	}
	
	public void initialize(int id, String name, double price, String category) {
		if (initialized = true)
			return;
		initialized = true;
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}
}
