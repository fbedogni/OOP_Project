import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

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

import actionListener.ButtonsListener;

import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window4 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window4 window = new Window4();
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
	public Window4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Image main = new ImageIcon(this.getClass().getResource("/main.png")).getImage();
		Image bottle = new ImageIcon(this.getClass().getResource("/bottle.png")).getImage();
		Image liquor = new ImageIcon(this.getClass().getResource("/liquor.png")).getImage();
		Image cashdesk = new ImageIcon(this.getClass().getResource("/cashdesk.png")).getImage();
		Image delete = new ImageIcon(this.getClass().getResource("/delete.png")).getImage();
		Image plates = new ImageIcon(this.getClass().getResource("/plates.png")).getImage();
		Image firsts = new ImageIcon(this.getClass().getResource("/firsts.png")).getImage();
		Image seconds = new ImageIcon(this.getClass().getResource("/seconds.png")).getImage();
		Image dessert = new ImageIcon(this.getClass().getResource("/dessert.png")).getImage();
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(dim.width,dim.height);
		frame.setLocation(0,0);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 0, 1350, 729);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(240, 248, 255));
		panel_9.setBounds(0, 0, 726, 729);
		panel_4.add(panel_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(240, 248, 255));
		panel_10.setBounds(725, 0, 625, 729);
		panel_4.add(panel_10);
		panel_10.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(20, 0, 116, 718);
		panel_10.add(panel_3);
		panel_3.setLayout(new GridLayout(7, 1, 0, 0));
		
		JButton btnNewButton_24 = new JButton();
		btnNewButton_24.setName("buttonMain");
		JLabel imageMain = new JLabel();
		imageMain.setHorizontalTextPosition(SwingConstants.CENTER);
		imageMain.setHorizontalAlignment(SwingConstants.CENTER);
		imageMain.setIcon(new ImageIcon(main));
		btnNewButton_24.setLayout(new BorderLayout());
		btnNewButton_24.add(imageMain,BorderLayout.CENTER); 
		JLabel label = new JLabel("PRINCIPALE");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_24.add(label,BorderLayout.SOUTH); 
		ButtonsListener bl_main = new ButtonsListener();
		bl_main.setPanel(panel_9);
		btnNewButton_24.addActionListener(bl_main);
		panel_3.add(btnNewButton_24);
		
		JButton btnNewButton_25 = new JButton();
		btnNewButton_25.setName("buttonFirsts");
		JLabel first = new JLabel();
		first.setHorizontalTextPosition(SwingConstants.CENTER);
		first.setHorizontalAlignment(SwingConstants.CENTER);
		first.setIcon(new ImageIcon(firsts));
		btnNewButton_25.setLayout(new BorderLayout());
		btnNewButton_25.add(first,BorderLayout.CENTER); 
		JLabel label2 = new JLabel("PRIMI");
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_25.add(label2,BorderLayout.SOUTH); 
		ButtonsListener bl_primi = new ButtonsListener();
		bl_primi.setPanel(panel_9);
		btnNewButton_25.addActionListener(bl_primi);
		panel_3.add(btnNewButton_25);
		
		JButton btnNewButton_22 = new JButton();
		btnNewButton_22.setName("buttonSeconds");
		JLabel second = new JLabel();
		second.setHorizontalTextPosition(SwingConstants.CENTER);
		second.setHorizontalAlignment(SwingConstants.CENTER);
		second.setIcon(new ImageIcon(seconds));
		btnNewButton_22.setLayout(new BorderLayout());
		btnNewButton_22.add(second,BorderLayout.CENTER); 
		JLabel label3 = new JLabel("SECONDI");
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_22.add(label3,BorderLayout.SOUTH); 
		ButtonsListener bl_secondi = new ButtonsListener();
		bl_secondi.setPanel(panel_9);
		btnNewButton_22.addActionListener(bl_secondi);
		panel_3.add(btnNewButton_22);
		
		JButton btnNewButton_26 = new JButton();
		btnNewButton_26.setName("buttonDessert");
		JLabel desserts = new JLabel();
		desserts.setHorizontalTextPosition(SwingConstants.CENTER);
		desserts.setHorizontalAlignment(SwingConstants.CENTER);
		desserts.setIcon(new ImageIcon(dessert));
		btnNewButton_26.setLayout(new BorderLayout());
		btnNewButton_26.add(desserts,BorderLayout.CENTER); 
		JLabel label4 = new JLabel("DESSERT");
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_26.add(label4,BorderLayout.SOUTH); 
		ButtonsListener bl_dessert = new ButtonsListener();
		bl_dessert.setPanel(panel_9);
		btnNewButton_26.addActionListener(bl_dessert);
		panel_3.add(btnNewButton_26);
		
		JButton btnNewButton_27 = new JButton();
		btnNewButton_27.setName("buttonWine");
		JLabel wine = new JLabel();
		wine.setHorizontalTextPosition(SwingConstants.CENTER);
		wine.setHorizontalAlignment(SwingConstants.CENTER);
		wine.setIcon(new ImageIcon(bottle));
		btnNewButton_27.setLayout(new BorderLayout());
		btnNewButton_27.add(wine,BorderLayout.CENTER); 
		JLabel label5 = new JLabel("VINI");
		label5.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_27.add(label5,BorderLayout.SOUTH); 
		ButtonsListener bl_vini = new ButtonsListener();
		bl_vini.setPanel(panel_9);
		btnNewButton_27.addActionListener(bl_vini);
		panel_3.add(btnNewButton_27);
		
		JButton button = new JButton();
		button.setName("buttonLiquor");
		JLabel liquors = new JLabel();
		liquors.setHorizontalTextPosition(SwingConstants.CENTER);
		liquors.setHorizontalAlignment(SwingConstants.CENTER);
		liquors.setIcon(new ImageIcon(liquor));
		button.setLayout(new BorderLayout());
		button.add(liquors,BorderLayout.CENTER); 
		JLabel label6 = new JLabel("LIQUORI");
		label6.setHorizontalAlignment(SwingConstants.CENTER);
		button.add(label6,BorderLayout.SOUTH); 
		ButtonsListener bl_liquori = new ButtonsListener();
		bl_liquori.setPanel(panel_9);
		panel_9.setLayout(null);
		button.addActionListener(bl_liquori);
		panel_3.add(button);
		
		
		
		JButton btnNewButton_23 = new JButton();
		JLabel plate = new JLabel();
		plate.setHorizontalTextPosition(SwingConstants.CENTER);
		plate.setHorizontalAlignment(SwingConstants.CENTER);
		plate.setIcon(new ImageIcon(plates));
		btnNewButton_23.setLayout(new BorderLayout());
		btnNewButton_23.add(plate,BorderLayout.CENTER); 
		JLabel label7 = new JLabel("COPERTO");
		label7.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_23.add(label7,BorderLayout.SOUTH); 
		panel_3.add(btnNewButton_23);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(147, 0, 479, 718);
		panel_10.add(panel_1);
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
		
		JLabel label_2 = new JLabel("100");
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
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		//MouseListener ml = new MouseAdapter () {
		//	
		//}
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(0, 471, 479, 247);
		panel_7.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.add(panel_7);
		panel_7.setLayout(null);
		
		JPanel p = (JPanel) panel_10.getParent();
		
		JButton btnNewButton_37 = new JButton("Invia modifica");
		ButtonsListener bl_modifica = new ButtonsListener();
		bl_modifica.setPanel(p);
		btnNewButton_37.addActionListener(bl_modifica);
		btnNewButton_37.setBackground(new Color(255, 69, 0));
		btnNewButton_37.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		btnNewButton_37.setBounds(0, 111, 182, 136);
		panel_7.add(btnNewButton_37);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(192, 11, 287, 178);
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
		
		JButton btnNewButton_34 = new JButton("0");
		btnNewButton_34.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 27));
		btnNewButton_34.setBounds(192, 190, 287, 57);
		panel_7.add(btnNewButton_34);
		
		JButton btnNewButton_49 = new JButton("");
		btnNewButton_49.setIcon(new ImageIcon(delete));
		btnNewButton_49.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_49.setBounds(0, 247, 95, 88);
		panel_1.add(btnNewButton_49);
		
		JButton btnNewButton_50 = new JButton("");
		btnNewButton_50.setIcon(new ImageIcon(cashdesk));
		btnNewButton_50.setBounds(0, 346, 95, 114);
		panel_1.add(btnNewButton_50);
		
		
		
		
		JLabel lblDessert = new JLabel("DESSERT");
		lblDessert.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblDessert.setOpaque(true);
		lblDessert.setBackground(new Color(255, 240, 245));
		lblDessert.setHorizontalAlignment(SwingConstants.CENTER);
		lblDessert.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDessert.setBounds(10, 11, 716, 27);
		panel_9.add(lblDessert);
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 49, 716, 443);
		panel_9.add(panel);
		panel.setLayout(new GridLayout(5, 4, 5, 5));
		
		JButton btnNewButton_9 = new JButton("ANANAS");
		btnNewButton_9.setBackground(new Color(255, 165, 0));
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_13 = new JButton("COPPA GELATO");
		btnNewButton_13.setBackground(new Color(255, 165, 0));
		panel.add(btnNewButton_13);
		
		JButton btnNewButton_18 = new JButton("CREMA CATALANA");
		btnNewButton_18.setBackground(new Color(255, 165, 0));
		panel.add(btnNewButton_18);
		
		JButton btnNewButton_29 = new JButton("CROSTATA");
		btnNewButton_29.setBackground(new Color(255, 165, 0));
		panel.add(btnNewButton_29);
		
		JButton btnNewButton_28 = new JButton("DOLCE MATTONE");
		btnNewButton_28.setBackground(new Color(255, 165, 0));
		panel.add(btnNewButton_28);
		
		JButton btnNewButton_21 = new JButton("FRAGOLE");
		btnNewButton_21.setBackground(new Color(255, 165, 0));
		panel.add(btnNewButton_21);
		
		JButton btnNewButton_20 = new JButton("FRAGOLE CON GELATO");
		btnNewButton_20.setBackground(new Color(255, 165, 0));
		panel.add(btnNewButton_20);
		
		JButton btnNewButton_19 = new JButton("MACEDONIA");
		btnNewButton_19.setBackground(new Color(255, 165, 0));
		panel.add(btnNewButton_19);
		
		JButton btnNewButton_17 = new JButton("MASCARPONE");
		btnNewButton_17.setBackground(new Color(255, 165, 0));
		panel.add(btnNewButton_17);
		
		JButton btnNewButton_16 = new JButton("PANNA COTTA");
		btnNewButton_16.setBackground(new Color(255, 165, 0));
		panel.add(btnNewButton_16);
		
		JButton btnNewButton_15 = new JButton("SORB CAFFE'");
		btnNewButton_15.setBackground(new Color(255, 165, 0));
		panel.add(btnNewButton_15);
		
		JButton btnNewButton_14 = new JButton("SORB LIMONE");
		btnNewButton_14.setBackground(new Color(255, 165, 0));
		panel.add(btnNewButton_14);
		
		JButton btnNewButton_30 = new JButton("SORB MELA");
		btnNewButton_30.setBackground(new Color(255, 165, 0));
		panel.add(btnNewButton_30);
		
		JButton btnNewButton_12 = new JButton("TIRAMISU'");
		btnNewButton_12.setBackground(new Color(255, 165, 0));
		panel.add(btnNewButton_12);
		
		JButton btnNewButton_11 = new JButton("TORTA CIOCC");
		btnNewButton_11.setBackground(new Color(255, 165, 0));
		panel.add(btnNewButton_11);
		
		JButton btnNewButton_10 = new JButton("TORTA CHEESE CAKE");
		btnNewButton_10.setBackground(new Color(255, 165, 0));
		panel.add(btnNewButton_10);
		
		JButton btnNewButton_8 = new JButton("TORTA MELE");
		btnNewButton_8.setBackground(new Color(255, 165, 0));
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_31 = new JButton("TORTA MIX");
		btnNewButton_31.setBackground(new Color(255, 165, 0));
		panel.add(btnNewButton_31);
		
		JButton btnNewButton_32 = new JButton("ZZ");
		btnNewButton_32.setBackground(new Color(255, 165, 0));
		panel.add(btnNewButton_32);
		
		JButton btnNewButton_33 = new JButton("ZZ");
		btnNewButton_33.setBackground(new Color(255, 165, 0));
		panel.add(btnNewButton_33);
		
		JLabel lblViniDaDessert = new JLabel("VINI DA DESSERT");
		lblViniDaDessert.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblViniDaDessert.setHorizontalAlignment(SwingConstants.CENTER);
		lblViniDaDessert.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblViniDaDessert.setOpaque(true);
		lblViniDaDessert.setBackground(new Color(255, 240, 245));
		lblViniDaDessert.setBounds(10, 503, 716, 27);
		panel_9.add(lblViniDaDessert);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 541, 716, 177);
		panel_9.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 4, 5, 5));
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(new Color(255, 153, 102));
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("MALVASIA");
		btnNewButton_2.setBackground(new Color(255, 153, 102));
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("PASSITO");
		btnNewButton_4.setBackground(new Color(255, 153, 102));
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setBackground(new Color(255, 153, 102));
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("ZZ");
		btnNewButton_7.setBackground(new Color(255, 153, 102));
		panel_2.add(btnNewButton_7);
		
		JButton btnNewButton_5 = new JButton("ZZ");
		btnNewButton_5.setBackground(new Color(255, 153, 102));
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_3 = new JButton("ZZ");
		btnNewButton_3.setBackground(new Color(255, 153, 102));
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton = new JButton("ZZ");
		btnNewButton.setBackground(new Color(255, 153, 102));
		panel_2.add(btnNewButton);
		
	}
}
