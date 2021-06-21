package app.servlets;

import app.entities.Square;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//servlet который обрабатывает запросы по адресу /square

public class SquareServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/AreaSquare.jsp"); // передача управления
        requestDispatcher.forward(req, resp);                                             // в AreaSquare.jsp
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Double a = Double.valueOf(req.getParameter("A"));//получение значения из формы по параметру A

        Square square = new Square();
        square.setSide_A(a);

        req.setAttribute("squareArea", square.calculateArea());
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/ResultAreaSquare.jsp");// передача управления
        requestDispatcher.forward(req, resp);                                                         // в ResultAreaSquare.jsp
    }
}
