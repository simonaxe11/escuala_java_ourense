<%-- 
    Document   : index
    Created on : 21-feb-2019, 20:42:40
    Author     : IEUser
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="head.jsp" %>
<html>
    <%=head()%>
    <body>
        <%@include file="header.jsp" %>
        <h1>Formulario JSP de registro</h1>
        <%
            Object mensajeDeError = request.getSession().getAttribute("mensajeError");
            if (mensajeDeError != null) {%>
        <p><%=(String) mensajeDeError %></p>
        <%
            request.getSession().removeAttribute("mensajeError");
            }
        %>

        <form name="form1" action="usuarios.do" method="post">

            <table border="1">
                <tr><td>Nombre:</td><td>
                        <input type="text" name="nombre" id="nombre" size="25" value="" placeholder="introduce nombre" required="required" pattern="^[A-Z][a-z]+ ?[A-Za-z]*$"/>  </td></tr>
                <tr><td>Edad:</td><td>
                        <input type="number" name="edad" id="edad" value="" placeholder="introduce edad" required="required"/>  </td></tr> 
                <tr><td>Email</td><td>
                        <input type="email" name="email" id="email" value="" placeholder="introduce email" required="required" pattern="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$"/>  </td></tr> 
                <tr><td>Contrase�a</td><td>
                        <input type="password" name="password" id="password" value="" placeholder="introduce contrase�a" required="required"/>  </td></tr> 
            </table>
            <input type="submit" value="Registrarse"/>
        </form>
    </body>
</html>