package Boundarys;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import Clases.Bodega;
import Clases.Vino;
import org.json.JSONArray;
import org.json.JSONObject;



// Clase que contiene el método para obtener la actualización de vinos
public class InterfazSB {

	public  List<Vino> getImportarActualizacionVinos() {
		Bodega bodega = new Bodega("Bodega 1");
		List<Vino> vinos = new ArrayList<>();
		try {
			// URL de la API
			String urlStr = "http://localhost:8080/Bodega-1/vinos";
			URL url = new URL(urlStr);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			StringBuilder sb = new StringBuilder();
			String output;
			while ((output = br.readLine()) != null) {
				sb.append(output);
			}

			conn.disconnect();

			// Procesar la respuesta JSON
			JSONArray jsonArray = new JSONArray(sb.toString());
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonObject = jsonArray.getJSONObject(i);
				String nombre = jsonObject.getString("nombre");
				Vino vino = new Vino(nombre, bodega);
				vinos.add(vino);
			}

			// Imprimir los vinos obtenidos
			for (Vino vino : vinos) {
				System.out.println(vino.getNombre() + " " +vino.getBodega().getNombre());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return vinos;
	}
}