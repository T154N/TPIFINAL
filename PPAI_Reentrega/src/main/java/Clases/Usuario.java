package Clases;


public class Usuario {
	//ATRIBUTOS
	private Object contrasenia;
	private Object nombre;
	private Object premium;
	private CobroPremium cobroPremium;

	//CONSTRUCTOR

	//METODOS
	public void esPremium() {

	}

	public void esTuUsuario() {
	}

	public void mostrarNombre() {

	}

	//GETTERS Y SETTERS
	public Object getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(Object contrasenia) {
		this.contrasenia = contrasenia;
	}

	public Object getNombre() {
		return nombre;
	}

	public void setNombre(Object nombre) {
		this.nombre = nombre;
	}

	public Object getPremium() {
		return premium;
	}

	public void setPremium(Object premium) {
		this.premium = premium;
	}

	public CobroPremium getCobroPremium() {
		return cobroPremium;
	}


	public void setCobroPremium(CobroPremium cobroPremium) {
		this.cobroPremium = cobroPremium;
	}

}