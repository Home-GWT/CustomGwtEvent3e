package com.customevent.client.events;

import com.google.gwt.event.shared.EventHandler;

/**
 * Интерфейс обработчика события - обработчик должен наследоваться от интерфейса 'EventHandler'
 * (тип события в GWT связан с интерфейсом представляющим приемника этого типа события)
 * ********************************************************************************
 * URL: http://alextretyakov.blogspot.com/2011/11/osnovy-raboty-s-gwt-eventbus.html
 */
public interface MyEventHandler extends EventHandler {
	
	// Каждый получатель может реагировать на событие через реализацию этого метода
	public void onSmileReceived(My1Event event);
	
}
