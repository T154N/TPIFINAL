package Clases;

import java.util.Set;

public class Enofilo {
	//ATRIBUTOS
	private Object apellido;
	private Object imagenPerfil;
	private Object nombre;
	private Set<Siguiendo> siguiendo;

	//CONSTRUCTOR

	//METODOS
	public void mostrarAmigosSeguidos() {
	}

	public void mostarColeccionFavoritos() {

	}

	public void seguisBodega() {
	}

	public void _getNombreUsuario() {

	}


	//GETTERS Y SETTERS
	public Object getApellido() {
		return apellido;
	}

	public void setApellido(Object apellido) {
		this.apellido = apellido;
	}

	public Object getImagenPerfil() {
		return imagenPerfil;
	}

	public void setImagenPerfil(Object imagenPerfil) {
		this.imagenPerfil = imagenPerfil;
	}

	public Object getNombre() {
		return nombre;
	}

	public void setNombre(Object nombre) {
		this.nombre = nombre;
	}

	public Set<Siguiendo> getSiguiendo() {
		return siguiendo;
	}

	public void setSiguiendo(Set<Siguiendo> siguiendo) {
		this.siguiendo = siguiendo;
	}

}