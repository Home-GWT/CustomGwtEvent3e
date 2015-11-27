package com.customevent.client.events;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;

/**
 * Класс отвечает за проверку пожеланий
 * ************************************
 * Класс отправитель событий должен реализовать интерфейс 'HasHandlers'
 */
public class Checker implements HasHandlers {
	
	private HandlerManager handlerManager;
	
	public Checker() {
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
	public HandlerRegistration addSmileReceivedEventHandler(ReceivedEventHandler eventHandler) {
		return handlerManager.addHandler(ReceivedEvent.TYPE, eventHandler);
	}
	
	public void newSmileReceived() {
		fireEvent(new ReceivedEvent("This SMILE is just for you :-)"));
	}
}
