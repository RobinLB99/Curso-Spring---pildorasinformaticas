package es.pildorasinformaticas.SingletonPrototype.Modelo;

import es.pildorasinformaticas.SingletonPrototype.Interface.Vehiculo;

public class Coche implements Vehiculo {

	private String modelo;
	private String marca;
	private String fechaFabricacion;

	public Coche() {
	}

	public Coche(String modelo, String marca, String fechaFabricacion) {
		this.modelo = modelo;
		this.marca = marca;
		this.fechaFabricacion = fechaFabricacion;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getFechaFabricacion() {
		return fechaFabricacion;
	}

	public void setFechaFabricacion(String fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}

	@Override
	public String encender() {
		return "Coche encendido";
	}

	@Override
	public String apagar() {
		return "Coche apagado";
	}

	@Override
	public String verNivelConbustible() {
		return "Visualizando el nivel del conbustible";
	}

}
