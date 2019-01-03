package InternetManager;

import java.util.Iterator;
import java.util.LinkedList;

import Design.Element;
import Internet.HttpMethod;
import Internet.IRESTable;
import Internet.JSON;
import Internet.JSONParseException;
import Internet.RESTResponse;
import Internet.Table;
import Internet.WebServer;

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
