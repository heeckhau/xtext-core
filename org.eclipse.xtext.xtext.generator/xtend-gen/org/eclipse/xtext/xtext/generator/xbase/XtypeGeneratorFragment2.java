/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.xtext.generator.xbase;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xtext.generator.AbstractXtextGeneratorFragment;
import org.eclipse.xtext.xtext.generator.xbase.XbaseUsageDetector;

@SuppressWarnings("all")
public class XtypeGeneratorFragment2 extends AbstractXtextGeneratorFragment {
  @Inject
  @Extension
  private XbaseUsageDetector _xbaseUsageDetector;
  
  @Override
  public void generate() {
    if ((this._xbaseUsageDetector.inheritsXtype(this.getLanguage().getGrammar()) && (this.getProjectConfig().getEclipsePlugin().getManifest() != null))) {
      Set<String> _requiredBundles = this.getProjectConfig().getEclipsePlugin().getManifest().getRequiredBundles();
      _requiredBundles.add("org.eclipse.xtext.xbase.ui");
    }
  }
}
