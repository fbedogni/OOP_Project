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
