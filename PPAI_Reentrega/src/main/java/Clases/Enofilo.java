package Clases;

import java.util.Set;

public class Enofilo {
	//ATRIBUTOS
	private String apellido;
	private String imagenPerfil;
	private String nombre;
	private Set<Siguiendo> siguiendo;

	//CONSTRUCTOR
	public Enofilo(String apellido, String imagenPerfil, String nombre, Set<Siguiendo> siguiendo) {
		this.apellido = apellido;
		this.imagenPerfil = imagenPerfil;
		this.nombre = nombre;
		this.siguiendo = siguiendo;
	}
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
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getImagenPerfil() {
		return imagenPerfil;
	}

	public void setImagenPerfil(String imagenPerfil) {
		this.imagenPerfil = imagenPerfil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Siguiendo> getSiguiendo() {
		return siguiendo;
	}

	public void setSiguiendo(Set<Siguiendo> siguiendo) {
		this.siguiendo = siguiendo;
	}

}