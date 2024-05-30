package Clases;

public class Bodega {

	private Object coordenadasUbicacion;
	private Object descripcion;
	private Object historia;
	private String nombre;
	private Object periodoActualizacion;
	private NovedadEvento novedadEvento;
	private RegionVitivinicola regionVitivinicola;

	//Constructor



	//Metodos
	public void contarResenia() {

	}

	public void mostrarTodosVinos() {
	}

	public void disponibleActualizar() {

	}

	public void actualizarDatosVino() {

	}


	//Getters y Setters
	public Object getCoordenadasUbicacion() {
		return coordenadasUbicacion;
	}

	public void setCoordenadasUbicacion(Object coordenadasUbicacion) {
		this.coordenadasUbicacion = coordenadasUbicacion;
	}

	public Object getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(Object descripcion) {
		this.descripcion = descripcion;
	}

	public Object getHistoria() {
		return historia;
	}

	public void setHistoria(Object historia) {
		this.historia = historia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Object getPeriodoActualizacion() {
		return periodoActualizacion;
	}

	public void setPeriodoActualizacion(Object periodoActualizacion) {
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

}