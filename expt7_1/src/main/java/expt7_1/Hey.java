package expt7_1;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class Hey extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get parameters from the client request
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Display the received username and password
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Received Username and Password</h2>");
        out.println("<p>Username: " + username + "</p>");
        out.println("<p>Password: " + password + "</p>");
        out.println("</body></html>");
    }
}
