/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.resource;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 * 
 *         We extend {@link IllegalStateException} for backwards compatibility.
 * @since 2.4
 */
@SuppressWarnings("serial")
public class FileNotFoundOnClasspathException extends IllegalStateException {

	public FileNotFoundOnClasspathException(String msg) {
		super(msg);
	}
}
