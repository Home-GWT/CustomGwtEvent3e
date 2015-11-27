package com.customevent.client;

import com.customevent.client.event.SmileReceivedEvent;
import com.customevent.client.events.Checker;
import com.customevent.client.view.SmileReceiver;
import com.customevent.client.view.ShowingWidget;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.web.bindery.event.shared.SimpleEventBus;

/**
 * Рассмотрим создание и использование собственных событий в GWT
 * *************************************************************
 * Это будет система которая отвечает за проверку пожеланий и информирует пользователя если есть новые пожелания 
 */
public class App implements EntryPoint {
	
	public void onModuleLoad() {
		/**
		 * Предположим, что в системе есть 2-а компонента:
		 * 1. компонент проверки (отвечает за проверку нового пожелания) - отправляет события когда приходят новые пожелания
		 * 2. компонент отображения (отвечающий за отображение пожелания) - получает эти события
		 */
		Checker checker = new Checker();
		ShowingWidget widget = new ShowingWidget();
		// define event receivers and register themselves in event senders
		checker.addSmileReceivedEventHandler(widget);
		checker.newSmileReceived();
		
		RootPanel.get().add(widget);
		
		
//		SimpleEventBus eventBus = new SimpleEventBus();
//		SmileReceiver receiverSmile = new SmileReceiver(eventBus);
//		eventBus.fireEvent(new SmileReceivedEvent("Smile today and everyday! ^__^"));
		
//		RootPanel.get().add(receiverSmile);
	}
	
}
