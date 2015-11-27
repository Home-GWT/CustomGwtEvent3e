package com.customevent.client;

import com.customevent.client.event.SmileReceivedEvent;
import com.customevent.client.events.SmileChecker;
import com.customevent.client.view.SmileReceiver;
import com.customevent.client.view.SmileShowing;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.web.bindery.event.shared.SimpleEventBus;

/**
 * @author Dmitry Nikolaenko
 */
public class CustomGwtEvent implements EntryPoint {
	public void onModuleLoad() {
		SmileChecker checker = new SmileChecker();
		SmileShowing showingSmile = new SmileShowing();
		// define event receivers and register themselves in event senders
		checker.addSmileReceivedEventHandler(showingSmile);
		checker.newSmileReceived();
		
		SimpleEventBus eventBus = new SimpleEventBus();
		SmileReceiver receiverSmile = new SmileReceiver(eventBus);
		eventBus.fireEvent(new SmileReceivedEvent("Smile today and everyday! ^__^"));
		
		RootPanel.get().add(showingSmile);
		RootPanel.get().add(receiverSmile);
	}
}
