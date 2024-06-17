package Boundarys;

import Clases.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/*
public class InterfazSB {


	public List<Vino> getImportarActualizacionVinos(String bodegaSeleccionadas) {
		// Codifica el nombre de la bodega para que sea seguro usarlo en una URL
		//String nombreBodegaCodificado = URLEncoder.encode(bodegaSeleccionadas, StandardCharsets.UTF_8);
		//String urlStr = "http://localhost:8080/" + nombreBodegaCodificado + "/vinos";
		String urlStr = "http://localhost:8080/bodega-1/vinos"

		List<Vino> vinos = new ArrayList<>();
		try {
			URL url = new URL(urlStr);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new IOException("API sin conexion");
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

				// Procesar la bodega
				JSONObject bodegaJson = jsonObject.getJSONObject("bodega");
				Bodega bodega = new Bodega(
						bodegaJson.optString("coordenadasUbicacion"),
						bodegaJson.optString("descripcion"),
						bodegaJson.optString("historia"),
						bodegaJson.optString("nombre"),
						bodegaJson.optInt("periodoActualizacion"),
						bodegaJson.optString("ultimaActualizacion")
				);

				// Procesar las reseñas
				List<Resenia> resenias = new ArrayList<>();
				JSONArray reseniasJson = jsonObject.optJSONArray("resenia");
				if (reseniasJson != null) {
					for (int j = 0; j < reseniasJson.length(); j++) {
						JSONObject reseniaJson = reseniasJson.getJSONObject(j);
						Resenia resenia = new Resenia(
								reseniaJson.getString("comentario"),
								reseniaJson.getBoolean("esPremium"),
								reseniaJson.getString("fechaResenia"),
								reseniaJson.getInt("puntaje")
						);
						resenias.add(resenia);
					}
				}

				// Procesar los varietales
				List<Varietal> varietales = new ArrayList<>();
				JSONArray varietalesJson = jsonObject.optJSONArray("varietal");
				if (varietalesJson != null) {
					for (int k = 0; k < varietalesJson.length(); k++) {
						JSONObject varietalJson = varietalesJson.getJSONObject(k);
						Varietal varietal = new Varietal(
								varietalJson.getString("descripcion"),
								varietalJson.getDouble("porcentajeComposicion"),
								null
						);
						varietales.add(varietal);
					}
				}

				// Procesar los maridajes
				List<Maridaje> maridajes = new ArrayList<>();
				JSONArray maridajesJson = jsonObject.optJSONArray("maridaje");
				if (maridajesJson != null) {
					for (int l = 0; l < maridajesJson.length(); l++) {
						JSONObject maridajeJson = maridajesJson.getJSONObject(l);
						Maridaje maridaje = new Maridaje(
								maridajeJson.getString("nombre"),
								maridajeJson.getString("descripcion")
						);
						maridajes.add(maridaje);
					}
				}

				Vino vino = new Vino(
						aniada,
						imagenEtiqueta,
						nombre,
						notaDeCataBodega,
						precioARS,
						bodega,
						resenias,
						varietales,
						maridajes
				);
				vinos.add(vino);
			}

		} catch (IOException e) {
			System.err.println("API sin conexion " + bodegaSeleccionadas);
		} catch (Exception e) {
			System.err.println("Error al importar la actualización de vinos: " + e.getMessage());
		}

		return vinos; [{aniada,
						imagenEtiqueta,
						nombre,
						notaDeCataBodega,
						precioARS,
						{bodega},
						{resenias},
						{varietales},
						{maridajes}]
	}
}
*/

public class InterfazSB {

	public ArrayList<Object> getImportarActualizacionVinos(String bodegaSeleccionadas) {
		String bodegaSeleccionadasConGuiones = bodegaSeleccionadas.replace(" ", "-");
		String urlStr = "http://localhost:8080/" + bodegaSeleccionadasConGuiones;
		System.out.println(urlStr);
		ArrayList<Object> vinoData = new ArrayList<>();

		try {
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

			// Process the JSON response
			JSONArray jsonArray = new JSONArray(sb.toString());
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonObject = jsonArray.getJSONObject(i);
				ArrayList<Object> vinoIndividual = new ArrayList<>();
				vinoIndividual.add(jsonObject.optInt("aniada"));
				vinoIndividual.add(jsonObject.optString("imagenEtiqueta"));
				vinoIndividual.add(jsonObject.optString("nombre"));
				vinoIndividual.add(jsonObject.optString("notaDeCataBodega"));
				vinoIndividual.add(jsonObject.optDouble("precioARS"));
				JSONObject bodegaJsonObject = jsonObject.optJSONObject("bodega");
				ArrayList<Object> bodegaList = new ArrayList<>();
				if (bodegaJsonObject != null) {
					bodegaList.add(bodegaJsonObject.optString("coordenadasUbicacion"));
					bodegaList.add(bodegaJsonObject.optString("descripcion"));
					bodegaList.add(bodegaJsonObject.optString("historia"));
					bodegaList.add(bodegaJsonObject.optString("nombre"));
					bodegaList.add(bodegaJsonObject.optInt("periodoActualizacion"));
					bodegaList.add(bodegaJsonObject.optString("ultimaActualizacion"));
				}
				vinoIndividual.add(bodegaList);
				JSONArray reseniasJsonArray = jsonObject.optJSONArray("resenia");
				ArrayList<ArrayList<Object>> reseniasList = new ArrayList<>();
				if (reseniasJsonArray != null) {
					for (int j = 0; j < reseniasJsonArray.length(); j++) {
						JSONObject reseniaJsonObject = reseniasJsonArray.getJSONObject(j);
						ArrayList<Object> reseniaIndividual = new ArrayList<>();
						reseniaIndividual.add(reseniaJsonObject.optString("comentario"));
						reseniaIndividual.add(reseniaJsonObject.optBoolean("esPremium"));
						reseniaIndividual.add(reseniaJsonObject.optString("fechaResenia"));
						reseniaIndividual.add(reseniaJsonObject.optInt("puntaje"));
						reseniasList.add(reseniaIndividual);
					}
				}
				JSONArray varietalJsonArray = jsonObject.optJSONArray("varietal");
				ArrayList<ArrayList<Object>> varietalesList = new ArrayList<>();
				if (varietalJsonArray != null) {
					for (int k = 0; k < varietalJsonArray.length(); k++) {
						JSONObject varietalJsonObject = varietalJsonArray.getJSONObject(k);
						ArrayList<Object> varietalIndividual = new ArrayList<>();
						varietalIndividual.add(varietalJsonObject.optString("descripcion"));
						varietalIndividual.add(varietalJsonObject.optDouble("porcentajeComposicion"));
						JSONObject tipoUvaJsonObject = varietalJsonObject.optJSONObject("tipoUva");
						ArrayList<Object> tipoUvaList = new ArrayList<>();
						if (tipoUvaJsonObject != null) {
							tipoUvaList.add(tipoUvaJsonObject.optString("nombre"));
							tipoUvaList.add(tipoUvaJsonObject.optString("descripcion"));
						}
						varietalIndividual.add(tipoUvaList);
						varietalesList.add(varietalIndividual);
					}
				}
				vinoIndividual.add(reseniasList);
				vinoIndividual.add(varietalesList);
				JSONArray maridajesJsonArray = jsonObject.optJSONArray("maridaje");
				ArrayList<ArrayList<Object>> maridajesList = new ArrayList<>();
				if (maridajesJsonArray != null) {
					for (int l = 0; l < maridajesJsonArray.length(); l++) {
						JSONObject maridajeJsonObject = maridajesJsonArray.getJSONObject(l);
						ArrayList<Object> maridajeIndividual = new ArrayList<>();
						maridajeIndividual.add(maridajeJsonObject.optString("nombre"));
						maridajeIndividual.add(maridajeJsonObject.optString("descripcion"));
						maridajesList.add(maridajeIndividual);
					}
				}
				vinoIndividual.add(maridajesList);
				vinoData.add(vinoIndividual);
			}
			System.out.println(vinoData);

			return vinoData;
		} catch (IOException e) {
			System.err.println("API sin conexion " + e.getMessage());
		} catch (Exception e) {
			System.err.println("Error al importar la actualización de vinos: " + e.getMessage());
		}

		return null;
	}
}
