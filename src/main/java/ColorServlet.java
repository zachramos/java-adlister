import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;

@WebServlet(name = "ColorServlet", urlPatterns = "/pickcolor")
public class ColorServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("/pickcolor.jsp");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException  {
        if (request.getMethod().equalsIgnoreCase("POST")){
            String color = request.getParameter("color");
            request.setAttribute("color", color);
        }
        request.getRequestDispatcher("color").forward(request, response);
    }
}

