package com.pildorasinformaticas.InyeccionCamposPorPropiedades.Modelo;

import com.pildorasinformaticas.InyeccionCamposPorPropiedades.Interface.Carro;
import com.pildorasinformaticas.InyeccionCamposPorPropiedades.Interface.Vehiculo;

public class ChevroletCar implements Vehiculo, Carro {

	private String marca;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String abrirPuertas() {
		// TODO Auto-generated method stub
		return "Puertas abiertas";
	}

	@Override
	public String abrirMaletero() {
		// TODO Auto-generated method stub
		return "Maletero abierto";
	}

	@Override
	public String encender() {
		// TODO Auto-generated method stub
		return "Encendido";
	}

	@Override
	public String apagar() {
		// TODO Auto-generated method stub
		return "Apagado";
	}

}
