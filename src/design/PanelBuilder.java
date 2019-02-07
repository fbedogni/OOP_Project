package design;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;

import actionListener.ButtonsListener;
import actionListener.ElementListener;
import actionListener.KeyboardListener;
import actionListener.TablesListener;
import design.Init;
import utils.*;


public class PanelBuilder {
	
	Utils utils = new Utils();

	public void groundBuilder (JPanel panel)
	{	
		int counter=0;
		
		Init.finestraTavoliAttiva = true;
		
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
		lblTavoliOccupati.setBounds(10, 20, 135, 16);
		panel_2.add(lblTavoliOccupati);
		
		JLabel time = new JLabel (Timers.getTime());
		time.setHorizontalAlignment(SwingConstants.CENTER);
		time.setFont(new Font("Tahoma", Font.PLAIN, 18));
		time.setBackground(new Color(0, 0, 0));
		time.setForeground(new Color(0, 255, 0));
		time.setOpaque(true);
		time.setBounds(10, 120, 135, 20);
		panel_2.add(time);
		
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setForeground(new Color(0, 255, 0));
		separator.setBounds(10, 90, 135, 2);
		panel_2.add(separator);
		/*
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
		
		*/
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(68, 82, 951, 460);
		panel_4.setBackground(new Color(255, 255, 240));
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 6, 80, 50));
		
		JButton btnNewButton_15 = new JButton("10");
		ListModels.getInstance().tl10.setPanel(panel);
		ListModels.getInstance().tl10.setFloor(0);
		btnNewButton_15.addActionListener(ListModels.getInstance().tl10);
		btnNewButton_15.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("10"))
		{
			counter++;
			btnNewButton_15.setBackground(new Color(255, 0, 102));	
		}
		else
			btnNewButton_15.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_15);
		
		JButton btnNewButton_14 = new JButton("11");
		ListModels.getInstance().tl11.setPanel(panel);
		ListModels.getInstance().tl11.setFloor(0);
		btnNewButton_14.addActionListener(ListModels.getInstance().tl11);
		btnNewButton_14.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("11"))
		{
			counter++;
			btnNewButton_14.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_14.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_14);
		
		JButton btnNewButton_13 = new JButton("12");
		ListModels.getInstance().tl12.setPanel(panel);
		ListModels.getInstance().tl12.setFloor(0);
		btnNewButton_13.addActionListener(ListModels.getInstance().tl12);
		btnNewButton_13.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("12"))
		{
			counter++;
			btnNewButton_13.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_13.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_13);
		
		JButton btnNewButton_12 = new JButton("13");
		ListModels.getInstance().tl13.setPanel(panel);
		ListModels.getInstance().tl13.setFloor(0);
		btnNewButton_12.addActionListener(ListModels.getInstance().tl13);
		btnNewButton_12.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("13"))
		{
			counter++;
			btnNewButton_12.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_12.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_12);
		
		JButton btnNewButton_11 = new JButton("14");
		ListModels.getInstance().tl14.setPanel(panel);
		ListModels.getInstance().tl14.setFloor(0);
		btnNewButton_11.addActionListener(ListModels.getInstance().tl14);
		btnNewButton_11.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("14"))
		{
			counter++;
			btnNewButton_11.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_11.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_11);
		
		JButton btnNewButton_10 = new JButton("15");
		ListModels.getInstance().tl15.setPanel(panel);
		ListModels.getInstance().tl15.setFloor(0);
		btnNewButton_10.addActionListener(ListModels.getInstance().tl15);
		btnNewButton_10.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("15"))
		{
			counter++;
			btnNewButton_10.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_10.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_10);
		
		JButton btnNewButton_21 = new JButton("20");
		ListModels.getInstance().tl20.setPanel(panel);
		ListModels.getInstance().tl20.setFloor(0);
		btnNewButton_21.addActionListener(ListModels.getInstance().tl20);
		btnNewButton_21.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("20"))
		{
			counter++;
			btnNewButton_21.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_21.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_21);
		
		JButton btnNewButton_16 = new JButton("21");
		ListModels.getInstance().tl21.setPanel(panel);
		ListModels.getInstance().tl21.setFloor(0);
		btnNewButton_16.addActionListener(ListModels.getInstance().tl21);
		btnNewButton_16.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("21"))
		{
			counter++;
			btnNewButton_16.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_16.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_16);
		
		JButton btnNewButton_20 = new JButton("22");
		ListModels.getInstance().tl22.setPanel(panel);
		ListModels.getInstance().tl22.setFloor(0);
		btnNewButton_20.addActionListener(ListModels.getInstance().tl22);
		btnNewButton_20.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("22"))
		{
			counter++;
			btnNewButton_20.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_20.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_20);
		
		JButton btnNewButton_19 = new JButton("23");
		ListModels.getInstance().tl23.setPanel(panel);
		ListModels.getInstance().tl23.setFloor(0);
		btnNewButton_19.addActionListener(ListModels.getInstance().tl23);
		btnNewButton_19.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("23"))
		{
			counter++;
			btnNewButton_19.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_19.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_19);
		
		JButton btnNewButton_18 = new JButton("24");
		ListModels.getInstance().tl24.setPanel(panel);
		ListModels.getInstance().tl24.setFloor(0);
		btnNewButton_18.addActionListener(ListModels.getInstance().tl24);
		btnNewButton_18.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("24"))
		{
			counter++;
			btnNewButton_18.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_18.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_18);
		
		JButton btnNewButton_17 = new JButton("25");
		ListModels.getInstance().tl25.setPanel(panel);
		ListModels.getInstance().tl25.setFloor(0);
		btnNewButton_17.addActionListener(ListModels.getInstance().tl25);
		btnNewButton_17.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("25"))
		{
			counter++;
			btnNewButton_17.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_17.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_17);
		
		JButton btnNewButton_3 = new JButton("30");
		ListModels.getInstance().tl30.setPanel(panel);
		ListModels.getInstance().tl30.setFloor(0);
		btnNewButton_3.addActionListener(ListModels.getInstance().tl30);
		btnNewButton_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("30"))
		{
			counter++;
			btnNewButton_3.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_3.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_3);
		
		JButton btnNewButton_9 = new JButton("31");
		ListModels.getInstance().tl31.setPanel(panel);
		ListModels.getInstance().tl31.setFloor(0);
		btnNewButton_9.addActionListener(ListModels.getInstance().tl31);
		btnNewButton_9.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("31"))
		{
			counter++;
			btnNewButton_9.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_9.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_9);
		
		JButton btnNewButton_8 = new JButton("32");
		ListModels.getInstance().tl32.setPanel(panel);
		ListModels.getInstance().tl32.setFloor(0);
		btnNewButton_8.addActionListener(ListModels.getInstance().tl32);
		btnNewButton_8.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("32"))
		{
			counter++;
			btnNewButton_8.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_8.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_8);
		
		JButton btnNewButton_7 = new JButton("33");
		ListModels.getInstance().tl33.setPanel(panel);
		ListModels.getInstance().tl33.setFloor(0);
		btnNewButton_7.addActionListener(ListModels.getInstance().tl33);
		btnNewButton_7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("33"))
		{
			counter++;
			btnNewButton_7.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_7.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_7);
		
		JButton btnNewButton_6 = new JButton("34");
		ListModels.getInstance().tl34.setPanel(panel);
		ListModels.getInstance().tl34.setFloor(0);
		btnNewButton_6.addActionListener(ListModels.getInstance().tl34);
		btnNewButton_6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("34"))
		{
			counter++;
			btnNewButton_6.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_6.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton("35");
		ListModels.getInstance().tl35.setPanel(panel);
		ListModels.getInstance().tl35.setFloor(0);
		btnNewButton_5.addActionListener(ListModels.getInstance().tl35);
		btnNewButton_5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("35"))
		{
			counter++;
			btnNewButton_5.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_5.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_5);
		
		JButton btnNewButton_23 = new JButton("40");
		ListModels.getInstance().tl40.setPanel(panel);
		ListModels.getInstance().tl40.setFloor(0);
		btnNewButton_23.addActionListener(ListModels.getInstance().tl40);
		btnNewButton_23.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("40"))
		{
			counter++;
			btnNewButton_23.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_23.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_23);
		
		JButton btnNewButton_26 = new JButton("41");
		ListModels.getInstance().tl41.setPanel(panel);
		ListModels.getInstance().tl41.setFloor(0);
		btnNewButton_26.addActionListener(ListModels.getInstance().tl41);
		btnNewButton_26.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("41"))
		{
			counter++;
			btnNewButton_26.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_26.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_26);
		
		JButton btnNewButton_25 = new JButton("42");
		ListModels.getInstance().tl42.setPanel(panel);
		ListModels.getInstance().tl42.setFloor(0);
		btnNewButton_25.addActionListener(ListModels.getInstance().tl42);
		btnNewButton_25.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("42"))
		{
			counter++;
			btnNewButton_25.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_25.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_25);
		
		JButton btnNewButton_24 = new JButton("43");
		ListModels.getInstance().tl43.setPanel(panel);
		ListModels.getInstance().tl43.setFloor(0);
		btnNewButton_24.addActionListener(ListModels.getInstance().tl43);
		btnNewButton_24.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("43"))
		{
			counter++;
			btnNewButton_24.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_24.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_24);
		
		JButton btnNewButton_22 = new JButton("44");
		ListModels.getInstance().tl44.setPanel(panel);
		ListModels.getInstance().tl44.setFloor(0);
		btnNewButton_22.addActionListener(ListModels.getInstance().tl44);
		btnNewButton_22.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("44"))
		{
			counter++;
			btnNewButton_22.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_22.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_22);
		
		JButton btnNewButton_4 = new JButton("45");
		ListModels.getInstance().tl45.setPanel(panel);
		ListModels.getInstance().tl45.setFloor(0);
		btnNewButton_4.addActionListener(ListModels.getInstance().tl45);
		btnNewButton_4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("45"))
		{
			counter++;
			btnNewButton_4.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_4.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_4);
		

		JLabel label = new JLabel("[" + counter + "/24]");
		// il testo di questo label lo si prende calcolando qunati tavoli presenti nella pagina sono occupati rispetto ai tavoli totali
		// ogni pagina avrà un numero di tavoli diverso e un numero diverso di tavoli occupati, quindi quando si camba pagina bisogna aggiornare la label
		// per tener traccia di quali tavoli sono occupati basta scorrere tutti i bottoni e contare quanti di essi hanno il colore tipico dei tavoli occupati
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBackground(new Color(0, 0, 0));
		label.setForeground(new Color(0, 255, 0));
		label.setOpaque(true);
		label.setBounds(10, 50, 135, 18);
		panel_2.add(label);
	
	}
	
	
	public void floorBuilder (JPanel panel)
	{
		int counter=0;
		
		Init.finestraTavoliAttiva = true;
		
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
		lblTavoliOccupati.setBounds(10, 20, 135, 16);
		panel_2.add(lblTavoliOccupati);
		
		JLabel time = new JLabel (Timers.getTime());
		time.setHorizontalAlignment(SwingConstants.CENTER);
		time.setFont(new Font("Tahoma", Font.PLAIN, 18));
		time.setBackground(new Color(0, 0, 0));
		time.setForeground(new Color(0, 255, 0));
		time.setOpaque(true);
		time.setBounds(10, 120, 135, 20);
		panel_2.add(time);
		
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setForeground(new Color(0, 255, 0));
		separator.setBounds(10, 90, 135, 2);
		panel_2.add(separator);
		
		/*
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
		*/
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(138, 144, 703, 346);
		panel_3.setBackground(new Color(255,255,240));
		panel_3.setOpaque(true);
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(4, 0, 170, 30));
		
		JButton btnNewButton_4 = new JButton("100");
		ListModels.getInstance().tl100.setPanel(panel);
		ListModels.getInstance().tl100.setFloor(1);
		btnNewButton_4.addActionListener(ListModels.getInstance().tl100);
		btnNewButton_4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("100"))
		{
			counter++;
			btnNewButton_4.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_4.setBackground(new Color(100, 149, 237));
		panel_3.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("110");
		ListModels.getInstance().tl110.setPanel(panel);
		ListModels.getInstance().tl110.setFloor(1);
		btnNewButton_5.addActionListener(ListModels.getInstance().tl110);
		btnNewButton_5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("110"))
		{
			counter++;
			btnNewButton_5.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_5.setBackground(new Color(100, 149, 237));
		panel_3.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("120");
		ListModels.getInstance().tl120.setPanel(panel);
		ListModels.getInstance().tl120.setFloor(1);
		btnNewButton_6.addActionListener(ListModels.getInstance().tl120);
		btnNewButton_6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("120"))
		{
			counter++;
			btnNewButton_6.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_6.setBackground(new Color(100, 149, 237));
		panel_3.add(btnNewButton_6);
		
		JButton btnNewButton_8 = new JButton("101");
		ListModels.getInstance().tl101.setPanel(panel);
		ListModels.getInstance().tl101.setFloor(1);
		btnNewButton_8.addActionListener(ListModels.getInstance().tl101);
		btnNewButton_8.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("101"))
		{
			counter++;
			btnNewButton_8.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_8.setBackground(new Color(100, 149, 237));
		panel_3.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("111");
		ListModels.getInstance().tl111.setPanel(panel);
		ListModels.getInstance().tl111.setFloor(1);
		btnNewButton_9.addActionListener(ListModels.getInstance().tl111);
		btnNewButton_9.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("111"))
		{
			counter++;
			btnNewButton_9.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_9.setBackground(new Color(100, 149, 237));
		panel_3.add(btnNewButton_9);
		
		JButton btnNewButton_7 = new JButton("121");
		ListModels.getInstance().tl121.setPanel(panel);
		ListModels.getInstance().tl121.setFloor(1);
		btnNewButton_7.addActionListener(ListModels.getInstance().tl121);
		btnNewButton_7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("121"))
		{
			counter++;
			btnNewButton_7.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_7.setBackground(new Color(100, 149, 237));
		panel_3.add(btnNewButton_7);
		
		JButton btnNewButton_11 = new JButton("102");
		ListModels.getInstance().tl102.setPanel(panel);
		ListModels.getInstance().tl102.setFloor(1);
		btnNewButton_11.addActionListener(ListModels.getInstance().tl102);
		btnNewButton_11.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("102"))
		{
			counter++;
			btnNewButton_11.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_11.setBackground(new Color(100, 149, 237));
		panel_3.add(btnNewButton_11);
		
		JButton btnNewButton_15 = new JButton("112");
		ListModels.getInstance().tl112.setPanel(panel);
		ListModels.getInstance().tl112.setFloor(1);
		btnNewButton_15.addActionListener(ListModels.getInstance().tl112);
		btnNewButton_15.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("112"))
		{
			counter++;
			btnNewButton_15.setBackground(new Color(255, 0, 102));
			
		}
		else
			btnNewButton_15.setBackground(new Color(100, 149, 237));
		panel_3.add(btnNewButton_15);
		
		JButton btnNewButton_3 = new JButton("122");
		ListModels.getInstance().tl122.setPanel(panel);
		ListModels.getInstance().tl122.setFloor(1);
		btnNewButton_3.addActionListener(ListModels.getInstance().tl122);
		btnNewButton_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("122"))
		{
			counter++;
			btnNewButton_3.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_3.setBackground(new Color(100, 149, 237));
		panel_3.add(btnNewButton_3);
		
		JButton btnNewButton_12 = new JButton("103");
		ListModels.getInstance().tl103.setPanel(panel);
		ListModels.getInstance().tl103.setFloor(1);
		btnNewButton_12.addActionListener(ListModels.getInstance().tl103);
		btnNewButton_12.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("103"))
		{
			counter++;
			btnNewButton_12.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_12.setBackground(new Color(100, 149, 237));
		panel_3.add(btnNewButton_12);
		
		JButton btnNewButton_10 = new JButton("113");
		ListModels.getInstance().tl113.setPanel(panel);
		ListModels.getInstance().tl113.setFloor(1);
		btnNewButton_10.addActionListener(ListModels.getInstance().tl113);
		btnNewButton_10.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("113"))
		{
			counter++;
			btnNewButton_10.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_10.setBackground(new Color(100, 149, 237));
		panel_3.add(btnNewButton_10);
		
		JButton btnNewButton_14 = new JButton("123");
		ListModels.getInstance().tl123.setPanel(panel);
		ListModels.getInstance().tl123.setFloor(1);
		btnNewButton_14.addActionListener(ListModels.getInstance().tl123);
		btnNewButton_14.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("123"))
		{
			counter++;
			btnNewButton_14.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_14.setBackground(new Color(100, 149, 237));
		panel_3.add(btnNewButton_14);
		
		JLabel label = new JLabel("[" + counter + "/24]");
		// il testo di questo label lo si prende calcolando qunati tavoli presenti nella pagina sono occupati rispetto ai tavoli totali
		// ogni pagina avrà un numero di tavoli diverso e un numero diverso di tavoli occupati, quindi quando si camba pagina bisogna aggiornare la label
		// per tener traccia di quali tavoli sono occupati basta scorrere tutti i bottoni e contare quanti di essi hanno il colore tipico dei tavoli occupati
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBackground(new Color(0, 0, 0));
		label.setForeground(new Color(0, 255, 0));
		label.setOpaque(true);
		label.setBounds(10, 50, 135, 18);
		panel_2.add(label);
		
	}
	
	
	public void greenBuilder (JPanel panel)
	{
		int counter=0;
		
		Init.finestraTavoliAttiva = true;
		
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
		lblTavoliOccupati.setBounds(10, 20, 135, 16);
		panel_2.add(lblTavoliOccupati);
	
		
		JLabel time = new JLabel (Timers.getTime());
		time.setHorizontalAlignment(SwingConstants.CENTER);
		time.setFont(new Font("Tahoma", Font.PLAIN, 18));
		time.setBackground(new Color(0, 0, 0));
		time.setForeground(new Color(0, 255, 0));
		time.setOpaque(true);
		time.setBounds(10, 120, 135, 20);
		panel_2.add(time);
		
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setForeground(new Color(0, 255, 0));
		separator.setBounds(10, 90, 135, 2);
		panel_2.add(separator);
		/*
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
		*/
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 240));
		panel_3.setBounds(0, 0, 1195, 729);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_4;
		panel_4 = new JPanel();
		panel_4.setBorder(null);
		panel_4.setBackground(new Color(255, 255, 240));
		panel_4.setBounds(284, 152, 339, 415);
		panel_3.add(panel_4);
		panel_4.setLayout(new GridLayout(4, 2, 100, 50));
		
		
		// idea: ogni tavolo ha un TablesListener diverso così posso associare ad ogni tavolo un DLM diverso, passandolo nel costruttore del TablesListener
		
		JButton btnNewButton_3 = new JButton("80");
		ListModels.getInstance().tl80.setPanel(panel);
		ListModels.getInstance().tl80.setFloor(-1);
		btnNewButton_3.addActionListener(ListModels.getInstance().tl80);
		btnNewButton_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("80"))
		{
			counter++;
			btnNewButton_3.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_3.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("84");
		ListModels.getInstance().tl84.setPanel(panel);
		ListModels.getInstance().tl84.setFloor(-1);
		btnNewButton_5.addActionListener(ListModels.getInstance().tl84);
		btnNewButton_5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("84"))
		{
			counter++;
			btnNewButton_5.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_5.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("81");
		ListModels.getInstance().tl81.setPanel(panel);
		ListModels.getInstance().tl81.setFloor(-1);
		btnNewButton_6.addActionListener(ListModels.getInstance().tl81);
		btnNewButton_6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("81"))
		{
			counter++;
			btnNewButton_6.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_6.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_6);
		
		JButton btnNewButton_4 = new JButton("85");
		ListModels.getInstance().tl85.setPanel(panel);
		ListModels.getInstance().tl85.setFloor(-1);
		btnNewButton_4.addActionListener(ListModels.getInstance().tl85);
		btnNewButton_4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("85"))
		{
			counter++;
			btnNewButton_4.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_4.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_4);
		
		JButton btnNewButton_7 = new JButton("82");
		ListModels.getInstance().tl82.setPanel(panel);
		ListModels.getInstance().tl82.setFloor(-1);
		btnNewButton_7.addActionListener(ListModels.getInstance().tl82);
		btnNewButton_7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("82"))
		{
			counter++;
			btnNewButton_7.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_7.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("86");
		ListModels.getInstance().tl86.setPanel(panel);
		ListModels.getInstance().tl86.setFloor(-1);
		btnNewButton_8.addActionListener(ListModels.getInstance().tl86);
		btnNewButton_8.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("86"))
		{
			counter++;
			btnNewButton_8.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_8.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("83");
		ListModels.getInstance().tl83.setPanel(panel);
		ListModels.getInstance().tl83.setFloor(-1);
		btnNewButton_9.addActionListener(ListModels.getInstance().tl83);
		btnNewButton_9.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("83"))
		{
			counter++;
			btnNewButton_9.setBackground(new Color(255, 0, 102));
		}
		else
			btnNewButton_9.setBackground(new Color(100, 149, 237));
		panel_4.add(btnNewButton_9);
		
		JButton button = new JButton("87");
		ListModels.getInstance().tl87.setPanel(panel);
		ListModels.getInstance().tl87.setFloor(-1);
		button.addActionListener(ListModels.getInstance().tl87);
		button.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		if (utils.isActive("87"))
		{
			counter++;
			button.setBackground(new Color(255, 0, 102));
		}
		else
			button.setBackground(new Color(100, 149, 237));
		panel_4.add(button);
		
		
		JLabel label = new JLabel("[" + counter + "/24]");
		// il testo di questo label lo si prende calcolando qunati tavoli presenti nella pagina sono occupati rispetto ai tavoli totali
		// ogni pagina avrà un numero di tavoli diverso e un numero diverso di tavoli occupati, quindi quando si camba pagina bisogna aggiornare la label
		// per tener traccia di quali tavoli sono occupati basta scorrere tutti i bottoni e contare quanti di essi hanno il colore tipico dei tavoli occupati
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBackground(new Color(0, 0, 0));
		label.setForeground(new Color(0, 255, 0));
		label.setOpaque(true);
		label.setBounds(10, 50, 135, 18);
		panel_2.add(label);
		
	}
	
	public void firstsBuilder (JPanel panel, DefaultListModel<String> DLM)
	{
		Init.finestraTavoliAttiva = false;
		
		ElementListener el = new ElementListener();
		el.setDLM(DLM);
		
		JLabel lblPrimi = new JLabel("Primi piatti");
		lblPrimi.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblPrimi.setOpaque(true);
		lblPrimi.setBackground(new Color(255, 240, 245));
		lblPrimi.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrimi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPrimi.setBounds(10, 11, 716, 29);
		panel.add(lblPrimi);
		
		JPanel firstsPanel = new JPanel();
		firstsPanel.setName("firstsPanel");
		firstsPanel.setBounds(10, 51, 716, 678);
		panel.add(firstsPanel);
		firstsPanel.setLayout(new GridLayout(0, 4, 5, 5));
		
		JButton btnNewButton_1 = new JButton("TORTELLI VERDI");
		btnNewButton_1.addActionListener(el);
		firstsPanel.add(btnNewButton_1);
		btnNewButton_1.setBackground(new Color(255, 255, 102));
		
		JButton btnNewButton_2 = new JButton();
		btnNewButton_2.addActionListener(el);
		firstsPanel.add(btnNewButton_2);
		btnNewButton_2.setBackground(new Color(255, 255, 102));
		btnNewButton_2.setText("TORTELLI PATATE");
		
		JButton btnNewButton_5 = new JButton("TORTELLI SPECK");
		btnNewButton_5.addActionListener(el);
		firstsPanel.add(btnNewButton_5);
		btnNewButton_5.setBackground(new Color(255, 255, 102));
		
		JButton btnNewButton_4 = new JButton("TORTELLI ZUCCA");
		btnNewButton_4.addActionListener(el);
		firstsPanel.add(btnNewButton_4);
		btnNewButton_4.setBackground(new Color(255, 255, 102));
		
		JButton btnNewButton_10 = new JButton("GRAMIGNA");
		btnNewButton_10.addActionListener(el);
		firstsPanel.add(btnNewButton_10);
		btnNewButton_10.setBackground(new Color(255, 255, 102));
		
		JButton btnNewButton_9 = new JButton("PANSOTTI");
		btnNewButton_9.addActionListener(el);
		firstsPanel.add(btnNewButton_9);
		btnNewButton_9.setBackground(new Color(255, 255, 102));
		
		JButton btnNewButton_15 = new JButton("TAGLIATELLE");
		btnNewButton_15.addActionListener(el);
		firstsPanel.add(btnNewButton_15);
		btnNewButton_15.setBackground(new Color(255, 255, 102));
		
		JButton btnNewButton_14 = new JButton("RISOTTO");
		btnNewButton_14.addActionListener(el);
		firstsPanel.add(btnNewButton_14);
		btnNewButton_14.setBackground(new Color(255, 255, 102));
		
		JButton btnNewButton_20 = new JButton("STRIGOLI");
		btnNewButton_20.addActionListener(el);
		firstsPanel.add(btnNewButton_20);
		btnNewButton_20.setBackground(new Color(255, 255, 102));
		
		JButton btnNewButton_19 = new JButton("GNOCCHETTI");
		btnNewButton_19.addActionListener(el);
		firstsPanel.add(btnNewButton_19);
		btnNewButton_19.setBackground(new Color(255, 255, 102));
		
		JButton btnNewButton_31 = new JButton("ROSETTE");
		btnNewButton_31.addActionListener(el);
		firstsPanel.add(btnNewButton_31);
		btnNewButton_31.setBackground(new Color(255, 255, 102));
		
		JButton btnNewButton_30 = new JButton("CAPPELLETTI");
		btnNewButton_30.addActionListener(el);
		firstsPanel.add(btnNewButton_30);
		btnNewButton_30.setBackground(new Color(255, 255, 102));
		
		JButton btnNewButton_8 = new JButton("PAPPARDELLE");
		btnNewButton_8.addActionListener(el);
		firstsPanel.add(btnNewButton_8);
		btnNewButton_8.setBackground(new Color(255, 255, 102));
		
		JButton btnNewButton_29 = new JButton("PASTA RAGU'");
		btnNewButton_29.addActionListener(el);
		firstsPanel.add(btnNewButton_29);
		btnNewButton_29.setBackground(new Color(255, 255, 102));
		
		JButton btnNewButton_28 = new JButton("TROFIE");
		btnNewButton_28.addActionListener(el);
		firstsPanel.add(btnNewButton_28);
		btnNewButton_28.setBackground(new Color(255, 255, 102));
		
		JButton btnNewButton_7 = new JButton("");
		firstsPanel.add(btnNewButton_7);
		btnNewButton_7.setBackground(new Color(255, 255, 102));
		
		JButton btnNewButton_13 = new JButton("TORTELLATA");
		btnNewButton_13.addActionListener(el);
		firstsPanel.add(btnNewButton_13);
		btnNewButton_13.setBackground(new Color(255, 255, 102));
			
		JButton btnNewButton_12 = new JButton("BIS");
		btnNewButton_12.addActionListener(el);
		firstsPanel.add(btnNewButton_12);
		btnNewButton_12.setBackground(new Color(255, 255, 102));
			
		JButton btnNewButton_11 = new JButton("TRIS");
		btnNewButton_11.addActionListener(el);
		firstsPanel.add(btnNewButton_11);
		btnNewButton_11.setBackground(new Color(255, 255, 102));
			
		JButton btnNewButton_6 = new JButton("QUADRIS");
		btnNewButton_6.addActionListener(el);
		firstsPanel.add(btnNewButton_6);
		btnNewButton_6.setBackground(new Color(255, 255, 102));
			
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(el);
		firstsPanel.add(btnNewButton_3);
		btnNewButton_3.setBackground(new Color(255, 255, 102));
			
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(el);
		firstsPanel.add(btnNewButton);
		btnNewButton.setBackground(new Color(255, 255, 102));
			
		JButton btnNewButton_16 = new JButton("");
		btnNewButton_16.addActionListener(el);
		firstsPanel.add(btnNewButton_16);
		btnNewButton_16.setBackground(new Color(255, 255, 102));
			
		JButton btnNewButton_17 = new JButton("");
		btnNewButton_17.addActionListener(el);
		firstsPanel.add(btnNewButton_17);
		btnNewButton_17.setBackground(new Color(255, 255, 102));
	}

	public void secondsBuilder (JPanel panel, DefaultListModel<String> DLM)
	{
		Init.finestraTavoliAttiva = false;
		
		ElementListener el = new ElementListener();
		el.setDLM(DLM);
		
		JLabel lblSecondiPiatti = new JLabel("Secondi piatti");
		lblSecondiPiatti.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblSecondiPiatti.setOpaque(true);
		lblSecondiPiatti.setBackground(new Color(255, 240, 245));
		lblSecondiPiatti.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSecondiPiatti.setHorizontalAlignment(SwingConstants.CENTER);
		lblSecondiPiatti.setBounds(10, 11, 716, 22);
		panel.add(lblSecondiPiatti);
		
		JPanel secondsPanel = new JPanel();
		secondsPanel.setName("secondsPanel");
		secondsPanel.setBounds(10, 44, 716, 366);
		panel.add(secondsPanel);
		secondsPanel.setLayout(new GridLayout(5, 5, 5, 5));
		
		JButton btnNewButton_1 = new JButton("TAGLIATA");
		btnNewButton_1.addActionListener(el);
		btnNewButton_1.setBackground(new Color(255, 235, 205));
		secondsPanel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("TAGLIATA R/G");
		btnNewButton_2.addActionListener(el);
		btnNewButton_2.setBackground(new Color(255, 235, 205));
		secondsPanel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("ARROSTICINI");
		btnNewButton_3.addActionListener(el);
		btnNewButton_3.setBackground(new Color(255, 235, 205));
		secondsPanel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("COSTOLETTE");
		btnNewButton_4.addActionListener(el);
		btnNewButton_4.setBackground(new Color(255, 235, 205));
		secondsPanel.add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton("COTOLETTA");
		btnNewButton_6.addActionListener(el);
		btnNewButton_6.setBackground(new Color(255, 235, 205));
		secondsPanel.add(btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton("GRIGLIATA M");
		btnNewButton_5.addActionListener(el);
		btnNewButton_5.setBackground(new Color(255, 235, 205));
		secondsPanel.add(btnNewButton_5);
		
		JButton btnNewButton_8 = new JButton("GRIGLIATA A");
		btnNewButton_8.addActionListener(el);
		btnNewButton_8.setBackground(new Color(255, 235, 205));
		secondsPanel.add(btnNewButton_8);
		
		JButton btnNewButton_7 = new JButton("GRIGLIATA M/A");
		btnNewButton_7.addActionListener(el);
		btnNewButton_7.setBackground(new Color(255, 235, 205));
		secondsPanel.add(btnNewButton_7);
		
		JButton btnNewButton_10 = new JButton("FILETTO");
		btnNewButton_10.addActionListener(el);
		btnNewButton_10.setBackground(new Color(255, 235, 205));
		secondsPanel.add(btnNewButton_10);
		
		JButton btnNewButton_12 = new JButton("FILETTO PEPE");
		btnNewButton_12.addActionListener(el);
		btnNewButton_12.setBackground(new Color(255, 235, 205));
		secondsPanel.add(btnNewButton_12);
		
		JButton btnNewButton_11 = new JButton("FILETTO ACETO");
		btnNewButton_11.addActionListener(el);
		btnNewButton_11.setBackground(new Color(255, 235, 205));
		secondsPanel.add(btnNewButton_11);
		
		JButton btnNewButton_9 = new JButton("FILETTO PORCINI");
		btnNewButton_9.addActionListener(el);
		btnNewButton_9.setBackground(new Color(255, 235, 205));
		secondsPanel.add(btnNewButton_9);
		
		JButton btnNewButton_16 = new JButton("PRAGA");
		btnNewButton_16.addActionListener(el);
		btnNewButton_16.setBackground(new Color(255, 235, 205));
		secondsPanel.add(btnNewButton_16);
		
		JButton btnNewButton_15 = new JButton("SALSICCIA");
		btnNewButton_15.addActionListener(el);
		btnNewButton_15.setBackground(new Color(255, 235, 205));
		secondsPanel.add(btnNewButton_15);
		
		JButton btnNewButton_14 = new JButton("BISTECCA");
		btnNewButton_14.addActionListener(el);
		btnNewButton_14.setBackground(new Color(255, 235, 205));
		secondsPanel.add(btnNewButton_14);
		
		JButton btnNewButton_13 = new JButton("COSTINE");
		btnNewButton_13.addActionListener(el);
		btnNewButton_13.setBackground(new Color(255, 235, 205));
		secondsPanel.add(btnNewButton_13);
		
		JButton btnNewButton_19 = new JButton("");
		btnNewButton_19.addActionListener(el);
		btnNewButton_19.setBackground(new Color(255, 235, 205));
		secondsPanel.add(btnNewButton_19);
		
		JButton btnNewButton_18 = new JButton("");
		btnNewButton_18.addActionListener(el);
		btnNewButton_18.setBackground(new Color(255, 235, 205));
		secondsPanel.add(btnNewButton_18);
		
		JButton btnNewButton_17 = new JButton("");
		btnNewButton_17.addActionListener(el);
		btnNewButton_17.setBackground(new Color(255, 235, 205));
		secondsPanel.add(btnNewButton_17);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(el);
		btnNewButton.setBackground(new Color(255, 235, 205));
		secondsPanel.add(btnNewButton);
		
		JLabel lblContorni = new JLabel("Contorni");
		lblContorni.setHorizontalAlignment(SwingConstants.CENTER);
		lblContorni.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblContorni.setBackground(new Color(255, 240, 245));
		lblContorni.setOpaque(true);
		lblContorni.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblContorni.setBounds(10, 421, 716, 22);
		panel.add(lblContorni);
		
		JPanel veggyPanel = new JPanel();
		veggyPanel.setName("veggyPanel");
		veggyPanel.setBounds(10, 454, 716, 264);
		panel.add(veggyPanel);
		veggyPanel.setLayout(new GridLayout(5, 5, 20, 5));
		
		JButton btnNewButton_30 = new JButton("BUFFET");
		btnNewButton_30.addActionListener(el);
		btnNewButton_30.setBackground(new Color(102, 255, 102));
		veggyPanel.add(btnNewButton_30);
		
		JButton btnNewButton_29 = new JButton("PATATE FORNO");
		btnNewButton_29.addActionListener(el);
		btnNewButton_29.setBackground(new Color(102, 255, 102));
		veggyPanel.add(btnNewButton_29);
		
		JButton btnNewButton_28 = new JButton("PATATE FRITTE");
		btnNewButton_28.addActionListener(el);
		btnNewButton_28.setBackground(new Color(102, 255, 102));
		veggyPanel.add(btnNewButton_28);
		
		JButton btnNewButton_21 = new JButton("INSALATA MISTA");
		btnNewButton_21.addActionListener(el);
		btnNewButton_21.setBackground(new Color(102, 255, 102));
		veggyPanel.add(btnNewButton_21);
		
		JButton btnNewButton_32 = new JButton("INSALATA VERDE");
		btnNewButton_32.addActionListener(el);
		btnNewButton_32.setBackground(new Color(102, 255, 102));
		veggyPanel.add(btnNewButton_32);
		
		JButton btnNewButton_31 = new JButton("POLENTA FRITTA");
		btnNewButton_31.addActionListener(el);
		btnNewButton_31.setBackground(new Color(102, 255, 102));
		veggyPanel.add(btnNewButton_31);
		
		JButton btnNewButton_34 = new JButton("VERDURE GRIGLIA");
		btnNewButton_34.addActionListener(el);
		btnNewButton_34.setBackground(new Color(102, 255, 102));
		veggyPanel.add(btnNewButton_34);
		
		JButton btnNewButton_33 = new JButton("VERDURE PASTELLATE");
		btnNewButton_33.addActionListener(el);
		btnNewButton_33.setBackground(new Color(102, 255, 102));
		veggyPanel.add(btnNewButton_33);
		
		JButton btnNewButton_36 = new JButton("FUNGHI FRITTI");
		btnNewButton_36.addActionListener(el);
		btnNewButton_36.setBackground(new Color(102, 255, 102));
		veggyPanel.add(btnNewButton_36);
		
		JButton btnNewButton_40 = new JButton("");
		btnNewButton_40.setBackground(new Color(102, 255, 102));
		veggyPanel.add(btnNewButton_40);
		
		JButton btnNewButton_39 = new JButton("");
		btnNewButton_39.setBackground(new Color(102, 255, 102));
		veggyPanel.add(btnNewButton_39);
		
		JButton btnNewButton_35 = new JButton("");
		btnNewButton_35.setBackground(new Color(102, 255, 102));
		veggyPanel.add(btnNewButton_35);
		
		JButton btnNewButton_20 = new JButton("");
		btnNewButton_20.addActionListener(el);
		btnNewButton_20.setBackground(new Color(102, 255, 102));
		veggyPanel.add(btnNewButton_20);
		
		JButton btnNewButton_41 = new JButton("");
		btnNewButton_41.addActionListener(el);
		btnNewButton_41.setBackground(new Color(102, 255, 102));
		veggyPanel.add(btnNewButton_41);
		
		JButton btnNewButton_42 = new JButton("");
		btnNewButton_42.addActionListener(el);
		btnNewButton_42.setBackground(new Color(102, 255, 102));
		veggyPanel.add(btnNewButton_42);
	}
	
	public void rightMainBuilder (JPanel panel_10, JPanel panel_9, DefaultListModel<String> DLM, String tableNumber,int floor)
	{
		Init.finestraTavoliAttiva = false;
		
		Image main = new ImageIcon(this.getClass().getResource("/main.png")).getImage();
		Image bottle = new ImageIcon(this.getClass().getResource("/bottle.png")).getImage();
		Image liquor = new ImageIcon(this.getClass().getResource("/liquor.png")).getImage();
		Image cashdesk = new ImageIcon(this.getClass().getResource("/cashdesk.png")).getImage();
		Image delete = new ImageIcon(this.getClass().getResource("/delete.png")).getImage();
		Image plates = new ImageIcon(this.getClass().getResource("/plates.png")).getImage();
		Image firsts = new ImageIcon(this.getClass().getResource("/firsts.png")).getImage();
		Image seconds = new ImageIcon(this.getClass().getResource("/seconds.png")).getImage();
		Image dessert = new ImageIcon(this.getClass().getResource("/dessert.png")).getImage();
		
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
		bl_main.setDLM(DLM);
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
		bl_primi.setDLM(DLM);
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
		bl_secondi.setDLM(DLM);
		bl_secondi.setPanel(panel_9);
		btnNewButton_22.addActionListener(bl_secondi);
		panel_3.add(btnNewButton_22);
		
		JButton btnNewButton_26 = new JButton("DESSERT");
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
		bl_dessert.setDLM(DLM);
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
		bl_vini.setDLM(DLM);
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
		bl_liquori.setDLM(DLM);
		bl_liquori.setPanel(panel_9);
		button.addActionListener(bl_liquori);
		panel_3.add(button);
		
		JButton btnNewButton_23 = new JButton("C");
		JLabel plate = new JLabel();
		plate.setHorizontalTextPosition(SwingConstants.CENTER);
		plate.setHorizontalAlignment(SwingConstants.CENTER);
		plate.setIcon(new ImageIcon(plates));
		btnNewButton_23.setLayout(new BorderLayout());
		btnNewButton_23.add(plate,BorderLayout.CENTER); 
		JLabel label7 = new JLabel("COPERTO");
		label7.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_23.add(label7,BorderLayout.SOUTH); 
		ElementListener el = new ElementListener();
		el.setDLM(DLM);
		btnNewButton_23.addActionListener(el);
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
		
		JLabel lblCassiere = new JLabel(Init.USER);
		// il testo in questa label corrisponde al nome dell'operatore, che si ricava dal codice che è stato inserito all'avvio dell'applicazione
		lblCassiere.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCassiere.setForeground(new Color(255, 255, 0));
		lblCassiere.setBounds(141, 11, 242, 52);
		panel_5.add(lblCassiere);
		
		//new Utils().getTotal(DLM)
		
		String total = new Utils().getTotal(DLM);
		JLabel label_1 = new JLabel(total);
		//label_1.setText();
		// per impostare il testo della label mi serve un metodo che calcoli il costo totale degli elementi presenti nella lista_ordini
		label_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 28));
		label_1.setForeground(new Color(0, 255, 0));
		label_1.setBounds(320, 81, 149, 26);
		panel_5.add(label_1);
		
		JLabel lblTavolo = new JLabel("Tavolo:");
		lblTavolo.setForeground(new Color(0, 255, 0));
		lblTavolo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblTavolo.setBounds(10, 164, 80, 26);
		panel_5.add(lblTavolo);
		
		JLabel label_2 = new JLabel(tableNumber);
		label_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		label_2.setForeground(new Color(0, 255, 0));
		label_2.setBounds(170, 164, 73, 26);
		panel_5.add(label_2);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setOpaque(true);
		separator.setForeground(new Color(0, 255, 0));
		separator.setBounds(10, 129, 459, 2);
		panel_5.add(separator);
		/*
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
		*/
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
		
		JList<String> list = new JList<String>();
		scrollPane.setViewportView(list);
		//System.out.println(list.getFont().toString());
		list.setModel(DLM);
		
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
		bl_modifica.setFloor(floor);
		bl_modifica.setDLM(DLM);
		bl_modifica.setTableNumber(tableNumber);
		btnNewButton_37.addActionListener(bl_modifica);
		btnNewButton_37.setBackground(new Color(255, 69, 0));
		btnNewButton_37.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		btnNewButton_37.setBounds(0, 11, 182, 235);
		panel_7.add(btnNewButton_37);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(192, 11, 287, 178);
		panel_7.add(panel_8);
		panel_8.setLayout(new GridLayout(3, 4, 0, 0));
		
		KeyboardListener kl = new KeyboardListener();  
		
		JButton btnNewButton_44 = new JButton("1");
		btnNewButton_44.addActionListener(kl);
		btnNewButton_44.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 27));
		panel_8.add(btnNewButton_44);
		
		JButton btnNewButton_45 = new JButton("2");
		btnNewButton_45.addActionListener(kl);
		btnNewButton_45.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 27));
		panel_8.add(btnNewButton_45);
		
		JButton btnNewButton_46 = new JButton("3");
		btnNewButton_46.addActionListener(kl);
		btnNewButton_46.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 27));
		panel_8.add(btnNewButton_46);
		
		JButton btnNewButton_43 = new JButton("4");
		btnNewButton_43.addActionListener(kl);
		btnNewButton_43.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 27));
		panel_8.add(btnNewButton_43);
		
		JButton btnNewButton_47 = new JButton("5");
		btnNewButton_47.addActionListener(kl);
		btnNewButton_47.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 27));
		panel_8.add(btnNewButton_47);
		
		JButton btnNewButton_48 = new JButton("6");
		btnNewButton_48.addActionListener(kl);
		btnNewButton_48.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 27));
		panel_8.add(btnNewButton_48);
		
		JButton btnNewButton_52 = new JButton("7");
		btnNewButton_52.addActionListener(kl);
		btnNewButton_52.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 27));
		panel_8.add(btnNewButton_52);
		
		JButton btnNewButton_51 = new JButton("8");
		btnNewButton_51.addActionListener(kl);
		btnNewButton_51.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 27));
		panel_8.add(btnNewButton_51);
		
		JButton btnNewButton_53 = new JButton("9");
		btnNewButton_53.addActionListener(kl);
		btnNewButton_53.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 27));
		panel_8.add(btnNewButton_53);
		
		JButton btnNewButton_34 = new JButton("0");
		btnNewButton_34.addActionListener(kl);
		btnNewButton_34.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 27));
		btnNewButton_34.setBounds(193, 190, 285, 55);
		panel_7.add(btnNewButton_34);
		/*
		JButton btnNewButton_38 = new JButton("Trasferisci tavolo");
		btnNewButton_38.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_38.setBackground(new Color(173, 255, 47));
		btnNewButton_38.setBounds(0, 11, 182, 82);
		panel_7.add(btnNewButton_38);
		*/
		JButton btnNewButton_49 = new JButton("");
		btnNewButton_49.setName("delete_row");
		btnNewButton_49.setIcon(new ImageIcon(delete));
		btnNewButton_49.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_49.setBounds(0, 247, 95, 88);
		ButtonsListener bl_delete = new ButtonsListener();
		btnNewButton_49.addActionListener(bl_delete);
		bl_delete.setList(list);
		bl_delete.setDLM(DLM);
		bl_delete.setPanel(panel_9);
		bl_delete.setFloor(floor);
		bl_delete.setTableNumber(tableNumber);
		panel_1.add(btnNewButton_49);
		
		JButton btnNewButton_50 = new JButton("");
		btnNewButton_50.setName("cashdesk");
		btnNewButton_50.setIcon(new ImageIcon(cashdesk));
		btnNewButton_50.setBounds(0, 346, 95, 114);
		ButtonsListener bl_cashdesk = new ButtonsListener();
		bl_cashdesk.setDLM(DLM);
		bl_cashdesk.setPanel(panel_9);
		bl_cashdesk.setFloor(floor);
		bl_cashdesk.setTableNumber(tableNumber);
		btnNewButton_50.addActionListener(bl_cashdesk);
		panel_1.add(btnNewButton_50);
		
	}
	
	
	public void leftMainBuilder (JPanel panel_4, DefaultListModel<String> DLM)
	{
		Init.finestraTavoliAttiva = false;
		
		ElementListener el = new ElementListener();
		el.setDLM(DLM);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(0, 0, 726, 729);
		panel_4.add(panel_9);
		panel_9.setLayout(null);
		
		
		JLabel lblBevande = new JLabel("Bevande");
		lblBevande.setBounds(10, 11, 715, 23);
		panel_9.add(lblBevande);
		lblBevande.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblBevande.setOpaque(true);
		lblBevande.setBackground(new Color(255, 240, 245));
		lblBevande.setHorizontalAlignment(SwingConstants.CENTER);
		lblBevande.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JPanel panel_2 = new JPanel();
		panel_2.setName("drinksPanel");
		panel_2.setBounds(10, 43, 716, 351);
		panel_9.add(panel_2);
		panel_2.setLayout(new GridLayout(5, 5, 5, 5));
		
		
		// per colorare i JButton bisognerebbe fare un metodo che prende un array di JButton e imposta a tutti il colore passato come argomento. 
		// per fare ciò però bisognerebbe modificare tutti i JButton e renderli parte di un array, cosa che non si può fare mentre si lavora ancora con la parte di Design
		
		
		JButton btnNewButton_12 = new JButton("ACQUA NAT");
		btnNewButton_12.addActionListener(el);
		btnNewButton_12.setBackground(new Color(175, 238, 238));
		panel_2.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("ACQUA GAS");
		btnNewButton_13.addActionListener(el);
		btnNewButton_13.setBackground(new Color(175, 238, 238));
		panel_2.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("1/2 ACQUA NAT");
		btnNewButton_14.addActionListener(el);
		btnNewButton_14.setBackground(new Color(175, 238, 238));
		panel_2.add(btnNewButton_14);
		
		JButton btnNewButton_16 = new JButton("1/2 ACQUA GAS");
		btnNewButton_16.addActionListener(el);
		btnNewButton_16.setBackground(new Color(175, 238, 238));
		panel_2.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("BIRRA SPINA PICCOLA");
		btnNewButton_17.addActionListener(el);
		btnNewButton_17.setBackground(new Color(255, 255, 102));
		panel_2.add(btnNewButton_17);
		
		JButton btnNewButton_21 = new JButton("BIRRA SPINA MEDIA");
		btnNewButton_21.addActionListener(el);
		btnNewButton_21.setBackground(new Color(255, 255, 102));
		panel_2.add(btnNewButton_21);
		
		JButton btnNewButton_15 = new JButton("BIRRA SPINA 1 L");
		btnNewButton_15.addActionListener(el);
		btnNewButton_15.setBackground(new Color(255, 255, 102));
		panel_2.add(btnNewButton_15);
		
		JButton btnNewButton_11 = new JButton("LATT COCA");
		btnNewButton_11.addActionListener(el);
		btnNewButton_11.setBackground(new Color(160, 82, 45));
		panel_2.add(btnNewButton_11);
		
		JButton btnNewButton_20 = new JButton("ROSSO SPINA 1/4");
		btnNewButton_20.addActionListener(el);
		btnNewButton_20.setBackground(new Color(255, 0, 51));
		panel_2.add(btnNewButton_20);
		
		JButton btnNewButton_19 = new JButton("ROSSO SPINA 1/2");
		btnNewButton_19.addActionListener(el);
		btnNewButton_19.setBackground(new Color(255, 0, 51));
		panel_2.add(btnNewButton_19);
		
		JButton btnNewButton_18 = new JButton("ROSSO SPINA 1 L");
		btnNewButton_18.addActionListener(el);
		btnNewButton_18.setBackground(new Color(255, 0, 51));
		panel_2.add(btnNewButton_18);
		
		JButton btnNewButton_29 = new JButton("LATT FANTA");
		btnNewButton_29.addActionListener(el);
		btnNewButton_29.setBackground(new Color(255, 215, 0));
		panel_2.add(btnNewButton_29);
		
		JButton btnNewButton_28 = new JButton("BIANCO SPINA 1/4");
		btnNewButton_28.addActionListener(el);
		btnNewButton_28.setBackground(new Color(250, 250, 210));
		panel_2.add(btnNewButton_28);
		
		JButton btnNewButton_30 = new JButton("BIANCO SPINA 1/2");
		btnNewButton_30.addActionListener(el);
		btnNewButton_30.setBackground(new Color(250, 250, 210));
		panel_2.add(btnNewButton_30);
		
		JButton btnNewButton_32 = new JButton("BIANCO SPINA 1 L");
		btnNewButton_32.addActionListener(el);
		btnNewButton_32.setBackground(new Color(250, 250, 210));
		panel_2.add(btnNewButton_32);
		
		JButton btnNewButton_33 = new JButton("LATT SPRITE");
		btnNewButton_33.addActionListener(el);
		btnNewButton_33.setBackground(new Color(173, 216, 230));
		panel_2.add(btnNewButton_33);
		
		JButton btnNewButton_31 = new JButton("COCA 1 L");
		btnNewButton_31.addActionListener(el);
		btnNewButton_31.setBackground(new Color(160, 82, 45));
		panel_2.add(btnNewButton_31);
		
		JButton btnNewButton_34 = new JButton("");
		btnNewButton_34.addActionListener(el);
		btnNewButton_34.setBackground(new Color(175, 238, 238));
		panel_2.add(btnNewButton_34);
		
		JButton btnNewButton_35 = new JButton("");
		btnNewButton_35.addActionListener(el);
		btnNewButton_35.setBackground(new Color(175, 238, 238));
		panel_2.add(btnNewButton_35);
		
		JButton btnNewButton_36 = new JButton("");
		btnNewButton_36.addActionListener(el);
		btnNewButton_36.setBackground(new Color(175, 238, 238));
		panel_2.add(btnNewButton_36);
		
		JLabel lblCaffetteria = new JLabel("Caffetteria");
		lblCaffetteria.setBounds(10, 401, 715, 23);
		panel_9.add(lblCaffetteria);
		lblCaffetteria.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblCaffetteria.setOpaque(true);
		lblCaffetteria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCaffetteria.setHorizontalAlignment(SwingConstants.CENTER);
		lblCaffetteria.setBackground(new Color(255, 240, 245));
		
		//PanelBuilder pb = new PanelBuilder();
		//pb.mainBuilder(panel_1);
		
		JPanel panel = new JPanel();
		panel.setName("coffeePanel");
		panel.setBackground(new Color(240, 248, 255));
		panel.setBounds(10, 435, 715, 283);
		panel_9.add(panel);
		panel.setLayout(new GridLayout(3, 3, 5, 5));
		
		JButton btnNewButton_4 = new JButton("CAFFE'");
		btnNewButton_4.addActionListener(el);
		btnNewButton_4.setBackground(new Color(240, 230, 140));
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("CAFFE' DECA");
		btnNewButton_3.addActionListener(el);
		btnNewButton_3.setBackground(new Color(240, 230, 140));
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("CAFFE' CORRETTO");
		btnNewButton_5.addActionListener(el);
		btnNewButton_5.setBackground(new Color(240, 230, 140));
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_2 = new JButton("CAFFE' GINSENG");
		btnNewButton_2.addActionListener(el);
		btnNewButton_2.setBackground(new Color(240, 230, 140));
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_6 = new JButton("CAFFE' G GRANDE");
		btnNewButton_6.addActionListener(el);
		btnNewButton_6.setBackground(new Color(240, 230, 140));
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_1 = new JButton("CAFFE' ORZO");
		btnNewButton_1.addActionListener(el);
		btnNewButton_1.setBackground(new Color(240, 230, 140));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_10 = new JButton("CAFFE' O GRANDE");
		btnNewButton_10.addActionListener(el);
		btnNewButton_10.setBackground(new Color(240, 230, 140));
		panel.add(btnNewButton_10);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setBackground(new Color(240, 230, 140));
		panel.add(btnNewButton_8);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(240, 230, 140));
		panel.add(btnNewButton);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setBackground(new Color(240, 230, 140));
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.setBackground(new Color(240, 230, 140));
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_39 = new JButton("");
		btnNewButton_39.setBackground(new Color(240, 230, 140));
		panel.add(btnNewButton_39);
		
		JButton btnNewButton_40 = new JButton("");
		btnNewButton_40.addActionListener(el);
		btnNewButton_40.setBackground(new Color(240, 230, 140));
		panel.add(btnNewButton_40);
		
		JButton btnNewButton_41 = new JButton("");
		btnNewButton_41.addActionListener(el);
		btnNewButton_41.setBackground(new Color(240, 230, 140));
		panel.add(btnNewButton_41);
		
		JButton btnNewButton_42 = new JButton("");
		btnNewButton_42.addActionListener(el);
		btnNewButton_42.setBackground(new Color(240, 230, 140));
		panel.add(btnNewButton_42);
	
	}
	
	
	public void dessertBuilder (JPanel panel_9, DefaultListModel<String> DLM)
	{
		Init.finestraTavoliAttiva = false;
		
		ElementListener el = new ElementListener();
		el.setDLM(DLM);
		
		JLabel lblDessert = new JLabel("DESSERT");
		lblDessert.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblDessert.setOpaque(true);
		lblDessert.setBackground(new Color(255, 240, 245));
		lblDessert.setHorizontalAlignment(SwingConstants.CENTER);
		lblDessert.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDessert.setBounds(10, 11, 716, 27);
		panel_9.add(lblDessert);
		
		
		
		JPanel dessertPanel = new JPanel();
		dessertPanel.setName("dessertPanel");
		dessertPanel.setBounds(10, 49, 716, 443);
		panel_9.add(dessertPanel);
		dessertPanel.setLayout(new GridLayout(5, 4, 5, 5));
		
		JButton btnNewButton_9 = new JButton("ANANAS");
		btnNewButton_9.addActionListener(el);
		btnNewButton_9.setBackground(new Color(255, 165, 0));
		dessertPanel.add(btnNewButton_9);
		
		JButton btnNewButton_13 = new JButton("COPPA GELATO");
		btnNewButton_13.addActionListener(el);
		btnNewButton_13.setBackground(new Color(255, 165, 0));
		dessertPanel.add(btnNewButton_13);
		
		JButton btnNewButton_18 = new JButton("CREMA CATALANA");
		btnNewButton_18.addActionListener(el);
		btnNewButton_18.setBackground(new Color(255, 165, 0));
		dessertPanel.add(btnNewButton_18);
		
		JButton btnNewButton_29 = new JButton("CROSTATA");
		btnNewButton_29.addActionListener(el);
		btnNewButton_29.setBackground(new Color(255, 165, 0));
		dessertPanel.add(btnNewButton_29);
		
		JButton btnNewButton_28 = new JButton("DOLCE MATTONE");
		btnNewButton_28.addActionListener(el);
		btnNewButton_28.setBackground(new Color(255, 165, 0));
		dessertPanel.add(btnNewButton_28);
		
		JButton btnNewButton_21 = new JButton("FRAGOLE");
		btnNewButton_21.addActionListener(el);
		btnNewButton_21.setBackground(new Color(255, 165, 0));
		dessertPanel.add(btnNewButton_21);
		
		JButton btnNewButton_20 = new JButton("FRAGOLE CON GELATO");
		btnNewButton_20.addActionListener(el);
		btnNewButton_20.setBackground(new Color(255, 165, 0));
		dessertPanel.add(btnNewButton_20);
		
		JButton btnNewButton_19 = new JButton("MACEDONIA");
		btnNewButton_19.addActionListener(el);
		btnNewButton_19.setBackground(new Color(255, 165, 0));
		dessertPanel.add(btnNewButton_19);
		
		JButton btnNewButton_17 = new JButton("MASCARPONE");
		btnNewButton_17.addActionListener(el);
		btnNewButton_17.setBackground(new Color(255, 165, 0));
		dessertPanel.add(btnNewButton_17);
		
		JButton btnNewButton_16 = new JButton("PANNA COTTA");
		btnNewButton_16.addActionListener(el);
		btnNewButton_16.setBackground(new Color(255, 165, 0));
		dessertPanel.add(btnNewButton_16);
		
		JButton btnNewButton_15 = new JButton("SORB CAFFE'");
		btnNewButton_15.addActionListener(el);
		btnNewButton_15.setBackground(new Color(255, 165, 0));
		dessertPanel.add(btnNewButton_15);
		
		JButton btnNewButton_14 = new JButton("SORB LIMONE");
		btnNewButton_14.addActionListener(el);
		btnNewButton_14.setBackground(new Color(255, 165, 0));
		dessertPanel.add(btnNewButton_14);
		
		JButton btnNewButton_30 = new JButton("SORB MELA");
		btnNewButton_30.addActionListener(el);
		btnNewButton_30.setBackground(new Color(255, 165, 0));
		dessertPanel.add(btnNewButton_30);
		
		JButton btnNewButton_12 = new JButton("TIRAMISU'");
		btnNewButton_12.addActionListener(el);
		btnNewButton_12.setBackground(new Color(255, 165, 0));
		dessertPanel.add(btnNewButton_12);
		
		JButton btnNewButton_11 = new JButton("TORTA CIOCC");
		btnNewButton_11.addActionListener(el);
		btnNewButton_11.setBackground(new Color(255, 165, 0));
		dessertPanel.add(btnNewButton_11);
		
		JButton btnNewButton_10 = new JButton("TORTA CHEESE CAKE");
		btnNewButton_10.addActionListener(el);
		btnNewButton_10.setBackground(new Color(255, 165, 0));
		dessertPanel.add(btnNewButton_10);
		
		JButton btnNewButton_8 = new JButton("TORTA MELE");
		btnNewButton_8.addActionListener(el);
		btnNewButton_8.setBackground(new Color(255, 165, 0));
		dessertPanel.add(btnNewButton_8);
		
		JButton btnNewButton_31 = new JButton("TORTA MIX");
		btnNewButton_31.addActionListener(el);
		btnNewButton_31.setBackground(new Color(255, 165, 0));
		dessertPanel.add(btnNewButton_31);
		
		JButton btnNewButton_32 = new JButton("");
		btnNewButton_32.addActionListener(el);
		btnNewButton_32.setBackground(new Color(255, 165, 0));
		dessertPanel.add(btnNewButton_32);
		
		JButton btnNewButton_33 = new JButton("");
		btnNewButton_33.addActionListener(el);
		btnNewButton_33.setBackground(new Color(255, 165, 0));
		dessertPanel.add(btnNewButton_33);
		
		JLabel lblViniDaDessert = new JLabel("VINI DA DESSERT");
		lblViniDaDessert.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblViniDaDessert.setHorizontalAlignment(SwingConstants.CENTER);
		lblViniDaDessert.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblViniDaDessert.setOpaque(true);
		lblViniDaDessert.setBackground(new Color(255, 240, 245));
		lblViniDaDessert.setBounds(10, 503, 716, 27);
		panel_9.add(lblViniDaDessert);
		
		JPanel dessWinesPanel = new JPanel();
		dessWinesPanel.setName("dessWinesPanel");
		dessWinesPanel.setBounds(10, 541, 716, 177);
		panel_9.add(dessWinesPanel);
		dessWinesPanel.setLayout(new GridLayout(0, 4, 5, 5));
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(new Color(255, 153, 102));
		dessWinesPanel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("MALVASIA");
		btnNewButton_2.addActionListener(el);
		btnNewButton_2.setBackground(new Color(255, 153, 102));
		dessWinesPanel.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("PASSITO");
		btnNewButton_4.addActionListener(el);
		btnNewButton_4.setBackground(new Color(255, 153, 102));
		dessWinesPanel.add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setBackground(new Color(255, 153, 102));
		dessWinesPanel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(el);
		btnNewButton_7.setBackground(new Color(255, 153, 102));
		dessWinesPanel.add(btnNewButton_7);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(el);
		btnNewButton_5.setBackground(new Color(255, 153, 102));
		dessWinesPanel.add(btnNewButton_5);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(el);
		btnNewButton_3.setBackground(new Color(255, 153, 102));
		dessWinesPanel.add(btnNewButton_3);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(el);
		btnNewButton.setBackground(new Color(255, 153, 102));
		dessWinesPanel.add(btnNewButton);
	}
	
	
	public void wineBuilder (JPanel panel_9, DefaultListModel<String> DLM)
	{
		Init.finestraTavoliAttiva = false;
		
		ElementListener el = new ElementListener();
		el.setDLM(DLM);
		
		JLabel lblViniRossi = new JLabel("VINI ROSSI");
		lblViniRossi.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblViniRossi.setOpaque(true);
		lblViniRossi.setBackground(new Color(255, 239, 213));
		lblViniRossi.setHorizontalAlignment(SwingConstants.CENTER);
		lblViniRossi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblViniRossi.setBounds(10, 11, 716, 24);
		panel_9.add(lblViniRossi);
		
		JLabel lblFermi = new JLabel("FERMO");
		lblFermi.setOpaque(true);
		lblFermi.setBackground(new Color(240, 230, 140));
		lblFermi.setHorizontalAlignment(SwingConstants.CENTER);
		lblFermi.setHorizontalTextPosition(SwingConstants.CENTER);
		lblFermi.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFermi.setBounds(10, 46, 351, 14);
		panel_9.add(lblFermi);
		
		JLabel lblFrizzante = new JLabel("FRIZZANTE");
		lblFrizzante.setOpaque(true);
		lblFrizzante.setBackground(new Color(240, 230, 140));
		lblFrizzante.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrizzante.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFrizzante.setBounds(371, 46, 355, 14);
		panel_9.add(lblFrizzante);
		
		JPanel winesPanel = new JPanel();
		winesPanel.setName("winesPanel");
		winesPanel.setBounds(10, 71, 351, 183);
		panel_9.add(winesPanel);
		winesPanel.setLayout(new GridLayout(3, 0, 5, 5));
		
		JButton btnNewButton_1 = new JButton("SANGIOVESE");
		btnNewButton_1.addActionListener(el);
		btnNewButton_1.setBackground(new Color(233, 150, 122));
		winesPanel.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("CABERNET");
		btnNewButton_3.addActionListener(el);
		btnNewButton_3.setBackground(new Color(233, 150, 122));
		winesPanel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("CHIANTI");
		btnNewButton_4.addActionListener(el);
		btnNewButton_4.setBackground(new Color(233, 150, 122));
		winesPanel.add(btnNewButton_4);
		
		JButton btnNewButton_2 = new JButton("NERO D'AVOLA");
		btnNewButton_2.addActionListener(el);
		btnNewButton_2.setBackground(new Color(233, 150, 122));
		winesPanel.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(233, 150, 122));
		winesPanel.add(btnNewButton);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setBackground(new Color(233, 150, 122));
		winesPanel.add(btnNewButton_5);
		
		JPanel wines2Panel = new JPanel();
		wines2Panel.setName("wines2Panel");
		wines2Panel.setBounds(371, 71, 355, 183);
		panel_9.add(wines2Panel);
		wines2Panel.setLayout(new GridLayout(3, 0, 5, 5));
		
		JButton btnNewButton_7 = new JButton("P38");
		btnNewButton_7.addActionListener(el);
		btnNewButton_7.setBackground(new Color(233, 150, 122));
		wines2Panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("ROSSO ALL'ANTICA");
		btnNewButton_8.addActionListener(el);
		btnNewButton_8.setBackground(new Color(233, 150, 122));
		wines2Panel.add(btnNewButton_8);
		
		JButton btnNewButton_10 = new JButton("OTTOCENTO NERO");
		btnNewButton_10.addActionListener(el);
		btnNewButton_10.setBackground(new Color(233, 150, 122));
		wines2Panel.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("MARCELLO");
		btnNewButton_11.addActionListener(el);
		btnNewButton_11.setBackground(new Color(233, 150, 122));
		wines2Panel.add(btnNewButton_11);
		
		JButton btnNewButton_6 = new JButton("GRASPAROSSA");
		btnNewButton_6.addActionListener(el);
		btnNewButton_6.setBackground(new Color(233, 150, 122));
		wines2Panel.add(btnNewButton_6);
		
		JButton btnNewButton_9 = new JButton("GUTTURNIO");
		btnNewButton_9.addActionListener(el);
		btnNewButton_9.setBackground(new Color(233, 150, 122));
		wines2Panel.add(btnNewButton_9);
		
		JLabel lblViniBianchi = new JLabel("VINI BIANCHI");
		lblViniBianchi.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblViniBianchi.setOpaque(true);
		lblViniBianchi.setBackground(new Color(255, 239, 213));
		lblViniBianchi.setHorizontalAlignment(SwingConstants.CENTER);
		lblViniBianchi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblViniBianchi.setBounds(10, 265, 716, 24);
		panel_9.add(lblViniBianchi);
		
		JLabel lblFermo = new JLabel("FERMO");
		lblFermo.setOpaque(true);
		lblFermo.setBackground(new Color(240, 230, 140));
		lblFermo.setHorizontalAlignment(SwingConstants.CENTER);
		lblFermo.setHorizontalTextPosition(SwingConstants.CENTER);
		lblFermo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFermo.setBounds(10, 300, 351, 14);
		panel_9.add(lblFermo);
		
		JLabel lblFrizzante_1 = new JLabel("FRIZZANTE");
		lblFrizzante_1.setOpaque(true);
		lblFrizzante_1.setBackground(new Color(240, 230, 140));
		lblFrizzante_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrizzante_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblFrizzante_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFrizzante_1.setBounds(371, 300, 355, 14);
		panel_9.add(lblFrizzante_1);
		
		JPanel wines3Panel = new JPanel();
		wines3Panel.setName("wines3Panel");
		wines3Panel.setBounds(10, 325, 351, 178);
		panel_9.add(wines3Panel);
		wines3Panel.setLayout(new GridLayout(3, 0, 5, 5));
		
		JButton btnNewButton_13 = new JButton("PINOT GRIGIO");
		btnNewButton_13.addActionListener(el);
		btnNewButton_13.setBackground(new Color(240, 255, 240));
		wines3Panel.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("GEWURZTRAMINER");
		btnNewButton_14.addActionListener(el);
		btnNewButton_14.setBackground(new Color(240, 255, 240));
		wines3Panel.add(btnNewButton_14);
		
		JButton btnNewButton_16 = new JButton("PASSITO");
		btnNewButton_16.addActionListener(el);
		btnNewButton_16.setBackground(new Color(240, 255, 240));
		wines3Panel.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("VERMENTINO");
		btnNewButton_17.addActionListener(el);
		btnNewButton_17.setBackground(new Color(240, 255, 240));
		wines3Panel.add(btnNewButton_17);
		
		JButton btnNewButton_12 = new JButton("");
		btnNewButton_12.setBackground(new Color(240, 255, 240));
		wines3Panel.add(btnNewButton_12);
		
		JButton btnNewButton_15 = new JButton("");
		btnNewButton_15.setBackground(new Color(240, 255, 240));
		wines3Panel.add(btnNewButton_15);
		
		JPanel wines4Panel = new JPanel();
		wines4Panel.setName("wines4Panel");
		wines4Panel.setBounds(371, 325, 355, 178);
		panel_9.add(wines4Panel);
		wines4Panel.setLayout(new GridLayout(3, 0, 5, 5));
		
		JButton btnNewButton_19 = new JButton("SHAMMAT");
		btnNewButton_19.addActionListener(el);
		btnNewButton_19.setBackground(new Color(240, 255, 240));
		wines4Panel.add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("BORTOLOMIOL");
		btnNewButton_20.addActionListener(el);
		btnNewButton_20.setBackground(new Color(240, 255, 240));
		wines4Panel.add(btnNewButton_20);
		
		JButton btnNewButton_28 = new JButton("MALVASIA");
		btnNewButton_28.addActionListener(el);
		btnNewButton_28.setBackground(new Color(240, 255, 240));
		wines4Panel.add(btnNewButton_28);
		
		JButton btnNewButton_18 = new JButton("PIGNOLETTO");
		btnNewButton_18.addActionListener(el);
		btnNewButton_18.setBackground(new Color(240, 255, 240));
		wines4Panel.add(btnNewButton_18);
		
		JButton btnNewButton_29 = new JButton("CHARDONNAY");
		btnNewButton_29.addActionListener(el);
		btnNewButton_29.setBackground(new Color(240, 255, 240));
		wines4Panel.add(btnNewButton_29);
		
		JButton btnNewButton_21 = new JButton("");
		btnNewButton_21.setBackground(new Color(240, 255, 240));
		wines4Panel.add(btnNewButton_21);
		
		JLabel lblViniAlCalice = new JLabel("VINI AL CALICE");
		lblViniAlCalice.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblViniAlCalice.setOpaque(true);
		lblViniAlCalice.setBackground(new Color(255, 239, 213));
		lblViniAlCalice.setHorizontalAlignment(SwingConstants.CENTER);
		lblViniAlCalice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblViniAlCalice.setBounds(10, 514, 716, 24);
		panel_9.add(lblViniAlCalice);
		
		JPanel wines5Panel = new JPanel();
		wines5Panel.setName("wines5Panel");
		wines5Panel.setBounds(10, 549, 716, 169);
		panel_9.add(wines5Panel);
		wines5Panel.setLayout(new GridLayout(3, 0, 5, 5));
		
		JButton btnNewButton_32 = new JButton("CALICE PASSITO");
		btnNewButton_32.addActionListener(el);
		btnNewButton_32.setBackground(new Color(204, 204, 255));
		wines5Panel.add(btnNewButton_32);
		
		JButton btnNewButton_31 = new JButton("CALICE PROSECCO");
		btnNewButton_31.addActionListener(el);
		btnNewButton_31.setBackground(new Color(204, 204, 255));
		wines5Panel.add(btnNewButton_31);
		
		JButton btnNewButton_34 = new JButton("CALICE BIANCO FERMO");
		btnNewButton_34.addActionListener(el);
		btnNewButton_34.setBackground(new Color(204, 204, 255));
		wines5Panel.add(btnNewButton_34);
		
		JButton btnNewButton_35 = new JButton("CALICE ROSSO FERMO");
		btnNewButton_35.addActionListener(el);
		btnNewButton_35.setBackground(new Color(204, 204, 255));
		wines5Panel.add(btnNewButton_35);
		
		JButton btnNewButton_33 = new JButton("");
		btnNewButton_33.setBackground(new Color(204, 204, 255));
		wines5Panel.add(btnNewButton_33);
		
		JButton btnNewButton_36 = new JButton("");
		btnNewButton_36.setBackground(new Color(204, 204, 255));
		wines5Panel.add(btnNewButton_36);
		
		JButton btnNewButton_30 = new JButton("");
		btnNewButton_30.addActionListener(el);
		btnNewButton_30.setBackground(new Color(204, 204, 255));
		wines5Panel.add(btnNewButton_30);
		
		JButton btnNewButton_40 = new JButton("");
		btnNewButton_40.addActionListener(el);
		btnNewButton_40.setBackground(new Color(204, 204, 255));
		wines5Panel.add(btnNewButton_40);
		
		JButton btnNewButton_39 = new JButton("");
		btnNewButton_39.addActionListener(el);
		btnNewButton_39.setBackground(new Color(204, 204, 255));
		wines5Panel.add(btnNewButton_39);
	}
	
	
	public void liquorBuilder (JPanel panel, DefaultListModel<String> DLM)
	{
		Init.finestraTavoliAttiva = false;
		
		ElementListener el = new ElementListener();
		el.setDLM(DLM);
		
		JLabel lblLiquori = new JLabel("LIQUORI");
		lblLiquori.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblLiquori.setOpaque(true);
		lblLiquori.setBackground(new Color(255, 240, 245));
		lblLiquori.setHorizontalAlignment(SwingConstants.CENTER);
		lblLiquori.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLiquori.setBounds(10, 11, 716, 25);
		panel.add(lblLiquori);
		
		JPanel liquorsPanel = new JPanel();
		liquorsPanel.setName("liquorsPanel");
		liquorsPanel.setBounds(10, 47, 716, 671);
		panel.add(liquorsPanel);
		liquorsPanel.setLayout(new GridLayout(6, 5, 5, 5));
		
		JButton btnNewButton_1 = new JButton("18 LUNE");
		btnNewButton_1.addActionListener(el);
		btnNewButton_1.setBackground(new Color(233, 150, 122));
		liquorsPanel.add(btnNewButton_1);
		
		JButton btnNewButton_6 = new JButton("AMARO DEL CAPO");
		btnNewButton_6.addActionListener(el);
		btnNewButton_6.setBackground(new Color(233, 150, 122));
		liquorsPanel.add(btnNewButton_6);
		
		JButton btnNewButton_12 = new JButton("ANIMA NERA");
		btnNewButton_12.addActionListener(el);
		btnNewButton_12.setBackground(new Color(233, 150, 122));
		liquorsPanel.add(btnNewButton_12);
		
		JButton btnNewButton_18 = new JButton("AVERNA");
		btnNewButton_18.addActionListener(el);
		btnNewButton_18.setBackground(new Color(233, 150, 122));
		liquorsPanel.add(btnNewButton_18);
		
		JButton btnNewButton_30 = new JButton("BAILEYS");
		btnNewButton_30.addActionListener(el);
		btnNewButton_30.setBackground(new Color(233, 150, 122));
		liquorsPanel.add(btnNewButton_30);
		
		JButton btnNewButton_34 = new JButton("BARRICATA");
		btnNewButton_34.addActionListener(el);
		btnNewButton_34.setBackground(new Color(233, 150, 122));
		liquorsPanel.add(btnNewButton_34);
		
		JButton btnNewButton_33 = new JButton("BRANCAMENTA");
		btnNewButton_33.addActionListener(el);
		btnNewButton_33.setBackground(new Color(233, 150, 122));
		liquorsPanel.add(btnNewButton_33);
		
		JButton btnNewButton_32 = new JButton("BRAULIO");
		btnNewButton_32.addActionListener(el);
		btnNewButton_32.setBackground(new Color(233, 150, 122));
		liquorsPanel.add(btnNewButton_32);
		
		JButton btnNewButton_31 = new JButton("DIPLOMATICO");
		btnNewButton_31.addActionListener(el);
		btnNewButton_31.setBackground(new Color(233, 150, 122));
		liquorsPanel.add(btnNewButton_31);
		
		JButton btnNewButton_17 = new JButton("DISARONNO");
		btnNewButton_17.addActionListener(el);
		btnNewButton_17.setBackground(new Color(233, 150, 122));
		liquorsPanel.add(btnNewButton_17);
		
		JButton btnNewButton_29 = new JButton("FERNET");
		btnNewButton_29.addActionListener(el);
		btnNewButton_29.setBackground(new Color(233, 150, 122));
		liquorsPanel.add(btnNewButton_29);
		
		JButton btnNewButton_28 = new JButton("FRANCOLI");
		btnNewButton_28.addActionListener(el);
		btnNewButton_28.setBackground(new Color(233, 150, 122));
		liquorsPanel.add(btnNewButton_28);

		JButton btnNewButton_11 = new JButton("GLEN GRANT");
		btnNewButton_11.addActionListener(el);
		btnNewButton_11.setBackground(new Color(233, 150, 122));
		liquorsPanel.add(btnNewButton_11);
		
		JButton btnNewButton_20 = new JButton("GRAPPA MORBIDA");
		btnNewButton_20.addActionListener(el);
		btnNewButton_20.setBackground(new Color(233, 150, 122));
		liquorsPanel.add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("GRAPPA SECCA");
		btnNewButton_21.addActionListener(el);
		btnNewButton_21.setBackground(new Color(233, 150, 122));
		liquorsPanel.add(btnNewButton_21);
		
		JButton btnNewButton_19 = new JButton("HIPPOCRAS");
		btnNewButton_19.addActionListener(el);
		btnNewButton_19.setBackground(new Color(233, 150, 122));
		liquorsPanel.add(btnNewButton_19);
		
		JButton btnNewButton_16 = new JButton("LIMONCINO");
		btnNewButton_16.addActionListener(el);
		btnNewButton_16.setBackground(new Color(233, 150, 122));
		liquorsPanel.add(btnNewButton_16);
		
		JButton btnNewButton_15 = new JButton("LUCANO");
		btnNewButton_15.addActionListener(el);
		btnNewButton_15.setBackground(new Color(233, 150, 122));
		liquorsPanel.add(btnNewButton_15);
		
		JButton btnNewButton_14 = new JButton("MIRTO SARDO");
		btnNewButton_14.addActionListener(el);
		btnNewButton_14.setBackground(new Color(233, 150, 122));
		liquorsPanel.add(btnNewButton_14);
		
		JButton btnNewButton_13 = new JButton("MONTENEGRO");
		btnNewButton_13.addActionListener(el);
		btnNewButton_13.setBackground(new Color(233, 150, 122));
		liquorsPanel.add(btnNewButton_13);
		
		JButton btnNewButton_10 = new JButton("NOCINO");
		btnNewButton_10.addActionListener(el);
		btnNewButton_10.setBackground(new Color(233, 150, 122));
		liquorsPanel.add(btnNewButton_10);
		
		JButton btnNewButton_9 = new JButton("NONINO");
		btnNewButton_9.addActionListener(el);
		btnNewButton_9.setBackground(new Color(233, 150, 122));
		liquorsPanel.add(btnNewButton_9);
		
		JButton btnNewButton_8 = new JButton("OBAN");
		btnNewButton_8.addActionListener(el);
		btnNewButton_8.setBackground(new Color(233, 150, 122));
		liquorsPanel.add(btnNewButton_8);
		
		JButton btnNewButton_7 = new JButton("PETRUS");
		btnNewButton_7.addActionListener(el);
		btnNewButton_7.setBackground(new Color(233, 150, 122));
		liquorsPanel.add(btnNewButton_7);
		
		JButton btnNewButton_5 = new JButton("POLI");
		btnNewButton_5.addActionListener(el);
		btnNewButton_5.setBackground(new Color(233, 150, 122));
		liquorsPanel.add(btnNewButton_5);
		
		JButton btnNewButton_35 = new JButton("SAMBUCA");
		btnNewButton_35.addActionListener(el);
		btnNewButton_35.setBackground(new Color(233, 150, 122));
		liquorsPanel.add(btnNewButton_35);
		
		JButton btnNewButton_4 = new JButton("UNICUM");
		btnNewButton_4.addActionListener(el);
		btnNewButton_4.setBackground(new Color(233, 150, 122));
		liquorsPanel.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("VODKA");
		btnNewButton_3.addActionListener(el);
		btnNewButton_3.setBackground(new Color(233, 150, 122));
		liquorsPanel.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(el);
		btnNewButton_2.setBackground(new Color(233, 150, 122));
		liquorsPanel.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(el);
		btnNewButton.setBackground(new Color(233, 150, 122));
		liquorsPanel.add(btnNewButton);
	}
	
}
