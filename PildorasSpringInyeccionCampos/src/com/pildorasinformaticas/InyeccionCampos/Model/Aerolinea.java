package com.pildorasinformaticas.InyeccionCampos.Model;

import com.pildorasinformaticas.InyeccionCampos.Interfaces.Empresa;

public class Aerolinea implements Empresa {

	private String nameEnterprise;
	private String email;
	private String phoneNumber;

	// Constructor
	
	//
	
	public String getNameEnterprise() {
		return nameEnterprise;
	}

	public void setNameEnterprise(String nameEnterprise) {
		this.nameEnterprise = nameEnterprise;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String contratar() {
		return "";
	}

}
