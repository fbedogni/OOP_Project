package Design;

import java.util.ArrayList;

import javax.swing.DefaultListModel;

public class Converter {
	
	String row;
	String name;
	String qty;
	ArrayList<Ordine> ordini = new ArrayList<Ordine>();
	Ordine[] ord;
	DefaultListModel<String> DLM = new DefaultListModel<String>();
	Utils utils = new Utils();
	
	// utilizzo un arraylist che poi converto in un semplice array perchè subito non conosco la lunghezza finale di tale array, e con arraylist posso modificare la lunghezza runtime senza problemi, mentre con un array dovrei conoscere subito la lunghezza
	
	public ArrayList<Ordine> conversionDLMtoOrdine (DefaultListModel<String> DLM)
	{	
		for (int i=0; i<DLM.size(); ++i)
		{
			row = DLM.elementAt(i);
			name = utils.getNameDLM(row, row.length());
			qty = String.valueOf(utils.getNumDLM(row));
			
			ordini.add(new Ordine(Prodotto.create_Prodotto(name), utils.getNumDLM(row)));
		}
		
		/*
		ord = new Ordine[ordini.size()];
		ord = ordini.toArray(ord);
		*/
		
		return ordini;
	}
	
	
	public DefaultListModel<String> converterOrdinetoDLM (ArrayList<Ordine> ordini)
	{
		
		for (Ordine o : ordini)
		{
			utils.setRowDLM(o.getQuantità(), o.getProdotto().getName(), DLM, o.getProdotto().getPrice()*o.getQuantità());
		}
	
		return DLM;
	}
	
	
}
