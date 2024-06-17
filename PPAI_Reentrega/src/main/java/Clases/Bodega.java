//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Clases;

import java.io.PrintStream;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;
import java.util.List;

public class Bodega {
	private String coordenadasUbicacion;
	private String descripcion;
	private String historia;
	private String nombre;
	private Integer periodoActualizacion;
	private NovedadEvento novedadEvento;
	private RegionVitivinicola regionVitivinicola;
	private String ultimaActualizacion;

	public Bodega(String coordenadasUbicacion, String descripcion, String historia, String nombre, Integer periodoActualizacion, String ultimaActualizacion) {
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

	public void contarResenia() {
	}

	public void mostrarTodosVinos() {
	}

	public boolean disponibleActualizar(LocalDate today) {
		LocalDate fechaUltimaActualizacion = LocalDate.parse(this.ultimaActualizacion);
		long monthsBetween = ChronoUnit.MONTHS.between(fechaUltimaActualizacion, today);
		return monthsBetween >= (long)this.periodoActualizacion;
	}

	public Boolean actualizarDatosVino(Object vinoAPI, List<Vino> listaVinosBDD) {
		Iterator var3 = listaVinosBDD.iterator();

		Vino vinoBDD;
		do {
			if (!var3.hasNext()) {
				return false;
			}

			vinoBDD = (Vino)var3.next();
		} while(!vinoBDD.sosVinoParaActualizar(vinoAPI));

		System.out.println("antes =" + vinoBDD.getPrecioARS());
		String priceStr = ((List)vinoAPI).get(4).toString();
		Double price = Double.parseDouble(priceStr);
		vinoBDD.setPrecioARS(price);
		String etiqueta = ((List)vinoAPI).get(1).toString();
		vinoBDD.setImagenEtiqueta(etiqueta);
		String nota = ((List)vinoAPI).get(3).toString();
		vinoBDD.setNotaDeCataBodega(nota);
		vinoBDD.setResenia((List)null);
		System.out.println(vinoBDD.getNotaDeCataBodega() + " = ");
		System.out.println(vinoBDD.getImagenEtiqueta() + " = hola");
		PrintStream var10000 = System.out;
		Double var10001 = vinoBDD.getPrecioARS();
		var10000.println("" + var10001 + " = " + priceStr);
		System.out.println("-------------------------------------------------------");
		return true;
	}

	public String getCoordenadasUbicacion() {
		return this.coordenadasUbicacion;
	}

	public void setCoordenadasUbicacion(String coordenadasUbicacion) {
		this.coordenadasUbicacion = coordenadasUbicacion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getHistoria() {
		return this.historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPeriodoActualizacion() {
		return this.periodoActualizacion;
	}

	public void setPeriodoActualizacion(Integer periodoActualizacion) {
		this.periodoActualizacion = periodoActualizacion;
	}

	public NovedadEvento getNovedadEvento() {
		return this.novedadEvento;
	}

	public void setNovedadEvento(NovedadEvento novedadEvento) {
		this.novedadEvento = novedadEvento;
	}

	public RegionVitivinicola getRegionVitivinicola() {
		return this.regionVitivinicola;
	}

	public void setRegionVitivinicola(RegionVitivinicola regionVitivinicola) {
		this.regionVitivinicola = regionVitivinicola;
	}

	public String getUltimaActualizacion() {
		return this.ultimaActualizacion;
	}

	public void setUltimaActualizacion(String ultimaActualizacion) {
		this.ultimaActualizacion = ultimaActualizacion;
	}
}
