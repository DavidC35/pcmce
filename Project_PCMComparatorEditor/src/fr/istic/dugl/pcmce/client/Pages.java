package fr.istic.dugl.pcmce.client;

import com.google.gwt.user.client.ui.VerticalPanel;

public enum Pages {
	
	LIST_NOMS(new fr.istic.dugl.pcmce.view.AfficherListNoms());
	
	private VerticalPanel panel;

	private Pages(VerticalPanel panel) {
		this.panel = panel;
	}
	
	public VerticalPanel getPanel() {
		return panel;
	}
	

}
