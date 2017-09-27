package com.example.one.servletone;



import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletOne
 */
@WebServlet("/ServletOne")
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletOne() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Date time = new Date(System.currentTimeMillis());
		String name = request.getParameter("nombre");
		name = name!=null?name:"";
		response.setContentType("text/html; charset=utf-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter writer = response.getWriter();
		//Todo mejor usar StringBuilder append
		writer.append("<html>");
		writer.append("<title>Ejemplo de página web");
		writer.append("</title>");
		writer.append("<body>");
		writer.append("<h3>Hola " + name + ", son las " + time.toString() + "</h3>");
		writer.append("</body>");
		writer.append("</html>");
	}
}
