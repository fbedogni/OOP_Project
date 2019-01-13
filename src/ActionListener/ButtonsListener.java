package ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Design.PanelBuilder;
import Design.Utils;
import Design.Window;
import Internet.HttpMethod;
import Internet.Table;
import Internet.WebServer;

public class ButtonsListener implements ActionListener{

	private JPanel panel;
	private int floor;
	private String tableNumber;
	private PanelBuilder pb;
	private JButton source;
	private DefaultListModel<String> DLM;
	private JList list;
	private Utils utils = new Utils();
	

	public JList getList() {
		return list;
	}

	public void setList(JList list) {
		this.list = list;
	}
	
	public String getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(String tableNumber) {
		this.tableNumber = tableNumber;
	}
	
	public DefaultListModel<String> getDLM() {
		return DLM;
	}

	public void setDLM(DefaultListModel<String> DLM) {
		this.DLM = DLM;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}	
	
	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public void actionPerformed(ActionEvent e) {
		source = (JButton) e.getSource();
		
		
		if (source.getText().equals("Primo piano"))
		{
			panel.removeAll();
			pb = new PanelBuilder();
			pb.floorBuilder(panel);
			panel.setBackground(new Color(255, 255, 240));
			panel.setOpaque(true);
			panel.revalidate();
			panel.repaint();
		}
		
		else if (source.getText().equals("Piano terra"))
		{
			panel.removeAll();
			pb = new PanelBuilder();
			pb.groundBuilder(panel);
			panel.setBackground(new Color(255, 255, 240));
			panel.setOpaque(true);
			panel.revalidate();
			panel.repaint();
		}
		
		else if (source.getText().equals("Prato"))
		{
			panel.removeAll();
			pb = new PanelBuilder();
			pb.greenBuilder(panel);
			panel.setBackground(new Color(255, 255, 240));
			panel.setOpaque(true);
			panel.revalidate();
			panel.repaint();
		}
		
		
		
		else if (source.getText().equals("Invia modifica"))
		{
			
			if (!DLM.isEmpty())
			{
				if (!utils.isActive(tableNumber))
					Window.active.add(tableNumber);
			}
			else
			{
				if (utils.isActive(tableNumber))
					Window.active.remove(tableNumber);
			}
			
			panel.removeAll();
			pb = new PanelBuilder();
			if (floor == -1)
				pb.greenBuilder(panel);
			if (floor == 0)
				pb.groundBuilder(panel);
			if (floor == 1)
				pb.floorBuilder(panel);
			panel.setBackground(new Color(255, 255, 240));
			panel.setOpaque(true);
			panel.revalidate();
			panel.repaint();
			
			utils.reorderDLM(DLM);
			
			// pollo
			// qui il DLM gi� ordinato, cio� in cui ogni riga � composta da un diverso elemento con la relativa quantit�, va caricato sul server
			
		}
		
		else if (source.getText().equals("Trasferisci tavolo"))
		{
			
		}
		
		else if (source.getName().equals("buttonMain"))
		{
			panel.removeAll();
			pb = new PanelBuilder();
			pb.leftMainBuilder(panel,DLM);
			panel.setBackground(new Color(240, 240, 240));
			panel.setOpaque(true);
			panel.revalidate();
			panel.repaint();
		}
		
		else if (source.getName().equals("buttonFirsts"))
		{
			panel.removeAll();
			pb = new PanelBuilder();
			pb.firstsBuilder(panel,DLM);
			panel.setBackground(new Color(240, 240, 240));
			panel.setOpaque(true);
			panel.revalidate();
			panel.repaint();
		}
		
		else if (source.getName().equals("buttonSeconds"))
		{
			panel.removeAll();
			pb = new PanelBuilder();
			pb.secondsBuilder(panel,DLM);
			panel.setBackground(new Color(240, 240, 240));
			panel.setOpaque(true);
			panel.revalidate();
			panel.repaint();
		}
		
		else if (source.getName().equals("buttonDessert"))
		{
			panel.removeAll();
			pb = new PanelBuilder();
			pb.dessertBuilder(panel,DLM);
			panel.setBackground(new Color(240, 240, 240));
			panel.setOpaque(true);
			panel.revalidate();
			panel.repaint();
		}
		
		else if (source.getName().equals("buttonWine"))
		{
			panel.removeAll();
			pb = new PanelBuilder();
			pb.wineBuilder(panel,DLM);
			panel.setBackground(new Color(240, 240, 240));
			panel.setOpaque(true);
			panel.revalidate();
			panel.repaint();
		}
		
		else if (source.getName().equals("buttonLiquor"))
		{
			panel.removeAll();
			pb = new PanelBuilder();
			pb.liquorBuilder(panel,DLM);
			panel.setBackground(new Color(240, 240, 240));
			panel.setOpaque(true);
			panel.revalidate();
			panel.repaint();
		}
		
		else if (source.getName().equals("delete_row"))
		{
			JPanel p = (JPanel) source.getParent();
			DLM.remove(list.getSelectedIndex());
			
			pb = new PanelBuilder();
			pb.rightMainBuilder((JPanel) p.getParent(), panel, DLM, tableNumber, floor);
			
		}
	
		else if (source.getName().equals("cashdesk"))
		{
			JPanel p = (JPanel) source.getParent();
			
			DLM.removeAllElements();
			
			pb = new PanelBuilder();
			pb.rightMainBuilder((JPanel) p.getParent(), panel, DLM, tableNumber, floor);
		}
	}

}
