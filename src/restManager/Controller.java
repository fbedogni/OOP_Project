package restManager;

import javax.swing.JOptionPane;

import design.Init;
import rest.HttpMethod;
import rest.IRESTable;
import rest.RESTResponse;
import rest.Table;
import rest.WebServer;

// controlla che nel database sia presente il codice utente che si sta usando per accedere all'applicazione

public class Controller implements IRESTable{

	volatile boolean check;
	String response;
	String id;
	int indexBegin;
	int indexEnd;
	int counter=0;

	public void control (String id)
	{
		// accede alla tabella degli utenti nel database e controlla se il codice è presente o no
		check = false;
		this.id=id;
		this.Request();  // cerca nella colona "id" l'id che è stato inserito
		
		// WebServer.Main().GenericRequest(HttpMethod.GET, Table.primi, this);
		// questa richiesta mi genera una risposta con dentro tutti gli elementi della tabella primi, che andrò a mettere un JSON in modo tale da poter usare i metodi
		// Next() e HasNext() per poter iterare nella risposta e salvare tutti i prodotti nel programma
		
		
		// per controllare quello che mi restituisce il server basta scrivere ad esempio http://ristogest.altervista.org/users/ su chrome e ottengo tutti gli elementi presenti nella tabella users
		// http://ristogest.altervista.org/users/id/1 mi restituisce l'utente con l'id 1
		// se non trova nessun elemento restituisce "404"
		
		while (!check);
		
		if (Init.checkConnection==true)
			return;
		
		if (response.equals("404"))
			 Init.USER = null;
		else
		{
			indexBegin = response.lastIndexOf(':') + 2;
			indexEnd = response.lastIndexOf('"');
			
			Init.USER = response.substring(indexBegin, indexEnd);
		
		}
			
	}
	
	public void Request ()
	{
		WebServer.Main().GenericRequest(HttpMethod.GET, Table.users,"id", id, this);
	}

	@Override
	public void Success(RESTResponse response) {
		this.response = response.GetResponse();
		check = true;	
	}

	@Override
	public void Error(RESTResponse response) {
		
		if (response.GetResponse().equals("ristogest.altervista.org"))
		{
			try {
				Thread.sleep(3000);
				counter++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (counter == 2)
			{
				Init.checkConnection=true;
				check = true;
				return;
			}
			
			this.Request();
		}
		else
		{
			this.response = "404";
			check = true;
		}
		// nel caso ci siano errori di connessione per fare comunque qualcosa
		
		// quindi qua devo chiamare un metodo che scrive la richiesta al server (WebServer.Main().GenericRequest(HttpMethod.GET, Table.users,"id", id, this);)
		// in questo modo ogni volta che finisco qua faccio ripartire la richiesta e finchè non la ottengo continuo a finire qua e a farla ripartire
	
	}
}
