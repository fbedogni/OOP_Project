package InternetManager;

import java.util.LinkedList;

import Design.Element;
import Internet.HttpMethod;
import Internet.IRESTable;
import Internet.JSON;
import Internet.JSONParseException;
import Internet.RESTResponse;
import Internet.Table;
import Internet.WebServer;

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
