/*
 * generated by Xtext
 */
package org.eclipse.xtext.grammarinheritance.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.grammarinheritance.parser.antlr.internal.InternalInheritanceTest3LanguageParser;
import org.eclipse.xtext.grammarinheritance.services.InheritanceTest3LanguageGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class InheritanceTest3LanguageParser extends AbstractAntlrParser {

	@Inject
	private InheritanceTest3LanguageGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalInheritanceTest3LanguageParser createParser(XtextTokenStream stream) {
		return new InternalInheritanceTest3LanguageParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public InheritanceTest3LanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(InheritanceTest3LanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
