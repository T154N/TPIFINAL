package Clases;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

import Clases.Vino;


public class Bodega {

	private String coordenadasUbicacion;
	private String descripcion;
	private String historia;
	private String nombre;
	private Integer periodoActualizacion;
	private NovedadEvento novedadEvento;
	private RegionVitivinicola regionVitivinicola;
	private String ultimaActualizacion; //AGREGAR

	//Constructor
	public Bodega(String coordenadasUbicacion, String descripcion, String historia, String nombre,
			Integer periodoActualizacion, String ultimaActualizacion, NovedadEvento novedadEvento, RegionVitivinicola regionVitivinicola) {
		this.coordenadasUbicacion = coordenadasUbicacion;
		this.descripcion = descripcion;
		this.historia = historia;
		this.nombre = nombre;
		this.periodoActualizacion = periodoActualizacion;
		this.novedadEvento = novedadEvento;
		this.regionVitivinicola = regionVitivinicola;
		this.ultimaActualizacion = ultimaActualizacion;
	}

	public Bodega(String nombre) {
		this.nombre = nombre;
	}



	//Metodos
	public void contarResenia() {

	}

	public void mostrarTodosVinos() {
	}

	public boolean disponibleActualizar(LocalDate today) {
		LocalDate fechaUltimaActualizacion = LocalDate.parse(ultimaActualizacion);
		long monthsBetween = ChronoUnit.MONTHS.between(fechaUltimaActualizacion, today);
		return monthsBetween >= periodoActualizacion;
	}

	public Boolean actualizarDatosVino(Vino vinoAPI, List<Vino> listaVinosBDD /*vino |hay que preguntar si se puede pasar un vino|*/) {
		for (Vino vinoBDD : listaVinosBDD){
			if (vinoBDD.sosVinoParaActualizar(vinoAPI)){
				vinoBDD.setPrecioARS(vinoAPI.getPrecioARS());
				vinoBDD.setImagenEtiqueta(vinoAPI.getImagenEtiqueta());
				vinoBDD.setNotaDeCataBodega(vinoAPI.getNotaDeCataBodega());
				vinoBDD.setResenia(vinoAPI.getResenia());
				System.out.println(vinoBDD.getPrecioARS() + " = " + vinoAPI.getPrecioARS());
				System.out.println("-------------------------------------------------------");
				return true;
			}
		}
		return false;

	}


	//Getters y Setters
	public String getCoordenadasUbicacion() {
		return coordenadasUbicacion;
	}

	public void setCoordenadasUbicacion(String coordenadasUbicacion) {
		this.coordenadasUbicacion = coordenadasUbicacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPeriodoActualizacion() {
		return periodoActualizacion;
	}

	public void setPeriodoActualizacion(Integer periodoActualizacion) {
		this.periodoActualizacion = periodoActualizacion;
	}

	public NovedadEvento getNovedadEvento() {
		// begin-user-code
		return novedadEvento;
		// end-user-code
	}

	public void setNovedadEvento(NovedadEvento novedadEvento) {
		this.novedadEvento = novedadEvento;
	}

	public RegionVitivinicola getRegionVitivinicola() {
		return regionVitivinicola;
	}

	public void setRegionVitivinicola(RegionVitivinicola regionVitivinicola) {
		this.regionVitivinicola = regionVitivinicola;
	}

	public String getUltimaActualizacion() {
		return ultimaActualizacion;
	}

	public void setUltimaActualizacion(String ultimaActualizacion) {
		this.ultimaActualizacion = ultimaActualizacion;
	}
}