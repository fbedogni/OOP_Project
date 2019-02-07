
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

public class FirstFloor {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstFloor window = new FirstFloor();
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
	public FirstFloor() {
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
		
		JLabel label = new JLabel("[1/12]");
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
		panel_3.setBounds(138, 144, 703, 346);
		panel_3.setBackground(new Color(255,255,240));
		panel_3.setOpaque(true);
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(4, 0, 170, 30));
		
		JButton btnNewButton_4 = new JButton("100");
		TablesListener tl100 = new TablesListener(new DefaultListModel());
		tl100.setPanel(panel);
		tl100.setFloor(1);
		btnNewButton_4.addActionListener(tl100);
		btnNewButton_4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_4.setBackground(new Color(100, 149, 237));
		panel_3.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("110");
		TablesListener tl110 = new TablesListener(new DefaultListModel());
		tl110.setPanel(panel);
		tl110.setFloor(1);
		btnNewButton_5.addActionListener(tl110);
		btnNewButton_5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_5.setBackground(new Color(100, 149, 237));
		panel_3.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("120");
		TablesListener tl120 = new TablesListener(new DefaultListModel());
		tl120.setPanel(panel);
		tl120.setFloor(1);
		btnNewButton_6.addActionListener(tl120);
		btnNewButton_6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_6.setBackground(new Color(100, 149, 237));
		panel_3.add(btnNewButton_6);
		
		JButton btnNewButton_8 = new JButton("101");
		TablesListener tl101 = new TablesListener(new DefaultListModel());
		tl101.setPanel(panel);
		tl101.setFloor(1);
		btnNewButton_8.addActionListener(tl101);
		btnNewButton_8.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_8.setBackground(new Color(100, 149, 237));
		panel_3.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("111");
		TablesListener tl111 = new TablesListener(new DefaultListModel());
		tl111.setPanel(panel);
		tl111.setFloor(1);
		btnNewButton_9.addActionListener(tl111);
		btnNewButton_9.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_9.setBackground(new Color(100, 149, 237));
		panel_3.add(btnNewButton_9);
		
		JButton btnNewButton_7 = new JButton("121");
		TablesListener tl121 = new TablesListener(new DefaultListModel());
		tl121.setPanel(panel);
		tl121.setFloor(1);
		btnNewButton_7.addActionListener(tl121);
		btnNewButton_7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_7.setBackground(new Color(100, 149, 237));
		panel_3.add(btnNewButton_7);
		
		JButton btnNewButton_11 = new JButton("102");
		TablesListener tl102 = new TablesListener(new DefaultListModel());
		tl102.setPanel(panel);
		tl102.setFloor(1);
		btnNewButton_11.addActionListener(tl102);
		btnNewButton_11.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_11.setBackground(new Color(100, 149, 237));
		panel_3.add(btnNewButton_11);
		
		JButton btnNewButton_15 = new JButton("112");
		TablesListener tl112 = new TablesListener(new DefaultListModel());
		tl112.setPanel(panel);
		tl112.setFloor(1);
		btnNewButton_15.addActionListener(tl112);
		btnNewButton_15.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_15.setBackground(new Color(100, 149, 237));
		panel_3.add(btnNewButton_15);
		
		JButton btnNewButton_3 = new JButton("122");
		TablesListener tl122 = new TablesListener(new DefaultListModel());
		tl122.setPanel(panel);
		tl122.setFloor(1);
		btnNewButton_3.addActionListener(tl122);
		btnNewButton_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_3.setBackground(new Color(100, 149, 237));
		panel_3.add(btnNewButton_3);
		
		JButton btnNewButton_12 = new JButton("103");
		TablesListener tl103 = new TablesListener(new DefaultListModel());
		tl103.setPanel(panel);
		tl103.setFloor(1);
		btnNewButton_12.addActionListener(tl103);
		btnNewButton_12.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_12.setBackground(new Color(100, 149, 237));
		panel_3.add(btnNewButton_12);
		
		JButton btnNewButton_10 = new JButton("113");
		TablesListener tl113 = new TablesListener(new DefaultListModel());
		tl113.setPanel(panel);
		tl113.setFloor(1);
		btnNewButton_10.addActionListener(tl113);
		btnNewButton_10.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_10.setBackground(new Color(100, 149, 237));
		panel_3.add(btnNewButton_10);
		
		JButton btnNewButton_14 = new JButton("123");
		TablesListener tl123 = new TablesListener(new DefaultListModel());
		tl123.setPanel(panel);
		tl123.setFloor(1);
		btnNewButton_14.addActionListener(tl123);
		btnNewButton_14.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_14.setBackground(new Color(100, 149, 237));
		panel_3.add(btnNewButton_14);
	}
}
