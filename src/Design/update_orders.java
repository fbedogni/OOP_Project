package Design;

import java.util.ArrayList;

import test.Ordine;
import test.Prodotto;
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
	
	public void add_order (int tavolo, int prodotto, int quantit�) {
		//aggiunge un ordine
		RequestManager handler = new RequestManager();
		data = setJSON_Add_Ordine(tavolo, prodotto, quantit�);
		handler.Add_Ordine(data);
	}
	
	public void payment (int tavolo) {
		//aggiorna come pagati tutti i tavoli con un certo numero
		RequestManager handler = new RequestManager();
		JSON data = this.setJSON_pagamento();
		handler.Pagamento(tavolo, data);
	}
	
	public ArrayList<Ordine> get_Ordine(int tavolo) {
		RequestManager handler = new RequestManager();
		String value = handler.get_Ordine(tavolo);
		JSON response = new JSON(value);
		ArrayList<Ordine> lista_ordini = new ArrayList<Ordine>();
		try
		{
			while(response.HasNext())
			{
				JSON a = response.Next();
				Ordine o = new Ordine(a.GetInt("ID"), a.GetInt("prodotto"), a.GetInt("quantit�"));
				lista_ordini.add(o);
			}
		}
		catch(Exception e) {
			
		}
		return lista_ordini;
	}
	
	public Prodotto get_Prodotto(int id) {
		RequestManager handler = new RequestManager();
		String value = handler.get_Prodotto(id);
		JSON response = new JSON(value);
		Prodotto p = null;
		try
		{
				JSON a = response.Next();
				p = Prodotto.create_Prodotto(a.GetInt("id"));
		}
		catch (Exception e)
		{
			
		}
		return p;
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
	private JSON setJSON_Add_Ordine(int tavolo, int prodotto, int quantit�) {
		JSON a = new JSON();
		a.Set("tavolo", tavolo);
		a.Set("pagato", 0);
		a.Set("prodotto", prodotto);
		a.Set("quantit�", quantit�);
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
