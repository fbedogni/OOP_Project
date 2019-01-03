package ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JPanel;

import Design.Element;
import Design.PanelBuilder;

public class TablesListener implements ActionListener{

	private PanelBuilder pb;
	private JPanel panel;
	private DefaultListModel<String> DLM;
	private int floor;
	
	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}	
	
	public TablesListener (DefaultListModel<String> defaultListModel)
	{
		this.DLM=defaultListModel;
	}
	
	public void setPanel (JPanel panel)
	{
		this.panel=panel;
	}
	
	public JPanel getPanel() {
		return panel;
	}
	
	public DefaultListModel<String> getDLM() {
		return DLM;
	}

	public void actionPerformed(ActionEvent e) {
		JButton source= (JButton) e.getSource();
		String tableNumber = source.getText();   // il testo di ogni bottone � il numero del tavolo         
		pb = new PanelBuilder();
		panel.removeAll();
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 726, 729);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(724, 0, 626, 729);
		panel.add(panel_2);
		panel_2.setLayout(null);
		pb.leftMainBuilder(panel_1,DLM);
		pb.rightMainBuilder(panel_2,panel_1,DLM,tableNumber,floor);
		panel.setBackground(new Color(255, 255, 240));
		panel.setOpaque(true);
		panel.revalidate();
		panel.repaint();
		
	}

}
