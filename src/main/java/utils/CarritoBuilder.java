package utils;

import models.Empleado;

public class CarritoBuilder {

	private Empleado lider;
	
	private double presupuesto;

	public CarritoBuilder(Empleado lider) {
		super();
		this.lider = lider;
		this.presupuesto = 0;
	}

	public Empleado getLider() {
		return lider;
	}

	public void setLider(Empleado lider) {
		this.lider = lider;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}
	
	
	
	
	
	
}
