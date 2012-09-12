package com.googlecode.gwtmock.schedule.jre;

import java.util.LinkedList;

import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.googlecode.gwtmock.schedule.client.TimerInterface;
import com.googlecode.gwtmock.schedule.client.TimingRequest;

public class TimerInterfaceTestImplementation implements TimerInterface{
	private long now;
	
	private LinkedList<TimingEntry> entries = new LinkedList<TimerInterfaceTestImplementation.TimingEntry>();

	
	private class TimingEntry{
		private ScheduledCommand command;
		private long time;
		
		public TimingEntry(ScheduledCommand command, long time) {
			this.command = command;
			this.time = time;
		}
		
		public long getTime() {
			return time;
		}
		
		public ScheduledCommand getCommand() {
			return command;
		}

	
	}
	
	@Override
	public TimingRequest schedule(ScheduledCommand command, int time) {
		final TimingEntry entry = new TimingEntry(command, now + time);
		
		entries.add(entry);
		
		
		return new TimingRequest() {
			
			@Override
			public void cancel() {
				entries.remove(entry);
				
			}
		};
	}

	@Override
	public TimingRequest scheduleRepeatin(ScheduledCommand command, int time) {
		return schedule(command, time);
	}
	
	
	public void setNow(long now) {
		this.now = now;
		
		for (TimingEntry entry : entries) {
			if(entry.getTime() <= now){
				entry.getCommand().execute();
			}
		}
		
		
	}
	
}
