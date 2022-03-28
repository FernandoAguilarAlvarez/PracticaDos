package com.emergentes.dos;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "DosServlet", urlPatterns = {"/DosServlet"})
public class DosServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String op = request.getParameter("op");
        if (op.equals("eliminar")) {
            int pos = -1;
            int indice = -1;
            int id = Integer.parseInt(request.getParameter("id"));
            HttpSession ses = request.getSession();

            ArrayList<ListaTareas> list = (ArrayList<ListaTareas>) ses.getAttribute("tarea");

            for (ListaTareas t : list) {
                pos++;

                if (t.getId() == id) {
                    indice = pos;
                }
            }
            list.remove(indice);
            response.sendRedirect("ejercicioDos.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String tarea = request.getParameter("tarea");


        ListaTareas tare = new ListaTareas();

        tare.setId(id);
        tare.setTarea(tarea);

        HttpSession ses = request.getSession();

        ArrayList<ListaTareas> ta = (ArrayList<ListaTareas>) ses.getAttribute("tarea");

        ta.add(tare);

        response.sendRedirect("ejercicioDos.jsp");
    }

}