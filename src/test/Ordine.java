package test;

public class Ordine {
	private int id;
	private Prodotto prodotto;
	private int quantit�;
	
	public Ordine(int id, int prodotto, int quantit�) {
		this.id = id;
		this.prodotto = Prodotto.create_Prodotto(prodotto);
		this.quantit� = quantit�;
	}
	
	public Ordine(int id, String prodotto, int quantit�) {
		this.id = id;
		this.prodotto = Prodotto.create_Prodotto(prodotto);
		this.quantit� = quantit�;
	}

	public Ordine(int id, Prodotto prodotto, int quantit�) {
		this.id = id;
		this.prodotto = prodotto;
		this.quantit� = quantit�;
	}
	
	public Ordine(int prodotto, int quantit�) {
		this.id = 0;
		this.prodotto = Prodotto.create_Prodotto(prodotto);
		this.quantit� = quantit�;
	}
	
	public Ordine(String prodotto, int quantit�) {
		this.id = 0;
		this.prodotto = Prodotto.create_Prodotto(prodotto);
		this.quantit� = quantit�;
	}

	public Ordine(Prodotto prodotto, int quantit�) {
		this.id = 0;
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

	public int getQuantit�() {
		return quantit�;
	}

	public void setQuantit�(int quantit�) {
		this.quantit� = quantit�;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Ordine)
		{
			return this.equals((Ordine) obj);
		}
		return false;
	}
	
	public boolean equals(Ordine o) {
		if(o != null && this.prodotto.equals(o.prodotto) && this.quantit� == o.quantit�)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
