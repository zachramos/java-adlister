import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;

@WebServlet(name = "GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {
    private int number;

    public int getNumber(){
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    private int randomNum = (int) Math.floor(Math.random()*100);

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("/guess.jsp");
        setNumber(15);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if (request.getMethod().equalsIgnoreCase("post")){
            int guess = Integer.parseInt(request.getParameter("number"));
            String message="";
            if (guess == randomNum){

            }
        }

    }
}