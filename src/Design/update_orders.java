package Design;

import Internet.HttpMethod;
import Internet.RESTResponse;
import Internet.Table;
import Internet.WebServer;
import InternetManager.RequestManager;
import Internet.JSON;

public class update_orders{

	private JSON data;
	
	public update_orders() {
		
	}
	
	public void add_order (int tavolo, int prodotto, int quantità) {
		//aggiunge un ordine
		RequestManager handler = new RequestManager();
		data = setJSON_Add_Ordine(tavolo, prodotto, quantità);
		handler.Add_Ordine(data);
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
	private JSON setJSON_Add_Ordine(int tavolo, int prodotto, int quantità) {
		JSON a = new JSON();
		a.Set("tavolo", tavolo);
		a.Set("pagato", 0);
		a.Set("prodotto", prodotto);
		a.Set("quantita", quantità);
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
}
