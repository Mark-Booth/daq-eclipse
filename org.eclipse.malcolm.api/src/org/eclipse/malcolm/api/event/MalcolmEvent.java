package org.eclipse.malcolm.api.event;

import java.util.EventObject;

/**
 * Event object used notify of Malcolm events inside
 * same VM as IMalcolmService. A workaround for connecting to 
 * JMS and getting the topic if one does not want to deal with
 * JMS.
 * 
 * @author Matthew Gerring
 *
 */
public class MalcolmEvent<T> extends EventObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1945090670224642819L;

	public MalcolmEvent(T bean) {
		super(bean);
	}
	
	/**
	 * Convenience method
	 * @return
	 */
	public T getBean() {
		return (T)getSource();
	}

}