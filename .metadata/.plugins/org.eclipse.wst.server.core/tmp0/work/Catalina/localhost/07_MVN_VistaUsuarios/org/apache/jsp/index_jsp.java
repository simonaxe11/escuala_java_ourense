/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.27
 * Generated at: 2019-11-28 12:11:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

 //<%! para declarar una función 
    String head() {  
        return "<head><meta http-equiv=\"Content-Type\" content=\"text/html\" charset=\"UTF-8\"/>"
                + "<title>Aplicación Gestión Usuarios MVC JSP</title></head>";
    } 

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/head.jsp", Long.valueOf(1574766913508L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1574767165560L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Include= antes de compilar, copia y pega el fichero aqui directamente -->\r\n");
      out.write("<html>\r\n");
      out.print(head());
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write('\r');
      out.write('\n');

      out.write("\r\n");
      out.write("<header>\r\n");
      out.write("    <h2>Aplicaci�n Gesti�n MVC JSP</h2>\r\n");
      out.write("    <nav>\r\n");
      out.write("        \r\n");
      out.write("        <a href=\"index.jsp\">Inicio</a>\r\n");
 if(false){ 
      out.write("\r\n");
      out.write("        <a href=\"listar.jsp\">Listar</a>   \r\n");
      out.write("        <a href=\"eliminar.jsp\">Eliminar</a>\r\n");
 } else { 
      out.write("\r\n");
      out.write("        <a href=\"login.jsp\">Login</a>\r\n");
      out.write("        <a href=\"registrarse.jsp\">Registrarse</a>\r\n");
 } 
      out.write("\r\n");
      out.write("    </nav>\r\n");
      out.write("    <h3 style=\"color: red\"> </h3>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("\t<h1>Página de inicio</h1>\r\n");
      out.write("\t<h2>Haga login o registrese para navegar por la web</h2>\r\n");
      out.write("\t<h3>Implementaciones diversas de gestión de datos</h3>\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<a\r\n");
      out.write("\t\thref=\"https://javiergarciaescobedo.es/programacion-en-java/9-bases-de-datos/446-como-crear-una-aplicacion-java-para-gestion-de-base-de-datos-parte-1\">\r\n");
      out.write("\t\tCómo crear una aplicación Java para gestión de base de datos (Parte 1)\r\n");
      out.write("\t</a>\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<a\r\n");
      out.write("\t\thref=\"https://www.arquitecturajava.com/usando-java-session-en-aplicaciones-web/\">Usando\r\n");
      out.write("\t\tJava Session en aplicaciones web - Arquitectura Java</a>\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<a href=\"https://www.tutorialspoint.com/es/jpa/jpa_entity_managers.htm\">JPA\r\n");
      out.write("\t\t- Administradores de la Entidad</a>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
