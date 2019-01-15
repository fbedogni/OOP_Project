package Design;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;


// window è una classe di prova per testare i vari cambiamenti della finestra in seguito alla pressione di bottoni che inducono un cambiamento nella schermata
// questa classe è quindi usata per testare la classe PanelBuilder
public class Window {
	
	public static LinkedList<String> active = new LinkedList<String>();
	
	private JFrame frame;
	private PanelBuilder pb;
	
	public Window() {
		frame = new JFrame("Gestione");
		frame.setVisible(true);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FrameInitializer init = new FrameInitializer();
		init.setDim(frame);
		init.setIcon(frame);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1350, 729);
		panel.setBackground(new Color(255, 255, 240));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		pb = new PanelBuilder();
		pb.groundBuilder(panel);

		Timers t = new Timers(panel);
		
		
	}

}
