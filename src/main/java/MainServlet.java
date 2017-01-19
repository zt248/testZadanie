import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;


public class MainServlet extends HttpServlet {

    public static DBConnection dbConnection = null;

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");


        dbConnection = new DBConnection();


        String vvodnay_stroka = req.getParameter("vvodnay_stroka");
        Calculator calc = new Calculator();
        int otvet = calc.raschet(vvodnay_stroka);

        dbConnection.insertIntoTable(vvodnay_stroka,otvet);

        System.out.println("Ответ = " + otvet);
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}

