/*
 * generated by Xtext
 */
package org.eclipse.xtext.parser.fragments.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.fragments.parser.antlr.internal.InternalFragmentTestLanguageParser;
import org.eclipse.xtext.parser.fragments.services.FragmentTestLanguageGrammarAccess;

public class FragmentTestLanguageParser extends AbstractAntlrParser {

	@Inject
	private FragmentTestLanguageGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalFragmentTestLanguageParser createParser(XtextTokenStream stream) {
		return new InternalFragmentTestLanguageParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "ParserRuleFragments";
	}

	public FragmentTestLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FragmentTestLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
