package Clases;

//----------------------------------
import Clases.Siguiendo;
import Clases.Usuario;
//----------------------------------

import java.util.Set;

public class Enofilo {
	//ATRIBUTOS
	private String apellido;
	private String imagenPerfil;
	private String nombre;
	private Set<Siguiendo> siguiendo;
	private Set<Usuario> usuario;

	//CONSTRUCTOR
	public Enofilo(String apellido, String imagenPerfil, String nombre, Set<Siguiendo> siguiendo, Set<Usuario> usuario) {
		this.apellido = apellido;
		this.imagenPerfil = imagenPerfil;
		this.nombre = nombre;
		this.siguiendo = siguiendo;
		this.usuario = usuario;
	}
	//METODOS
	public void mostrarAmigosSeguidos() {
	}

	public void mostarColeccionFavoritos() {

	}

	public Boolean seguisBodega(/*String bodegaSeleccionada*/) {
		// return Siguiendo.sosBodega(String bodegaSeleccionada);
		return false;

	}

	public String getNombreUsuario() {
		//return this.Usuario.getNombre();
		return "Cristulo";
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
	public Set<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(Set<Usuario> usuario) {
		this.usuario = usuario;
	}

}



