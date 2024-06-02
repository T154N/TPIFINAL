package Controladores;

import Boundarys.PantallaAB;
import Clases.Bodega;
import Clases.Maridaje;
import Clases.TipoUva;
import Clases.Vino;
import Clases.Enofilo;
import com.company.views.tablaCU;

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
	private List<Bodega> listaAPI;



	//CREAR BODEGAS DE PRUEBA
	public void crearBodegasDePrueba() {
		listaAPI.add(new Bodega("123.45", "Descripcion 2", "Historia 1", "Bodega 1", 4, "2022-04-01", null, null));
		listaAPI.add(new Bodega("123.45", "Descripcion 3", "Historia 1", "Bodega 2", 2, "2025-04-01", null, null));
		listaAPI.add(new Bodega("123.45", "Descripcion 4", "Historia 1", "Bodega 3", 2, "2025-04-01", null, null));
		listaAPI.add(new Bodega("123.45", "Descripcion 5", "Historia 1", "Bodega 4", 2, "2025-04-01", null, null));
		listaAPI.add(new Bodega("123.45", "Descripcion 6", "Historia 1", "Bodega 5", 2, "2025-04-01", null, null));
		listaAPI.add(new Bodega("123.45", "Descripcion 1", "Historia 1", "Bodega 6", 2, "2027-04-01", null, null));
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

	//Metodos
	public void opcionImportarActualizacionVinosBodega() {
		// lista de tipo bodega = buscarBodegasParaActualizar(getListaBodegas());
		// mostrarBodegasParaActualizar(con una lista de tipo bodega)
	}

	public void buscarBodegasParaActualizar(List<Bodega> listaAPI) {
		tablaCU tabla = new tablaCU();
		LocalDate today = LocalDate.now();
		for (Bodega bodega : listaAPI) {
			if (bodega.disponibleActualizar(today)) {
			// mostrarBodegasParaActualizar (Iterado por cada bodega que devuelva True en disponible para actualizar)
			}}

	}

	public void tomarSeleccionBodega() {
	}

	public void getActualizacionVinos() {
	}

	public void actualizarVinosExistentes() {
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