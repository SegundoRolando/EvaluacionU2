package ec.edu.ups.EvaluacionU2Calle.view;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.EvaluacionU2Calle.bussines.LibrosOnLocal;

/**
 * Servlet implementation class PrincipalLocal
 */
@WebServlet("/PrincipalLocal")
public class PrincipalLocal extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private LibrosOnLocal calOn;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrincipalLocal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//response.getWriter().append("<h1> UPS</h1>").append(request.getContextPath());
		//double n = calOn.suma(30, 80);
		
		//response.getWriter().append("<h1> UPS</h1>" + n).append(request.getContextPath());
		//response.getOutputStream().println("<h1>UPS</h1" + n);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
