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

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String reset = request.getParameter("reset");
        if(reset != null && reset.equals("Reset Random Number?")){
            randomNum = (int) Math.floor(Math.random()*100);
        }
        request.getRequestDispatcher("/guess.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if (request.getMethod().equalsIgnoreCase("post")){
            int guess = Integer.parseInt(request.getParameter("number"));
            String message="";
            if (guess == randomNum){
                message = "You Won!! The number is " + randomNum + "!";
            }else if (guess < randomNum){
                message = guess + " is too low";
            }else if (guess > randomNum){
                message = guess + " is too high";
            }
            request.setAttribute("message", message);
        }
        request.getRequestDispatcher("/correctguess.jsp").forward(request,response);
    }
}