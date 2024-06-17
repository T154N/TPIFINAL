//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Clases;

import java.util.List;

public class Vino {
	private Integer aniada;
	private String imagenEtiqueta;
	private String nombre;
	private String notaDeCataBodega;
	private Double precioARS;
	private Bodega bodega;
	private List<Resenia> resenia;
	private List<Varietal> varietal;
	private List<Maridaje> maridaje;

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

	public Vino(String nombre, Bodega bodega) {
		this.nombre = nombre;
		this.bodega = bodega;
	}

	public void calcularRanking() {
	}

	public void compararEtiquetas() {
	}

	public void esDeBodega() {
	}

	public void esDeRegionVitivinicola() {
	}

	public Boolean sosVinoParaActualizar(Object vinoAPI) {
		return this.getNombre().equals(((List)vinoAPI).get(2)) ? true : false;
	}

	public void _new() {
	}

	public void crearVarietal() {
	}

	public Integer getAniada() {
		return this.aniada;
	}

	public void setAniada(Integer aniada) {
		this.aniada = aniada;
	}

	public String getImagenEtiqueta() {
		return this.imagenEtiqueta;
	}

	public void setImagenEtiqueta(String imagenEtiqueta) {
		this.imagenEtiqueta = imagenEtiqueta;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNotaDeCataBodega() {
		return this.notaDeCataBodega;
	}

	public void setNotaDeCataBodega(String notaDeCataBodega) {
		this.notaDeCataBodega = notaDeCataBodega;
	}

	public Double getPrecioARS() {
		return this.precioARS;
	}

	public void setPrecioARS(Double precioARS) {
		this.precioARS = precioARS;
	}

	public Bodega getBodega() {
		return this.bodega;
	}

	public void setBodega(Bodega bodega) {
		this.bodega = bodega;
	}

	public List<Resenia> getResenia() {
		return this.resenia;
	}

	public void setResenia(List<Resenia> resenia) {
		this.resenia = resenia;
	}

	public List<Varietal> getVarietal() {
		return this.varietal;
	}

	public void setVarietal(List<Varietal> varietal) {
		this.varietal = varietal;
	}

	public List<Maridaje> getMaridaje() {
		return this.maridaje;
	}

	public void setMaridaje(List<Maridaje> maridaje) {
		this.maridaje = maridaje;
	}
}
