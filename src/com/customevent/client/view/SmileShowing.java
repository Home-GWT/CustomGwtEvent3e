package com.customevent.client.view;

import com.customevent.client.events.SmileReceivedEvent;
import com.customevent.client.events.SmileReceivedEventHandler;
import com.google.gwt.user.client.ui.Label;

/**
 * @author Dmitry Nikolaenko
 *
 * Class that listening an events and reacts on them.
 */
public class SmileShowing extends Label implements SmileReceivedEventHandler {
	@Override
	public void onSmileReceived(SmileReceivedEvent event) {
		this.setText(event.getSmile());
	}
}
