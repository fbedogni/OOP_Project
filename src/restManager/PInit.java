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

public class PInit implements IRESTable{
	
	public static LinkedList<Element> PRIMI = new LinkedList<Element>();
	JSON list;
	
	public PInit ()
	{
		this.Request();
	}
	
	public void Request ()
	{
		WebServer.Main().GenericRequest(HttpMethod.GET, Table.primi, this);
	}
	
	@Override
	public void Success(RESTResponse response) {
		list = new JSON (response.GetResponse());
		
		while (list.HasNext())
		{
			try {
				JSON element = list.Next();
				
				PRIMI.add(new Element (element.GetString("nome"),element.GetString("prezzo")));
				
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
