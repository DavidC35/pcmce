package fr.istic.dugl.pcmce.client;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;


@RemoteServiceRelativePath("lesSucces")
public interface SuccesService extends RemoteService {

	public List<String> envoieNomServer(String nom);
}
