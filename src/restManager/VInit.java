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

public class VInit implements IRESTable{
	
	public static LinkedList<Element> VINI = new LinkedList<Element>();
	JSON list;
	
	
	public VInit ()
	{
		this.Request();
	}
	
	public void Request ()
	{
		WebServer.Main().GenericRequest(HttpMethod.GET, Table.vini, this);
	}

	@Override
	public void Success(RESTResponse response) {
		list = new JSON (response.GetResponse());
		
		while (list.HasNext())
		{
			try {
				JSON element = list.Next();
				
				VINI.add(new Element (element.GetString("nome"),element.GetString("prezzo")));
				
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
