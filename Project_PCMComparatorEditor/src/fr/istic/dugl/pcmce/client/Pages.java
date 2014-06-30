package fr.istic.dugl.pcmce.client;

import com.google.gwt.user.client.ui.VerticalPanel;

public enum Pages {
	
	LIST_NOMS(new fr.istic.dugl.pcmce.view.AfficherListNoms(),
			  new fr.istic.dugl.pcmce.view.AccueilPanel());
	
	private VerticalPanel panel;
	private VerticalPanel AccueilPanel;

	private Pages(VerticalPanel panel, VerticalPanel Accueil) {
		this.panel = panel;
		this.AccueilPanel = Accueil;
	}
	
	public VerticalPanel getPanel() {
		return panel;
	}
	
public VerticalPanel getAccueilPanel() {
		return AccueilPanel;
	}

}
