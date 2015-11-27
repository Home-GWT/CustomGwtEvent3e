package com.customevent.client.events;

import com.google.gwt.event.shared.EventHandler;

/**
 * Каждый обработчик должен наследоваться от интерфейса 'EventHandler'
 * (тип события в GWT связан с интерфейсом представляющим приемника этого типа события)
 */
public interface ReceivedEventHandler extends EventHandler {
	
	// Каждый получатель может реагировать на событие через реализацию этого метода
	public void onSmileReceived(ReceivedEvent event);
	
}
