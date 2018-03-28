import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;

@WebServlet(name = "NameServlet", urlPatterns = "/name")
public class NameServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("/name.jsp");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException  {
        if (request.getMethod().equalsIgnoreCase("POST")){
            String name = request.getParameter("name");
            request.setAttribute("name", name);
        }
        request.getRequestDispatcher("name").forward(request, response);
    }
}
