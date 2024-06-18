package Clases;

import java.util.ArrayList;

public class Varietal {

	//ATRIBUTOS
	private String descripcion;
	private Double porcentajeComposicion;
	private TipoUva tipoUva;

	//CONSTRUCTOR
	public Varietal(String descripcion, Double porcentajeComposicion, TipoUva tipoUva) {
		this.descripcion = descripcion;
		this.porcentajeComposicion = porcentajeComposicion;
		this.tipoUva = tipoUva;
	}

	public  Varietal(Object Varietal, ArrayList<TipoUva> tipoUvaList){
		ArrayList<Object> varArray = (ArrayList<Object>) Varietal;
		System.out.println("entro aqui");
		System.out.println(varArray);
		ArrayList<Object> tipoUvaArray = (ArrayList<Object>) varArray.get(2);

		this.descripcion = varArray.get(0).toString();
		this.porcentajeComposicion = Double.parseDouble(varArray.get(1).toString());
		if (varArray.get(3) == "existe"){
			for (TipoUva tipoUvaBDD : tipoUvaList) {
				if (tipoUvaBDD.getNombre().equals((tipoUvaArray.get(1).toString()))){
					this.tipoUva = tipoUvaBDD;
				}
			}
		}else {
			this.tipoUva = new TipoUva(tipoUvaArray.get(0).toString(), tipoUvaArray.get(1).toString());
		}
	}

	//METODOS
	public void conocerTiposUva() {
	}

	public void esDeTipoUva() {
	}

	public void mostrarPorcentaje() {

	}


	//GETTERS Y SETTERS
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPorcentajeComposicion() {
		return porcentajeComposicion;
	}

	public void setPorcentajeComposicion(Double porcentajeComposicion) {
		this.porcentajeComposicion = porcentajeComposicion;
	}

	public TipoUva getTipoUva() {
		return tipoUva;
	}

	public void setTipoUva(TipoUva tipoUva) {
		this.tipoUva = tipoUva;
	}
}