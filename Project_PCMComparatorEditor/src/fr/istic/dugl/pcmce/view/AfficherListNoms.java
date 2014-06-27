package fr.istic.dugl.pcmce.view;

import java.util.List;

import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.VerticalPanel;

public class AfficherListNoms extends VerticalPanel {
	FlexTable table = new FlexTable();
	static final int NAME_COLUMN = 0;
	
	public AfficherListNoms () {
		this.add(table);
	}
	
	public void init(List<String> noms) {
		table.clear();
		for (int i=0; i<noms.size(); i++) {
			table.setText(NAME_COLUMN, i, noms.get(i));
		}
	}
}
