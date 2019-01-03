import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class BasicWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BasicWindow window = new BasicWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BasicWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(dim.width,dim.height);
		frame.setLocation(0,0);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1350, 729);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(1195, 0, 155, 729);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_2 = new JButton("Primo piano");
		btnNewButton_2.setBackground(new Color(240, 230, 140));
		btnNewButton_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("Piano terra");
		btnNewButton.setBackground(new Color(240, 230, 140));
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Prato");
		btnNewButton_1.setBackground(new Color(240, 230, 140));
		btnNewButton_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblTavoliOccupati = new JLabel("Tavoli occupati");
		lblTavoliOccupati.setHorizontalAlignment(SwingConstants.CENTER);
		lblTavoliOccupati.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTavoliOccupati.setForeground(new Color(0, 255, 0));
		lblTavoliOccupati.setBackground(Color.BLACK);
		lblTavoliOccupati.setBounds(10, 15, 135, 16);
		panel_2.add(lblTavoliOccupati);
		
		JLabel label = new JLabel("[0/8]");
		// il testo di questo label lo si prende calcolando qunati tavoli presenti nella pagina sono occupati rispetto ai tavoli totali
		// ogni pagina avrà un numero di tavoli diverso e un numero diverso di tavoli occupati, quindi quando si camba pagina bisogna aggiornare la label
		// per tener traccia di quali tavoli sono occupati basta scorrere tutti i bottoni e contare quanti di essi hanno il colore tipico dei tavoli occupati
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBackground(new Color(0, 0, 0));
		label.setForeground(new Color(0, 255, 0));
		label.setOpaque(true);
		label.setBounds(10, 42, 135, 16);
		panel_2.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setForeground(new Color(0, 255, 0));
		separator.setBounds(10, 69, 135, 2);
		panel_2.add(separator);
		
		JLabel lblTotaleConti = new JLabel("Totale conti");
		lblTotaleConti.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotaleConti.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTotaleConti.setForeground(new Color(0, 255, 0));
		lblTotaleConti.setBackground(new Color(0, 0, 0));
		lblTotaleConti.setBounds(10, 82, 135, 14);
		panel_2.add(lblTotaleConti);
		
		JLabel label_1 = new JLabel("0.00");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(0, 255, 0));
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(10, 107, 135, 14);
		panel_2.add(label_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(0, 0, 0));
		separator_1.setForeground(new Color(0, 255, 0));
		separator_1.setBounds(10, 132, 135, 2);
		panel_2.add(separator_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 240));
		panel_3.setBounds(0, 0, 1195, 729);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(null);
		panel_4.setBackground(new Color(255, 255, 240));
		panel_4.setBounds(284, 152, 339, 415);
		panel_3.add(panel_4);
		panel_4.setLayout(new GridLayout(4, 2, 100, 50));
		
		JButton btnNewButton_3 = new JButton("80");
		btnNewButton_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_3.setBackground(new Color(255, 0, 102));
		panel_4.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("84");
		btnNewButton_5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_5.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("81");
		btnNewButton_6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_6.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_6);
		
		JButton btnNewButton_4 = new JButton("85");
		btnNewButton_4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_4.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_4);
		
		JButton btnNewButton_7 = new JButton("82");
		btnNewButton_7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_7.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("86");
		btnNewButton_8.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_8.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("83");
		btnNewButton_9.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_9.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_9);
		
		JButton button = new JButton("87");
		button.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		button.setBackground(new Color(100, 149, 237));
		panel_4.add(button);
		
	}
}
