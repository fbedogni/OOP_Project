import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class Window3 {

	private JFrame frame;
	DefaultListModel DLM= new DefaultListModel();
	JList list = new JList();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window3 window = new Window3();
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
	public Window3() {
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
		Image main = new ImageIcon(this.getClass().getResource("/main.png")).getImage();
		Image bottle = new ImageIcon(this.getClass().getResource("/bottle.png")).getImage();
		Image liquor = new ImageIcon(this.getClass().getResource("/liquor.png")).getImage();
		Image cashdesk = new ImageIcon(this.getClass().getResource("/cashdesk.png")).getImage();
		Image delete = new ImageIcon(this.getClass().getResource("/delete.png")).getImage();
		
		frame.setIconImage(title);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(1366,759);
		frame.setLocation(0,0);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 0, 1350, 729);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(735, 5, 116, 713);
		panel_4.add(panel_3);
		panel_3.setLayout(new GridLayout(7, 1, 0, 0));
		
		
		JButton btnNewButton_24 = new JButton();
		JLabel imageMain = new JLabel();
		imageMain.setHorizontalTextPosition(SwingConstants.CENTER);
		imageMain.setHorizontalAlignment(SwingConstants.CENTER);
		imageMain.setIcon(new ImageIcon(main));
		btnNewButton_24.setLayout(new BorderLayout());
		btnNewButton_24.add(imageMain,BorderLayout.CENTER); 
		JLabel label = new JLabel("Principale");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_24.add(label,BorderLayout.SOUTH); 
		panel_3.add(btnNewButton_24);
		
		JButton btnNewButton_25 = new JButton("PRIMI");
		panel_3.add(btnNewButton_25);
		
		JButton btnNewButton_22 = new JButton("SECONDI");
		panel_3.add(btnNewButton_22);
		
		JButton btnNewButton_26 = new JButton("DESSERT");
		panel_3.add(btnNewButton_26);
		
		JButton btnNewButton_27 = new JButton("VINI");
		btnNewButton_27.setIcon(new ImageIcon(bottle));
		panel_3.add(btnNewButton_27);
		
		JButton button = new JButton("LIQUORI");
		button.setIcon(new ImageIcon(liquor));
		panel_3.add(button);
		
		JButton btnNewButton_23 = new JButton("COPERTO");
		panel_3.add(btnNewButton_23);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(861, 11, 479, 707);
		panel_4.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 1, 479, 235);
		panel_5.setBackground(Color.BLACK);
		panel_5.setOpaque(true);
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblOperatore = new JLabel("Operatore :");
		lblOperatore.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblOperatore.setForeground(new Color(0, 255, 0));
		lblOperatore.setBackground(new Color(0, 0, 0));
		lblOperatore.setBounds(10, 11, 117, 52);
		panel_5.add(lblOperatore);
		
		JLabel lblCassiere = new JLabel("Cassiere");
		// il testo in questa label corrisponde al nome dell'operatore, che si ricava dal codice che è stato inserito all'avvio dell'applicazione
		lblCassiere.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCassiere.setForeground(new Color(255, 255, 0));
		lblCassiere.setBounds(141, 11, 242, 52);
		panel_5.add(lblCassiere);
		
		JLabel label_1 = new JLabel("100000");
		//label_1.setText();
		// per impostare il testo della label mi serve un metodo che calcoli il costo totale degli elementi prenìsenti nella lista_ordini
		label_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 28));
		label_1.setForeground(new Color(0, 255, 0));
		label_1.setBounds(320, 81, 149, 26);
		panel_5.add(label_1);
		
		JLabel lblTavolo = new JLabel("Tavolo:");
		lblTavolo.setForeground(new Color(0, 255, 0));
		lblTavolo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTavolo.setBounds(10, 154, 61, 26);
		panel_5.add(lblTavolo);
		
		JLabel label_2 = new JLabel("500");
		// il testo della label è il numero del tavolo selezionato, si ricava dal bottone che è stato premuto nella finestra precedente
		label_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		label_2.setForeground(new Color(0, 255, 0));
		label_2.setBounds(156, 152, 73, 26);
		panel_5.add(label_2);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setOpaque(true);
		separator.setForeground(new Color(0, 255, 0));
		separator.setBounds(10, 129, 459, 2);
		panel_5.add(separator);
		
		JLabel lblNewLabel = new JLabel("Orario apertura:");
		lblNewLabel.setForeground(new Color(0, 255, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 191, 134, 26);
		panel_5.add(lblNewLabel);
		
		JLabel label_3 = new JLabel("21:00");
		// label opzionale, bisognerebbe salvare in una varibile l'orario nel quale un tavolo è arrivato, cioè l'orario del primo ordine messo nella lista_ordini
		// è anche opzionale aggiungere un'altra label che indica il tempo che è trascorso dall'orario di apertura
		label_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		label_3.setForeground(new Color(0, 255, 0));
		label_3.setBounds(156, 190, 46, 26);
		panel_5.add(label_3);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(105, 236, 374, 235);
		panel_1.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblQtDescrizioneTotale = new JLabel("Q.t\u00E0     Descrizione                                                Totale");
		lblQtDescrizioneTotale.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblQtDescrizioneTotale.setOpaque(true);
		lblQtDescrizioneTotale.setBackground(new Color(169, 169, 169));
		lblQtDescrizioneTotale.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblQtDescrizioneTotale.setBounds(0, 5, 374, 25);
		panel_6.add(lblQtDescrizioneTotale);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 41, 374, 183);
		panel_6.add(scrollPane);
		
		scrollPane.setViewportView(list);
		final String string="tortelli verdi";
		final int x=3;
		final int y=20;
		final int z=100;
		final double n=10.5,n1=90.0,n2=1000.0;
		btnNewButton_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (x<10)
				DLM.addElement("       "+x+"       "+string+"                                                                "+n);
				if (y<100 && y>9)
				DLM.addElement("     "+y+"       "+string+"                                                                "+n1);
				if (z>99)
				DLM.addElement("  "+z+"       "+string+"                                                                 "+n2);
	
				list.setModel(DLM);
				
			}
		});
		
		//MouseListener ml = new MouseAdapter () {
		//	
		//}
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(0, 471, 479, 235);
		panel_7.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.add(panel_7);
		panel_7.setLayout(null);
		
		JButton btnNewButton_37 = new JButton("Invia modifica");
		btnNewButton_37.setBackground(new Color(255, 69, 0));
		btnNewButton_37.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		btnNewButton_37.setBounds(0, 104, 182, 131);
		panel_7.add(btnNewButton_37);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(192, 0, 287, 235);
		panel_7.add(panel_8);
		panel_8.setLayout(new GridLayout(3, 4, 0, 0));
		
		JButton btnNewButton_44 = new JButton("1");
		btnNewButton_44.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 27));
		panel_8.add(btnNewButton_44);
		
		JButton btnNewButton_45 = new JButton("2");
		btnNewButton_45.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 27));
		panel_8.add(btnNewButton_45);
		
		JButton btnNewButton_46 = new JButton("3");
		btnNewButton_46.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 27));
		panel_8.add(btnNewButton_46);
		
		JButton btnNewButton_43 = new JButton("4");
		btnNewButton_43.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 27));
		panel_8.add(btnNewButton_43);
		
		JButton btnNewButton_47 = new JButton("5");
		btnNewButton_47.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 27));
		panel_8.add(btnNewButton_47);
		
		JButton btnNewButton_48 = new JButton("6");
		btnNewButton_48.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 27));
		panel_8.add(btnNewButton_48);
		
		JButton btnNewButton_52 = new JButton("7");
		btnNewButton_52.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 27));
		panel_8.add(btnNewButton_52);
		
		JButton btnNewButton_51 = new JButton("8");
		btnNewButton_51.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 27));
		panel_8.add(btnNewButton_51);
		
		JButton btnNewButton_53 = new JButton("9");
		btnNewButton_53.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 27));
		panel_8.add(btnNewButton_53);
		
		JButton btnNewButton_38 = new JButton("Trasferisci tavolo");
		btnNewButton_38.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_38.setBackground(new Color(173, 255, 47));
		btnNewButton_38.setBounds(0, 11, 182, 82);
		panel_7.add(btnNewButton_38);
		
		JButton btnNewButton_49 = new JButton("");
		btnNewButton_49.setIcon(new ImageIcon(delete));
		btnNewButton_49.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_49.setBounds(0, 247, 95, 88);
		panel_1.add(btnNewButton_49);
		
		JButton btnNewButton_50 = new JButton("");
		btnNewButton_50.setIcon(new ImageIcon(cashdesk));
		btnNewButton_50.setBounds(0, 346, 95, 114);
		panel_1.add(btnNewButton_50);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 736, 718);
		panel_4.add(panel);
		panel.setLayout(null);
		
		JLabel lblLiquori = new JLabel("LIQUORI");
		lblLiquori.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblLiquori.setOpaque(true);
		lblLiquori.setBackground(new Color(255, 240, 245));
		lblLiquori.setHorizontalAlignment(SwingConstants.CENTER);
		lblLiquori.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLiquori.setBounds(10, 11, 716, 25);
		panel.add(lblLiquori);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 47, 716, 671);
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(6, 5, 5, 5));
		
		JButton btnNewButton_1 = new JButton("18 LUNE");
		btnNewButton_1.setBackground(new Color(255, 204, 204));
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_6 = new JButton("AMARO DEL CAPO");
		btnNewButton_6.setBackground(new Color(233, 150, 122));
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton_12 = new JButton("ANIMA NERA");
		btnNewButton_12.setBackground(new Color(233, 150, 122));
		panel_2.add(btnNewButton_12);
		
		JButton btnNewButton_18 = new JButton("AVERNA");
		btnNewButton_18.setBackground(new Color(233, 150, 122));
		panel_2.add(btnNewButton_18);
		
		JButton btnNewButton_30 = new JButton("BAILEYS");
		btnNewButton_30.setBackground(new Color(233, 150, 122));
		panel_2.add(btnNewButton_30);
		
		JButton btnNewButton_34 = new JButton("BARRICATA");
		btnNewButton_34.setBackground(new Color(255, 255, 102));
		panel_2.add(btnNewButton_34);
		
		JButton btnNewButton_33 = new JButton("BRANCAMENTA");
		btnNewButton_33.setBackground(new Color(255, 255, 102));
		panel_2.add(btnNewButton_33);
		
		JButton btnNewButton_32 = new JButton("BRAULIO");
		btnNewButton_32.setBackground(new Color(255, 255, 153));
		panel_2.add(btnNewButton_32);
		
		JButton btnNewButton_31 = new JButton("DIPLOMATICO");
		btnNewButton_31.setBackground(new Color(233, 150, 122));
		panel_2.add(btnNewButton_31);
		
		JButton btnNewButton_17 = new JButton("DISARONNO");
		btnNewButton_17.setBackground(new Color(233, 150, 122));
		panel_2.add(btnNewButton_17);
		
		JButton btnNewButton_29 = new JButton("FERNET");
		btnNewButton_29.setBackground(new Color(255, 255, 102));
		panel_2.add(btnNewButton_29);
		
		JButton btnNewButton_28 = new JButton("FRANCOLI");
		btnNewButton_28.setBackground(new Color(255, 255, 153));
		panel_2.add(btnNewButton_28);

		JButton btnNewButton_11 = new JButton("GLEN GRANT");
		btnNewButton_11.setBackground(new Color(255, 255, 153));
		panel_2.add(btnNewButton_11);
		
		JButton btnNewButton_20 = new JButton("GRAPPA MORBIDA");
		btnNewButton_20.setBackground(new Color(233, 150, 122));
		panel_2.add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("GRAPPA SECCA");
		btnNewButton_21.setBackground(new Color(233, 150, 122));
		panel_2.add(btnNewButton_21);
		
		JButton btnNewButton_19 = new JButton("HIPPOCRAS");
		btnNewButton_19.setBackground(new Color(233, 150, 122));
		panel_2.add(btnNewButton_19);
		
		JButton btnNewButton_16 = new JButton("LIMONCINO");
		btnNewButton_16.setBackground(new Color(233, 150, 122));
		panel_2.add(btnNewButton_16);
		
		JButton btnNewButton_15 = new JButton("LUCANO");
		btnNewButton_15.setBackground(new Color(233, 150, 122));
		panel_2.add(btnNewButton_15);
		
		JButton btnNewButton_14 = new JButton("MIRTO SARDO");
		btnNewButton_14.setBackground(new Color(233, 150, 122));
		panel_2.add(btnNewButton_14);
		
		JButton btnNewButton_13 = new JButton("MONTENEGRO");
		btnNewButton_13.setBackground(new Color(233, 150, 122));
		panel_2.add(btnNewButton_13);
		
		JButton btnNewButton_10 = new JButton("NOCINO");
		btnNewButton_10.setBackground(new Color(233, 150, 122));
		panel_2.add(btnNewButton_10);
		
		JButton btnNewButton_9 = new JButton("NONINO");
		btnNewButton_9.setBackground(new Color(233, 150, 122));
		panel_2.add(btnNewButton_9);
		
		JButton btnNewButton_8 = new JButton("OBAN");
		btnNewButton_8.setBackground(new Color(233, 150, 122));
		panel_2.add(btnNewButton_8);
		
		JButton btnNewButton_7 = new JButton("PETRUS");
		btnNewButton_7.setBackground(new Color(233, 150, 122));
		panel_2.add(btnNewButton_7);
		
		JButton btnNewButton_5 = new JButton("POLI");
		btnNewButton_5.setBackground(new Color(233, 150, 122));
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_35 = new JButton("SAMBUCA");
		btnNewButton_35.setBackground(new Color(233, 150, 122));
		panel_2.add(btnNewButton_35);
		
		JButton btnNewButton_4 = new JButton("UNICUM");
		btnNewButton_4.setBackground(new Color(233, 150, 122));
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("VODKA");
		btnNewButton_3.setBackground(new Color(233, 150, 122));
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("ZZ");
		btnNewButton_2.setBackground(new Color(233, 150, 122));
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("ZZ");
		btnNewButton.setBackground(new Color(233, 150, 122));
		panel_2.add(btnNewButton);
	}
}
