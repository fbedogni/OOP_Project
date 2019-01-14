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

public class Update_Orders{

	private JSON data;
	
	public Update_Orders() {
		
	}
	
	public void add_order (Ordine o, int tavolo) {
		//aggiunge un ordine
		RequestManager handler = new RequestManager();
		data = setJSON_Add_Ordine(tavolo, o.getProdotto().getId(), o.getQuantità());
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
				Ordine o = new Ordine(a.GetInt("ID"), a.GetInt("prodotto"), a.GetInt("quantità"));
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
		Prodotto p = new Prodotto();
		String retname = Utils.serverToString(response.GetString("name"));
		String retcategory = Utils.serverToString(response.GetString("category"));
		try
		{
				p.initialize(response.GetInt("id"), retname, response.GetDouble("price"), retcategory);
		}
		catch (Exception e)
		{
			
		}
		return p;
	}
	
	public Prodotto get_Prodotto(String name) {
		RequestManager handler = new RequestManager();
		String value = handler.get_Prodotto(Utils.stringToServer(name));
		JSON response = new JSON(value);
		Prodotto p = new Prodotto();
		String retname = Utils.serverToString(response.GetString("name"));
		String retcategory = Utils.serverToString(response.GetString("category"));
		try
		{
			p.initialize(response.GetInt("id"), retname, response.GetDouble("price"), retcategory);
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
	private JSON setJSON_Add_Ordine(int tavolo, int prodotto, int quantità) {
		JSON a = new JSON();
		a.Set("tavolo", tavolo);
		a.Set("pagato", 0);
		a.Set("prodotto", prodotto);
		a.Set("quantità", quantità);
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
