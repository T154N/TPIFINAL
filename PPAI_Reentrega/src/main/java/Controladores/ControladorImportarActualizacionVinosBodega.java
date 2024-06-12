package Controladores;
import Boundarys.InterfazNotificacion;
import Boundarys.InterfazSB;
import Clases.*;
import com.company.PantallaAB.PantallaAB;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ControladorImportarActualizacionVinosBodega {

	//Atributos
	private List<Bodega> bodegaSeleccionada;
	private List<Vino> vinosParaActualizar;
	private Maridaje maridaje;
	private TipoUva tipoUva;
	private List<Vino> listaVinosCreados;
	private List<Enofilo> seguidoresDeBodega;
	private List<String> nombresDeUsuariosSeguidores;
	private List<Bodega> listaBodegas;

	//inicializar pantalla




	//BODEGAS BDD
	public void crearBodegasDePrueba() {

		listaBodegas.add(new Bodega("123.45", "Descripcion 2", "Historia 1", "Bodega 1", 4, "2025-04-01", null, null));
		listaBodegas.add(new Bodega("123.45", "Descripcion 3", "Historia 1", "Bodega 2", 2, "2025-04-01", null, null));
		listaBodegas.add(new Bodega("123.45", "Descripcion 4", "Historia 1", "Bodega 3", 2, "2024-04-01", null, null));
		listaBodegas.add(new Bodega("123.45", "Descripcion 5", "Historia 1", "Bodega 4", 2, "2021-04-01", null, null));
		listaBodegas.add(new Bodega("123.45", "Descripcion 6", "Historia 1", "Bodega 5", 2, "2021-04-01", null, null));
		listaBodegas.add(new Bodega("123.45", "Descripcion 1", "Historia 1", "Bodega 6", 2, "2027-04-01", null, null));
	}

//Acceso directo de array
	// VINOS BDD
	public void crearVinosActualizar() {
		List<Vino> listaVinos1 = new ArrayList<>();
		listaVinos1.add(new Vino(2020, "imagen1.jpg", "Vino Ejemplo", "Nota de cata de la bodega 1", 500.0, listaBodegas.get(0), null, null, null));
		listaVinos1.add(new Vino(2019, "logo.jpg", "Vino Ejemplo 1", "Nota de cata de la bodega 1", 500.0, listaBodegas.get(0), null, null, null));
		listaVinos1.add(new Vino(2021, "imagen1.jpg", "Vino Ejemplo 2", "Nota de cata de la bodega 1", 500.0, listaBodegas.get(0), null, null, null));
		listaVinos1.add(new Vino(2018, "imagen1.jpg", "Vino Ejemplo 3", "Nota de cata de la bodega 1", 500.0, listaBodegas.get(0), null, null, null));


		List<Vino> listaVinos2 = new ArrayList<>();
		listaVinos2.add(new Vino(2020, "imagen2.jpg", "Vino1", "Nota de cata de la bodega 2", 600.0, listaBodegas.get(1), null, null, null));
		listaVinos2.add(new Vino(2020, "imagen2.jpg", "Vino2", "Nota de cata de la bodega 2", 600.0, listaBodegas.get(1), null, null, null));
		listaVinos2.add(new Vino(2020, "imagen2.jpg", "Vino3", "Nota de cata de la bodega 2", 600.0, listaBodegas.get(1), null, null, null));

		List<Vino> listaVinos3 = new ArrayList<>();
		listaVinos3.add(new Vino(2020, "imagen2.jpg", "Vino1", "Nota de cata de la bodega 2", 600.0, listaBodegas.get(2), null, null, null));
		listaVinos3.add(new Vino(2020, "imagen2.jpg", "Vino2", "Nota de cata de la bodega 2", 600.0, listaBodegas.get(2), null, null, null));
		listaVinos3.add(new Vino(2020, "imagen2.jpg", "Vino3", "Nota de cata de la bodega 2", 600.0, listaBodegas.get(2), null, null, null));

		List<Vino> listaVinos4 = new ArrayList<>();
		listaVinos4.add(new Vino(2020, "imagen2.jpg", "Vino1", "Nota de cata de la bodega 2", 600.0, listaBodegas.get(3), null, null, null));
		listaVinos4.add(new Vino(2020, "imagen2.jpg", "Vino2", "Nota de cata de la bodega 2", 600.0, listaBodegas.get(3), null, null, null));
		listaVinos4.add(new Vino(2020, "imagen2.jpg", "Vino3", "Nota de cata de la bodega 2", 600.0, listaBodegas.get(3), null, null, null));
	}

	//APIS
	// VINOS API
	public void crearVinosApi() {
		List<Vino> listaVinosApi = new ArrayList<Vino>();
		listaVinosApi.add(new Vino(2020, "imagen1Modificada.jpg", "Vino Ejemplo", "Nota de cata de la bodega 1", 500.0, listaBodegas.get(0), null, null, null));
		listaVinosApi.add(new Vino(2019, "logo.jpg", "Vino Ejemplo 1", "Nota de cata de la bodega 1", 111500.0, listaBodegas.get(0), null, null, null));
		listaVinosApi.add(new Vino(2021, "imagen1.jpg", "Vino Ejemplo 2", "Nota de cata de la bodega 1", 500.0, listaBodegas.get(0), null, null, null));
		listaVinosApi.add(new Vino(1900, "imagen1.jpg", "Vino Nuevo", "Nota de cata de la bodega 1", 500.0, listaBodegas.get(0), null, null, null));
	}



	public void apiVinosActualizar(){

	}

	//Constructor
	public ControladorImportarActualizacionVinosBodega(List<Bodega> bodegaSeleccionada, List<Vino> vinosParaActualizar, Maridaje maridaje, TipoUva tipoUva, List<Vino> listaVinosCreados, List<Enofilo> seguidoresDeBodega, List<String> nombresDeUsuariosSeguidores, List<Bodega> listaBodegas) {
		this.bodegaSeleccionada = bodegaSeleccionada;
		this.vinosParaActualizar = vinosParaActualizar;
		this.maridaje = maridaje;
		this.tipoUva = tipoUva;
		this.listaVinosCreados = listaVinosCreados;
		this.seguidoresDeBodega = seguidoresDeBodega;
		this.nombresDeUsuariosSeguidores = nombresDeUsuariosSeguidores;
		this.listaBodegas = listaBodegas;
	}



	public ControladorImportarActualizacionVinosBodega() {
		this.listaBodegas = new ArrayList<>();
	}

	//Metodos
	public void opcionImportarActualizacionVinosBodega() {
		//PantallaAB pantalla = new PantallaAB();

		List<String> listaBodegasConActualizacion = buscarBodegasParaActualizar(getListaBodegas());

		//PREGUNTAR SOL
		if (listaBodegasConActualizacion.isEmpty()){
			JOptionPane.showMessageDialog(null, "No hay bodegas para actualizar");
			//volver a inicio
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

	public void tomarSeleccionBodega(List<String> bodegaSeleccionadas) {
		//InterfazSB.getImpo
		//List<Vino> vinosParaActualizar = getActualizacionVinos(bodegaSeleccionadas);
		System.out.println(bodegaSeleccionadas); //Muestra por terminal las bodegas seleccionadas
		// for vinosParaActualizar
		//		actualizarVinosExistentes(vino[i])

	}

	public List<Vino> getActualizacionVinos(List<String> bodegaSeleccionadas) {
		List<Vino> vinosParaActualizar = new ArrayList<>();
		for (String bodega : bodegaSeleccionadas) {
			vinosParaActualizar.addAll(InterfazSB.getImportarActualizacionVinos(bodega));
		}
		vinosParaActualizar.addAll(listaVinosApi);
	}

	public void actualizarVinosExistentes() {
		// actualizarDatosVino(vino)
		//
	}

	public void buscarMaridaje() {
	}

	public void buscarTipoUva() {
	}

	public void crearVino() {
	}

	public void buscarSeguidoresBodega() {
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

	public List<Vino> getVinosParaActualizar() {
		return vinosParaActualizar;
	}

	public void setVinosParaActualizar(List<Vino> vinosParaActualizar) {
		this.vinosParaActualizar = vinosParaActualizar;
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