package com.stefanini.onlinecatalog;

import com.stefanini.onlinecatalog.dao.DaoProfessor;
import com.stefanini.onlinecatalog.entity.Professors;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServletProfessor", value = "/ServletProfessor")
public class ServletProfessor extends HttpServlet {

    @Override
    public void init() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DaoProfessor daoProfessor = new DaoProfessor();
        try {
            List<Professors> professorsList = daoProfessor.getAll();
            request.setAttribute("professors", professorsList);

            RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/professors.jsp");
            dispatcher.forward(request, response);

        } finally {
            daoProfessor.closeEntityManager();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public void destroy() {
    }
}
