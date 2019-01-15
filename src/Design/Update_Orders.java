package Design;

import java.util.ArrayList;
import java.util.HashSet;

import InternetManager.RequestManager;
import Internet.JSON;

public class Update_Orders{

	private JSON data;
	
	public Update_Orders() {
		
	}
	
	public HashSet<Integer> get_tavoli_attivi() {
		RequestManager handler = new RequestManager();
		String value = handler.get_Ordine_Active();
		HashSet<Integer> lista_tavoli = new HashSet<Integer>();
		if (value.equals("404"))
		{
			return lista_tavoli;
		}
		JSON response = new JSON(value);
		try
		{
			while(response.HasNext())
			{
				JSON a = response.Next();
				Integer i = new Integer(a.GetInt("tavolo"));
				lista_tavoli.add(i);
			}
		}
		catch(Exception e) {
			
		}
		return lista_tavoli;
	}
	
	public void updatefromFullList(ArrayList<Ordine> list, int tavolo) {
		ArrayList<Ordine> server_list = this.get_Ordine(tavolo);
		ArrayList<Ordine> temp = new ArrayList<Ordine>(list);
		list.removeAll(server_list);
		server_list.removeAll(temp);
		delete_Ordine(server_list);
		add_order(list, tavolo);
	}
	
	public void add_order(ArrayList<Ordine> list, int tavolo) {
		for(Ordine o : list)
		{
			add_order(o, tavolo);
		}
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
		ArrayList<Ordine> lista_ordini = new ArrayList<Ordine>();
		if (value.equals("404"))
		{
			return lista_ordini;
		}
		JSON response = new JSON(value);
		try
		{
			while(response.HasNext())
			{
				JSON a = response.Next();
				Ordine o = new Ordine(a.GetInt("ID"), a.GetInt("prodotto"), a.GetInt("quantita"));
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
		try
		{
			if(response.HasNext())
			{
				JSON a = response.Next();
				String retname = Utils.serverToString(a.GetString("name"));
				p.initialize(a.GetInt("id"), retname, a.GetDouble("price"));
			}
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
		try
		{
			if(response.HasNext())
			{
				JSON a = response.Next();
				String retname = Utils.serverToString(a.GetString("name"));
				p.initialize(a.GetInt("id"), retname, a.GetDouble("price"));
			}
		}
		catch (Exception e)
		{
			
		}
		return p;
	}
	
	public void delete_Ordine(ArrayList<Ordine> list) {
		for(Ordine o : list)
		{
			delete_Ordine(o);
		}
	}
	
	public void delete_Ordine(Ordine o) {
		RequestManager handler = new RequestManager();
		handler.delete_Ordine(o.getId());
	}

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
