package edu.uspg.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Alumno {
	
	int carnet;
	String nombres;
	String apellidos; 
	String correo;
	
	
	public Alumno() {
		super();
	}


	public Alumno(int carnet, String nombres, String apellidos, String correo) {
		super();
		this.carnet = carnet;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.correo = correo;
	}


	public int getCarnet() {
		return carnet;
	}

	@XmlAttribute
	public void setCarnet(int carnet) {
		this.carnet = carnet;
	}


	public String getNombres() {
		return nombres;
	}

	@XmlAttribute
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getApellidos() {
		return apellidos;
	}

	@XmlElement
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
	
	

}
