package Controladores;
//----------------------------------CLASES
import Clases.Bodega;
import Clases.Maridaje;
import Clases.TipoUva;
import Clases.Enofilo;
import Clases.Vino;
//----------------------------------BOUNDARYS
import com.company.PantallaAB.PantallaAB;
import Boundarys.InterfazSB;
import Boundarys.InterfazNotificacion;
//----------------------------------JAVA
import javax.swing.*;
import java.io.ObjectStreamException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ControladorImportarActualizacionVinosBodega {

	//Atributos
	private List<Bodega> bodegaSeleccionada;
	private Maridaje maridaje;
	private TipoUva tipoUva;
	private List<Vino> listaVinosCreados;
	private List<Enofilo> seguidoresDeBodega;
	private List<String> nombresDeUsuariosSeguidores;
	private List<Bodega> listaBodegas;
	private List<Vino> listaVinos;
	private ArrayList<Maridaje> maridajesList;
	private ArrayList<TipoUva> tipoUvaList;


	//inicializar pantalla
	InterfazSB interfazSB = new InterfazSB();
	//PantallaAB pantallaAB = new PantallaAB();

	//Acceso directo de array
	// VINOS BDD nuestra
	public void crearVinosActualizar() {
		listaVinos.add(new Vino(2020, "imagen1.jpg", "Vino 1b1", "Nota de cata de la bodega 1", 110.0, listaBodegas.get(0), null, null, null));
		listaVinos.add(new Vino(2019, "logo.jpg", "Vino 2b1", "Nota de cata de la bodega 1", 120.0, listaBodegas.get(0), null, null, null));
		listaVinos.add(new Vino(2021, "imagen1.jpg", "Vino 3b1", "Nota de cata de la bodega 1", 130.0, listaBodegas.get(0), null, null, null));
		listaVinos.add(new Vino(2018, "imagen1.jpg", "Vino 4b1", "Nota de cata de la bodega 1", 140.0, listaBodegas.get(0), null, null, null));

		listaVinos.add(new Vino(2020, "imagen2.jpg", "Vino 1b2", "Nota de cata de la bodega 2", 210.0, listaBodegas.get(1), null, null, null));
		listaVinos.add(new Vino(2020, "imagen2.jpg", "Vino 2b2", "Nota de cata de la bodega 2", 220.0, listaBodegas.get(1), null, null, null));
		listaVinos.add(new Vino(2020, "imagen2.jpg", "Vino 3b2", "Nota de cata de la bodega 2", 230.0, listaBodegas.get(1), null, null, null));

		listaVinos.add(new Vino(2020, "imagen2.jpg", "Vino 1b3", "Nota de cata de la bodega 3", 310.0, listaBodegas.get(2), null, null, null));
		listaVinos.add(new Vino(2020, "imagen2.jpg", "Vino 2b3", "Nota de cata de la bodega 3", 320.0, listaBodegas.get(2), null, null, null));
		listaVinos.add(new Vino(2020, "imagen2.jpg", "Vino 3b3", "Nota de cata de la bodega 3", 330.0, listaBodegas.get(2), null, null, null));

		listaVinos.add(new Vino(2020, "imagen2.jpg", "Vino 1b4", "Nota de cata de la bodega 4", 410.0, listaBodegas.get(3), null, null, null));
		listaVinos.add(new Vino(2020, "imagen2.jpg", "Vino 2b4", "Nota de cata de la bodega 4", 420.0, listaBodegas.get(3), null, null, null));
		listaVinos.add(new Vino(2020, "imagen2.jpg", "Vino 3b4", "Nota de cata de la bodega 4", 430.0, listaBodegas.get(3), null, null, null));
	}

	public void crearBodegasDePrueba() {
		listaBodegas.add(new Bodega("123.45", "Descripcion 2", "Historia 1", "Bodega 1", 4, "2020-04-01"));
		listaBodegas.add(new Bodega("123.45", "Descripcion 3", "Historia 1", "Bodega 2", 2, "2025-04-01"));
		listaBodegas.add(new Bodega("123.45", "Descripcion 4", "Historia 1", "Bodega 3", 2, "2024-04-01"));
		listaBodegas.add(new Bodega("123.45", "Descripcion 5", "Historia 1", "Bodega 4", 2, "2021-04-01"));
		listaBodegas.add(new Bodega("123.45", "Descripcion 6", "Historia 1", "Bodega 5", 2, "2021-04-01"));
		listaBodegas.add(new Bodega("123.45", "Descripcion 1", "Historia 1", "Bodega 6", 2, "2027-04-01"));
	}

	public void crearMaridaje(){
		maridajesList.add(new Maridaje("Ensaladas","Ideal para ensaladas frescas"));
		maridajesList.add(new Maridaje("Carne","Ideal para carnes rojas"));
		maridajesList.add(new Maridaje("Arroz","Excelente para platos de arroz"));
		maridajesList.add(new Maridaje("Pasta","Excelente para platos de pasta"));
	}

	public void crearTipoUvaBDD(){
		tipoUvaList.add(new TipoUva("Descripción del tipo de uva Chardonnay", "Chardonnay"));
		tipoUvaList.add(new TipoUva("Descripción del tipo de uva Riesling", "Riesling"));
		tipoUvaList.add(new TipoUva("Descripción del tipo de uva Merlot", "Merlot"));
		tipoUvaList.add(new TipoUva("Descripción del tipo de uva Cabernet Sauvignon", "Cabernet Sauvignon"));
	}

	//Constructor

	public ControladorImportarActualizacionVinosBodega() {
		this.listaBodegas = new ArrayList<>();
		this.bodegaSeleccionada = new ArrayList<>();
		this.maridajesList = new ArrayList<>();
		this.listaVinos = new ArrayList<>();
		this.tipoUvaList = new ArrayList<>();
		crearBodegasDePrueba();
		crearVinosActualizar();
		crearMaridaje();
		crearTipoUvaBDD();
	}

	//Metodos
	public void opcionImportarActualizacionVinosBodega() {
		List<String> listaBodegasConActualizacion = buscarBodegasParaActualizar(getListaBodegas());
		if (listaBodegasConActualizacion.isEmpty()){
			JOptionPane.showMessageDialog(null, "No hay bodegas para actualizar");
			System.exit(0);
		} else {
			PantallaAB.mostrarBodegasParaActualizar(listaBodegasConActualizacion);
		}
	}

	public List<String> buscarBodegasParaActualizar(List<Bodega> listaBodegas) {
		LocalDate today = LocalDate.now(); //Tomar fecha actual
		// array para la lista de nombres
		List<String> bodegasConActualizacion = new ArrayList<>();// falta este atributo en el diagrama de clases
		for (Bodega bodega : listaBodegas) {
			if (bodega.disponibleActualizar(today)) {
				// agregar al array lista nombres
				bodegasConActualizacion.add(bodega.getNombre());
			}}
		// devolver el array con los nombres de la bodega
		return bodegasConActualizacion;
	}

	public void tomarSeleccionBodega(List<String> nombresBodegaSeleccionadas) {
		ArrayList<Object> vinosPantalla = new ArrayList<>();
		// Vaciar las bodegasSeleccionadas
		ArrayList<Object> vinosParaActualizar = new ArrayList<>();
		for (String nombreBodegaSeleccionada : nombresBodegaSeleccionadas){
			for (Bodega bodegaBDD : listaBodegas){
				if (bodegaBDD.getNombre().equals(nombreBodegaSeleccionada )){
					bodegaSeleccionada.add(bodegaBDD);
				}
			}
			 vinosParaActualizar = interfazSB.getImportarActualizacionVinos(nombreBodegaSeleccionada);
		}



		for (Object vinostr : vinosParaActualizar) {
			ArrayList<String> vinoIndividual = new ArrayList<>();
			Boolean vinoActualizado = actualizarVinosExistentes(vinostr);
			if (vinoActualizado){
				vinoIndividual.add(((List<Object>)vinostr).get(2).toString());
				vinoIndividual.add(((List<Object>)vinostr).get(0).toString());
				vinoIndividual.add(((List<Object>)((List<Object>)vinostr).get(5)).get(3).toString());
				vinoIndividual.add(((List<Object>)vinostr).get(1).toString());
				vinoIndividual.add(((List<Object>)vinostr).get(4).toString());
				vinoIndividual.add(((List<Object>)vinostr).get(3).toString());
				vinoIndividual.add("Actualizado");
			}
			if (!vinoActualizado){
				ArrayList<Object> maridajesArray = buscarMaridaje(((List<Object>)vinostr).get(8), maridajesList);
				ArrayList<Object> tipoUvaArray = buscarTipoUva(((List<Object>)vinostr).get(7), tipoUvaList);
				//crearVino(maridajesArray, tipoUvaArray, vinostr, bodegaSeleccionada);


				vinoIndividual.add(((List<Object>)vinostr).get(2).toString());
				vinoIndividual.add(((List<Object>)vinostr).get(0).toString());
				vinoIndividual.add(((List<Object>)((List<Object>)vinostr).get(5)).get(3).toString());
				vinoIndividual.add(((List<Object>)vinostr).get(1).toString());
				vinoIndividual.add(((List<Object>)vinostr).get(4).toString());
				vinoIndividual.add(((List<Object>)vinostr).get(3).toString());
				vinoIndividual.add("Creado");
				//con los vinostr el eltimo elemento del array es si esta creado o no
				// Anotar el vino creado para mostrarlo en el resumen
			}
			//pantalla.mostrarResumenVinosImportados(vino) //No se si se puede pasar el vino);
			vinosPantalla.add(vinoIndividual);

		}
		PantallaAB.mostrarResumenVinosImportados(vinosPantalla);
	}


	public ArrayList<Object> getActualizacionVinos(List<String> bodegaSeleccionadas) {
		ArrayList<Object> vinosParaActualizar = new ArrayList<>();
		for (String bodega : bodegaSeleccionadas) {
			vinosParaActualizar.addAll(interfazSB.getImportarActualizacionVinos(bodega));
		}
		return vinosParaActualizar;
	}

	public Boolean actualizarVinosExistentes(Object vino) {
		for (Bodega bodegaSeleccionada : bodegaSeleccionada){
			if (bodegaSeleccionada.getNombre().equals(new ArrayList<>(((List<Object>)((List<Object>)vino).get(5))).get(3))) {
				return bodegaSeleccionada.actualizarDatosVino(vino, listaVinos );
				// Anotar el vino actualizado para mostrarlo en el resumen
				// agregar a un array para mostrar el resumen
			}
		}
		return false;
	}

	public ArrayList<Object> buscarMaridaje(Object maridajeAPI, ArrayList<Maridaje> maridajesList) {
		ArrayList<Object> result = new ArrayList<>();
		boolean yaExiste = false;
			for (Object maridajeIndividual : (List<Object>) maridajeAPI) {
				for (Maridaje m : maridajesList) {/* preguntar si lo sacamos afuera */
					if (m._sosMaridaje(maridajeIndividual) && !yaExiste) {
						List<Object> maridajeList = (List<Object>) maridajeIndividual;
						maridajeList.add("existe");
						result.add(maridajeList);
						yaExiste = true;
						break;
					}
				}
				if (!yaExiste) {
					List<Object> maridajeList = (List<Object>) maridajeIndividual;
					maridajeList.add("no existe");
					result.add(maridajeList);
					break;
				}

			}
		return result;

}

	public ArrayList<Object> buscarTipoUva(Object varietal, ArrayList<TipoUva> tipoUvaBDD) {
		ArrayList<Object> result = new ArrayList<>();
		for (Object tipoUvaIndividual : (List<Object>) varietal) {
			boolean yaExiste = false;
			for (TipoUva tu : tipoUvaBDD) {
				if (tu._sosTipoUva(((List<Object>)tipoUvaIndividual).get(2))) {
					List<Object> tipoUvaList = (List<Object>) ((List<Object>)tipoUvaIndividual).get(2);
					tipoUvaList.add("existe");
					result.add(tipoUvaList);
					yaExiste = true;
					break;
				}
			}
			if (!yaExiste) {
				List<Object> tipoUvaList = (List<Object>) ((List<Object>)tipoUvaIndividual).get(2);
				tipoUvaList.add("no existe");
				result.add(tipoUvaList);
			}
		}
		return result;
	}

	public void crearVino(ArrayList maridajesArray, ArrayList tipoUvaArray, Object vinostr, List<Bodega> bodegaSeleccionada) {
		Vino vino = new Vino();
		vino._new(maridajesArray, tipoUvaArray, vinostr, bodegaSeleccionada);
	}

	public void buscarSeguidoresBodega() {
		//Enofilo.seguisBodega()
		//Enofilo.getNombreUsuario()
	}

	public void finCU() {
	}

	//GETTERS Y SETTERS
	public List<Bodega> getBodegaSeleccionada() {
		return bodegaSeleccionada;
	}

	public void setBodegaSeleccionada(List<Bodega> bodegaSeleccionada) {
		this.bodegaSeleccionada = bodegaSeleccionada;
	}


	public Maridaje getMaridaje() {
		return maridaje;
	}

	public void setMaridaje(Maridaje maridaje) {
		this.maridaje = maridaje;
	}

	public TipoUva getTipoUva() {
		return tipoUva;
	}

	public void setTipoUva(TipoUva tipoUva) {
		this.tipoUva = tipoUva;
	}

	public List<Vino> getListaVinosCreados() {
		return listaVinosCreados;
	}

	public void setListaVinosCreados(List<Vino> listaVinosCreados) {
		this.listaVinosCreados = listaVinosCreados;
	}

	public List<Enofilo> getSeguidoresBodega() {
		return seguidoresDeBodega;
	}

	public void setSeguidoresBodega(List<Enofilo> seguidoresDeBodega) {
		this.seguidoresDeBodega = seguidoresDeBodega;
	}

	public List<String> getNombresDeUsuariosSeguidores() {
		return nombresDeUsuariosSeguidores;
	}

	public void setNombresDeUsuariosSeguidores(List<String> nombresDeUsuariosSeguidores) {
		this.nombresDeUsuariosSeguidores = nombresDeUsuariosSeguidores;
	}

	public List<Bodega> getListaBodegas() {
		return listaBodegas;
	}

	public void setListaBodegas(List<Bodega> listaBodegas) {
		this.listaBodegas = listaBodegas;
	}
}