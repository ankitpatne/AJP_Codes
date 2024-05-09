package expt7_1;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class ServerSideServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get parameters from the client request
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Check if the username and password are correct
        boolean isValidCredentials = checkCredentials(username, password);

        // Display message based on credentials
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        if (isValidCredentials) {
//            out.println("<h2>Hi, " + username + "!</h2>");
        	response.sendRedirect("success.html");
        } else {
            out.println("<h2>Invalid credentials</h2>");
        }
        out.println("</body></html>");
    }

    // Dummy method to check credentials (replace with your actual logic)
    private boolean checkCredentials(String username, String password) {
        return "admin".equals(username) && "password".equals(password);
    }
}

