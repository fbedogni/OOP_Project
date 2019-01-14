package InternetManager;

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

	public String get_Ordine(int tavolo) {
		check = false;
		Request_get_Ordine(String.valueOf(tavolo) + "*0");
		while(!check);
		return response;
	}
	
	public String get_Prodotto(int id) {
		check = false;
		Request_get_Prodotto(String.valueOf(id));
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
	}
	
	private void Request_Add_Ordine (JSON data)
	{
		WebServer.Main().GenericRequest(HttpMethod.PUT, Table.ordini, data, this);
	}
	
	private void Request_pagamento (String tavolo, JSON data) {
		WebServer.Main().GenericRequest(HttpMethod.PUT, Table.ordini, "tavolo", tavolo, data, this);
	}
	
	private void Request_get_Ordine(String tavolo) {
		WebServer.Main().GenericRequest(HttpMethod.GET, Table.ordini, "tavolo*pagato", tavolo, this);
	}
	
	private void Request_get_Prodotto(String id) {
		WebServer.Main().GenericRequest(HttpMethod.GET, Table.prodotti, "id", id, this);
	}
}
