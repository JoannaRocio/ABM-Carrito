package controllers;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.Empleado;
import repositories.EmpleadosRepoSingleton;
import repositories.interfaces.EmpleadoRepo;
import utils.CarritoBuilder;

@WebServlet("/crear")
public class CreacionProyectoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private EmpleadoRepo empleadosRepo;
	
    public CreacionProyectoController() {
    	this.empleadosRepo = EmpleadosRepoSingleton.getInstance(); 
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		
		Empleado empleadoLogNullable = (Empleado) session.getAttribute("empleado");
		
		Empleado empleadoLog = Optional.ofNullable(empleadoLogNullable)
				.orElseThrow(() -> new IOException("No hay usuario"));
		
		Empleado empleadoActualizado = empleadosRepo.findById(empleadoLog.getId());
		
		session.setAttribute("empleado", empleadoActualizado);
		
		CarritoBuilder carrito = (CarritoBuilder) session.getAttribute("carrito");
		
		carrito = Optional.ofNullable(carrito).orElseGet( ()-> {
			CarritoBuilder pro = new CarritoBuilder(empleadoLog);
			session.setAttribute("carrito", pro);
			return pro;
		});
		
		carrito.setLider(empleadoActualizado);
		
		request.setAttribute("carrito", carrito);
		
		request.getRequestDispatcher("/views/creacion-proyecto/index.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String accion = request.getParameter("accion");
		
		switch (accion) {
		case "modifpre" -> doModificarPresupuesto(request, response);
		default -> response.sendError(400);
		}
	}

	private void doModificarPresupuesto(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		
		CarritoBuilder carrito = (CarritoBuilder) session.getAttribute("carrito");
		
		Empleado empleadoLogNullable = (Empleado) session.getAttribute("empleado");
		
		Empleado empleadoLog = Optional.ofNullable(empleadoLogNullable)
				.orElseThrow(() -> new IOException("No hay usuario"));
		
		carrito = Optional.ofNullable(carrito).orElseGet( ()-> {
			CarritoBuilder pro = new CarritoBuilder(empleadoLog);
			session.setAttribute("carrito", pro);
			return pro;
		});
		
		String sImporte = request.getParameter("importe");
		double importe = Double.parseDouble(sImporte);
		
		carrito.setPresupuesto(importe);
		
		response.sendRedirect("crear");
	}
	
	

}
