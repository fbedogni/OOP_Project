package Design;

import javax.swing.DefaultListModel;

import InternetManager.BInit;

public class Utils {
	
	public static int index = 14; // 14 è la posizione della prima lettera del nome del prodotto
	public static int KEYBOARD = 0;
	
	/*
	public String getTotal (DefaultListModel<String> DLM)
	{
		
		String cost="";
		
		for (int i=0; i < DLM.size(); ++i)
		{
			
		}
		
		return cost;
	}
	*/
	
	public boolean isActive (String tableNumber)
	{
		boolean check = false; 
		
		for (int i=0; i< Window.active.size(); ++i)
		{
			if (Window.active.get(i).equals(tableNumber))
				check = true;
		}
		
		return check;
	}

	public StringBuilder DLMSpaces(String buttonName) {
		

		StringBuilder string = new StringBuilder("                                                 ");
		int lenghtName = buttonName.length();
		/*
		String base = new String("   1          ");
		
		for (int i=base.length(), y=0; i< base.length()+lenghtName; ++i,++y)
		{
			string.setCharAt(i, buttonName.charAt(y));
		}
		
		*/
		// il bottone con nome più lungo è CALICE BIANCO FERMO con lenght=19
		// in base a quante lettere in meno hanno gli altri nome aggiungo spazi di conseguenza
		
		for (int i=19-lenghtName; i>0; --i)
		{
			string.append("  ");
		}	
		
		
		return string;
	}
	
	public StringBuilder getNameDLM (String string, int lenght)
	{
		StringBuilder name = new StringBuilder();
		
		for (int i=index; i< lenght; ++i)
		{
			if ((string.charAt(i) == ' ') && (string.charAt(i+1) == ' '))
				break;
			
			name.append(string.charAt(i));
		}
		
		return name;
	}
	
	
	public int getNumDLM (String string)
	{
		int counter;
		String number= "";
		
		for (int i=0; i<index; ++i)
		{
			
			if (string.charAt(i) != ' ')
				number = number + string.charAt(i);
		}
		
		counter = Integer.parseInt(number);
		
		return counter;
	}
	
	
	public void reorderDLM (DefaultListModel<String> DLM) 
	{
		
		// non considera l'eventualità che in una riga successiva alla prima il numero di elementi possa essere diverso da uno 
		int counter;
		StringBuilder name;
		String substring;
		
		for (int i=0; i<DLM.getSize(); ++i)
		{		
			
			counter = this.getNumDLM(DLM.elementAt(i));
			name = new StringBuilder (this.getNameDLM(DLM.elementAt(i), DLM.elementAt(i).length()));
			
			for (int y=i+1; y<DLM.getSize(); ++y)
				if (DLM.elementAt(y).contains(name))
				{
					counter += this.getNumDLM(DLM.elementAt(y));
					DLM.remove(y);
					y--;
				}
			
			substring = DLM.elementAt(i).substring(index);
			
			DLM.remove(i);
			this.setRowDLM(counter, substring, DLM, i);
		}
	}
	
	public void setRowDLM (int counter, String string, DefaultListModel<String> DLM, double cost)
	{
		if (counter < 10)
			DLM.addElement("     " + counter + "        " + string + this.DLMSpaces(string) + cost);
		else if (counter < 100)
			DLM.addElement("    " + counter + "        " + string + this.DLMSpaces(string) + cost);
		else
			DLM.addElement("   " + counter + "        " + string + this.DLMSpaces(string) + cost);
	}
	
	public void setRowDLM (int counter, String string, DefaultListModel<String> DLM, int position)
	{
		if (counter < 10)
			DLM.add(position, "     " + counter + "        " + string);
		else if (counter < 100)
			DLM.add(position, "    " + counter + "        " + string);
		else
			DLM.add(position, "   " + counter + "        " + string);
	}
}
