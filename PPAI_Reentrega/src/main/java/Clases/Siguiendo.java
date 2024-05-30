package Clases;

import java.util.Date;

public class Siguiendo {

	//ATRIBUTOS
	private Bodega bodega;
	private Date fechaFin;
	private Date fechaInicio;
	private Sommelier sommelier;
	private Enofilo amigo;

	//CONSTRUCTOR
	public Siguiendo(Bodega bodega, Date fechaFin, Date fechaInicio, Sommelier sommelier, Enofilo amigo) {
		this.bodega = bodega;
		this.fechaFin = fechaFin;
		this.fechaInicio = fechaInicio;
		this.sommelier = sommelier;
		this.amigo = amigo;
	}

	//METODOS
	public void sosDeAmigo() {

	}

	public void sosDeBodega() {
	}

	public void sosDeSomelier() {

	}

	public void _sosDeBodega() {

	}

	//GETTERS Y SETTERS
	public Bodega getBodega() {
		return bodega;
	}

	public void setBodega(Bodega bodega) {
		this.bodega = bodega;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Sommelier getSommelier() {
		return sommelier;
	}

	public void setSommelier(Sommelier sommelier) {
		this.sommelier = sommelier;
	}

	public Enofilo getAmigo() {
		return amigo;
	}

	public void setAmigo(Enofilo amigo) {
		this.amigo = amigo;
	}
}