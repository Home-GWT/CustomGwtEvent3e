package com.customevent.client.events;

import com.google.gwt.event.shared.GwtEvent;

/**
 * Класс собственного события - хранит информацию о пожелании
 * **********************************************************
 * класс представляющий GWT-событие должен наследоваться от класса 'GwtEvent'
 * ( Получатель события может получить его через метод getSmile() )
 */
public class ReceivedEvent extends GwtEvent<ReceivedEventHandler> {
	
	// just type of handler
	public static Type<ReceivedEventHandler> TYPE = new Type<ReceivedEventHandler>();
	
	// let's assume that it will be a wish
	public final String smile;
	
	public ReceivedEvent(String smile){
		this.smile = smile;
	}

	@Override
	public Type<ReceivedEventHandler> getAssociatedType(){
		return TYPE;
	}

	@Override
	protected void dispatch(ReceivedEventHandler handler){
		handler.onSmileReceived(this);
	}
	
	public String getSmile() {
		return smile;
	}
}
