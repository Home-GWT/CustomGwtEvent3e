package com.customevent.client.events;

import com.google.gwt.event.shared.GwtEvent;

/**
 * @author Dmitry Nikolaenko 
 * 
 * Class that represent an information of new smile
 */
public class SmileReceivedEvent extends GwtEvent<SmileReceivedEventHandler> {
	
	// just type of handler
	public static Type<SmileReceivedEventHandler> TYPE = 
			new Type<SmileReceivedEventHandler>();
	
	// let's assume that it will be a wish
	public final String smile;
	
	public SmileReceivedEvent(String smile) {
		this.smile = smile;
	}

	@Override
	public Type<SmileReceivedEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(SmileReceivedEventHandler handler) {
		handler.onSmileReceived(this);
	}
	
	public String getSmile() {
		return smile;
	}
}
