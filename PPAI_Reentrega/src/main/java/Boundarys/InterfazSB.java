package Boundarys;

import Clases.*;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InterfazSB {

	public List<Vino> getImportarActualizacionVinos() {
		Bodega bodega = new Bodega("Bodega 4");
		List<Vino> vinos = new ArrayList<>();
		try {
			// URL de la API
			String urlStr = "http://localhost:8080/Bodega4/vinos";
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
				Integer aniada = jsonObject.optInt("aniada");
				String imagenEtiqueta = jsonObject.optString("imagenEtiqueta");
				String nombre = jsonObject.optString("nombre");
				String notaDeCataBodega = jsonObject.optString("notaDeCataBodega");
				Double precioARS = jsonObject.optDouble("precioARS");

				// Procesar las reseñas
				List<Resenia> resenias = new ArrayList<>();
				JSONArray reseniasJson = jsonObject.optJSONArray("resenia");
				if (reseniasJson != null) {
					for (int j = 0; j < reseniasJson.length(); j++) {
						JSONObject reseniaJson = reseniasJson.getJSONObject(j);
						Resenia resenia = new Resenia(reseniaJson.getString("comentario"),reseniaJson.getBoolean("esPremium"),reseniaJson.getString("fechaResenia"),reseniaJson.getInt("puntaje"));
						// Setea los atributos de Resenia desde reseniaJson
						resenias.add(resenia);
					}
				}

				// Procesar los varietales
				List<Varietal> varietales = new ArrayList<>();
				JSONArray varietalesJson = jsonObject.optJSONArray("varietal");
				if (varietalesJson != null) {
					for (int k = 0; k < varietalesJson.length(); k++) {
						JSONObject varietalJson = varietalesJson.getJSONObject(k);
						Varietal varietal = new Varietal(varietalJson.getString("descripcion"),varietalJson.getDouble("porcentajeComposicion"),null);// Asume que tienes un constructor o método para crear Varietal desde JSON
						// Setea los atributos de Varietal desde varietalJson
						varietales.add(varietal);
					}
				}

				// Procesar los maridajes
				List<Maridaje> maridajes = new ArrayList<>();
				JSONArray maridajesJson = jsonObject.optJSONArray("maridaje");
				if (maridajesJson != null) {
					for (int l = 0; l < maridajesJson.length(); l++) {
						JSONObject maridajeJson = maridajesJson.getJSONObject(l);
						Maridaje maridaje = new Maridaje(maridajeJson.getString("nombre"), maridajeJson.getString("descripcion")); // Asume que tienes un constructor o método para crear Maridaje desde JSON
						// Setea los atributos de Maridaje desde maridajeJson
						maridajes.add(maridaje);
					}
				}

				Vino vino = new Vino(aniada, imagenEtiqueta, nombre, notaDeCataBodega, precioARS, bodega, resenias, varietales, maridajes);
				vinos.add(vino);
			}

			// Imprimir los vinos obtenidos
			//for (Vino vino : vinos) {
			//	System.out.println(vino.getPrecioARS());
			//}

		} catch (Exception e) {
			e.printStackTrace();
		}
		//System.out.println("Llegue");
		return vinos;
	}
}