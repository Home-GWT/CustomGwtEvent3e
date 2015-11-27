package com.customevent.client.events;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;

/**
 * @author Dmitry Nikolaenko
 *
 * Class responsible for checking wishes
 */
public class SmileChecker implements HasHandlers {
	
	private HandlerManager handlerManager;
	
	public SmileChecker() {
		handlerManager = new HandlerManager(this);
	}

	/**
	 * method responsible for sending events
	 */
	@Override
	public void fireEvent(GwtEvent<?> event) {
		handlerManager.fireEvent(event);
	}
	
	/**
	 * used by event receivers to register themselves as interested in receiving events.
	 */
	public HandlerRegistration addSmileReceivedEventHandler(SmileReceivedEventHandler eventHandler) {
		return handlerManager.addHandler(SmileReceivedEvent.TYPE, eventHandler);
	}
	
	public void newSmileReceived() {
		fireEvent(new SmileReceivedEvent("This SMILE is just for you :-)"));
	}
}
