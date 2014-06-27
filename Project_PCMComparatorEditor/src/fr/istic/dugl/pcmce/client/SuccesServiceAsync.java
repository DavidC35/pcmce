package fr.istic.dugl.pcmce.client;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface SuccesServiceAsync {

	void envoieNomServer(String nom, AsyncCallback<List<String>> callback);
	

}
