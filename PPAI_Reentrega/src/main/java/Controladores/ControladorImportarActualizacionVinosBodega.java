// ------------------------------------------
// IMPORTACION DE CLASES NECESARIAS y extras
// ------------------------------------------

package Controladores;
//----------------------------------CLASES
import Clases.*;
//----------------------------------BOUNDARYS
import com.company.PantallaAB.PantallaAB;
import Boundarys.InterfazSB;
import Boundarys.InterfazNotificacion;
//----------------------------------JAVA
import java.util.*;
import javax.swing.*;
import java.time.LocalDate;

// ---------------------------------------------------
// Definicion de la clase controlador
// ---------------------------------------------------

public class ControladorImportarActualizacionVinosBodega {

	// Atributos
	private List<Bodega> bodegaSeleccionada;
	private Maridaje maridaje;
	private TipoUva tipoUva;
	private List<Vino> listaVinosCreados;
	private List<Enofilo> seguidoresDeBodega;
	private List<Bodega> listaBodegas;
	private List<Vino> listaVinos;
	private ArrayList<Maridaje> maridajesList;
	private ArrayList<TipoUva> tipoUvaList;
	private ArrayList<Usuario> listaUsuario;
	private ArrayList<Enofilo> listaEnofilos;
	private ArrayList<Siguiendo> Listasiguiendo;

	// inicializar pantalla
	InterfazSB interfazSB = new InterfazSB();
	InterfazNotificacion interfazNotificacion = new InterfazNotificacion();


	// ------------------------------------------------------------------
	// ARRAYS CON LOS DATOS
	// ------------------------------------------------------------------
	// VINOS BDD nuestra-------------------------------------------------
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

	// BODEGAS BDD -----------------------------------------------------
	public void crearBodegasDePrueba() {
		listaBodegas.add(new Bodega("123.45", "Descripcion 2", "Historia 1", "Bodega 1", 4, "2020-04-01"));
		listaBodegas.add(new Bodega("123.45", "Descripcion 3", "Historia 1", "Bodega 2", 2, "2025-04-01"));
		listaBodegas.add(new Bodega("123.45", "Descripcion 4", "Historia 1", "Bodega 3", 2, "2024-04-01"));
		listaBodegas.add(new Bodega("123.45", "Descripcion 5", "Historia 1", "Bodega 4", 2, "2021-04-01"));
		listaBodegas.add(new Bodega("123.45", "Descripcion 6", "Historia 1", "Bodega 5", 2, "2021-04-01"));
		listaBodegas.add(new Bodega("123.45", "Descripcion 1", "Historia 1", "Bodega 6", 2, "2027-04-01"));
	}

	// MARIDAJES BDD ----------------------------------------------------
	public void crearMaridaje() {
		maridajesList.add(new Maridaje("Ensaladas", "Ideal para ensaladas frescas"));
		maridajesList.add(new Maridaje("Carne", "Ideal para carnes rojas"));
		maridajesList.add(new Maridaje("Arroz", "Excelente para platos de arroz"));
		maridajesList.add(new Maridaje("Pasta", "Excelente para platos de pasta"));
	}

	// TIPOS DE UVA BDD --------------------------------------------------
	public void crearTipoUvaBDD() {
		tipoUvaList.add(new TipoUva("Descripción del tipo de uva Chardonnay", "Chardonnay"));
		tipoUvaList.add(new TipoUva("Descripción del tipo de uva Riesling", "Riesling"));
		tipoUvaList.add(new TipoUva("Descripción del tipo de uva Merlot", "Merlot"));
		tipoUvaList.add(new TipoUva("Descripción del tipo de uva Cabernet Sauvignon", "Cabernet Sauvignon"));
	}

	// --------------------------------------------------------------------
	//Parte de la notificacion
	// --------------------------------------------------------------------
	// USUARIOS BDD -------------------------------------------------------
	public void crearListaUsuarioBDD(){
		listaUsuario.add(new Usuario("contra1","usuario1",true, null));
		listaUsuario.add(new Usuario("contra2","usuario2",true, null));
	  	listaUsuario.add(new Usuario("contra3","usuario3",false, null));
		listaUsuario.add(new Usuario("contra4","usuario4",false, null));
	}

	// ENOFILOS BDD -------------------------------------------------------
	public void crearEnofiloBDD(){
		List<Siguiendo> siguiendo1 = new ArrayList<>();
		siguiendo1.add(Listasiguiendo.get(0));
		siguiendo1.add(Listasiguiendo.get(3));



		List<Siguiendo> siguiendo2 = new ArrayList<>();
		siguiendo2.add(Listasiguiendo.get(1));


		List<Siguiendo> siguiendo3 = new ArrayList<>();
		siguiendo3.add(Listasiguiendo.get(2));


		listaEnofilos.add(new Enofilo("apellido1","img1", "nombre1", siguiendo1, listaUsuario.get(0)));
		listaEnofilos.add(new Enofilo("apellido2","img2", "nombre2", siguiendo2, listaUsuario.get(1)));
		listaEnofilos.add(new Enofilo("apellido3","img3", "nombre3", siguiendo3, listaUsuario.get(2)));
		listaEnofilos.add(new Enofilo("apellido4","img4", "nombre4", siguiendo1, listaUsuario.get(3)));
	}

	// SIGUIENDO BDD ------------------------------------------------------
	public void crearSiguiendoBDD(){
		Listasiguiendo.add(new Siguiendo(listaBodegas.get(0),"2021-01-01", "2023-03-01", null, null ));
		Listasiguiendo.add(new Siguiendo(listaBodegas.get(3),"2022-02-02", "2024-04-04", null, null ));
	  	Listasiguiendo.add(new Siguiendo(listaBodegas.get(3),"2021-01-01", "2025-05-05", null, null ));
		Listasiguiendo.add(new Siguiendo(listaBodegas.get(2),"2021-01-01", "2025-05-05", null, null ));
	}

	// --------------------------------------------------------------------
	// Constructor
	// --------------------------------------------------------------------
	// Sirve para inicializar los nuevos objetos de la clase
	public ControladorImportarActualizacionVinosBodega() {
		this.listaBodegas = new ArrayList<>();
		this.bodegaSeleccionada = new ArrayList<>();
		this.maridajesList = new ArrayList<>();
		this.listaVinos = new ArrayList<>();
		this.tipoUvaList = new ArrayList<>();
		this.Listasiguiendo = new ArrayList<>();
		this.listaEnofilos = new ArrayList<>();
		this.listaUsuario = new ArrayList<>();

		// crea las clases correspondientes con las que se relaciona

		crearBodegasDePrueba();
		crearVinosActualizar();
		crearMaridaje();
		crearTipoUvaBDD();
		crearSiguiendoBDD();
		crearListaUsuarioBDD();
		crearEnofiloBDD();

	}

	// --------------------------------------------------------------------
	// Metodos de clase controlador
	//---------------------------------------------------------------------
	// Cuando se selecciona la opcion de importar actualizacion
	public void opcionImportarActualizacionVinosBodega() {
		// array de string que va a ser llenado (con el resultado de funcion) por las bodegas que posean actualizacion
		List<String> listaBodegasConActualizacion = buscarBodegasParaActualizar(getListaBodegas());
		if (listaBodegasConActualizacion.isEmpty()){
			// si el array esta vacio, muestra un mensaje de la inexistencia de bodegas para actualizar:
			JOptionPane.showMessageDialog(null, "No hay bodegas para actualizar");
			System.exit(0);
		} else {
			// si el array no esta vacio, llama a la funcion mostrarBodegasParaActualizacion de la pantallaAB
			// a la funcion se le pasa por parametro las bodegas que requieren actualizacion, algunas se crean otras se modifican
			PantallaAB.mostrarBodegasParaActualizar(listaBodegasConActualizacion);
		}
	}

	//
	public List<String> buscarBodegasParaActualizar(List<Bodega> listaBodegas) {
		LocalDate today = LocalDate.now(); // Tomar fecha actual
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

	// Metodo para seleccionar las bodegas
	public void tomarSeleccionBodega(List<String> nombresBodegaSeleccionadas) {
		boolean notificacion = false;
		ArrayList<Object> vinosPantalla = new ArrayList<>();
		ArrayList<String> bodegasActualizadas = new ArrayList<>();
		ArrayList<Object> vinosParaActualizar;
		for (String nombreBodegaSeleccionada : nombresBodegaSeleccionadas) {
			for (Bodega bodegaBDD : listaBodegas) {
				if (bodegaBDD.getNombre().equals(nombreBodegaSeleccionada)) {
					bodegaSeleccionada.add(bodegaBDD);
					bodegasActualizadas.add(bodegaBDD.getNombre());
				}
			}
			vinosParaActualizar = interfazSB.getImportarActualizacionVinos(nombreBodegaSeleccionada);



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
				crearVino(maridajesArray, tipoUvaArray, vinostr, bodegaSeleccionada, tipoUvaList, maridajesList);


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
			vinosPantalla.add(vinoIndividual);
		}

			if (!(vinosParaActualizar.isEmpty())) {
				ArrayList<String> nombresDeUsuariosSeguidores;
				// Validar que sean bodegas actualizadas
				nombresDeUsuariosSeguidores = buscarSeguidoresBodega(nombreBodegaSeleccionada); // Array Strings de Usuarios
				interfazNotificacion.notificarNovedadVino(nombresDeUsuariosSeguidores, nombreBodegaSeleccionada);
				nombresDeUsuariosSeguidores.clear();

				notificacion = true;
			}

		}
		if (notificacion) {
			JOptionPane.showMessageDialog(null, "Se notifico a los usuarios ");
		}
		PantallaAB.mostrarResumenVinosImportados(vinosPantalla);
	}


	 /* public ArrayList<Object> getActualizacionVinos(List<String> nombresBodegaSeleccionadas) {
		return interfazSB.getImportarActualizacionVinos(List<String>nombresBodegaSeleccionadas); */


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
		for (Object maridajeIndividual : (List<Object>) maridajeAPI) {
			boolean yaExiste = false;
			for (Maridaje m : maridajesList) {
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
			}
		}
		return result;
	}

	public ArrayList<Object> buscarTipoUva(Object varietal, ArrayList<TipoUva> tipoUvaBDD) {
		ArrayList<Object> varietalList = (ArrayList<Object>) varietal;

		for (Object tipoUvaIndividual : varietalList) {
			boolean yaExiste = false;
			for (TipoUva tu : tipoUvaBDD) {
				if (tu._sosTipoUva(((List<Object>) tipoUvaIndividual).get(2))) {
					((List<Object>) tipoUvaIndividual).add("existe"); // Agrega "existe" dentro del array del varietal
					yaExiste = true;
					break;
				}
			}
			if (!yaExiste) {
				((List<Object>) tipoUvaIndividual).add("no existe"); // Agrega "no existe" dentro del array del varietal
			}
		}

		return varietalList;
	}

	// metodo crear vino, pasarle todas las clases necesarias. Con ayuda de lconstructor
	public void crearVino(ArrayList maridajesArray, ArrayList tipoUvaArray, Object vinostr, List<Bodega> bodegaSeleccionada, ArrayList<TipoUva> tipoUvaList, ArrayList<Maridaje> maridajesList) {
		Vino vino = new Vino(maridajesArray, tipoUvaArray, vinostr, bodegaSeleccionada, tipoUvaList, maridajesList);
		listaVinos.add(vino);
	}


	public ArrayList<String> buscarSeguidoresBodega(String Bodega) {
        ArrayList<String> enofilosSiguiendos = new ArrayList<>();
            for (Enofilo enofilo : listaEnofilos) {
                if (enofilo.seguisBodega(Bodega)) {
					enofilosSiguiendos.add(enofilo.getNombreUsuario());
				}
            }
        return enofilosSiguiendos; // Si no se encuentra ningún seguidor
    }

	// finCU
	public void finCU() {
	}

	// --------------------------------------------
	//GETTERS Y SETTERS
	// --------------------------------------------
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


	public List<Bodega> getListaBodegas() {
		return listaBodegas;
	}

	public void setListaBodegas(List<Bodega> listaBodegas) {
		this.listaBodegas = listaBodegas;
	}
}