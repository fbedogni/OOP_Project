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

public class LInit implements IRESTable{
	
	public static LinkedList<Element> LIQUORI = new LinkedList<Element>();
	JSON list;
	
	
	public LInit ()
	{
		this.Request();
	}
	
	public void Request ()
	{
		WebServer.Main().GenericRequest(HttpMethod.GET, Table.liquori, this);
	}

	@Override
	public void Success(RESTResponse response) {
		list = new JSON (response.GetResponse());
		
		while (list.HasNext())
		{
			try {
				JSON element = list.Next();
				
				LIQUORI.add(new Element (element.GetString("nome"),element.GetString("prezzo")));
				
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
