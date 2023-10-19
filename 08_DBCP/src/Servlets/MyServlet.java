package Servlets;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/hello")
public class MyServlet extends HttpServlet {
    //life cycle of a servlet

    public MyServlet(){
        System.out.println("making servlet.Servlets.MyServlet object");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Called init method");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("called to get method");
    }

    @Override
    public void destroy() {
        System.out.println("called to destory method");
    }
}
