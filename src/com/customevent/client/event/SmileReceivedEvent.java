package com.customevent.client.event;

import com.google.web.bindery.event.shared.Event;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.HandlerRegistration;

/**
 * @author Dmitry Nikolaenko
 *
 * Smile event. This event extends the Event from com.google.web.bindery.event.shared package.
 */
public class SmileReceivedEvent extends Event<SmileReceivedEvent.Handler> {
	/**
	 * Implemented by methods that handle SmileReceivedEvent events.
	 */
	public interface Handler {
		public void onSmileReceived(SmileReceivedEvent event);
	}
	
	private static final Type<SmileReceivedEvent.Handler> TYPE = 
			new Type<SmileReceivedEvent.Handler>();
	
	private final String smile;
	
	public SmileReceivedEvent(String smile) {
		this.smile = smile;
	}

	@Override
	public Type<Handler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(Handler handler) {
		handler.onSmileReceived(this);
	}
	
	/**
	 * Register a handler for SmileReceivedEvent events on the eventBus
	 */
	public static HandlerRegistration register(EventBus eventBus, SmileReceivedEvent.Handler handler) {
		return eventBus.addHandler(TYPE, handler);
	}
	
	public String getSmile() {
		return smile;
	}
}
