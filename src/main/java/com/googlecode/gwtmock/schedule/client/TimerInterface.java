package com.googlecode.gwtmock.schedule.client;

import com.google.gwt.core.client.Scheduler.ScheduledCommand;

public interface TimerInterface {

	public TimingRequest schedule(ScheduledCommand command, int time);
	
	public TimingRequest scheduleRepeatin(ScheduledCommand command, int time);

}
