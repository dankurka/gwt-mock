package com.googlecode.gwtmock.schedule.client.gwt;

import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.user.client.Timer;
import com.googlecode.gwtmock.schedule.client.TimerInterface;
import com.googlecode.gwtmock.schedule.client.TimingRequest;

public class TimerInterfaceGwtImpl implements TimerInterface {

	@Override
	public TimingRequest schedule(final ScheduledCommand command, int time) {
		final Timer timer = new Timer(){

			@Override
			public void run() {
				command.execute();
				
			}};
			
			
		timer.schedule(time);
		return new TimingRequest() {
			
			@Override
			public void cancel() {
				timer.cancel();
				
			}
		};
	}

	@Override
	public TimingRequest scheduleRepeatin(final ScheduledCommand command, int time) {
		final Timer timer = new Timer(){

			@Override
			public void run() {
				command.execute();
				
			}};
			
			
		timer.scheduleRepeating(time);
		return new TimingRequest() {
			
			@Override
			public void cancel() {
				timer.cancel();
				
			}
		};
	}

}
