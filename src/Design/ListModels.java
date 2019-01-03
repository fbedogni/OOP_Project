package Design;

import javax.swing.DefaultListModel;

import ActionListener.TablesListener;

public class ListModels {
	
	private static ListModels instance = null;
	
	public static TablesListener tl10;
	public static TablesListener tl11;
	public static TablesListener tl12;
	public static TablesListener tl13;
	public static TablesListener tl14;
	public static TablesListener tl15;
	public static TablesListener tl20;
	public static TablesListener tl21;
	public static TablesListener tl22;
	public static TablesListener tl23;
	public static TablesListener tl24;
	public static TablesListener tl25;
	public static TablesListener tl30;
	public static TablesListener tl31;
	public static TablesListener tl32;
	public static TablesListener tl33;
	public static TablesListener tl34;
	public static TablesListener tl35;
	public static TablesListener tl40;
	public static TablesListener tl41;
	public static TablesListener tl42;
	public static TablesListener tl43;
	public static TablesListener tl44;
	public static TablesListener tl45;
	
	
	public static TablesListener tl80;
	public static TablesListener tl81;
	public static TablesListener tl82;
	public static TablesListener tl83;
	public static TablesListener tl84;
	public static TablesListener tl85;
	public static TablesListener tl86;
	public static TablesListener tl87;
	
	
	public static TablesListener tl100;
	public static TablesListener tl101;
	public static TablesListener tl102;
	public static TablesListener tl103;
	public static TablesListener tl110;
	public static TablesListener tl111;
	public static TablesListener tl112;
	public static TablesListener tl113;
	public static TablesListener tl120;
	public static TablesListener tl121;
	public static TablesListener tl122;
	public static TablesListener tl123;
	
	protected ListModels ()
	{
		tl10 = new TablesListener(new DefaultListModel<String>());
		tl11 = new TablesListener(new DefaultListModel<String>());
		tl12 = new TablesListener(new DefaultListModel<String>());
		tl13 = new TablesListener(new DefaultListModel<String>());
		tl14 = new TablesListener(new DefaultListModel<String>());
		tl15 = new TablesListener(new DefaultListModel<String>());
		tl20 = new TablesListener(new DefaultListModel<String>());
		tl21 = new TablesListener(new DefaultListModel<String>());
		tl22 = new TablesListener(new DefaultListModel<String>());
		tl23 = new TablesListener(new DefaultListModel<String>());
		tl24 = new TablesListener(new DefaultListModel<String>());
		tl25 = new TablesListener(new DefaultListModel<String>());
		tl30 = new TablesListener(new DefaultListModel<String>());
		tl31 = new TablesListener(new DefaultListModel<String>());
		tl32 = new TablesListener(new DefaultListModel<String>());
		tl33 = new TablesListener(new DefaultListModel<String>());
		tl34 = new TablesListener(new DefaultListModel<String>());
		tl35 = new TablesListener(new DefaultListModel<String>());
		tl40 = new TablesListener(new DefaultListModel<String>());
		tl41 = new TablesListener(new DefaultListModel<String>());
		tl42 = new TablesListener(new DefaultListModel<String>());
		tl43 = new TablesListener(new DefaultListModel<String>());
		tl44 = new TablesListener(new DefaultListModel<String>());
		tl45 = new TablesListener(new DefaultListModel<String>());
		
		tl80 = new TablesListener(new DefaultListModel<String>());
		tl81 = new TablesListener(new DefaultListModel<String>());
		tl82 = new TablesListener(new DefaultListModel<String>());
		tl83 = new TablesListener(new DefaultListModel<String>());
		tl84 = new TablesListener(new DefaultListModel<String>());
		tl85 = new TablesListener(new DefaultListModel<String>());
		tl86 = new TablesListener(new DefaultListModel<String>());
		tl87 = new TablesListener(new DefaultListModel<String>());
		
		
		tl100 = new TablesListener(new DefaultListModel<String>());
		tl101 = new TablesListener(new DefaultListModel<String>());
		tl102 = new TablesListener(new DefaultListModel<String>());
		tl103 = new TablesListener(new DefaultListModel<String>());
		tl110 = new TablesListener(new DefaultListModel<String>());
		tl111 = new TablesListener(new DefaultListModel<String>());
		tl112 = new TablesListener(new DefaultListModel<String>());
		tl113 = new TablesListener(new DefaultListModel<String>());
		tl120 = new TablesListener(new DefaultListModel<String>());
		tl121 = new TablesListener(new DefaultListModel<String>());
		tl122 = new TablesListener(new DefaultListModel<String>());
		tl123 = new TablesListener(new DefaultListModel<String>());
	}
	
	public static ListModels getInstance ()
	{
		if (instance == null)
			instance = new ListModels();
		return instance;
	}
}
