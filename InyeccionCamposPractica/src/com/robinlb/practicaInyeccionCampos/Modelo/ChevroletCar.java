package com.robinlb.practicaInyeccionCampos.Modelo;

import com.robinlb.practicaInyeccionCampos.Interface.Vehiculo;
import com.robinlb.practicaInyeccionCampos.Interface.Carro;

public class ChevroletCar implements Vehiculo, Carro {

	private String marca;

	private String factoryYear;

	public String getFactoryYear() {
		return factoryYear;
	}

	public void setFactoryYear(String factoryYear) {
		this.factoryYear = factoryYear;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String encender() {
		// TODO Auto-generated method stub
		return "Auto encendido";
	}

	@Override
	public String apagar() {
		// TODO Auto-generated method stub
		return "Auto apagado";
	}

	@Override
	public String abrirCapo() {
		// TODO Auto-generated method stub
		return "Capo abierto";
	}

	@Override
	public String abrirPuertas() {
		// TODO Auto-generated method stub
		return "Puertas abiertas";
	}

}
