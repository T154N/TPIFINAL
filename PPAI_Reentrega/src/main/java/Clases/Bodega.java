package Clases;

public class Bodega {

	private String coordenadasUbicacion;
	private String descripcion;
	private String historia;
	private String nombre;
	private Integer periodoActualizacion;
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

}