package test;

import Internet.HttpMethod;
import Internet.RESTResponse;
import Internet.Table;
import Internet.WebServer;
import test.RequestManager;
import Internet.JSON;

public class update_orders{

	private JSON data;
	
	public update_orders() {
		
	}
	
	public void add_order (int tavolo, int prodotto, int quantit�) {
		//aggiunge un ordine abbinato ad un tavolo con pagamento = 0
		RequestManager handler = new RequestManager();
		data = setJSON_Add_Ordine(tavolo);
		String value = handler.Add_Ordine(data);
		int id_returned = Integer.parseInt(value.substring(0, value.length()-1));
		
		//aggiunge l'ordine con prodotto e quantit�
		data = setJSON_Add_Ordine_Prodotto(id_returned, prodotto, quantit�);
		value = handler.Add_Ordine_Prodotto(data);
	}
	
	public void payment (int tavolo) {
		//aggiorna come pagati tutti i tavoli con un certo numero
		RequestManager handler = new RequestManager();
		JSON data = this.setJSON_pagamento();
		String value = handler.Pagamento(tavolo, data);
	}
/*
	public void Error(RESTResponse response) {
		
		if (response.GetResponse().equals("ristogest.altervista.org"))
			this.Request_add_ordine();
		else
		{
			this.response = "404";
			check = true;
		}
	}
	*/
	private JSON setJSON_Add_Ordine(int tavolo) {
		JSON a = new JSON();
		a.Set("tavolo", tavolo);
		a.Set("pagato", 0);
		JSON b = new JSON();
		b.Set("data", a);
		return b;
	}
	
	private JSON setJSON_pagamento() {
		JSON a = new JSON();
		a.Set("pagato", 1);
		JSON b = new JSON();
		b.Set("data", a);
		return b;
	}
	
	private JSON setJSON_Add_Ordine_Prodotto(int ordine, int prodotto, int quantit�) {
		JSON a = new JSON();
		a.Set("ordine", ordine);
		a.Set("prodotto", prodotto);
		a.Set("quantita", quantit�);
		JSON b = new JSON();
		b.Set("data", a);
		return b;
	}
}
