package ActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Design.Utils;

public class KeyboardListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton button = (JButton) e.getSource();		
		String num = button.getText();
		int number = Integer.parseInt(num);
		/*
		if (Utils.KEYBOARD >= 100)
			Utils.KEYBOARD += number*1000;
		if (Utils.KEYBOARD >= 10)
			Utils.KEYBOARD += number*100;
		if (Utils.KEYBOARD > 1)
			Utils.KEYBOARD += number*10;
		if (Utils.KEYBOARD == 1)
			Utils.KEYBOARD += number;
			*/
		if (Utils.KEYBOARD != 0)
			Utils.KEYBOARD = Utils.KEYBOARD*10 + number; 
		else 
			Utils.KEYBOARD = number;
	}

}
