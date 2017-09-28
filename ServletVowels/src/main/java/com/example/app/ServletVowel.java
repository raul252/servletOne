package com.example.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.SuperWorld.Vocal;

/**
 * Servlet implementation class ServletVowel
 */
@WebServlet("/ServletVowel")
public class ServletVowel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletVowel() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String texto = request.getParameter("textovocal");
		texto = texto!=null?texto:"";
		ArrayList<SuperWorld.Vocal> lista = new ArrayList<SuperWorld.Vocal>();
		SuperWorld superw = new SuperWorld(texto);
		lista = superw.numberVocal();
		PrintWriter writer = response.getWriter();
		writer.append("<html>");
		response.setContentType("text/html; charset=utf-8");
		writer.append("<title>Palabras");
		writer.append("</title>");
		writer.append("<body>");
		String cadena = "<ul>";
		Integer suma = 0;
		for (int i=0; i<lista.size(); i++)
		{
			cadena += "<li>" +lista.get(i).getVocal() + ": " + lista.get(i).getNumber() + "</li>";
			suma++;
		}
		cadena += "</ul>";
		writer.append("<h3>La palabra " + texto + " contiene un total de " + suma + " vocales</h3>");
		writer.append(cadena);
		writer.append("</body>");
		writer.append("</html>");
	}

}
