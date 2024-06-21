package repositories.interfaces;

import java.util.List;

import models.Empleado;

public interface EmpleadoRepo {

	public List<Empleado> getAll();
	
	public Empleado findById(int id);
	
	public void insert(Empleado empleado);
	
	public void update(Empleado empleado);
	
	public void delete(int id);
}
