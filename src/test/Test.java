package test;

import java.util.ArrayList;

import Design.Update_orders;

public class Test {

<<<<<<< HEAD
<<<<<<< HEAD
	public static void main(String[] args) {/*
		IRESTable callback = new IRESTable() {

			@Override
			public void Success(RESTResponse response) {
				JSON a = new JSON(response.GetResponse());
				ArrayList<ordini> papera = new ArrayList<ordini>();
				try {
					while(a.HasNext())
					{
						JSON gigio= a.Next();
						ordini o = new ordini();
						o.tavolo = gigio.GetInt("tavolo");
						o.pagato = gigio.GetInt("pagato");
						o.idtavolo = gigio.GetInt("ID");
						papera.add(o);
			}
		WebServer.Main().GenericRequest(HttpMethod.GET, Table.ordini, callback);*/
		Update_orders a = new Update_orders();
=======
=======
>>>>>>> b05c4c7609490977ad909d61793ef225c2a1957a
	public static void main(String[] args) {
		update_orders a = new update_orders();
>>>>>>> b05c4c7609490977ad909d61793ef225c2a1957a
		a.add_order(22, 2, 5);
	}

}
