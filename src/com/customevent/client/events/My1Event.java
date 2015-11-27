package com.customevent.client.events;

import com.google.gwt.event.shared.GwtEvent;

/**
 * Создаю класс <типа> события - хранит информацию о пожелании
 * **********************************************************
 * класс представляющий GWT-событие должен наследоваться от класса 'GwtEvent'
 * ( Получатель события может получить его через метод getSmile() )
 * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * URL: http://alextretyakov.blogspot.com/2011/11/osnovy-raboty-s-gwt-eventbus.html
 *    ( https://github.com/Home-GWT/Contacts3/tree/develop )
 */
public class My1Event extends GwtEvent<MyEventHandler> {
	
	// переменную 'TYPE' определяет тип события
	public static Type<MyEventHandler> TYPE = new Type<MyEventHandler>();
	
	// let's assume that it will be a wish
	public final String smile;
	
	public My1Event(String smile){
		this.smile = smile;
	}

	// метод 'getAssociatedType()' возвращает тип события
	@Override
	public Type<MyEventHandler> getAssociatedType(){
		return TYPE;
	}

	// метод 'dispatch()' вызывает метод обработчика события
	@Override
	protected void dispatch(MyEventHandler handler){
		handler.onSmileReceived(this);
	}
	
	public String getSmile() {
		return smile;
	}
}
