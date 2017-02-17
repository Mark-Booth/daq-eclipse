/*-
 *******************************************************************************
 * Copyright (c) 2011, 2016 Diamond Light Source Ltd.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Matthew Gerring - initial API and implementation and/or initial documentation
 *******************************************************************************/
package org.eclipse.scanning.api.event.queues.beans;

/**
 * Base class for all bean types which exist in active-queues.
 * 
 * @author Michael Wharmby
 *
 */
public abstract class QueueAtom extends Queueable {

	/**
	 * Version ID for serialization. Should be updated when class changed. 
	 */
	private static final long serialVersionUID = 20161017L;

}
