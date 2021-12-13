package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(name = "controllers.SearchAdsServlet", urlPatterns = "/ads/search")
public class SearchAdsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Ad> ads = (List<Ad>)request.getSession().getAttribute("ads");
        request.setAttribute("ads", ads);
        request.getRequestDispatcher("/WEB-INF/ads/search.jsp")
                .forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String searchTerm = request.getParameter("searchTerm");

        System.out.println("searchTerm = " + searchTerm);

        List<Ad> ads = DaoFactory.getAdsDao().searchAdsFromResults(searchTerm);
//        request.getSession().setAttribute("ads", ads);

        System.out.println(ads);
//        DaoFactory.getAdsDao().insert(SearchAd);
        request.setAttribute("ads", ads);
        request.getRequestDispatcher("/WEB-INF/ads/search.jsp")
                .forward(request, response);
//        response.sendRedirect("/ads/search" + "?" + searchTerm);
    }
}





//String email = request.getParameter("email");
//    function myFunction() {
//        var input, filter, i;
//        var newCoffee = [];
//        input = document.getElementById("myInput")
//        filter = input.value.toUpperCase();
//        // for (i = 0; i < coffees.length; i++) {
//        coffees.forEach(function(coffee) {
//            if (coffee.name.toUpperCase().includes(filter.toUpperCase())) {
//                newCoffee.push(coffee)
//                console.log(newCoffee)
//                tbody.innerHTML = renderCoffees(newCoffee);
//            }})
//    }