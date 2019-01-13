package Design;

import java.util.concurrent.*;
import java.time.LocalTime;

public class Timers {
	private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);
	
	public Timers() {
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
				System.out.println("aggiorno robe!");
			}
		};
		final ScheduledFuture<?> timerHandle = scheduler.scheduleAtFixedRate(table_update, 0, 10, TimeUnit.SECONDS);
	}
}
