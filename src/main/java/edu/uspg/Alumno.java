package edu.uspg;

public class Alumno {
	String nombre;
	String apellido;
	int carnet;
	String Fnacimiento;
	String direccion;
	
	Alumno(){}

	public Alumno(String nombre, String apellido, int carnet, String fnacimiento, String direccion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.carnet = carnet;
		Fnacimiento = fnacimiento;
		this.direccion = direccion;
	}

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

	public int getCarnet() {
		return carnet;
	}

	public void setCarnet(int carnet) {
		this.carnet = carnet;
	}

	public String getFnacimiento() {
		return Fnacimiento;
	}

	public void setFnacimiento(String fnacimiento) {
		Fnacimiento = fnacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	

}
