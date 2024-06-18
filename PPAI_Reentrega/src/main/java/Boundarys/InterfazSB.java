package Boundarys;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import com.company.PantallaAB.PantallaAB;

public class InterfazSB {
	ArrayList<String> bodegasSinConexion = new ArrayList<>();
	public ArrayList<Object> getImportarActualizacionVinos(String bodegaSeleccionadas) {
		String bodegaSeleccionadasConGuiones = bodegaSeleccionadas.replace(" ", "-");
		String urlStr = "http://localhost:8080/" + bodegaSeleccionadasConGuiones;
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

			return vinoData;
		} catch (IOException e) {

		} catch (Exception e) {

			bodegasSinConexion.add(bodegaSeleccionadas);
			PantallaAB.tablaBodegasSinConexion( bodegasSinConexion);
		}
		ArrayList<Object> emptyList = new ArrayList<>();
		return emptyList;
	}
}
