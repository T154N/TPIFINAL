package Clases;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.ArrayList;

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
				  Integer periodoActualizacion, String ultimaActualizacion) {
		this.coordenadasUbicacion = coordenadasUbicacion;
		this.descripcion = descripcion;
		this.historia = historia;
		this.nombre = nombre;
		this.periodoActualizacion = periodoActualizacion;
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

	public Boolean actualizarDatosVino(Object vinoAPI, List<Vino> listaVinosBDD ) {
		for (Vino vinoBDD : listaVinosBDD){
			if (vinoBDD.sosVinoParaActualizar(vinoAPI)){
				System.out.println("");
				System.out.println("");
				System.out.println("---------------------------------------------------------------------");
				System.out.println("Datos actualizados correctamente del vino" + ((List<Object>)vinoAPI).get(2).toString());
				System.out.println("Precio antes"+ vinoBDD.getPrecioARS() );
				String priceStr = ((List<Object>)vinoAPI).get(4).toString();
				Double price = Double.parseDouble(priceStr);
				vinoBDD.setPrecioARS(price);
				System.out.println("Precio Despues: " + priceStr );
				System.out.println("Etiqueta Antes: " + vinoBDD.getImagenEtiqueta());
				String etiqueta= ((List<Object>)vinoAPI).get(1).toString();
				vinoBDD.setImagenEtiqueta(etiqueta);
				System.out.println("Etiquete Despues: " + etiqueta);
				System.out.println("Nota de cata antes: "+vinoBDD.getNotaDeCataBodega());
				String nota= ((List<Object>)vinoAPI).get(3).toString();
				vinoBDD.setNotaDeCataBodega(nota);
				System.out.println("Nota de cata Despues: "+nota);
				System.out.println("Esta es la resenia antes: " + vinoBDD.getResenia());
				List<Resenia> reseniaList = (ArrayList<Resenia>) ((List<Object>) vinoAPI).get(6);
				vinoBDD.setResenia(reseniaList);
				System.out.println("Esta es la resenia Despues: " + reseniaList);

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