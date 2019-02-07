package actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JPanel;

import restManager.BInit;
import restManager.DInit;
import restManager.LInit;
import restManager.PInit;
import restManager.SInit;
import restManager.VInit;
import utils.*;

public class ElementListener implements ActionListener{
	
	JButton button;
	JPanel panel;
	DefaultListModel<String> DLM;
	Utils utils = new Utils();
	
	public DefaultListModel<String> getDLM() {
		return DLM;
	}

	public void setDLM(DefaultListModel<String> DLM) {
		this.DLM = DLM;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		button = (JButton) e.getSource();
		panel = (JPanel) button.getParent();
		String buttonName;
		double cost;
		
		
		if (button.getText().equals("C"))
		{
			if (Utils.KEYBOARD == 0)
			{
				cost = 2;
				Utils.KEYBOARD = 1;
			}
			else
				cost = 2*Utils.KEYBOARD;
			utils.setRowDLM(Utils.KEYBOARD, "COPERTO", DLM, cost);
			Utils.KEYBOARD=0;
		}
		
		else if (panel.getName().equals("drinksPanel") || panel.getName().equals("coffeePanel"))
		{
			for (int i=0; i< BInit.BEVANDE.size(); ++i)
			{
				buttonName = BInit.BEVANDE.get(i).getName();
				
				if (button.getText().equals(buttonName))
				{
					if (Utils.KEYBOARD == 0)
					{
						cost = Double.parseDouble(BInit.BEVANDE.get(i).getCost());
						Utils.KEYBOARD = 1;
					}
					else
						cost = Utils.KEYBOARD*Double.parseDouble(BInit.BEVANDE.get(i).getCost());
					utils.setRowDLM(Utils.KEYBOARD, buttonName, DLM, cost);
					Utils.KEYBOARD=0;
					break;
				}
			}
		}
		
		else if (panel.getName().equals("firstsPanel"))
		{
			for (int i=0; i< PInit.PRIMI.size(); ++i)
			{
				buttonName = PInit.PRIMI.get(i).getName();
					
				if (button.getText().equals(buttonName))
				{
					if (Utils.KEYBOARD == 0)
					{
						cost = Double.parseDouble(PInit.PRIMI.get(i).getCost());
						Utils.KEYBOARD=1;
					}
					else
						cost = Utils.KEYBOARD*Double.parseDouble(PInit.PRIMI.get(i).getCost());
					utils.setRowDLM(Utils.KEYBOARD, buttonName, DLM, cost);
					Utils.KEYBOARD=0;
					break;
				}
				
			}
		}
		
		else if (panel.getName().equals("secondsPanel") || panel.getName().equals("veggyPanel"))
		{
			for (int i=0; i< SInit.SECONDI.size(); ++i)
			{
				buttonName = SInit.SECONDI.get(i).getName();
					
				if (button.getText().equals(buttonName))
				{
					if (Utils.KEYBOARD == 0)
					{
						cost = Double.parseDouble(SInit.SECONDI.get(i).getCost());
						Utils.KEYBOARD=1;
					}
					else
						cost = Utils.KEYBOARD*Double.parseDouble(SInit.SECONDI.get(i).getCost());
					utils.setRowDLM(Utils.KEYBOARD, buttonName, DLM, cost);
					Utils.KEYBOARD=0;
					break;
				}
				
			}
		}
		
		else if (panel.getName().equals("dessertPanel") || panel.getName().equals("dessWinesPanel"))
		{
			for (int i=0; i< DInit.DESSERT.size(); ++i)
			{
				buttonName = DInit.DESSERT.get(i).getName();
					
				if (button.getText().equals(buttonName))
				{
					if (Utils.KEYBOARD == 0)
					{
						cost = Double.parseDouble(DInit.DESSERT.get(i).getCost());
						Utils.KEYBOARD=1;
					}
					else
						cost = Utils.KEYBOARD*Double.parseDouble(DInit.DESSERT.get(i).getCost());
					utils.setRowDLM(Utils.KEYBOARD, buttonName, DLM, cost);
					Utils.KEYBOARD=0;
					break;
				}
				
			}
		}
		
		else if (panel.getName().equals("winesPanel") || panel.getName().equals("wines2Panel") || panel.getName().equals("wines3Panel") || panel.getName().equals("wines4Panel") || panel.getName().equals("wines5Panel"))
		{
			for (int i=0; i< VInit.VINI.size(); ++i)
			{
				buttonName = VInit.VINI.get(i).getName();
					
				if (button.getText().equals(buttonName))
				{
					if (Utils.KEYBOARD == 0)
					{
						cost = Double.parseDouble(VInit.VINI.get(i).getCost());
						Utils.KEYBOARD=1;
					}
					else
						cost = Utils.KEYBOARD*Double.parseDouble(VInit.VINI.get(i).getCost());
					utils.setRowDLM(Utils.KEYBOARD, buttonName, DLM, cost);
					Utils.KEYBOARD=0;
					break;
				}
				
			}
		}
		
		else if (panel.getName().equals("liquorsPanel"))
		{
			for (int i=0; i< LInit.LIQUORI.size(); ++i)
			{
				buttonName = LInit.LIQUORI.get(i).getName();
					
				if (button.getText().equals(buttonName))
				{
					if (Utils.KEYBOARD == 0)
					{
						cost = Double.parseDouble(LInit.LIQUORI.get(i).getCost());
						Utils.KEYBOARD=1;
					}
					else
						cost = Utils.KEYBOARD*Double.parseDouble(LInit.LIQUORI.get(i).getCost());
					utils.setRowDLM(Utils.KEYBOARD, buttonName, DLM, cost);
					Utils.KEYBOARD=0;
					break;
				}
				
			}
		}
	
	}

}
