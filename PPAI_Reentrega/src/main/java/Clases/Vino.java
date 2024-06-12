package Clases;

import java.util.Set;
import	Clases.Bodega;
public class Vino {

	//Atributos
	private Integer aniada;
	private String imagenEtiqueta;
	private String nombre;
	private String notaDeCataBodega;
	private Double precioARS;
	private Bodega bodega;
	private Resenia resenia;
	private Varietal varietal;
	private Set<Maridaje> maridaje;

	//Contructor
	public Vino(Integer aniada, String imagenEtiqueta, String nombre, String notaDeCataBodega, Double precioARS, Bodega bodega, Resenia resenia, Varietal varietal, Set<Maridaje> maridaje) {
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

	//Metodos
	public void calcularRanking() {

	}

	public void compararEtiquetas() {

	}

	public void esDeBodega() {

	}

	public void esDeRegionVitivinicola() {

	}

	public void sosVinoParaActualizar() {

	}

	public void setPrecio() {

	}

	public void setImagenEtiqueta() {

	}

	public void setNotaCata() {

	}

	public void _new() {

	}

	//GETTERS Y SETTERS
	public void crearVarietal() {

	}

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

	public Resenia getResenia() {
		return resenia;
	}

	public void setResenia(Resenia resenia) {
		this.resenia = resenia;
	}

	public Varietal getVarietal() {
		return varietal;
	}

	public void setVarietal(Varietal varietal) {
		this.varietal = varietal;
	}

	public Set<Maridaje> getMaridaje() {
		return maridaje;
	}

	public void setMaridaje(Set<Maridaje> maridaje) {
		this.maridaje = maridaje;
	}
}