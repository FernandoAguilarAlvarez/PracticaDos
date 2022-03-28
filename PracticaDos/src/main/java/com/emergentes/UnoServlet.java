package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Fernando
 */
@WebServlet(name = "UnoServlet", urlPatterns = {"/UnoServlet"})
public class UnoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        boolean nuevoUsuario = true;
        Cookie[] cookies = request.getCookies();
        if(cookies != null) {
            for (Cookie ck : cookies) {
                if (ck.getName().equals("visitante") && ck.getValue().equals("si")) {
                    nuevoUsuario = false;
                    break;
                }
            }
        }
        String mensaje = null;
        if(nuevoUsuario) {
            Cookie visitanteN = new Cookie("visitante", "si");
            response.addCookie(visitanteN);
            mensaje = "Bienvenido a Nuestro Sitio Web";
        } else {
            mensaje = "Gracias por visitarnos Nuevamente";
        }
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        out.println(mensaje);
        out.close();   
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
