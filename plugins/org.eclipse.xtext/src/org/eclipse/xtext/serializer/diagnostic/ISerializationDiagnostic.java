/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.serializer.diagnostic;

import org.eclipse.emf.ecore.EObject;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 */
public interface ISerializationDiagnostic {

	public interface Acceptor {
		void accept(ISerializationDiagnostic diagnostic);
	}

	public class ExceptionDiagnostic implements ISerializationDiagnostic {

		protected Throwable exception;

		public ExceptionDiagnostic(Throwable exception) {
			super();
			this.exception = exception;
		}

		public boolean breaksSyntax() {
			return false;
		}

		public Throwable getException() {
			return exception;
		}

		public String getMessage() {
			return exception.getMessage();
		}

		public EObject getSemanitcObject() {
			return null;
		}

	}

	public class ExceptionThrowingAcceptor implements Acceptor {
		public void accept(ISerializationDiagnostic diagnostic) {
			if (diagnostic == null || diagnostic.getMessage() == null)
				throw new RuntimeException("Something went wrong during serialization");
			else if (diagnostic.getException() != null)
				throw new RuntimeException(diagnostic.getException());
			else
				throw new RuntimeException(diagnostic.getMessage());
		}
	}

	public class StdErrAcceptor implements Acceptor {
		public void accept(ISerializationDiagnostic diagnostic) {
			if (diagnostic == null || diagnostic.getMessage() == null)
				System.err.println("error");
			else
				System.err.println("error " + diagnostic.getMessage());
		}
	}

	public Acceptor EXCEPTION_THROWING_ACCEPTOR = new ExceptionThrowingAcceptor();

	public Acceptor STDERR_ACCEPTOR = new StdErrAcceptor();

	boolean breaksSyntax();

	Throwable getException();

	String getMessage();

	EObject getSemanitcObject();
}