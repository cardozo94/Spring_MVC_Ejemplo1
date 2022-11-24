package co.camcar.spring.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

import co.camcar.spring.mvc.validaciones.CPostalBogota;

public class Alumno {
	
	@NotNull
	@Size(min=2, message="Campo requerido igual o superior a 2")
	private String nombre;
	private String apellido;
	private String optativa;
	private String ciudadEstudios;
	private String idiomas;
	@Min(value= 10, message ="Edad minima 10 años")
	@Max(value = 150, message = "Edad maxima 150 años")
	private int edad;
	@Email
	private String email;
	//@Pattern(regexp="[0-9]{5}", message = "Solo 5 valores númericos")
	@CPostalBogota
	private String codigoPostal;
	
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
	public String getCiudadEstudios() {
		return ciudadEstudios;
	}
	public void setCiudadEstudios(String ciudadEstudios) {
		this.ciudadEstudios = ciudadEstudios;
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
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

}
