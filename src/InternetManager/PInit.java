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
