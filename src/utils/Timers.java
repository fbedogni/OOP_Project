package utils;

import java.util.HashSet;
import java.util.concurrent.*;

import javax.swing.JPanel;

import design.Init;
import design.PanelBuilder;
import design.Window;

import java.awt.Color;
import java.time.LocalTime;

public class Timers {
	private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);
	private Utils utils;
	private JPanel panel;
	public static int floor;
	private static String timer;
	
	public Timers(JPanel panel) {
		this.panel = panel;
		utils = new Utils();
		clock_initializer();
		updater_initializer();
	}
	
	private void clock_initializer() {
		final Runnable time_update = new Runnable() {
			public void run() {
				LocalTime time = LocalTime.now();
				String t = time.toString();
				Timers.timer = t.substring(0, t.lastIndexOf(':'));
			}
		};
		final ScheduledFuture<?> timerHandle = scheduler.scheduleAtFixedRate(time_update, 0, 1, TimeUnit.SECONDS);
	}
	
	private void updater_initializer() {
		final Runnable table_update = new Runnable() {
			public void run() {
				update_5_sec();
			}
		};
		final ScheduledFuture<?> timerHandle = scheduler.scheduleAtFixedRate(table_update, 0, 5, TimeUnit.SECONDS);
	}
	
	private void update_5_sec() {
		Update_Orders handler = new Update_Orders();
		HashSet<Integer> lista_tavoli = handler.get_tavoli_attivi();
		Window.active.clear();
		for (Integer i : lista_tavoli)
		{
			if (!utils.isActive(i.toString()))
			Window.active.add(i.toString());
		}
		updateScreen();
	}
	
	private void updateScreen() {
		if (!Init.finestraTavoliAttiva)
		{ return; }
		panel.removeAll();
		PanelBuilder pb = new PanelBuilder();
		if (floor == -1)
			pb.greenBuilder(panel);
		if (floor == 0)
			pb.groundBuilder(panel);
		if (floor == 1)
			pb.floorBuilder(panel);
		panel.setBackground(new Color(255, 255, 240));
		panel.setOpaque(true);
		panel.revalidate();
		panel.repaint();
	}

	public static String getTime() {
		// TODO Auto-generated method stub
		return timer;
	}
}
