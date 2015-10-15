/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xtext.generator.idea.parser.antlr

import com.google.inject.Inject
import com.google.inject.Singleton
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming
import org.eclipse.xtext.xtext.generator.parser.antlr.AntlrGrammar
import org.eclipse.xtext.xtext.generator.parser.antlr.GrammarNaming

import static extension org.eclipse.xtext.GrammarUtil.*
import org.eclipse.xtext.xtext.generator.model.TypeReference

@Singleton
class PsiGrammarNaming extends GrammarNaming {
	@Inject
	extension XtextGeneratorNaming
	
	override String getParserPackage(Grammar it) '''�ideaBasePackage�.parser.antlr'''
	
	override getParserGrammar(Grammar it) {
		new AntlrGrammar(internalParserPackage, '''PsiInternal�simpleName�''')
	}
	
	override getInternalParserSuperClass(Grammar it) {
		new TypeReference("org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser")
	}
	
}