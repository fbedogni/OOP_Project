package Design;
import java.awt.EventQueue;

import javax.swing.*;

import InternetManager.Controller;
import InternetManager.DataInitializer;

import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Init implements ActionListener {

	private JFrame frame;
	public static String USER;	
	JButton btnNewButton_0;
	JButton btnNewButton_1;
	JButton btnNewButton_2;
	JButton btnNewButton_3;
	JButton btnNewButton_4;
	JButton btnNewButton_5;
	JButton btnNewButton_6;
	JButton btnNewButton_7;
	JButton btnNewButton_8;
	JButton btnNewButton_9;
	JButton btnNewButton_10;
	
	JLabel lblNewLabel;
	
	Controller c = new Controller();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Init window = new Init();
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
	public Init() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Gestione");
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.setBounds(100, 100, 325, 306);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Image title = new ImageIcon(this.getClass().getResource("/title.png")).getImage();
		frame.setIconImage(title);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((int) (dim.getWidth() - dim.getWidth()/2 - 180),(int) (dim.getHeight() - dim.getHeight()/2 - 100));
		
		
		JLabel lblInserireUnCodice = new JLabel("Inserire un codice utente valido:");
		lblInserireUnCodice.setForeground(Color.BLACK);
		lblInserireUnCodice.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblInserireUnCodice.setBounds(10, 11, 289, 28);
		frame.getContentPane().add(lblInserireUnCodice);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(135, 206, 235));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 50, 289, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 101, 289, 155);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(4,4));
		
		btnNewButton_1 = new JButton("1");
		btnNewButton_1.addActionListener(this);
		panel.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("2");
		btnNewButton_2.addActionListener(this);
		panel.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("3");
		btnNewButton_3.addActionListener(this);
		panel.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(this);
		panel.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(this);
		panel.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(this);
		panel.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("7");
		btnNewButton_7.addActionListener(this);
		panel.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("8");
		btnNewButton_8.addActionListener(this);
		panel.add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("9");
		btnNewButton_9.addActionListener(this);
		panel.add(btnNewButton_9);
		
		btnNewButton_0 = new JButton("0");
		btnNewButton_0.addActionListener(this);
		panel.add(btnNewButton_0);
		
		btnNewButton_10 = new JButton("CANC");
		btnNewButton_10.addActionListener(this);
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel.add(btnNewButton_10);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() 
				{

					public void actionPerformed(ActionEvent e) {
					/*
						if (lblNewLabel.getText().matches("0"))
						{
							new Window();
							frame.setVisible(false);
						}
						
							*/
						
						c.control(lblNewLabel.getText());
						
						if (USER != null) 
						{
							DataInitializer.getInstance();
							new Window();
							frame.setVisible(false);
						}
					    
						else
						{
							JOptionPane.showMessageDialog(frame, "Codice utente non valido","Errore",JOptionPane.WARNING_MESSAGE);
							lblNewLabel.setText("");
						}
					}
				
				});
		Image ok = new ImageIcon(this.getClass().getResource("/ok.png")).getImage();
		button.setIcon(new ImageIcon(ok));
		panel.add(button);
	}

	public void actionPerformed(ActionEvent e) {
		
		String number = "";
		String text;
		if (e.getSource() == btnNewButton_1)
			number= "1";
		if (e.getSource() == btnNewButton_2)
			number="2";
		if (e.getSource() == btnNewButton_3)
			number="3";
		if (e.getSource() == btnNewButton_4)
			number="4";
		if (e.getSource() == btnNewButton_5)
			number="5";
		if (e.getSource() == btnNewButton_6)
			number="6";
		if (e.getSource() == btnNewButton_7)
			number="7";
		if (e.getSource() == btnNewButton_8)
			number="8";
		if (e.getSource() == btnNewButton_9)
			number="9";
		if (e.getSource() == btnNewButton_0)
			number="0";
		if (e.getSource() == btnNewButton_10)
		{
			lblNewLabel.setText("");
			number="10";
		}
		
		if (!number.matches("10"))
		{
			text = lblNewLabel.getText();
			lblNewLabel.setText(text + number);
		}
	}
}
