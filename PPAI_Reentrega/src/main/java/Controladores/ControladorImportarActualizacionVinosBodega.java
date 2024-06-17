package Controladores;

import Boundarys.InterfazSB;
import Clases.Bodega;
import Clases.Enofilo;
import Clases.Maridaje;
import Clases.TipoUva;
import Clases.Vino;
import com.company.PantallaAB.PantallaAB;
import java.awt.Component;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

public class ControladorImportarActualizacionVinosBodega {
	private List<Bodega> bodegaSeleccionada;
	private List<Vino> vinosParaActualizar;
	private Maridaje maridaje;
	private TipoUva tipoUva;
	private List<Vino> listaVinosCreados;
	private List<Enofilo> seguidoresDeBodega;
	private List<String> nombresDeUsuariosSeguidores;
	private List<Bodega> listaBodegas;
	private List<Vino> listaVinos;
	InterfazSB interfazSB = new InterfazSB();

	public void crearVinosActualizar() {
		this.listaVinos.add(new Vino(2020, "imagen1.jpg", "Vino 1", "Nota de cata de la bodega 1", 500.0, (Bodega)this.listaBodegas.get(0), (List)null, (List)null, (List)null));
		this.listaVinos.add(new Vino(2019, "logo.jpg", "Vino 2", "Nota de cata de la bodega 1", 500.0, (Bodega)this.listaBodegas.get(0), (List)null, (List)null, (List)null));
		this.listaVinos.add(new Vino(2021, "imagen1.jpg", "Vino 3", "Nota de cata de la bodega 1", 500.0, (Bodega)this.listaBodegas.get(0), (List)null, (List)null, (List)null));
		this.listaVinos.add(new Vino(2018, "imagen1.jpg", "Vino 4", "Nota de cata de la bodega 1", 500.0, (Bodega)this.listaBodegas.get(0), (List)null, (List)null, (List)null));
		this.listaVinos.add(new Vino(2020, "imagen2.jpg", "Vino1", "Nota de cata de la bodega 2", 600.0, (Bodega)this.listaBodegas.get(1), (List)null, (List)null, (List)null));
		this.listaVinos.add(new Vino(2020, "imagen2.jpg", "Vino2", "Nota de cata de la bodega 2", 600.0, (Bodega)this.listaBodegas.get(1), (List)null, (List)null, (List)null));
		this.listaVinos.add(new Vino(2020, "imagen2.jpg", "Vino3", "Nota de cata de la bodega 2", 600.0, (Bodega)this.listaBodegas.get(1), (List)null, (List)null, (List)null));
		this.listaVinos.add(new Vino(2020, "imagen2.jpg", "Vino1", "Nota de cata de la bodega 2", 600.0, (Bodega)this.listaBodegas.get(2), (List)null, (List)null, (List)null));
		this.listaVinos.add(new Vino(2020, "imagen2.jpg", "Vino2", "Nota de cata de la bodega 2", 600.0, (Bodega)this.listaBodegas.get(2), (List)null, (List)null, (List)null));
		this.listaVinos.add(new Vino(2020, "imagen2.jpg", "Vino3", "Nota de cata de la bodega 2", 600.0, (Bodega)this.listaBodegas.get(2), (List)null, (List)null, (List)null));
		this.listaVinos.add(new Vino(2020, "imagen2.jpg", "Vino 1", "Nota de cata de la bodega 2", 600.0, (Bodega)this.listaBodegas.get(3), (List)null, (List)null, (List)null));
		this.listaVinos.add(new Vino(2020, "imagen2.jpg", "Vino 2", "Nota de cata de la bodega 2", 600.0, (Bodega)this.listaBodegas.get(3), (List)null, (List)null, (List)null));
		this.listaVinos.add(new Vino(2020, "imagen2.jpg", "Vino 3", "Nota de cata de la bodega 2", 600.0, (Bodega)this.listaBodegas.get(3), (List)null, (List)null, (List)null));
	}

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
		this.listaBodegas = new ArrayList();
		this.bodegaSeleccionada = new ArrayList();
		this.listaVinos = new ArrayList();
		this.crearBodegasDePrueba();
		this.crearVinosActualizar();
	}

	public void crearBodegasDePrueba() {
		this.listaBodegas.add(new Bodega("123.45", "Descripcion 2", "Historia 1", "Bodega 1", 4, "2020-04-01"));
		this.listaBodegas.add(new Bodega("123.45", "Descripcion 3", "Historia 1", "Bodega 2", 2, "2025-04-01"));
		this.listaBodegas.add(new Bodega("123.45", "Descripcion 4", "Historia 1", "Bodega 3", 2, "2024-04-01"));
		this.listaBodegas.add(new Bodega("123.45", "Descripcion 5", "Historia 1", "Bodega 4", 2, "2021-04-01"));
		this.listaBodegas.add(new Bodega("123.45", "Descripcion 6", "Historia 1", "Bodega 5", 2, "2021-04-01"));
		this.listaBodegas.add(new Bodega("123.45", "Descripcion 1", "Historia 1", "Bodega 6", 2, "2027-04-01"));
	}

	public void opcionImportarActualizacionVinosBodega() {
		List<String> listaBodegasConActualizacion = this.buscarBodegasParaActualizar(this.getListaBodegas());
		if (listaBodegasConActualizacion.isEmpty()) {
			JOptionPane.showMessageDialog((Component)null, "No hay bodegas para actualizar");
		} else {
			PantallaAB.mostrarBodegasParaActualizar(listaBodegasConActualizacion);
		}

	}

	public List<String> buscarBodegasParaActualizar(List<Bodega> listaBodegas) {
		LocalDate today = LocalDate.now();
		List<String> bodegasConActualizacion = new ArrayList();
		Iterator var4 = listaBodegas.iterator();

		while(var4.hasNext()) {
			Bodega bodega = (Bodega)var4.next();
			if (bodega.disponibleActualizar(today)) {
				bodegasConActualizacion.add(bodega.getNombre());
			}
		}

		return bodegasConActualizacion;
	}

	public void tomarSeleccionBodega(List<String> nombresBodegaSeleccionadas) {
		Iterator var2 = nombresBodegaSeleccionadas.iterator();

		while(var2.hasNext()) {
			String nombreBodegaSeleccionada = (String)var2.next();
			Iterator var4 = this.listaBodegas.iterator();

			while(var4.hasNext()) {
				Bodega bodegaBDD = (Bodega)var4.next();
				if (bodegaBDD.getNombre().equals(nombreBodegaSeleccionada)) {
					this.bodegaSeleccionada.add(bodegaBDD);
				}
			}

			this.interfazSB.getImportarActualizacionVinos(nombreBodegaSeleccionada);
		}

		var2 = this.vinosParaActualizar.iterator();

		while(var2.hasNext()) {
			Object vinostr = var2.next();
			Boolean vinoActualizado = this.actualizarVinosExistentes(vinostr);
			if (!vinoActualizado) {
			}
		}

	}

	public ArrayList<Object> getActualizacionVinos(List<String> bodegaSeleccionadas) {
		ArrayList<Object> vinosParaActualizar = new ArrayList();
		Iterator var3 = bodegaSeleccionadas.iterator();

		while(var3.hasNext()) {
			String bodega = (String)var3.next();
			vinosParaActualizar.addAll(this.interfazSB.getImportarActualizacionVinos(bodega));
		}

		return vinosParaActualizar;
	}

	public Boolean actualizarVinosExistentes(Object vino) {
		Iterator var2 = this.bodegaSeleccionada.iterator();

		Bodega bodegaSeleccionada;
		do {
			if (!var2.hasNext()) {
				return false;
			}

			bodegaSeleccionada = (Bodega)var2.next();
		} while(!bodegaSeleccionada.getNombre().equals((new ArrayList((List)((List)vino).get(5))).get(3)));

		return bodegaSeleccionada.actualizarDatosVino(vino, this.listaVinos);
	}

	public void buscarMaridaje(Object maridaje) {
	}

	public void buscarTipoUva() {
	}

	public void crearVino() {
	}

	public void buscarSeguidoresBodega() {
	}

	public void finCU() {
	}

	public List<Bodega> getBodegaSeleccionada() {
		return this.bodegaSeleccionada;
	}

	public void setBodegaSeleccionada(List<Bodega> bodegaSeleccionada) {
		this.bodegaSeleccionada = bodegaSeleccionada;
	}

	public List<Vino> getVinosParaActualizar() {
		return this.vinosParaActualizar;
	}

	public void setVinosParaActualizar(List<Vino> vinosParaActualizar) {
		this.vinosParaActualizar = vinosParaActualizar;
	}

	public Maridaje getMaridaje() {
		return this.maridaje;
	}

	public void setMaridaje(Maridaje maridaje) {
		this.maridaje = maridaje;
	}

	public TipoUva getTipoUva() {
		return this.tipoUva;
	}

	public void setTipoUva(TipoUva tipoUva) {
		this.tipoUva = tipoUva;
	}

	public List<Vino> getListaVinosCreados() {
		return this.listaVinosCreados;
	}

	public void setListaVinosCreados(List<Vino> listaVinosCreados) {
		this.listaVinosCreados = listaVinosCreados;
	}

	public List<Enofilo> getSeguidoresBodega() {
		return this.seguidoresDeBodega;
	}

	public void setSeguidoresBodega(List<Enofilo> seguidoresDeBodega) {
		this.seguidoresDeBodega = seguidoresDeBodega;
	}

	public List<String> getNombresDeUsuariosSeguidores() {
		return this.nombresDeUsuariosSeguidores;
	}

	public void setNombresDeUsuariosSeguidores(List<String> nombresDeUsuariosSeguidores) {
		this.nombresDeUsuariosSeguidores = nombresDeUsuariosSeguidores;
	}

	public List<Bodega> getListaBodegas() {
		return this.listaBodegas;
	}

	public void setListaBodegas(List<Bodega> listaBodegas) {
		this.listaBodegas = listaBodegas;
	}
}