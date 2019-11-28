<%-- 
    Document   : index
    Created on : 21-feb-2019, 20:42:40
    Author     : IEUser
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="head.jsp" %>
<html>
    <%= head() %>
    <body>
	
        <h1>Formulario JSP de Login</h1> 
        <form name="form1" action="usuarios.do" method="get">

            <table border="1">
                <tr><td>Email</td><td>
                        <input type="email" name="email" id="email" value="" placeholder="Introduzca email" required="required" pattern="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$"/>  </td></tr> 
                <tr><td>Contrase�a</td><td>
                        <input type="password" name="password" id="password" value="" minlength="4" placeholder="Introduzca password" m required="required"/>  </td></tr> 
            </table>
            <input type="submit" value="Login"/>
        </form>
    </body>
</html>