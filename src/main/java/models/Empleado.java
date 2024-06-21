package models;

public class Empleado {
	private int id;
	private String nombre;
	private int edad;
	private double sueldo;
	

	public Empleado() {
		super();
	}


	public Empleado(String nombre, int edad, double sueldo) {
		super();
		this.nombre = nombre;
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
	
	

}