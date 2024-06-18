package Clases;

import java.util.ArrayList;
import java.util.List;

public class Vino {

	//Atributos
	private Integer aniada;
	private String imagenEtiqueta;	//Modificada
	private String nombre;
	private String notaDeCataBodega;	//Modificable
	private Double precioARS;	//Modificable
	private Bodega bodega;
	private List<Resenia> resenia;
	private List<Varietal> varietal;
	private List<Maridaje> maridaje;	//Modificable

	//Contructor
	public Vino(Integer aniada, String imagenEtiqueta, String nombre, String notaDeCataBodega, Double precioARS, Bodega bodega, List<Resenia> resenia, List<Varietal> varietal, List<Maridaje> maridaje) {
		this.aniada = aniada;
		this.imagenEtiqueta = imagenEtiqueta;
		this.nombre = nombre;
		this.notaDeCataBodega = notaDeCataBodega;
		this.precioARS = precioARS;
		this.bodega = bodega;
		this.resenia = resenia;
		this.varietal = varietal;
		this.maridaje = maridaje;
	}

	public Vino(ArrayList maridajesArray, ArrayList tipoUvaArray, Object vinostr, List<Bodega> bodegaSeleccionada, ArrayList<TipoUva> tipoUvaList, ArrayList<Maridaje> maridajesList) {
		ArrayList<Object> vino = (ArrayList<Object>) vinostr;
		ArrayList<Resenia> resenias = new ArrayList<>();

		System.out.println("-------------------------------------------------------------");
		System.out.println("creacion del vino "+ vino.get(2));
		this.setAniada((Integer) vino.get(0));
		System.out.println(this.getAniada());
		this.setImagenEtiqueta(vino.get(1).toString());
		System.out.println(this.getImagenEtiqueta());
		this.setNombre(vino.get(2).toString());
		System.out.println(this.getNombre());
		this.setNotaDeCataBodega(vino.get(3).toString());
		System.out.println(this.getNotaDeCataBodega());
		this.setPrecioARS((Double) vino.get(4));
		System.out.println(this.getPrecioARS());

		//Setea la Bodega
		ArrayList<Object> bodegaVino = (ArrayList<Object>) vino.get(5);
		for (Bodega bodega : bodegaSeleccionada) {
			if (bodega.getNombre().equals(bodegaVino.get(3).toString())){
				this.setBodega(bodega);
				System.out.println(this.getBodega().getNombre());
			}
		}

		//Crea resenia VER DIAGRAMA
		ArrayList<Object> reseniaVino = (ArrayList<Object>) vino.get(6);
		for (Object reseniaIvividual : reseniaVino) {
			String comentario = (String) ((ArrayList) reseniaIvividual).get(0);
			Boolean esPremium = (Boolean) ((ArrayList) reseniaIvividual).get(1);
			String fechaResenia = (String) ((ArrayList) reseniaIvividual).get(2);
			Integer puntaje = (Integer) ((ArrayList) reseniaIvividual).get(3);
			Resenia resenia = new Resenia(comentario, esPremium, fechaResenia, puntaje);
			resenias.add(resenia);
		}

		this.setResenia(resenias);
		System.out.println(this.getResenia());

		//Crea Varietal
		ArrayList<Varietal> varietales;
		varietales = this.crearVarietal(tipoUvaArray, tipoUvaList);
		this.setVarietal(varietales);
		System.out.println(this.getVarietal());

		//Crea Maridaje
		ArrayList<Maridaje> maridajes;
		maridajes = this.crearMaridaje(maridajesArray, maridajesList);
		this.setMaridaje(maridajes);
		System.out.println(this.getMaridaje());


		//crear vino ==> crea el el vino con varietal nulo
		//for tiposDeUvaEnVinoPorCrear
		//		asignamos al vino = Varietal.new(tipouva)
	}

	public Vino(String nombre, Bodega bodega ){
		this.nombre = nombre;
		this.bodega = bodega;
	}

	//Metodos
	public void calcularRanking() {

	}

	public void compararEtiquetas() {

	}

	public void esDeBodega() {

	}

	public void esDeRegionVitivinicola() {

	}

	public Boolean sosVinoParaActualizar(Object vinoAPI) {
		if (this.getNombre().equals(((List<Object>)vinoAPI).get(2))){
			return true;
		}
		return false;
	}


	public ArrayList<Varietal> crearVarietal( ArrayList VarietalArray, ArrayList<TipoUva> tipoUvaList){
		ArrayList<Varietal> varietalesCreados = new ArrayList<>();
		for (Object VarietalIndividual : VarietalArray){
			Varietal varietalesCreado = new Varietal(VarietalIndividual, tipoUvaList);
			varietalesCreados.add(varietalesCreado);
			System.out.println("soy un nuevo varietal " + varietalesCreado );
			System.out.println("soy el tipo de uva"+ varietalesCreado.getTipoUva());
		}
		return varietalesCreados;
	}

	public ArrayList<Maridaje> crearMaridaje( ArrayList MaridajeListApi, ArrayList<Maridaje> maridajesListBDD){
		ArrayList<Maridaje> maridajeCreados = new ArrayList<>();
		for (Object MaridajeIndividualAPI : MaridajeListApi){
			boolean bandera = false;
			for (Maridaje maridajeIndividualBDD: maridajesListBDD ) {
				Object elemento = ((List<Object>) MaridajeIndividualAPI).get(0);
				if (maridajeIndividualBDD.getNombre().equals(elemento.toString())) {
					elemento = ((List<Object>) MaridajeIndividualAPI).get(2);
					if (elemento.toString().equals("existe")) {
						maridajeCreados.add(maridajeIndividualBDD);
						System.out.println("Este es el maridaje que hay que asisgnar "+ maridajeIndividualBDD);
						bandera = true;
						break;
					}
				}
			}
			if (bandera == false){
				String nombre = ((List<Object>) MaridajeIndividualAPI).get(0).toString();
				String descripcion = ((List<Object>) MaridajeIndividualAPI).get(1).toString();
				Maridaje maridajeCreado = new Maridaje(nombre, descripcion);
				maridajeCreados.add(maridajeCreado);
				System.out.println("Soy un nuevo Maridaje " + maridajeCreado);
			}
		}
		return maridajeCreados;
	}

	// -----------------------------------------------
	//GETTERS Y SETTERS
	// -----------------------------------------------
	public Integer getAniada() {
		return aniada;
	}

	public void setAniada(Integer aniada) {
		this.aniada = aniada;
	}

	public String getImagenEtiqueta() {
		return imagenEtiqueta;
	}

	public void setImagenEtiqueta(String imagenEtiqueta) {
		this.imagenEtiqueta = imagenEtiqueta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNotaDeCataBodega() {
		return notaDeCataBodega;
	}

	public void setNotaDeCataBodega(String notaDeCataBodega) {
		this.notaDeCataBodega = notaDeCataBodega;
	}

	public Double getPrecioARS() {
		return precioARS;
	}

	public void setPrecioARS(Double precioARS) {
		this.precioARS = precioARS;
	}

	public Bodega getBodega() {
		return bodega;
	}

	public void setBodega(Bodega bodega) {
		this.bodega = bodega;
	}

	public List<Resenia> getResenia() {
		return resenia;
	}

	public void setResenia(List<Resenia> resenia) {
		this.resenia = resenia;
	}

	public List<Varietal> getVarietal() {
		return varietal;
	}

	public void setVarietal(List<Varietal> varietal) {
		this.varietal = varietal;
	}

	public List<Maridaje> getMaridaje() {
		return maridaje;
	}

	public void setMaridaje(List<Maridaje> maridaje) {
		this.maridaje = maridaje;
	}
}