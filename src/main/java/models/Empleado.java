package models;

import java.time.LocalDate;

public class Empleado {
	private int id;
	private String nombre;
	private String contraseña;
	private int edad;
	private double sueldo;
	private LocalDate fechaVueltaVacaciones;
	

	public Empleado() {
		super();
	} 


	public Empleado(String nombre, String contraseña, int edad, double sueldo) {
		super();
		this.nombre = nombre;
		this.contraseña = contraseña;
		this.edad = edad;
		this.sueldo = sueldo;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getContraseña() {
		return contraseña;
	}


	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public double getSueldo() {
		return sueldo;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}


	public LocalDate getFechaVueltaVacaciones() {
		return fechaVueltaVacaciones;
	}


	public void setFechaVueltaVacaciones(LocalDate fechaVueltaVacaciones) {
		this.fechaVueltaVacaciones = fechaVueltaVacaciones;
	}

	

}
