package test;

public class Ordini {
	private int id_ordine;
	private int prodotto;
	private int quantit�;
	
	public Ordini(int id_ordine, int prodotto, int quantit�) {
		this.id_ordine = id_ordine;
		this.prodotto = prodotto;
		this.quantit� = quantit�;
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

	public int getQuantit�() {
		return quantit�;
	}

	public void setQuantit�(int quantit�) {
		this.quantit� = quantit�;
	}
	
}
