package com.example.one.servletone;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletTwo
 */
@WebServlet("/ServletTwo")
public class ServletTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTwo() {
        super();
        // TODO Auto-generated constructor stub
    }
    /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		String speso = request.getParameter("peso");
		String saltura = request.getParameter("altura");
		float peso = Float.valueOf(speso);
		float altura = Float.valueOf(saltura);
		float imc = peso/altura/altura;
		writer.append("<html>");
		writer.append("<title>IMC");
		writer.append("</title>");
		writer.append("<body>");
		writer.append("<h3>El IMC de " + peso + " y " + altura + " es " + imc +"</h3>");
		writer.append("</body>");
		writer.append("</html>");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
