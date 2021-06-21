package app.servlets;

import app.entities.Rectangle;
import app.entities.Square;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//servlet который обрабатывает запросы по адресу /rectangle

public class RectangleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/AreaRectangle.jsp"); // передача управления
        requestDispatcher.forward(req, resp);                                             // в AreaRectangle.jsp
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Double a = Double.valueOf(req.getParameter("A"));//получение значения из формы по параметру A
        Double b = Double.valueOf(req.getParameter("B"));//получение значения из формы по параметру B

        Rectangle rectangle = new Rectangle();
        rectangle.setSide_A(a);
        rectangle.setSide_B(b);

        req.setAttribute("squareRectangle", rectangle.calculateArea());
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/ResultAreaRectangle.jsp");// передача управления
        requestDispatcher.forward(req, resp);                                                    // в ResultAreaRectangle.jsp


    }
}
