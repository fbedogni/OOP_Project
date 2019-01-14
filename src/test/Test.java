package test;

import java.util.ArrayList;

import Design.Update_Orders;

public class Test {

	public static void main(String[] args) {
		Update_Orders a = new Update_Orders();
		ArrayList<Ordine> ordini = new ArrayList<Ordine>();
		for (int counter=1; counter<11; counter++)
		{
			Ordine o = new Ordine(counter*2, counter);
			ordini.add(o);
		}
		a.add_order(ordini, 3);
		ArrayList<Ordine> ordini2 = a.get_Ordine(3);
		System.out.println("ciao");
	}

}
