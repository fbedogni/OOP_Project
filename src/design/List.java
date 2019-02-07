package design;

import java.util.ArrayList;

import javax.swing.DefaultListModel;

import actionListener.TablesListener;

public class List {

	private static List instance = null;
	
	private ArrayList<TablesListener> tl;
	
	private List ()
	{
		tl = new ArrayList<TablesListener>();
		
		for (int i=10; i<30; ++i)
			tl.add(new TablesListener(new DefaultListModel<String>()));
		
		for (int i=80; i<87; ++i)
			tl.add(new TablesListener(new DefaultListModel<String>()));
		
		for (int i=100; i<120; ++i)
			tl.add(new TablesListener(new DefaultListModel<String>()));
	}
	
	
	public static List getInstance ()
	{
		if (instance == null)
			instance = new List();
		return instance;
	}
	
	public TablesListener getTL (String number)
	{
		return tl.get(Integer.parseInt(number));
	}
}
