package com.customevent.client.events;

import com.google.gwt.event.shared.EventHandler;

/**
 * @author Dmitry Nikolaenko
 *
 * Interface that represents event receivers
 */
public interface SmileReceivedEventHandler extends EventHandler {
	public void onSmileReceived(SmileReceivedEvent event);
}
