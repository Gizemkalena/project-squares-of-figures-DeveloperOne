package app.servlets;

import app.entities.Trapezoid;
import app.entities.Triangle;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//servlet который обрабатывает запросы по адресу /trapezoid

public class TrapezoidServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/AreaTrapezoid.jsp"); // передача управления
        requestDispatcher.forward(req, resp);                                             // в AreaTrapezoid.jsp
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Double a = Double.valueOf(req.getParameter("A"));//получение значения из формы по параметру A
        Double b = Double.valueOf(req.getParameter("B"));//получение значения из формы по параметру B
        Double h = Double.valueOf(req.getParameter("H"));//получение значения из формы по параметру H

        Trapezoid trapezoid = new Trapezoid();
        trapezoid.setSide_A(a);
        trapezoid.setSide_B(b);
        trapezoid.setHight_H(h);

        req.setAttribute("trapezoidArea", trapezoid.calculateArea());
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/ResultAreaTrapezoid.jsp");// передача управления
        requestDispatcher.forward(req, resp);                                                         // в ResultAreaTrapezoid.jsp
    }
}
