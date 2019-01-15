package restManager;

import java.util.LinkedList;

import design.Element;
import rest.HttpMethod;
import rest.IRESTable;
import rest.JSON;
import rest.JSONParseException;
import rest.RESTResponse;
import rest.Table;
import rest.WebServer;

public class DInit implements IRESTable{
	
	public static LinkedList<Element> DESSERT = new LinkedList<Element>();
	JSON list;
	
	
	public DInit ()
	{
		this.Request();
	}
	
	public void Request ()
	{
		WebServer.Main().GenericRequest(HttpMethod.GET, Table.dessert, this);
	}

	@Override
	public void Success(RESTResponse response) {
		list = new JSON (response.GetResponse());
		
		while (list.HasNext())
		{
			try {
				JSON element = list.Next();
				
				DESSERT.add(new Element (element.GetString("nome"),element.GetString("prezzo")));
				
			} catch (JSONParseException e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void Error(RESTResponse response) {
		this.Request();
	}

}
