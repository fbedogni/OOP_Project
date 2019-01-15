package restManager;

import java.util.Iterator;
import java.util.LinkedList;

import design.Element;
import rest.HttpMethod;
import rest.IRESTable;
import rest.JSON;
import rest.JSONParseException;
import rest.RESTResponse;
import rest.Table;
import rest.WebServer;

public class BInit implements IRESTable{

	public static LinkedList<Element> BEVANDE = new LinkedList<Element>();
	JSON list;
	
	public BInit ()
	{
		this.Request();
	}
	
	public void Request ()
	{
		WebServer.Main().GenericRequest(HttpMethod.GET, Table.bevande, this);
	}
	
	@Override
	public void Success(RESTResponse response) {
		list = new JSON (response.GetResponse());
		
		while (list.HasNext())
		{
			try {
				JSON element = list.Next();
				
				BEVANDE.add(new Element (element.GetString("nome"),element.GetString("prezzo")));
				
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
