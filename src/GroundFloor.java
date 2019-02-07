
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import actionListener.ButtonsListener;
import actionListener.TablesListener;

public class GroundFloor {

	private JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GroundFloor window = new GroundFloor();
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
	public GroundFloor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Image title = new ImageIcon(this.getClass().getResource("/title.png")).getImage();
		frame.setIconImage(title);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(dim.width,dim.height);
		frame.setLocation(0,0);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 240));
		panel.setBounds(0, 0, 1350, 729);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(1195, 0, 155, 729);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_2 = new JButton("Primo piano");
		ButtonsListener bl_floor = new ButtonsListener();
		bl_floor.setPanel(panel);
		btnNewButton_2.addActionListener(bl_floor);
		btnNewButton_2.setBackground(new Color(240, 230, 140));
		btnNewButton_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("Piano terra");
		ButtonsListener bl_ground = new ButtonsListener();
		bl_ground.setPanel(panel);
		btnNewButton.addActionListener(bl_ground);
		btnNewButton.setBackground(new Color(240, 230, 140));
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Prato");
		ButtonsListener bl_green = new ButtonsListener();
		bl_green.setPanel(panel);
		btnNewButton_1.addActionListener(bl_green);
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
		
		
		int num=0;
		
		JLabel label = new JLabel("[" + num + "/24]");
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
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(68, 82, 951, 460);
		panel_4.setBackground(new Color(255, 255, 240));
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 6, 80, 50));
		
		JButton btnNewButton_15 = new JButton("10");
		TablesListener tl10 = new TablesListener(new DefaultListModel());
		tl10.setPanel(panel);
		tl10.setFloor(0);
		btnNewButton_15.addActionListener(tl10);
		btnNewButton_15.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_15.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_15);
		
		JButton btnNewButton_14 = new JButton("11");
		TablesListener tl11 = new TablesListener(new DefaultListModel());
		tl11.setPanel(panel);
		tl11.setFloor(0);
		btnNewButton_14.addActionListener(tl11);
		btnNewButton_14.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_14.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_14);
		
		JButton btnNewButton_13 = new JButton("12");
		TablesListener tl12 = new TablesListener(new DefaultListModel());
		tl12.setPanel(panel);
		tl12.setFloor(0);
		btnNewButton_13.addActionListener(tl12);
		btnNewButton_13.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_13.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_13);
		
		JButton btnNewButton_12 = new JButton("13");
		TablesListener tl13 = new TablesListener(new DefaultListModel());
		tl13.setPanel(panel);
		tl13.setFloor(0);
		btnNewButton_12.addActionListener(tl13);
		btnNewButton_12.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_12.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_12);
		
		JButton btnNewButton_11 = new JButton("14");
		TablesListener tl14 = new TablesListener(new DefaultListModel());
		tl14.setPanel(panel);
		tl14.setFloor(0);
		btnNewButton_11.addActionListener(tl14);
		btnNewButton_11.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_11.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_11);
		
		JButton btnNewButton_10 = new JButton("15");
		TablesListener tl15 = new TablesListener(new DefaultListModel());
		tl15.setPanel(panel);
		tl15.setFloor(0);
		btnNewButton_10.addActionListener(tl15);
		btnNewButton_10.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_10.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_10);
		
		JButton btnNewButton_21 = new JButton("20");
		TablesListener tl20 = new TablesListener(new DefaultListModel());
		tl20.setPanel(panel);
		tl20.setFloor(0);
		btnNewButton_21.addActionListener(tl20);
		btnNewButton_21.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_21.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_21);
		
		JButton btnNewButton_16 = new JButton("21");
		TablesListener tl21 = new TablesListener(new DefaultListModel());
		tl21.setPanel(panel);
		tl21.setFloor(0);
		btnNewButton_16.addActionListener(tl21);
		btnNewButton_16.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_16.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_16);
		
		JButton btnNewButton_20 = new JButton("22");
		TablesListener tl22 = new TablesListener(new DefaultListModel());
		tl22.setPanel(panel);
		tl22.setFloor(0);
		btnNewButton_20.addActionListener(tl22);
		btnNewButton_20.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_20.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_20);
		
		JButton btnNewButton_19 = new JButton("23");
		TablesListener tl23 = new TablesListener(new DefaultListModel());
		tl23.setPanel(panel);
		tl23.setFloor(0);
		btnNewButton_19.addActionListener(tl23);
		btnNewButton_19.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_19.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_19);
		
		JButton btnNewButton_18 = new JButton("24");
		TablesListener tl24 = new TablesListener(new DefaultListModel());
		tl24.setPanel(panel);
		tl24.setFloor(0);
		btnNewButton_18.addActionListener(tl24);
		btnNewButton_18.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_18.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_18);
		
		JButton btnNewButton_17 = new JButton("25");
		TablesListener tl25 = new TablesListener(new DefaultListModel());
		tl25.setPanel(panel);
		tl25.setFloor(0);
		btnNewButton_17.addActionListener(tl25);
		btnNewButton_17.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_17.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_17);
		
		JButton btnNewButton_3 = new JButton("30");
		TablesListener tl30 = new TablesListener(new DefaultListModel());
		tl30.setPanel(panel);
		tl30.setFloor(0);
		btnNewButton_3.addActionListener(tl30);
		btnNewButton_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_3.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_3);
		
		JButton btnNewButton_9 = new JButton("31");
		TablesListener tl31 = new TablesListener(new DefaultListModel());
		tl31.setPanel(panel);
		tl31.setFloor(0);
		btnNewButton_9.addActionListener(tl31);
		btnNewButton_9.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_9.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_9);
		
		JButton btnNewButton_8 = new JButton("32");
		TablesListener tl32 = new TablesListener(new DefaultListModel());
		tl32.setPanel(panel);
		tl32.setFloor(0);
		btnNewButton_8.addActionListener(tl32);
		btnNewButton_8.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_8.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_8);
		
		JButton btnNewButton_7 = new JButton("33");
		TablesListener tl33 = new TablesListener(new DefaultListModel());
		tl33.setPanel(panel);
		tl33.setFloor(0);
		btnNewButton_7.addActionListener(tl33);
		btnNewButton_7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_7.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_7);
		
		JButton btnNewButton_6 = new JButton("34");
		TablesListener tl34 = new TablesListener(new DefaultListModel());
		tl34.setPanel(panel);
		tl34.setFloor(0);
		btnNewButton_6.addActionListener(tl34);
		btnNewButton_6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_6.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton("35");
		TablesListener tl35 = new TablesListener(new DefaultListModel());
		tl35.setPanel(panel);
		tl35.setFloor(0);
		btnNewButton_5.addActionListener(tl35);
		btnNewButton_5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_5.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_5);
		
		JButton btnNewButton_23 = new JButton("40");
		TablesListener tl40 = new TablesListener(new DefaultListModel());
		tl40.setPanel(panel);
		tl40.setFloor(0);
		btnNewButton_23.addActionListener(tl40);
		btnNewButton_23.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_23.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_23);
		
		JButton btnNewButton_26 = new JButton("41");
		TablesListener tl41 = new TablesListener(new DefaultListModel());
		tl41.setPanel(panel);
		tl41.setFloor(0);
		btnNewButton_26.addActionListener(tl41);
		btnNewButton_26.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_26.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_26);
		
		JButton btnNewButton_25 = new JButton("42");
		TablesListener tl42 = new TablesListener(new DefaultListModel());
		tl42.setPanel(panel);
		tl42.setFloor(0);
		btnNewButton_25.addActionListener(tl42);
		btnNewButton_25.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_25.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_25);
		
		JButton btnNewButton_24 = new JButton("43");
		TablesListener tl43 = new TablesListener(new DefaultListModel());
		tl43.setPanel(panel);
		tl43.setFloor(0);
		btnNewButton_24.addActionListener(tl43);
		btnNewButton_24.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_24.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_24);
		
		JButton btnNewButton_22 = new JButton("44");
		TablesListener tl44 = new TablesListener(new DefaultListModel());
		tl44.setPanel(panel);
		tl44.setFloor(0);
		btnNewButton_22.addActionListener(tl44);
		btnNewButton_22.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_22.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_22);
		
		JButton btnNewButton_4 = new JButton("45");
		TablesListener tl45 = new TablesListener(new DefaultListModel());
		tl45.setPanel(panel);
		tl45.setFloor(0);
		btnNewButton_4.addActionListener(tl45);
		btnNewButton_4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_4.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_4);
		
	}

}
