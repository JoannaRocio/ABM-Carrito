package models;

import java.time.LocalDate;

public class Empleado {
	private int id;
	private String nombre;
	private String contrase�a;
	private int edad;
	private double sueldo;
	private LocalDate fechaVueltaVacaciones;
	

	public Empleado() {
		super();
	} 


	public Empleado(String nombre, String contrase�a, int edad, double sueldo) {
		super();
		this.nombre = nombre;
		this.contrase�a = contrase�a;
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
	
	public String getContrase�a() {
		return contrase�a;
	}


	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
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
