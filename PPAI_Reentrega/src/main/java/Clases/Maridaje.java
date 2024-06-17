package Clases;

import java.util.ArrayList;
import java.util.List;

public class Maridaje {
	//ATRIBUTOS
	private String nombre;
	private String descripcion;

	//CONSTRUCTOR
	public Maridaje(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	//METODOS
	public void maridaConVino() {

	}

	public boolean _sosMaridaje(Object maridajeAPI) {
		if (this.nombre.equals(((List<Object>)maridajeAPI).get(0).toString())) {
			return true;
		}else {
			return false;
		}
	}
	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}