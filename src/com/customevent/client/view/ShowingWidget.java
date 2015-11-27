package com.customevent.client.view;

import com.customevent.client.events.ReceivedEvent;
import com.customevent.client.events.ReceivedEventHandler;
import com.google.gwt.user.client.ui.Label;

/**
 *  Класс является компонентом который получает событие и отображает пожелания
 */
public class ShowingWidget extends Label implements ReceivedEventHandler {
	
	@Override
	public void onSmileReceived(ReceivedEvent event) {
		this.setText(event.getSmile());
	}
	
}
