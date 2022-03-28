<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio Dos</title>
        <link rel="stylesheet" type="text/css" href="css/stilo.css"/>
    </head>
    <body>
        <div >
            <h1>Registrar nueva Tarea</h1>
            <form action="DosServlet"  method="post" id="formu">
                <table>
                    <tr>
                        <td>Id: </td>
                        <td><input type="number" name="id" ></td>
                    </tr>
                    <tr>
                        <td>Tarea: </td>
                        <td><input type="text" name="tarea" ></td>
                    </tr>
                        <input type="text" name="completado" value="false" hidden>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Procesar" ></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>