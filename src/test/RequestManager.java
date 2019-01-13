package test;

import Internet.HttpMethod;
import Internet.IRESTable;
import Internet.JSON;
import Internet.RESTResponse;
import Internet.Table;
import Internet.WebServer;

public class RequestManager implements IRESTable {
	private String response;
	volatile boolean check;

	public String Add_Ordine(JSON data) {
		check = false;
		this.Request_Add_Ordine(data);
		while(!check);
		return response;
	}
	
	public String Pagamento(int tavolo, JSON data) {
		check = false;
		Request_pagamento(String.valueOf(tavolo), data);
		while(!check);
		return response;
	}
	
	public String Add_Ordine_Prodotto(JSON data) {
		check = false;
		Request_Add_Ordine_Prodotto(data);
		while(!check);
		return response;
	}

	@Override
	public void Success(RESTResponse response) {
		this.response = response.GetResponse();
		this.check = true;
	}

	@Override
	public void Error(RESTResponse response) {
		// TODO Auto-generated method stub
		
	}
	
	private void Request_Add_Ordine (JSON data)
	{
		WebServer.Main().GenericRequest(HttpMethod.PUT, Table.ordini, data, this);
	}
	
	private void Request_pagamento (String tavolo, JSON data) {
		WebServer.Main().GenericRequest(HttpMethod.PUT, Table.ordini, "tavolo", tavolo, data, this);
	}
	
	private void Request_Add_Ordine_Prodotto(JSON data) {
		WebServer.Main().GenericRequest(HttpMethod.PUT, Table.dettagliordini, data, this);
	}
}