package Clases;

import java.util.List;

public class TipoUva {

	//ATRIBUTOS
	private String descripcion;
	private String nombre;

	//CONSTRUCTOR
	public TipoUva(String descripcion, String nombre) {
		this.descripcion = descripcion;
		this.nombre = nombre;
	}

	//METODOS
	public boolean _sosTipoUva(Object tipoUvaAPI) {
		if (this.nombre.equals(((List<Object>)tipoUvaAPI).get(0).toString())) {
			return true;
		}else {
			return false;
		}
	}

	//GETTERS Y SETTERS
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}