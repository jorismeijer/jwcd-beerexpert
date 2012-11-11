package nl.jjjmeijer.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nl.jjjmeijer.model.BeerExpert;

/**
 * Created with IntelliJ IDEA. User: JOMEIJER Date: 11-11-12 Time: 20:42 To change this template use File | Settings |
 * File Templates.
 */
public class BeerSelect extends HttpServlet{

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Beer selection advice<br>");
        String c = request.getParameter("color");
        out.println("<br>Got beer color " + c);
        BeerExpert beerExpert = new BeerExpert();
        if (c != null) {
            List brands = beerExpert.getBrands(c);
            request.setAttribute("brands",brands);
        }
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request,response);
    }
}
