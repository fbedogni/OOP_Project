package test;

public class Ordini {
	private int id_ordine;
	private int prodotto;
	private int quantità;
	
	public Ordini(int id_ordine, int prodotto, int quantità) {
		this.id_ordine = id_ordine;
		this.prodotto = prodotto;
		this.quantità = quantità;
	}

	public int getId_ordine() {
		return id_ordine;
	}

	public void setId_ordine(int id_ordine) {
		this.id_ordine = id_ordine;
	}

	public int getProdotto() {
		return prodotto;
	}

	public void setProdotto(int prodotto) {
		this.prodotto = prodotto;
	}

	public int getQuantità() {
		return quantità;
	}

	public void setQuantità(int quantità) {
		this.quantità = quantità;
	}
	
}
