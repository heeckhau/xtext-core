/*
 * generated by Xtext
 */
package org.eclipse.xtext.resource.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.resource.parser.antlr.internal.InternalLiveContainerBuilderIntegerationTestLanguageParser;
import org.eclipse.xtext.resource.services.LiveContainerBuilderIntegerationTestLanguageGrammarAccess;

public class LiveContainerBuilderIntegerationTestLanguageParser extends AbstractAntlrParser {

	@Inject
	private LiveContainerBuilderIntegerationTestLanguageGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalLiveContainerBuilderIntegerationTestLanguageParser createParser(XtextTokenStream stream) {
		return new InternalLiveContainerBuilderIntegerationTestLanguageParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public LiveContainerBuilderIntegerationTestLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LiveContainerBuilderIntegerationTestLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
