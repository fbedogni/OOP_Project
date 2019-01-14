package test;

public class Ordine {
	private int id;
	private Prodotto prodotto;
	private int quantità;
	
	public Ordine(int id, int prodotto, int quantità) {
		this.id = id;
		this.prodotto = new Prodotto(prodotto);
		this.quantità = quantità;
	}

	public Ordine(int id, Prodotto prodotto, int quantità) {
		this.id = id;
		this.prodotto = prodotto;
		this.quantità = quantità;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Prodotto getProdotto() {
		return prodotto;
	}

	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}
	
	public void setProdotto(int prodotto) {
		this.prodotto = new Prodotto(prodotto);
	}

	public int getQuantità() {
		return quantità;
	}

	public void setQuantità(int quantità) {
		this.quantità = quantità;
	}
	
}
