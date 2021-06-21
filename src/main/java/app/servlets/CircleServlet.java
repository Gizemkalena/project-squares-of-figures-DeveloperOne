package app.servlets;

import app.entities.Circle;
import app.entities.Trapezoid;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//servlet который обрабатывает запросы по адресу /circle

public class CircleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/AreaCircle.jsp"); // передача управления
        requestDispatcher.forward(req, resp);                                             // в AreaCircle.jsp
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Double radius = Double.valueOf(req.getParameter("Radius"));//получение значения из формы по параметру Radius

        Circle circle=new Circle();
        circle.setRadius(radius);

        req.setAttribute("circleArea", circle.calculateArea());
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/ResultAreaCircle.jsp");// передача управления
        requestDispatcher.forward(req, resp);                                                         // в ResultAreaCircle.jsp
    }
}
