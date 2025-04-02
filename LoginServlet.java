import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Hardcoded credentials for demo
        String validUsername = "admin";
        String validPassword = "12345";

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (username.equals(validUsername) && password.equals(validPassword)) {
            out.println("<h2>Welcome, " + username + "!</h2>");
        } else {
            out.println("<h2>Invalid credentials. Try again.</h2>");
            out.println("<a href='index.html'>Go Back</a>");
        }
    }
}
