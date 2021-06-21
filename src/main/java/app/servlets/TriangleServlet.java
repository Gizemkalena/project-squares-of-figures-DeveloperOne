package app.servlets;

import app.entities.Triangle;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//servlet который обрабатывает запросы по адресу /triangle

public class TriangleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/AreaTriangle.jsp"); // передача управления
        requestDispatcher.forward(req, resp);                                             // в AreaTriangle.jsp
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Double a = Double.valueOf(req.getParameter("A"));//получение значения из формы по параметру A
        Double h = Double.valueOf(req.getParameter("H"));//получение значения из формы по параметру H

        Triangle triangle = new Triangle();
        triangle.setSide_A(a);
        triangle.setHight_H(h);

        req.setAttribute("triangleArea", triangle.calculateArea());
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/ResultAreaTriangle.jsp");// передача управления
        requestDispatcher.forward(req, resp);                                                         // в ResultAreaTriangle.jsp
    }
}
