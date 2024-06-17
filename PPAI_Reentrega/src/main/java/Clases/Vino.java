package Clases;

import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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

	public Vino(){

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

	public void _new(ArrayList maridajesArray, ArrayList tipoUvaArray, Object vinostr, List<Bodega> bodegaSeleccionada) {
		ArrayList<Object> vino = (ArrayList<Object>) vinostr;
		this.setAniada((Integer)vino.get(0));
		System.out.println(this.getAniada());
		this.setImagenEtiqueta(vino.get(1).toString());
		System.out.println(this.getImagenEtiqueta());
		this.setNombre(vino.get(2).toString());
		System.out.println(this.getNombre());
		this.setNotaDeCataBodega(vino.get(3).toString());
		System.out.println(this.getNotaDeCataBodega());
		this.setPrecioARS((Double)vino.get(4));
		System.out.println(this.getPrecioARS());
		for (Bodega bodega : bodegaSeleccionada){
			if (bodega.getNombre().equals(vino.get(5).toString())){
				this.setBodega(bodega);
				System.out.println(this.getBodega());
			}
		}
		this.setResenia((List<Resenia>)vino.get(6));
		System.out.println(this.getResenia());
		this.setVarietal(tipoUvaArray);
		this.crearVarietal(this, tipoUvaArray);
		System.out.println(this.getVarietal());
		this.setMaridaje(maridajesArray);
		System.out.println(this.getMaridaje());
		//crear vino ==> crea el el vino con varietal nulo
		//for tiposDeUvaEnVinoPorCrear
		//		asignamos al vino = Varietal.new(tipouva)
	}

	public void crearVarietal(Vino vino, ArrayList tipoUvaArray) {
		for (TipoUva tipoUva : (ArrayList<TipoUva>)tipoUvaArray){
			Varietal var = new Varietal("descripcion", 0.0, tipoUva);
			vino.getVarietal().add(var);
		}
	}
	//GETTERS Y SETTERS
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