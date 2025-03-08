package es.pildoras.spring.mvc;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Alumno {

	@NotNull
	@Size(min = 2, message = " Campo requerido")
	private String nombre;
	
	@NotNull
	@Size(min = 2, message = " Campo requerido")
	private String apellido;
	
	@NotNull
	@Min(value=10, message = "No se permite edades menores de 10 años.")
	@Max(value = 99, message = "No se prmiten edades mayores de 99 años.")
	private int edad;
	
	@NotEmpty(message = "Campo requerido")
	@Email
	private String email;
	
	private String optativa;
	
	private String ciudadEstudio;
	
	private String idiomas;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getOptativa() {
		return optativa;
	}

	public void setOptativa(String optativa) {
		this.optativa = optativa;
	}

	public String getCiudadEstudio() {
		return ciudadEstudio;
	}

	public void setCiudadEstudio(String ciudadEstudio) {
		this.ciudadEstudio = ciudadEstudio;
	}

	public String getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
