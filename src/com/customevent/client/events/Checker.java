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
	
	public Checker(){
		handlerManager = new HandlerManager(this);
	}

	/**
	 * #2
	 * выбрасываем событие
	 */
	@Override
	public void fireEvent(GwtEvent<?> event){
		handlerManager.fireEvent(event);
	}
	
	/**
	 * #1
	 * добавляю/регистрирую подписчиков (обработчиков-события)
	 * *******************************************************
	 * каждый обработчик события должен поддерживать тип (интерфейс) события...
	 * (на 1-тип (интерфейс) события можно повесить много обработчиков события)
	 */
	public HandlerRegistration addSmileReceivedEventHandler(MyEventHandler eventHandler){
		return handlerManager.addHandler(My1Event.TYPE, eventHandler);
	}
	
	public void newSmileReceived(){
		fireEvent(new My1Event("This SMILE is just for you :-)"));
	}
}
