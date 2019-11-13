import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/calculate")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float first = Float.parseFloat(request.getParameter("first"));
        float second = Float.parseFloat(request.getParameter("second"));
        String operator = request.getParameter("operator");
        float result;
        switch (operator) {
            case "cong":
                result = first + second;
                break;
            case "tru":
                result = first - second;
                break;
            case "nhan":
                result = first * second;
                break;
            case "chia" :
                result = first / second;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h4>First operator: " + first + "<h4>");
        writer.println("<h4>Operator: "  + operator + "<h4>");
        writer.println("<h4>Second operator: " + second + "<h4>");
        writer.println("<h4>Result : "  + result + "<h4>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
