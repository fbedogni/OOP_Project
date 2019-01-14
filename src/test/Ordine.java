package test;

public class Ordine {
	private int id;
	private Prodotto prodotto;
	private int quantit�;
	
	public Ordine(int id, int prodotto, int quantit�) {
		this.id = id;
		this.prodotto = new Prodotto(prodotto);
		this.quantit� = quantit�;
	}

	public Ordine(int id, Prodotto prodotto, int quantit�) {
		this.id = id;
		this.prodotto = prodotto;
		this.quantit� = quantit�;
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

	public int getQuantit�() {
		return quantit�;
	}

	public void setQuantit�(int quantit�) {
		this.quantit� = quantit�;
	}
	
}
