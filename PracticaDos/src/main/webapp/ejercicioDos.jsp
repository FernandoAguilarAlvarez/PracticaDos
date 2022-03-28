<%@page import="java.util.ArrayList"%>
<%@page import="com.emergentes.dos.ListaTareas"%>
<%
    if (session.getAttribute("tarea") == null) {
        ArrayList<ListaTareas> tar = new ArrayList<ListaTareas>();
        session.setAttribute("tarea", tar);
    }
    ArrayList<ListaTareas> tr = (ArrayList<ListaTareas>) session.getAttribute("tarea");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio Dos</title>
        <link rel="stylesheet" type="text/css" href="css/stilo.css"/>
    </head>
    <body>       
       <h1>Tareas Pendientes</h1>
       
           <div class="centrar"><a href="ejDosTareas.jsp" >Nueva Tarea</a></div>
        <div id="formu">
            <table border="1" cellspacing="0">
                <tr>
                    <th>Id</th>
                    <th>Tarea</th>
                    <th>Completado</th>
                    <th></th>
                </tr>

                <%
                    if (tr != null) {
                        for (ListaTareas t : tr) {
                %>

                <tr>
                    <td> <%= t.getId() %> </td>
                    <td> <%= t.getTarea() %> </td>
                    <%
                        if (t.isCompleatado()) {
                            out.print("<td><input type='checkbox' checked></td>");
                        } else {
                            out.print("<td><input type='checkbox'></td>");
                        }
                    %>
                    <td><a href="DosServlet?op=eliminar&id=<%= t.getId()%>" >Eliminar</a></td>
                </tr>

                <%      }
                    }
                %>
            </table>
        </div>
    
       

    </body>
</html>