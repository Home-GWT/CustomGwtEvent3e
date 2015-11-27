package com.customevent.client.view;

import com.customevent.client.events.*;
import com.google.gwt.user.client.ui.*;

/**
 *  Класс (<виджет>) является компонентом который получает событие и отображает пожелания
 */
public class ShowingWidget extends Label implements MyEventHandler {
	
	@Override
	public void onSmileReceived(My1Event event) {
		this.setText(event.getSmile());
	}
	
}
