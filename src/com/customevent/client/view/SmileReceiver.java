package com.customevent.client.view;

import com.customevent.client.event.SmileReceivedEvent;
import com.google.gwt.user.client.ui.Label;
import com.google.web.bindery.event.shared.SimpleEventBus;

/**
 * @author Dmitry Nikolaenko
 *
 * Class that listening an events and reacts on them.
 */
public class SmileReceiver extends Label {
	public SmileReceiver(SimpleEventBus eventBus) {
		SmileReceivedEvent.register(eventBus, new SmileReceivedEvent.Handler() {
			@Override
			public void onSmileReceived(SmileReceivedEvent event) {
				SmileReceiver.this.setText(event.getSmile());
			}
		});
	}
}
