package Boundarys;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import Clases.Vino;

import org.json.JSONArray;
import org.json.JSONObject;


public class InterfazSB {

	private Object listaVinosActualizar;


	public Object getListaVinosActualizar() {
		return listaVinosActualizar;
	}


	public void setListaVinosActualizar(Object listaVinosActualizar) {
		this.listaVinosActualizar = listaVinosActualizar;
	}

	//public void getImportarActualizacionVinos() { nombreBodega
	// arrayVinos = []
	// 		localhost:/$nombreBodega/:vinos
	// else
	// 		System.out.println("No se obtiene respuesta de la API de : bodegaSeleccionada[i])
	//		Poner un warning en la pantalla
	// if arrayVinos = Empty
	// return listaVinosActualizar
	//	return
	//}

	public List<Vino> getImportarActualizacionVinos(String bodega) {
		List<Vino> vinos = new ArrayList<>();
		// URL de la API
		String urlStr = "http://localhost:8080/" + bodega + "/vinos";
		System.out.println("Se obteniron los vinos del puerto " + urlStr );
		return vinos;
	}
}