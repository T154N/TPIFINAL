package Clases;

import java.util.Date;

public class Resenia {
	//ATRIBUTOS
	private String comentario;
	private Boolean esPremium;
	private Date fechaResenia;
	private Integer puntaje;
	private Vino vino;

	//CONSTRUCTOR

	//METODOS
	public void esPremium() {

	}

	public void sosDeEnofilo() {

	}

	public void sosDeSomelier() {

	}

	//GETTERS Y SETTERS
	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Boolean getEsPremium() {
		return esPremium;
	}

	public void setEsPremium(Boolean esPremium) {
		this.esPremium = esPremium;
	}

	public Date getFechaResenia() {
		return fechaResenia;
	}

	public void setFechaResenia(Date fechaResenia) {
		this.fechaResenia = fechaResenia;
	}

	public Integer getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(Integer puntaje) {
		this.puntaje = puntaje;
	}

	public Vino getVino() {
		return vino;
	}

	public void setVino(Vino vino) {
		this.vino = vino;
	}

}