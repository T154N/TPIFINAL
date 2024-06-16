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

/*public class InterfazSB {

	public ArrayList<Object> getImportarActualizacionVinos(String bodegaSeleccionadas) {
		String urlStr = "http://localhost:8080/bodega-1/vinos";
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
				ArrayList<String> vinoIndividual = new ArrayList<>();
				vinoIndividual.add(jsonObject.optString("aniada"));
				vinoIndividual.add(jsonObject.optString("imagenEtiqueta"));
				vinoIndividual.add(jsonObject.optString("nombre"));
				vinoIndividual.add(jsonObject.optString("notaDeCataBodega"));
				vinoIndividual.add(String.valueOf(jsonObject.optDouble("precioARS")));
				vinoIndividual.add(jsonObject.optString("bodega"));
				vinoIndividual.add(jsonObject.optString("resenias"));
				vinoIndividual.add(jsonObject.optString("varietales", ""));
				vinoIndividual.add(jsonObject.optString("maridaje", ""));
				vinoData.add(vinoIndividual);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
			System.out.println(vinoData);

		return vinoData;
	}
}*/


public class InterfazSB {

	 public ArrayList<Object> getImportarActualizacionVinos(/*String bodegaSeleccionadas*/) {
		 ArrayList<Object> vinoData = new ArrayList<>(
				 Arrays.asList(
						 Arrays.asList(2020, "imagen1Modificada.jpg", "Vino Ejemplo", "Nota de cata de la bodega 1", 10500.0, Arrays.asList("123.45", "Descripcion 2", "Historia 1", "Bodega 1", 4, "2020-04-01"), null, null, null),
						 Arrays.asList(2019, "logo.jpg", "Vino Ejemplo 1", "Nota de cata de la bodega 1", 11500.0, Arrays.asList("123.45", "Descripcion 2", "Historia 1", "Bodega 1", 4, "2020-04-01"), null, null, null),
						 Arrays.asList(2021, "imagen1.jpg", "Vino Ejemplo 2", "Nota de cata de la bodega 1", 12500.0, Arrays.asList("123.45", "Descripcion 2", "Historia 1", "Bodega 1", 4, "2020-04-01"), null, null, null),
						 Arrays.asList(1900, "imagen1.jpg", "Vino Nuevo", "Nota de cata de la bodega 1", 13500.0, Arrays.asList("123.45", "Descripcion 2", "Historia 1", "Bodega 1", 4, "2020-04-01"), null, null, null)
				 )
		 ); //Matriz de datos
		 System.out.println(vinoData);
		return vinoData;

	}



};

