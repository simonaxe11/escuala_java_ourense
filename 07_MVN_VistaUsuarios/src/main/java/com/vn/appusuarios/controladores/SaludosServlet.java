package com.vn.appusuarios.controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Descriptores de servlets
@WebServlet({ "/saludo", "/otraurl" })
public class SaludosServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String nombre = req.getParameter("nombre");
		resp.getWriter().println("<html>");
		resp.getWriter().println("<body>" + nombre);
		Cookie[] todasCookies = req.getCookies();
		Cookie nombreCookie;
		System.out.println("Cookie desde navegador: " + todasCookies[0].getValue());
		if (todasCookies.length == 0) {
			System.out.println("Cookie desde navegador: " + todasCookies[1].getValue());
		}
		
		resp.addCookie(nombreCookie);
		resp.getWriter().println("<div id = 'divC'></div>");
		resp.getWriter().println("<script>");
		resp.getWriter().println("document.getElementById('divC').innerHTML = document.cookie; ");
		resp.getWriter().println("document.cookie='nombre_cookie=\"Modificada en JS: \"';");

		resp.getWriter().println("</script></body></html>");
	}
}
