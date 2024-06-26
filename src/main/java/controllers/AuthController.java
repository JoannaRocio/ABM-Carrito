package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import decorators.SessionDecorator;
import models.Empleado;
import repositories.EmpleadosRepoSingleton;
import repositories.interfaces.EmpleadoRepo;

@WebServlet("/auth")
public class AuthController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private EmpleadoRepo empleadosRepo;
       
    public AuthController() {
    	this.empleadosRepo = EmpleadosRepoSingleton.getInstance(); 
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Empleado> empleados = empleadosRepo.getAll();
				
		request.setAttribute("empleados", empleados);
		
		request.getRequestDispatcher("/views/auth/login.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String pass = request.getParameter("pass");

		Empleado _username = empleadosRepo.findByUsername(username, pass);

		if(_username != null) {

			HttpSession session = request.getSession();
			
			SessionDecorator sessionDe = new SessionDecorator(session);
			
			sessionDe.setEmpleadoLogueado(_username);
			
			response.sendRedirect("empleados");
		}
		
		else {
			response.sendRedirect("auth");
		}
		
		
		
//		String sId = request.getParameter("empleado_id");
//		int id = Integer.parseInt(sId);
//		
//		Empleado emple = empleadosRepo.findById(id);
//		
//		HttpSession session = request.getSession();
//		
//		SessionDecorator sessionDe = new SessionDecorator(session);
//		
//		sessionDe.setEmpleadoLogueado(emple);
//		
//		response.sendRedirect("empleados");
	}

}
