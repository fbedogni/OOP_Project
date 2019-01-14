package test;

public class Ordine {
	private int id;
	private Prodotto prodotto;
	private int quantità;
	
	public Ordine(int id, int prodotto, int quantità) {
		this.id = id;
		this.prodotto = Prodotto.create_Prodotto(prodotto);
		this.quantità = quantità;
	}
	
	public Ordine(int id, String prodotto, int quantità) {
		this.id = id;
		this.prodotto = Prodotto.create_Prodotto(prodotto);
		this.quantità = quantità;
	}

	public Ordine(int id, Prodotto prodotto, int quantità) {
		this.id = id;
		this.prodotto = prodotto;
		this.quantità = quantità;
	}
	
	public Ordine(int prodotto, int quantità) {
		this.id = 0;
		this.prodotto = Prodotto.create_Prodotto(prodotto);
		this.quantità = quantità;
	}
	
	public Ordine(String prodotto, int quantità) {
		this.id = 0;
		this.prodotto = Prodotto.create_Prodotto(prodotto);
		this.quantità = quantità;
	}

	public Ordine(Prodotto prodotto, int quantità) {
		this.id = 0;
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

	public int getQuantità() {
		return quantità;
	}

	public void setQuantità(int quantità) {
		this.quantità = quantità;
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
		if(o != null && this.prodotto.equals(o.prodotto) && this.quantità == o.quantità)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
