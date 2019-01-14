package Prova;

import javax.swing.DefaultListModel;

import Design.Utils;
import test.Ordine;

public class Converter {
	
	String row;
	String name;
	String qty;
	Utils utils = new Utils();
	
	
	public Ordine[] conversionDLMtoOrdine (DefaultListModel<String> DLM)
	{
		DLM.clear();
		
		for (int i=0; i<DLM.size(); ++i)
		{
			row = DLM.elementAt(i);
			name = utils.getNameDLM(row, row.length());
		}
		
		
		
		
		return null;
	}
	
	
}
