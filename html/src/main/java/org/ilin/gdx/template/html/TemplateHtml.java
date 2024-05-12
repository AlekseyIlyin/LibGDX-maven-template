package org.ilin.gdx.template.html;

import org.ilin.gdx.template.core.Template;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

public class TemplateHtml extends GwtApplication {
	@Override
	public ApplicationListener getApplicationListener () {
		return new Template();
	}
	
	@Override
	public GwtApplicationConfiguration getConfig () {
		return new GwtApplicationConfiguration(480, 320);
	}
}
