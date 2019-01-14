package Design;

import java.util.HashSet;
import java.util.concurrent.*;
import java.time.LocalTime;
import Design.Utils;

public class Timers {
	private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);
	private Utils utils;
	
	public Timers() {
		utils = new Utils();
		clock_initializer();
		updater_initializer();
	}
	
	private void clock_initializer() {
		final Runnable time_update = new Runnable() {
			public void run() {
				LocalTime time = LocalTime.now();
				String t = time.toString();
				System.out.println(t.substring(0, t.lastIndexOf(':')));
			}
		};
		final ScheduledFuture<?> timerHandle = scheduler.scheduleAtFixedRate(time_update, 0, 1, TimeUnit.SECONDS);
	}
	
	private void updater_initializer() {
		final Runnable table_update = new Runnable() {
			public void run() {
				update_10_sec();
			}
		};
		final ScheduledFuture<?> timerHandle = scheduler.scheduleAtFixedRate(table_update, 0, 10, TimeUnit.SECONDS);
	}
	
	private void update_10_sec() {
		Update_Orders handler = new Update_Orders();
		HashSet<Integer> lista_tavoli = handler.get_tavoli_attivi();
		Window.active.clear();
		for (Integer i : lista_tavoli)
		{
			if (!utils.isActive(i.toString()))
			Window.active.add(i.toString());
		}
		handler.payment(3);
	}
}
